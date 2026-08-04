// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetWeatherRequest extends TeaModel {
    /**
     * <p>Device ID information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public GetWeatherRequestDeviceInfo deviceInfo;

    /**
     * <p>Input parameters for the service request</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Payload")
    public GetWeatherRequestPayload payload;

    /**
     * <p>User identifier information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public GetWeatherRequestUserInfo userInfo;

    public static GetWeatherRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWeatherRequest self = new GetWeatherRequest();
        return TeaModel.build(map, self);
    }

    public GetWeatherRequest setDeviceInfo(GetWeatherRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetWeatherRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetWeatherRequest setPayload(GetWeatherRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public GetWeatherRequestPayload getPayload() {
        return this.payload;
    }

    public GetWeatherRequest setUserInfo(GetWeatherRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetWeatherRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetWeatherRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the application\&quot;s SkillID. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID of Maojing, and each way corresponds to a different encoding type: PACKAGE_NAME refers to the APK package name, which is the encoding type for the Android application customer link; SKILL_ID refers to the skill ID, which is the encoding type for the cloud link.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID (deviceOpenId or deviceUnionId)</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of the device ID: OPEN_ID is the default device ID identity; UNION_ID is the organization-dimension device ID identity, which is available only after an organization has been requested on the Maojing Skill Application Open Platform.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. This field is required when IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetWeatherRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWeatherRequestDeviceInfo self = new GetWeatherRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetWeatherRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetWeatherRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetWeatherRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetWeatherRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetWeatherRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetWeatherRequestPayload extends TeaModel {
        public static GetWeatherRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            GetWeatherRequestPayload self = new GetWeatherRequestPayload();
            return TeaModel.build(map, self);
        }

    }

    public static class GetWeatherRequestUserInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the application\&quot;s SkillID. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the user identifier for Maojing, and each method corresponds to a different encoding type: PACKAGE_NAME: APK package name, used for Android application customer links; SKILL_ID: skill ID, used for cloud-based links.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User Identifier (userOpenId or userUnionId)</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of user ID: OPEN_ID: default user ID identifier; UNION_ID: organization-dimension user ID identifier, available only after an organization has been requested on the Maojing Skill Application Open Platform.</p>
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

        public static GetWeatherRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWeatherRequestUserInfo self = new GetWeatherRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetWeatherRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetWeatherRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetWeatherRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetWeatherRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetWeatherRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
