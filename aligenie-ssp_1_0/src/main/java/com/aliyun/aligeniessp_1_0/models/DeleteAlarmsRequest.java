// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class DeleteAlarmsRequest extends TeaModel {
    /**
     * <p>Device identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public DeleteAlarmsRequestDeviceInfo deviceInfo;

    /**
     * <p>Input parameters for the service request</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public DeleteAlarmsRequestPayload payload;

    /**
     * <p>User Identifier information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public DeleteAlarmsRequestUserInfo userInfo;

    public static DeleteAlarmsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmsRequest self = new DeleteAlarmsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmsRequest setDeviceInfo(DeleteAlarmsRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public DeleteAlarmsRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public DeleteAlarmsRequest setPayload(DeleteAlarmsRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public DeleteAlarmsRequestPayload getPayload() {
        return this.payload;
    }

    public DeleteAlarmsRequest setUserInfo(DeleteAlarmsRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public DeleteAlarmsRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class DeleteAlarmsRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the SkillID of the application; when the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID for Maojing, and each method corresponds to a different encoding type: PACKAGE_NAME: APK package name, used in the Android application customer link; SKILL_ID: skill ID, used in the cloud link.</p>
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
         * <p>Type of the device ID: OPEN_ID: default device ID; UNION_ID: organization-dimension device ID, available only after an organization has been requested on the Maojing Skill Application Open Platform.</p>
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

        public static DeleteAlarmsRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteAlarmsRequestDeviceInfo self = new DeleteAlarmsRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public DeleteAlarmsRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public DeleteAlarmsRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public DeleteAlarmsRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteAlarmsRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public DeleteAlarmsRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class DeleteAlarmsRequestPayload extends TeaModel {
        /**
         * <p>Alarms to delete</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AlarmIds")
        public java.util.List<Long> alarmIds;

        public static DeleteAlarmsRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            DeleteAlarmsRequestPayload self = new DeleteAlarmsRequestPayload();
            return TeaModel.build(map, self);
        }

        public DeleteAlarmsRequestPayload setAlarmIds(java.util.List<Long> alarmIds) {
            this.alarmIds = alarmIds;
            return this;
        }
        public java.util.List<Long> getAlarmIds() {
            return this.alarmIds;
        }

    }

    public static class DeleteAlarmsRequestUserInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the application\&quot;s SkillID. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the User Identifier for Maojing, and each way corresponds to a different encoding type: PACKAGE_NAME refers to the APK package name, which is the encoding type for the Android application customer ingest endpoint; SKILL_ID refers to the skill ID, which is the encoding type for the cloud ingest endpoint.</p>
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
         * <li>OPEN_ID: The default User ID identity.  </li>
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
         * <p>Organization ID. Required when IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static DeleteAlarmsRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteAlarmsRequestUserInfo self = new DeleteAlarmsRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public DeleteAlarmsRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public DeleteAlarmsRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public DeleteAlarmsRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteAlarmsRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public DeleteAlarmsRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
