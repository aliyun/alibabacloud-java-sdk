// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class QueryMusicTypeRequest extends TeaModel {
    /**
     * <p>Device identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public QueryMusicTypeRequestDeviceInfo deviceInfo;

    /**
     * <p>Input parameters for the service request</p>
     */
    @NameInMap("Payload")
    public QueryMusicTypeRequestPayload payload;

    /**
     * <p>User identifier information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public QueryMusicTypeRequestUserInfo userInfo;

    public static QueryMusicTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMusicTypeRequest self = new QueryMusicTypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryMusicTypeRequest setDeviceInfo(QueryMusicTypeRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public QueryMusicTypeRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public QueryMusicTypeRequest setPayload(QueryMusicTypeRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public QueryMusicTypeRequestPayload getPayload() {
        return this.payload;
    }

    public QueryMusicTypeRequest setUserInfo(QueryMusicTypeRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public QueryMusicTypeRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class QueryMusicTypeRequestDeviceInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the application\&quot;s SkillID. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device identity for Maojing, and each way corresponds to a different encoding type: PACKAGE_NAME: APK package name, used for the Android application customer link; SKILL_ID: skill ID, used for the cloud link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
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
         * <p>Type of the device ID: OPEN_ID: default device ID; UNION_ID: organization-level device ID, available only after requesting an organization in the Maojing Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static QueryMusicTypeRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMusicTypeRequestDeviceInfo self = new QueryMusicTypeRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryMusicTypeRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public QueryMusicTypeRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public QueryMusicTypeRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryMusicTypeRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public QueryMusicTypeRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class QueryMusicTypeRequestPayload extends TeaModel {
        public static QueryMusicTypeRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            QueryMusicTypeRequestPayload self = new QueryMusicTypeRequestPayload();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMusicTypeRequestUserInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the application\&quot;s SkillID. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the Maojing user identifier, and each way corresponds to a different encoding type: PACKAGE_NAME: APK package name, used for Android application customer journeys; SKILL_ID: skill ID, used for cloud-based journeys.</p>
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
         * <p>Type of User ID: OPEN_ID: default User ID identity; UNION_ID: organization-dimension User ID identity, available only after an organization has been requested on the Maojing Skill Application Open Platform.</p>
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

        public static QueryMusicTypeRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMusicTypeRequestUserInfo self = new QueryMusicTypeRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public QueryMusicTypeRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public QueryMusicTypeRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public QueryMusicTypeRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryMusicTypeRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public QueryMusicTypeRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
