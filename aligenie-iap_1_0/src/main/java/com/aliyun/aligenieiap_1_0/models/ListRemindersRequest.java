// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class ListRemindersRequest extends TeaModel {
    /**
     * <p>List of device identity information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public ListRemindersRequestDeviceInfo deviceInfo;

    /**
     * <p>Input parameters for the service request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public ListRemindersRequestPayload payload;

    /**
     * <p>List of user identity information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public ListRemindersRequestUserInfo userInfo;

    public static ListRemindersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRemindersRequest self = new ListRemindersRequest();
        return TeaModel.build(map, self);
    }

    public ListRemindersRequest setDeviceInfo(ListRemindersRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ListRemindersRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ListRemindersRequest setPayload(ListRemindersRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public ListRemindersRequestPayload getPayload() {
        return this.payload;
    }

    public ListRemindersRequest setUserInfo(ListRemindersRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListRemindersRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListRemindersRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type.</p>
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
         * <p>Encoding type. There are multiple ways to obtain the device ID for Tmall Genie, and each method corresponds to a different encoding type.  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used in the Android application customer flow.  </li>
         * <li>SKILL_ID: Skill ID, used in the cloud-based flow.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID, either deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of the device ID.  </p>
         * <ul>
         * <li>OPEN_ID: The default device ID.  </li>
         * <li>UNION_ID: Organization-level device ID. This value is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</li>
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

        public static ListRemindersRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRemindersRequestDeviceInfo self = new ListRemindersRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ListRemindersRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListRemindersRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListRemindersRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRemindersRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListRemindersRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListRemindersRequestPayload extends TeaModel {
        /**
         * <p>Indicates whether this invocation is for debug purposes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDebug")
        public Boolean isDebug;

        public static ListRemindersRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            ListRemindersRequestPayload self = new ListRemindersRequestPayload();
            return TeaModel.build(map, self);
        }

        public ListRemindersRequestPayload setIsDebug(Boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }
        public Boolean getIsDebug() {
            return this.isDebug;
        }

    }

    public static class ListRemindersRequestUserInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type:</p>
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
         * <p>Encoding type. There are multiple ways to obtain the user identifier for Tmall Genie, and each method corresponds to a different encoding type.  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used for the Android application customer ingest endpoint.  </li>
         * <li>SKILL_ID: Skill ID, used for the cloud-side ingest endpoint.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User Identifier, either userOpenId or userUnionId.</p>
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
         * <li>UNION_ID: The User ID identity at the organization dimension. This value is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. This parameter is required when <strong>IdType</strong> is configured as <strong>UNION_ID</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListRemindersRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRemindersRequestUserInfo self = new ListRemindersRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListRemindersRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListRemindersRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListRemindersRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRemindersRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListRemindersRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
