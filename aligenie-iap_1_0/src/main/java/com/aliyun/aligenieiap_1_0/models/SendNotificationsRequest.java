// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class SendNotificationsRequest extends TeaModel {
    /**
     * <p>Device identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public SendNotificationsRequestDeviceInfo deviceInfo;

    /**
     * <p>Input parameter object for message push.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NotificationUnicastRequest")
    public SendNotificationsRequestNotificationUnicastRequest notificationUnicastRequest;

    /**
     * <p>Identity information.</p>
     */
    @NameInMap("TenantInfo")
    public SendNotificationsRequestTenantInfo tenantInfo;

    /**
     * <p>User Identifier information</p>
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
         * <p>Value corresponding to the encoding type. If the encoding type is SKILL_ID, the value is the application\&quot;s Skill ID. If the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID for Maojing, and each method corresponds to a different encoding type:  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used for the Android application customer link  </li>
         * <li>SKILL_ID: Skill ID, used for the cloud link</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID (deviceOpenId or deviceUnionId)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of device ID:  </p>
         * <ul>
         * <li>OPEN_ID: Default device ID  </li>
         * <li>UNION_ID: Organization-dimension device ID, available only after an organization has been requested on the Maojing Skill Application Open Platform</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required if IdType is UNION_ID.</p>
         * 
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
         * <p>Debug flag. When the skill application is in the debugging phase, setting this flag determines whether the retrieved skill application information is from the editing state or the online state.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDebug")
        public Boolean isDebug;

        /**
         * <p>Message template ID obtained when requesting a message template in the Tmall Genie Application Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2iU81*****G9elJ</p>
         */
        @NameInMap("MessageTemplateId")
        public String messageTemplateId;

        /**
         * <p>Placeholder information. For example, for the template [&quot;Hello, {nick}!&quot;], this can be: {&quot;nick&quot;:&quot;Xiao Tian Tian&quot;}. Additionally, within the placeholder parameters, you can append parameters to the application launch link to support hyperlinking to a specific address, such as: <code>{&quot;nick&quot;:&quot;Xiao Tian Tian&quot;,&quot;_URL_SUFFIX_&quot;:&quot;xxx&quot;}</code>. The hyperlink address in the message pop-up will then be: application launch link + <code>${_URL_SUFFIX_}</code>. This feature is only effective for applications that have configured a launch link.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;nick&quot;:&quot;张三&quot;}</p>
         */
        @NameInMap("PlaceHolder")
        public java.util.Map<String, String> placeHolder;

        /**
         * <p>Target information for message push.</p>
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
         * <p>Value corresponding to the encoding type. If the encoding type is SKILL_ID, the value is the application\&quot;s Skill ID. If the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the Maojing User Identifier, and each method corresponds to a different encoding type:  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used for the Android application customer link  </li>
         * <li>SKILL_ID: Skill ID, used for the cloud-based link</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User Identifier (userOpenId or userUnionId)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of the User ID:  </p>
         * <ul>
         * <li>OPEN_ID: Default User ID identifier  </li>
         * <li>UNION_ID: Organization-dimension User ID identifier, available only after an organization has been requested on the Maojing Skill Application Open Platform</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required if IdType is UNION_ID.</p>
         * 
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
