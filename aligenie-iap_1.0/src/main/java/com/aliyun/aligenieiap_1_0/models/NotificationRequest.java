// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class NotificationRequest extends TeaModel {
    // 消息推送入参对象
    @NameInMap("NotificationUnicastRequest")
    public NotificationRequestNotificationUnicastRequest notificationUnicastRequest;

    @NameInMap("TenantInfo")
    public NotificationRequestTenantInfo tenantInfo;

    public static NotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        NotificationRequest self = new NotificationRequest();
        return TeaModel.build(map, self);
    }

    public NotificationRequest setNotificationUnicastRequest(NotificationRequestNotificationUnicastRequest notificationUnicastRequest) {
        this.notificationUnicastRequest = notificationUnicastRequest;
        return this;
    }
    public NotificationRequestNotificationUnicastRequest getNotificationUnicastRequest() {
        return this.notificationUnicastRequest;
    }

    public NotificationRequest setTenantInfo(NotificationRequestTenantInfo tenantInfo) {
        this.tenantInfo = tenantInfo;
        return this;
    }
    public NotificationRequestTenantInfo getTenantInfo() {
        return this.tenantInfo;
    }

    public static class NotificationRequestNotificationUnicastRequestSendTarget extends TeaModel {
        // 推送目标类型
        @NameInMap("TargetType")
        public String targetType;

        // 推送目标类型对应的标识值
        @NameInMap("TargetIdentity")
        public String targetIdentity;

        public static NotificationRequestNotificationUnicastRequestSendTarget build(java.util.Map<String, ?> map) throws Exception {
            NotificationRequestNotificationUnicastRequestSendTarget self = new NotificationRequestNotificationUnicastRequestSendTarget();
            return TeaModel.build(map, self);
        }

        public NotificationRequestNotificationUnicastRequestSendTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public NotificationRequestNotificationUnicastRequestSendTarget setTargetIdentity(String targetIdentity) {
            this.targetIdentity = targetIdentity;
            return this;
        }
        public String getTargetIdentity() {
            return this.targetIdentity;
        }

    }

    public static class NotificationRequestNotificationUnicastRequest extends TeaModel {
        // 消息推送目标信息
        @NameInMap("sendTarget")
        public NotificationRequestNotificationUnicastRequestSendTarget sendTarget;

        // 消息模板
        @NameInMap("MessageTemplateId")
        public String messageTemplateId;

        @NameInMap("PlaceHolder")
        public java.util.Map<String, byte[]> placeHolder;

        // 编码类型
        @NameInMap("EncodeType")
        public String encodeType;

        // 编码key
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 组织标识（推送类型是组织类的才需要）
        @NameInMap("OrganizationId")
        public String organizationId;

        public static NotificationRequestNotificationUnicastRequest build(java.util.Map<String, ?> map) throws Exception {
            NotificationRequestNotificationUnicastRequest self = new NotificationRequestNotificationUnicastRequest();
            return TeaModel.build(map, self);
        }

        public NotificationRequestNotificationUnicastRequest setSendTarget(NotificationRequestNotificationUnicastRequestSendTarget sendTarget) {
            this.sendTarget = sendTarget;
            return this;
        }
        public NotificationRequestNotificationUnicastRequestSendTarget getSendTarget() {
            return this.sendTarget;
        }

        public NotificationRequestNotificationUnicastRequest setMessageTemplateId(String messageTemplateId) {
            this.messageTemplateId = messageTemplateId;
            return this;
        }
        public String getMessageTemplateId() {
            return this.messageTemplateId;
        }

        public NotificationRequestNotificationUnicastRequest setPlaceHolder(java.util.Map<String, byte[]> placeHolder) {
            this.placeHolder = placeHolder;
            return this;
        }
        public java.util.Map<String, byte[]> getPlaceHolder() {
            return this.placeHolder;
        }

        public NotificationRequestNotificationUnicastRequest setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public NotificationRequestNotificationUnicastRequest setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public NotificationRequestNotificationUnicastRequest setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class NotificationRequestTenantInfo extends TeaModel {
        @NameInMap("GeineAppId")
        public String geineAppId;

        public static NotificationRequestTenantInfo build(java.util.Map<String, ?> map) throws Exception {
            NotificationRequestTenantInfo self = new NotificationRequestTenantInfo();
            return TeaModel.build(map, self);
        }

        public NotificationRequestTenantInfo setGeineAppId(String geineAppId) {
            this.geineAppId = geineAppId;
            return this;
        }
        public String getGeineAppId() {
            return this.geineAppId;
        }

    }

}
