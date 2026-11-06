// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class DeleteReminderRequest extends TeaModel {
    /**
     * <p>device identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public DeleteReminderRequestDeviceInfo deviceInfo;

    /**
     * <p>Input parameters for the service request</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public DeleteReminderRequestPayload payload;

    /**
     * <p>User identifier information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public DeleteReminderRequestUserInfo userInfo;

    public static DeleteReminderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteReminderRequest self = new DeleteReminderRequest();
        return TeaModel.build(map, self);
    }

    public DeleteReminderRequest setDeviceInfo(DeleteReminderRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public DeleteReminderRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public DeleteReminderRequest setPayload(DeleteReminderRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public DeleteReminderRequestPayload getPayload() {
        return this.payload;
    }

    public DeleteReminderRequest setUserInfo(DeleteReminderRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public DeleteReminderRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class DeleteReminderRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type. When the encoding type is <code>SKILL_ID</code>, the value is the application\&quot;s Skill ID. When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>encoding type; there are multiple ways to obtain the Tmall Genie device ID, and each method corresponds to a different encoding type  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used in the Android application customer flow  </li>
         * <li>SKILL_ID: skill ID, used in the cloud-based flow</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>device ID (deviceOpenId or deviceUnionId)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>type of device ID  </p>
         * <ul>
         * <li>OPEN_ID: default device ID  </li>
         * <li>UNION_ID: organization-level device ID; available only after an organization has been requested on the Tmall Genie Skill Application Open Platform</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>organization ID; required if IdType is <code>UNION_ID</code></p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static DeleteReminderRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteReminderRequestDeviceInfo self = new DeleteReminderRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public DeleteReminderRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public DeleteReminderRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public DeleteReminderRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteReminderRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public DeleteReminderRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class DeleteReminderRequestPayload extends TeaModel {
        /**
         * <p>Unique ID of the reminder</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20****34</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Debug flag</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDebug")
        public Boolean isDebug;

        public static DeleteReminderRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            DeleteReminderRequestPayload self = new DeleteReminderRequestPayload();
            return TeaModel.build(map, self);
        }

        public DeleteReminderRequestPayload setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteReminderRequestPayload setIsDebug(Boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }
        public Boolean getIsDebug() {
            return this.isDebug;
        }

    }

    public static class DeleteReminderRequestUserInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type. When the encoding type is <code>SKILL_ID</code>, the value is the application\&quot;s Skill ID. When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the user identifier for Maojing, and each method corresponds to a different encoding type:  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used for the Android application customer ingest endpoint  </li>
         * <li>SKILL_ID: Skill ID, used for the cloud service ingest endpoint</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL_ID</p>
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
         * <p>Type of the User ID:</p>
         * <ul>
         * <li>OPEN_ID: The default User ID identity.</li>
         * <li>UNION_ID: The User ID identity at the organization dimension. This is available only after an organization has been requested on the Maojing Skill Application Open Platform.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when IdType is <code>UNION_ID</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static DeleteReminderRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteReminderRequestUserInfo self = new DeleteReminderRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public DeleteReminderRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public DeleteReminderRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public DeleteReminderRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteReminderRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public DeleteReminderRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
