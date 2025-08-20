// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class SendNotificationsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public SendNotificationsRequestDeviceInfo deviceInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NotificationUnicastRequest")
    public SendNotificationsRequestNotificationUnicastRequest notificationUnicastRequest;

    @NameInMap("TenantInfo")
    public SendNotificationsRequestTenantInfo tenantInfo;

    /**
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <strong>example:</strong>
         * <p>1**2</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDebug")
        public Boolean isDebug;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2iU81*****G9elJ</p>
         */
        @NameInMap("MessageTemplateId")
        public String messageTemplateId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;nick&quot;:&quot;张三&quot;}</p>
         */
        @NameInMap("PlaceHolder")
        public java.util.Map<String, String> placeHolder;

        /**
         * <p>This parameter is required.</p>
         */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <strong>example:</strong>
         * <p>1**2</p>
         */
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
