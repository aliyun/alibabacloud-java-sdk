// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class SendNotificationsRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public SendNotificationsRequestDeviceInfo deviceInfo;

    // 消息推送入参对象。
    @NameInMap("NotificationUnicastRequest")
    public SendNotificationsRequestNotificationUnicastRequest notificationUnicastRequest;

    // 身份信息。
    @NameInMap("TenantInfo")
    public SendNotificationsRequestTenantInfo tenantInfo;

    // 用户标识信息
    @NameInMap("UserInfo")
    public SendNotificationsRequestUserInfo userInfo;

    public static SendNotificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendNotificationsRequest self = new SendNotificationsRequest();
        return TeaModel.build(map, self);
    }

    public SendNotificationsRequest setDeviceInfo(SendNotificationsRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public SendNotificationsRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public SendNotificationsRequest setNotificationUnicastRequest(SendNotificationsRequestNotificationUnicastRequest notificationUnicastRequest) {
        this.notificationUnicastRequest = notificationUnicastRequest;
        return this;
    }
    public SendNotificationsRequestNotificationUnicastRequest getNotificationUnicastRequest() {
        return this.notificationUnicastRequest;
    }

    public SendNotificationsRequest setTenantInfo(SendNotificationsRequestTenantInfo tenantInfo) {
        this.tenantInfo = tenantInfo;
        return this;
    }
    public SendNotificationsRequestTenantInfo getTenantInfo() {
        return this.tenantInfo;
    }

    public SendNotificationsRequest setUserInfo(SendNotificationsRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public SendNotificationsRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class SendNotificationsRequestDeviceInfo extends TeaModel {
        // 编码类型对应的值，编码类型是SKILL_ID时，其值为应用的Skill ID； 编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，获取猫精的设备标识的途径有多种，不同途径对应不同的编码类型 - PACKAGE_NAME：apk包名，Android应用客户链路的编码类型 - SKILL_ID：技能ID，云端链路的编码类型
        @NameInMap("EncodeType")
        public String encodeType;

        // 设备标识（deviceOpenId或deviceUnionId）
        @NameInMap("Id")
        public String id;

        // 设备Id的类型 - OPEN_ID：默认的设备ID标识 - UNION_ID: 组织维度的设备ID标识，在猫精技能应用开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
        @NameInMap("OrganizationId")
        public String organizationId;

        public static SendNotificationsRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            SendNotificationsRequestDeviceInfo self = new SendNotificationsRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public SendNotificationsRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public SendNotificationsRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public SendNotificationsRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SendNotificationsRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public SendNotificationsRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class SendNotificationsRequestNotificationUnicastRequestSendTarget extends TeaModel {
        public static SendNotificationsRequestNotificationUnicastRequestSendTarget build(java.util.Map<String, ?> map) throws Exception {
            SendNotificationsRequestNotificationUnicastRequestSendTarget self = new SendNotificationsRequestNotificationUnicastRequestSendTarget();
            return TeaModel.build(map, self);
        }

    }

    public static class SendNotificationsRequestNotificationUnicastRequest extends TeaModel {
        // 调试标识
        @NameInMap("IsDebug")
        public Boolean isDebug;

        // 消息模板，在天猫精灵应用平台中申请消息模板时得到的模板id。
        @NameInMap("MessageTemplateId")
        public String messageTemplateId;

        // 占位符信息，例如：模板是【你好，{nick}！】这里可以是：{"nick":"小甜甜"}
        @NameInMap("PlaceHolder")
        public java.util.Map<String, String> placeHolder;

        // 消息推送的目标信息。
        @NameInMap("SendTarget")
        public SendNotificationsRequestNotificationUnicastRequestSendTarget sendTarget;

        public static SendNotificationsRequestNotificationUnicastRequest build(java.util.Map<String, ?> map) throws Exception {
            SendNotificationsRequestNotificationUnicastRequest self = new SendNotificationsRequestNotificationUnicastRequest();
            return TeaModel.build(map, self);
        }

        public SendNotificationsRequestNotificationUnicastRequest setIsDebug(Boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }
        public Boolean getIsDebug() {
            return this.isDebug;
        }

        public SendNotificationsRequestNotificationUnicastRequest setMessageTemplateId(String messageTemplateId) {
            this.messageTemplateId = messageTemplateId;
            return this;
        }
        public String getMessageTemplateId() {
            return this.messageTemplateId;
        }

        public SendNotificationsRequestNotificationUnicastRequest setPlaceHolder(java.util.Map<String, String> placeHolder) {
            this.placeHolder = placeHolder;
            return this;
        }
        public java.util.Map<String, String> getPlaceHolder() {
            return this.placeHolder;
        }

        public SendNotificationsRequestNotificationUnicastRequest setSendTarget(SendNotificationsRequestNotificationUnicastRequestSendTarget sendTarget) {
            this.sendTarget = sendTarget;
            return this;
        }
        public SendNotificationsRequestNotificationUnicastRequestSendTarget getSendTarget() {
            return this.sendTarget;
        }

    }

    public static class SendNotificationsRequestTenantInfo extends TeaModel {
        public static SendNotificationsRequestTenantInfo build(java.util.Map<String, ?> map) throws Exception {
            SendNotificationsRequestTenantInfo self = new SendNotificationsRequestTenantInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class SendNotificationsRequestUserInfo extends TeaModel {
        // 编码类型对应的值，编码类型是SKILL_ID时，其值为应用的Skill ID； 编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，获取猫精的用户标识的途径有多种，不同途径对应不同的编码类型 - PACKAGE_NAME：apk包名，Android应用客户链路的编码类型 - SKILL_ID：技能ID，云端链路的编码类型
        @NameInMap("EncodeType")
        public String encodeType;

        // 用户标识（userOpenId或userUnionId）
        @NameInMap("Id")
        public String id;

        // 用户Id的类型 - OPEN_ID：默认的用户ID标识 - UNION_ID: 组织维度的用户ID标识，在猫精技能应用开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
        @NameInMap("OrganizationId")
        public String organizationId;

        public static SendNotificationsRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            SendNotificationsRequestUserInfo self = new SendNotificationsRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public SendNotificationsRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public SendNotificationsRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public SendNotificationsRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SendNotificationsRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public SendNotificationsRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
