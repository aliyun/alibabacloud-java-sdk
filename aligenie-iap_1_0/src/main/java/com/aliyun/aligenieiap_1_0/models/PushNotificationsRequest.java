// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class PushNotificationsRequest extends TeaModel {
    // 消息推送入参对象。
    @NameInMap("NotificationUnicastRequest")
    public PushNotificationsRequestNotificationUnicastRequest notificationUnicastRequest;

    // 身份信息。
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
        // 推送目标类型对应的标识值。
        @NameInMap("TargetIdentity")
        public String targetIdentity;

        // 推送的目标类型，获取到对应设备或用户标识时的类型 - DEVICE_UNION_ID：设备unionId - DEVICE_OPEN_ID：设备openId - USER_UNION_ID：用户unionId - USER_OPEN_ID：用户openId
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
        // 编码类型对应的值，例如：编码类型是SKILLID，其值就为webhook服务中得到的skillId；编码类似是PACKAGENAME，其值就为对应客户端app的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，获取猫精的设备标识的途径有多种，不同途径对应不同的编码类型： PACKAGE_NAME：apk包名 SKILL_ID：技能id
        @NameInMap("EncodeType")
        public String encodeType;

        // 调试标识
        @NameInMap("IsDebug")
        public Boolean isDebug;

        // 消息模板，在天猫精灵应用平台中申请消息模板时得到的模板id。
        @NameInMap("MessageTemplateId")
        public String messageTemplateId;

        // 组织标识，推送类型是XX_UNION_XX时才需要配。当存在多种途径获取猫精设备或用户标识且又需要能互通的情况下需要找平台申请组织，申请通过后由平台分配得到。
        @NameInMap("OrganizationId")
        public String organizationId;

        // 占位符信息，例如：模板是【你好，{nick}！】这里可以是：{"nick":"小甜甜"}
        @NameInMap("PlaceHolder")
        public java.util.Map<String, String> placeHolder;

        // 消息推送的目标信息。
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
