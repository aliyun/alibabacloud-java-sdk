// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class PushNotificationsRequest extends TeaModel {
    @NameInMap("NotificationUnicastRequest")
    public PushNotificationsRequestNotificationUnicastRequest notificationUnicastRequest;

    @NameInMap("TenantInfo")
    public PushNotificationsRequestTenantInfo tenantInfo;

    public static PushNotificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        PushNotificationsRequest self = new PushNotificationsRequest();
        return TeaModel.build(map, self);
    }

    public PushNotificationsRequest setNotificationUnicastRequest(PushNotificationsRequestNotificationUnicastRequest notificationUnicastRequest) {
        this.notificationUnicastRequest = notificationUnicastRequest;
        return this;
    }
    public PushNotificationsRequestNotificationUnicastRequest getNotificationUnicastRequest() {
        return this.notificationUnicastRequest;
    }

    public PushNotificationsRequest setTenantInfo(PushNotificationsRequestTenantInfo tenantInfo) {
        this.tenantInfo = tenantInfo;
        return this;
    }
    public PushNotificationsRequestTenantInfo getTenantInfo() {
        return this.tenantInfo;
    }

    public static class PushNotificationsRequestNotificationUnicastRequestSendTarget extends TeaModel {
        @NameInMap("TargetIdentity")
        public String targetIdentity;

        @NameInMap("TargetType")
        public String targetType;

        public static PushNotificationsRequestNotificationUnicastRequestSendTarget build(java.util.Map<String, ?> map) throws Exception {
            PushNotificationsRequestNotificationUnicastRequestSendTarget self = new PushNotificationsRequestNotificationUnicastRequestSendTarget();
            return TeaModel.build(map, self);
        }

        public PushNotificationsRequestNotificationUnicastRequestSendTarget setTargetIdentity(String targetIdentity) {
            this.targetIdentity = targetIdentity;
            return this;
        }
        public String getTargetIdentity() {
            return this.targetIdentity;
        }

        public PushNotificationsRequestNotificationUnicastRequestSendTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class PushNotificationsRequestNotificationUnicastRequest extends TeaModel {
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("IsDebug")
        public Boolean isDebug;

        @NameInMap("MessageTemplateId")
        public String messageTemplateId;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("PlaceHolder")
        public java.util.Map<String, String> placeHolder;

        @NameInMap("SendTarget")
        public PushNotificationsRequestNotificationUnicastRequestSendTarget sendTarget;

        public static PushNotificationsRequestNotificationUnicastRequest build(java.util.Map<String, ?> map) throws Exception {
            PushNotificationsRequestNotificationUnicastRequest self = new PushNotificationsRequestNotificationUnicastRequest();
            return TeaModel.build(map, self);
        }

        public PushNotificationsRequestNotificationUnicastRequest setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public PushNotificationsRequestNotificationUnicastRequest setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public PushNotificationsRequestNotificationUnicastRequest setIsDebug(Boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }
        public Boolean getIsDebug() {
            return this.isDebug;
        }

        public PushNotificationsRequestNotificationUnicastRequest setMessageTemplateId(String messageTemplateId) {
            this.messageTemplateId = messageTemplateId;
            return this;
        }
        public String getMessageTemplateId() {
            return this.messageTemplateId;
        }

        public PushNotificationsRequestNotificationUnicastRequest setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public PushNotificationsRequestNotificationUnicastRequest setPlaceHolder(java.util.Map<String, String> placeHolder) {
            this.placeHolder = placeHolder;
            return this;
        }
        public java.util.Map<String, String> getPlaceHolder() {
            return this.placeHolder;
        }

        public PushNotificationsRequestNotificationUnicastRequest setSendTarget(PushNotificationsRequestNotificationUnicastRequestSendTarget sendTarget) {
            this.sendTarget = sendTarget;
            return this;
        }
        public PushNotificationsRequestNotificationUnicastRequestSendTarget getSendTarget() {
            return this.sendTarget;
        }

    }

    public static class PushNotificationsRequestTenantInfo extends TeaModel {
        public static PushNotificationsRequestTenantInfo build(java.util.Map<String, ?> map) throws Exception {
            PushNotificationsRequestTenantInfo self = new PushNotificationsRequestTenantInfo();
            return TeaModel.build(map, self);
        }

    }

}
