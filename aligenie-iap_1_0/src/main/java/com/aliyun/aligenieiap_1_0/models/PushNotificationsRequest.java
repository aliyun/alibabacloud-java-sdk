// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class PushNotificationsRequest extends TeaModel {
    /**
     * <p>Input parameter object for message push.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NotificationUnicastRequest")
    public PushNotificationsRequestNotificationUnicastRequest notificationUnicastRequest;

    /**
     * <p>Identity information.</p>
     */
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
        /**
         * <p>The identity value corresponding to the Push Target Type.</p>
         * 
         * <strong>example:</strong>
         * <p>2VpiDQ6aMjxz******Eo7r6e08oIVZ3fKrm5TyEfY=</p>
         */
        @NameInMap("TargetIdentity")
        public String targetIdentity;

        /**
         * <p>The type of the Push Target, indicating the type when obtaining the corresponding device or User Identifier:  </p>
         * <ul>
         * <li><code>DEVICE_UNION_ID</code>: device unionId  </li>
         * <li><code>DEVICE_OPEN_ID</code>: device openId  </li>
         * <li><code>USER_UNION_ID</code>: user unionId  </li>
         * <li><code>USER_OPEN_ID</code>: user openId</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEVICE_OPEN_ID</p>
         */
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
        /**
         * <p>The value corresponding to the encoding type.  </p>
         * <ul>
         * <li>When the encoding type is SKILL_ID, the value is the skill ID obtained from the webhook service.  </li>
         * <li>When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apk包名</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the Tmall Genie device ID, and each method corresponds to a different encoding type:  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name  </li>
         * <li>SKILL_ID: Skill ID</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Debug flag. When the skill application is in the debug phase, setting this flag determines whether the retrieved skill application information is from the editing state or the online state.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDebug")
        public Boolean isDebug;

        /**
         * <p>Message template ID obtained when applying for a message template on the Tmall Genie Application Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2iU81*****G9elJ</p>
         */
        @NameInMap("MessageTemplateId")
        public String messageTemplateId;

        /**
         * <p>Organization Identifier. This parameter is required only when the push type is <code>XX_UNION_XX</code>. If you obtain CatGenie device or user identifiers through multiple channels and need interoperability among them, you must request an organization from the platform. After approval, the platform will assign an organization identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <p>Placeholder information. For example, for the template [&quot;Hello, {nick}!&quot;], this could be {&quot;nick&quot;:&quot;Sweetie&quot;}. Additionally, within the placeholder parameters, you can append parameters to the application launch link to support hyperlinking to a specific address, such as: <code>{&quot;nick&quot;:&quot;Sweetie&quot;,&quot;_URL_SUFFIX_&quot;:&quot;xxx&quot;}</code>. The hyperlink address in the message pop-up will then be: application launch link + <code>${_URL_SUFFIX_}</code>. This feature only works for applications that have configured a launch link.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;nick&quot;:&quot;张三&quot;}</p>
         */
        @NameInMap("PlaceHolder")
        public java.util.Map<String, String> placeHolder;

        /**
         * <p>The target information for message push.</p>
         * <p>This parameter is required.</p>
         */
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
