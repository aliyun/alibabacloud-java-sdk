// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAlarmRequest extends TeaModel {
    /**
     * <p>Device identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public GetAlarmRequestDeviceInfo deviceInfo;

    /**
     * <p>Input parameters for the service request</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public GetAlarmRequestPayload payload;

    /**
     * <p>User identifier information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public GetAlarmRequestUserInfo userInfo;

    public static GetAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmRequest self = new GetAlarmRequest();
        return TeaModel.build(map, self);
    }

    public GetAlarmRequest setDeviceInfo(GetAlarmRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetAlarmRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetAlarmRequest setPayload(GetAlarmRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public GetAlarmRequestPayload getPayload() {
        return this.payload;
    }

    public GetAlarmRequest setUserInfo(GetAlarmRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetAlarmRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetAlarmRequestDeviceInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type: when the encoding type is SKILL_ID, the value is the application\&quot;s SkillID; when the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding Type. There are multiple ways to obtain the device ID for Maojing, and each method corresponds to a different encoding Type: PACKAGE_NAME: APK package name, used for the Android application Customer link; SKILL_ID: Skill ID, used for the cloud link.</p>
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
         * <p>Type of Device ID:  </p>
         * <ul>
         * <li>OPEN_ID: default device ID identity  </li>
         * <li>UNION_ID: organization-dimension device ID identity, available only after an organization has been requested on the Maojing Skill Application Open Platform</li>
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

        public static GetAlarmRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmRequestDeviceInfo self = new GetAlarmRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetAlarmRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetAlarmRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetAlarmRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAlarmRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetAlarmRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetAlarmRequestPayload extends TeaModel {
        /**
         * <p>Alarm ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("AlarmId")
        public Long alarmId;

        public static GetAlarmRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmRequestPayload self = new GetAlarmRequestPayload();
            return TeaModel.build(map, self);
        }

        public GetAlarmRequestPayload setAlarmId(Long alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public Long getAlarmId() {
            return this.alarmId;
        }

    }

    public static class GetAlarmRequestUserInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type. If the encoding type is SKILL_ID, the value is the application\&quot;s SkillID. If the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the Maojing User Identifier, and each corresponds to a different encoding type:  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used for Android application customer-side flows  </li>
         * <li>SKILL_ID: Skill ID, used for cloud-side flows</li>
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
         * <p>Type of User ID: OPEN_ID: default User ID identifier; UNION_ID: organization-dimension User ID identifier, available only after an organization has been requested on the Maojing Skill Application Open Platform.</p>
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

        public static GetAlarmRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmRequestUserInfo self = new GetAlarmRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetAlarmRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetAlarmRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetAlarmRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAlarmRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetAlarmRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
