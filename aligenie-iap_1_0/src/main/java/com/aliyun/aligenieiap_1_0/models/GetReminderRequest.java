// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetReminderRequest extends TeaModel {
    /**
     * <p>List of device identity information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public GetReminderRequestDeviceInfo deviceInfo;

    /**
     * <p>Input parameters for the service request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public GetReminderRequestPayload payload;

    /**
     * <p>List of user identity information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public GetReminderRequestUserInfo userInfo;

    public static GetReminderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReminderRequest self = new GetReminderRequest();
        return TeaModel.build(map, self);
    }

    public GetReminderRequest setDeviceInfo(GetReminderRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetReminderRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetReminderRequest setPayload(GetReminderRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public GetReminderRequestPayload getPayload() {
        return this.payload;
    }

    public GetReminderRequest setUserInfo(GetReminderRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetReminderRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetReminderRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type.</p>
         * <ul>
         * <li>When the encoding type is SKILLID, the value is the application\&quot;s Skill ID.</li>
         * <li>When the encoding type is PACKAGENAME, the value is the packageName of the corresponding client app.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID for Tmall Genie, and each method corresponds to a different encoding type.  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used for the Android application customer link.  </li>
         * <li>SKILL_ID: Skill ID, used for the cloud-based link.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID, set to either deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of device ID.  </p>
         * <ul>
         * <li>OPEN_ID: The default device ID.  </li>
         * <li>UNION_ID: Organization-level device ID, available only after an organization has been requested on the Tmall Genie Skill Application Platform.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when <strong>IdType</strong> is set to <strong>UNION_ID</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetReminderRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetReminderRequestDeviceInfo self = new GetReminderRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetReminderRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetReminderRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetReminderRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetReminderRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetReminderRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetReminderRequestPayload extends TeaModel {
        /**
         * <p>The unique ID of the reminder.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20****34</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether this invocation is for debug purposes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDebug")
        public Boolean isDebug;

        public static GetReminderRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            GetReminderRequestPayload self = new GetReminderRequestPayload();
            return TeaModel.build(map, self);
        }

        public GetReminderRequestPayload setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetReminderRequestPayload setIsDebug(Boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }
        public Boolean getIsDebug() {
            return this.isDebug;
        }

    }

    public static class GetReminderRequestUserInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type.  </p>
         * <ul>
         * <li>When the encoding type is SKILLID, the value is the application\&quot;s Skill ID.  </li>
         * <li>When the encoding type is PACKAGENAME, the value is the packageName of the corresponding client app.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the user identifier for Tmall Genie, and each method corresponds to a different encoding type.</p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used for the Android application customer ingest endpoint.</li>
         * <li>SKILL_ID: Skill ID, used for the cloud-based ingest endpoint.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User identifier, set to either userOpenId or userUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of the User ID  </p>
         * <ul>
         * <li>OPEN_ID: The default User ID identifier.  </li>
         * <li>UNION_ID: The organization-dimension User ID identifier. This value is available only after an organization has been requested on the Tmall Genie Skills Application Open Platform.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when <strong>IdType</strong> is set to <strong>UNION_ID</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetReminderRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetReminderRequestUserInfo self = new GetReminderRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetReminderRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetReminderRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetReminderRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetReminderRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetReminderRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
