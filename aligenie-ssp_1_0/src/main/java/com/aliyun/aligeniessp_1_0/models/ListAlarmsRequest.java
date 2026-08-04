// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListAlarmsRequest extends TeaModel {
    /**
     * <p>Device identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public ListAlarmsRequestDeviceInfo deviceInfo;

    /**
     * <p>Input parameters for the service request</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public ListAlarmsRequestPayload payload;

    /**
     * <p>User identifier information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public ListAlarmsRequestUserInfo userInfo;

    public static ListAlarmsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmsRequest self = new ListAlarmsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmsRequest setDeviceInfo(ListAlarmsRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ListAlarmsRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ListAlarmsRequest setPayload(ListAlarmsRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public ListAlarmsRequestPayload getPayload() {
        return this.payload;
    }

    public ListAlarmsRequest setUserInfo(ListAlarmsRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListAlarmsRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListAlarmsRequestDeviceInfo extends TeaModel {
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
         * <p>Device ID type: OPEN_ID: default device ID; UNION_ID: organization-level device ID, available only after an organization has been requested on the Maojing Skill Application Open Platform.</p>
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

        public static ListAlarmsRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmsRequestDeviceInfo self = new ListAlarmsRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ListAlarmsRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListAlarmsRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListAlarmsRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAlarmsRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListAlarmsRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListAlarmsRequestPayload extends TeaModel {
        /**
         * <p>Current page</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>Number of entries per page: maximum value is 100</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListAlarmsRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmsRequestPayload self = new ListAlarmsRequestPayload();
            return TeaModel.build(map, self);
        }

        public ListAlarmsRequestPayload setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAlarmsRequestPayload setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListAlarmsRequestUserInfo extends TeaModel {
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
         * <p>Encoding type. There are multiple ways to obtain the user identifier for Maojing, and each method corresponds to a different encoding type: PACKAGE_NAME refers to the APK package name, which is the encoding type for the Android application customer link; SKILL_ID refers to the skill ID, which is the encoding type for the cloud link.</p>
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

        public static ListAlarmsRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmsRequestUserInfo self = new ListAlarmsRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListAlarmsRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListAlarmsRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListAlarmsRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAlarmsRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListAlarmsRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
