// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetBusAppConfigRequest extends TeaModel {
    /**
     * <p>Device ID information</p>
     */
    @NameInMap("DeviceInfo")
    public GetBusAppConfigRequestDeviceInfo deviceInfo;

    /**
     * <p>Business parameters</p>
     */
    @NameInMap("Payload")
    public GetBusAppConfigRequestPayload payload;

    /**
     * <p>User identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public GetBusAppConfigRequestUserInfo userInfo;

    public static GetBusAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusAppConfigRequest self = new GetBusAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetBusAppConfigRequest setDeviceInfo(GetBusAppConfigRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetBusAppConfigRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetBusAppConfigRequest setPayload(GetBusAppConfigRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public GetBusAppConfigRequestPayload getPayload() {
        return this.payload;
    }

    public GetBusAppConfigRequest setUserInfo(GetBusAppConfigRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetBusAppConfigRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetBusAppConfigRequestDeviceInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the application\&quot;s Skill ID. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID for Maojing, and each method corresponds to a different encoding type: PACKAGE_NAME: APK package name, used for Android application customer journeys; SKILL_ID: skill ID, used for cloud-based journeys.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL_ID</p>
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
         * <p>Type of device ID: OPEN_ID: default device ID; UNION_ID: organization-dimension device ID, available only after an organization has been requested on the Maojing Skill Application Open Platform.</p>
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

        public static GetBusAppConfigRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBusAppConfigRequestDeviceInfo self = new GetBusAppConfigRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetBusAppConfigRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetBusAppConfigRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetBusAppConfigRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetBusAppConfigRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetBusAppConfigRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetBusAppConfigRequestPayload extends TeaModel {
        /**
         * <p>Plaintext UUID</p>
         * 
         * <strong>example:</strong>
         * <p>731D5F********DC3B</p>
         */
        @NameInMap("originUuid")
        public String originUuid;

        /**
         * <p>Phone number</p>
         * 
         * <strong>example:</strong>
         * <p>136****1111</p>
         */
        @NameInMap("phone")
        public String phone;

        public static GetBusAppConfigRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            GetBusAppConfigRequestPayload self = new GetBusAppConfigRequestPayload();
            return TeaModel.build(map, self);
        }

        public GetBusAppConfigRequestPayload setOriginUuid(String originUuid) {
            this.originUuid = originUuid;
            return this;
        }
        public String getOriginUuid() {
            return this.originUuid;
        }

        public GetBusAppConfigRequestPayload setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class GetBusAppConfigRequestUserInfo extends TeaModel {
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
         * <p>Encoding type. There are multiple ways to obtain the user identifier for Maojing, and each method corresponds to a different encoding type: PACKAGE_NAME: APK package name, used for Android application customer ingest endpoints; SKILL_ID: skill ID, used for cloud-based ingest endpoints.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User Identifier (UserOpenId or UserUnionId)</p>
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

        public static GetBusAppConfigRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBusAppConfigRequestUserInfo self = new GetBusAppConfigRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetBusAppConfigRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetBusAppConfigRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetBusAppConfigRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetBusAppConfigRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetBusAppConfigRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
