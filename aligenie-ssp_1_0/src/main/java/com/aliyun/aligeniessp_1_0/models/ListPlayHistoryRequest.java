// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListPlayHistoryRequest extends TeaModel {
    /**
     * <p>Device identification information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public ListPlayHistoryRequestDeviceInfo deviceInfo;

    /**
     * <p>Request Parameters</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Request")
    public ListPlayHistoryRequestRequest request;

    /**
     * <p>User identification information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public ListPlayHistoryRequestUserInfo userInfo;

    public static ListPlayHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPlayHistoryRequest self = new ListPlayHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListPlayHistoryRequest setDeviceInfo(ListPlayHistoryRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ListPlayHistoryRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ListPlayHistoryRequest setRequest(ListPlayHistoryRequestRequest request) {
        this.request = request;
        return this;
    }
    public ListPlayHistoryRequestRequest getRequest() {
        return this.request;
    }

    public ListPlayHistoryRequest setUserInfo(ListPlayHistoryRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListPlayHistoryRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListPlayHistoryRequestDeviceInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type  </p>
         * <p>When the encoding type is SKILL_ID, this value is the application\&quot;s Skill ID.<br>When the encoding type is PACKAGE_NAME, this value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID for Tmall Genie, and each method corresponds to a different encoding type.  </p>
         * <p>PACKAGE_NAME: APK package name, used for Android application client-side identification.<br>SKILL_ID: Skill ID, used for cloud-based identification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
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
         * <p>Type of device ID  </p>
         * <p>OPEN_ID: Default device ID identity.<br>UNION_ID: Organization-dimension device ID identity. This value is available only after an organization has been registered on the Tmall Genie Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when IdType is UNION_ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListPlayHistoryRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPlayHistoryRequestDeviceInfo self = new ListPlayHistoryRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ListPlayHistoryRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListPlayHistoryRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListPlayHistoryRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPlayHistoryRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListPlayHistoryRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListPlayHistoryRequestRequest extends TeaModel {
        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>Number of records per page</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Type of content: music, program (audiobook), story, children_song, or radio</p>
         * 
         * <strong>example:</strong>
         * <p>music</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListPlayHistoryRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            ListPlayHistoryRequestRequest self = new ListPlayHistoryRequestRequest();
            return TeaModel.build(map, self);
        }

        public ListPlayHistoryRequestRequest setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListPlayHistoryRequestRequest setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPlayHistoryRequestRequest setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPlayHistoryRequestUserInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type.</p>
         * <p>When the encoding type is SKILL_ID, the value is the Skill ID of the application.
         * When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>The encoding type. There are multiple ways to obtain the User Identifier for Tmall Genie, and each method corresponds to a different encoding type.</p>
         * <p>PACKAGE_NAME: The APK package name. This is the encoding type for the Android application customer link.
         * SKILL_ID: The skill ID. This is the encoding type for the cloud-based link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>The User Identifier, which can be set to userOpenId or userUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of User ID.</p>
         * <p>OPEN_ID: The default User ID identity.
         * UNION_ID: The organization-dimension User ID identity. This value is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>The organization ID. This field is required when IdType is set to UNION_ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListPlayHistoryRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPlayHistoryRequestUserInfo self = new ListPlayHistoryRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListPlayHistoryRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListPlayHistoryRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListPlayHistoryRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPlayHistoryRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListPlayHistoryRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
