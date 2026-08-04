// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class SearchContentRequest extends TeaModel {
    /**
     * <p>Device identification information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public SearchContentRequestDeviceInfo deviceInfo;

    /**
     * <p>Request Parameters</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Request")
    public SearchContentRequestRequest request;

    /**
     * <p>User identification information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public SearchContentRequestUserInfo userInfo;

    public static SearchContentRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchContentRequest self = new SearchContentRequest();
        return TeaModel.build(map, self);
    }

    public SearchContentRequest setDeviceInfo(SearchContentRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public SearchContentRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public SearchContentRequest setRequest(SearchContentRequestRequest request) {
        this.request = request;
        return this;
    }
    public SearchContentRequestRequest getRequest() {
        return this.request;
    }

    public SearchContentRequest setUserInfo(SearchContentRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public SearchContentRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class SearchContentRequestDeviceInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type.  </p>
         * <p>When the encoding type is <code>SKILL_ID</code>, the value is the application\&quot;s Skill ID.<br>When the encoding type is <code>PACKAGE_NAME</code>, the value is the <code>packageName</code> of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID for Tmall Genie, and each method corresponds to a different encoding type.  </p>
         * <p><code>PACKAGE_NAME</code>: APK package name, used for the Android application customer link.<br><code>SKILL_ID</code>: Skill ID, used for the cloud-based link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID, set to either <code>deviceOpenId</code> or <code>deviceUnionId</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of device ID.  </p>
         * <p><code>OPEN_ID</code>: Default device ID identity.<br><code>UNION_ID</code>: Organization-dimension device ID identity. This value is available only after an organization has been registered on the Tmall Genie Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when <code>IdType</code> is <code>UNION_ID</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static SearchContentRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchContentRequestDeviceInfo self = new SearchContentRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public SearchContentRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public SearchContentRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public SearchContentRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchContentRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public SearchContentRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class SearchContentRequestRequest extends TeaModel {
        /**
         * <p>The search scope: music or audio.<br>Input parameter enumeration: music | program</p>
         * 
         * <strong>example:</strong>
         * <p>music</p>
         */
        @NameInMap("Cate")
        public String cate;

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
         * <p>Query keyword</p>
         * 
         * <strong>example:</strong>
         * <p>周杰伦</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>Whether to query albums</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("QueryAlbum")
        public Boolean queryAlbum;

        /**
         * <p>When <code>cate</code> is <code>music</code>, <code>subCate</code> can be omitted.<br>If <code>subCate</code> is provided, it can be one of the following:<br><code>song</code> (Song), <code>singer</code> (Artist), <code>album</code> (Album).  </p>
         * <p>When <code>cate</code> is <code>program</code>, <code>subCate</code> can be omitted.<br>If <code>subCate</code> is provided, it can be one of the following:<br><code>album</code> (Album), <code>audio</code> (Program Audio), <code>radio</code> (Radio Station).</p>
         * 
         * <strong>example:</strong>
         * <p>singer</p>
         */
        @NameInMap("SubCate")
        public String subCate;

        public static SearchContentRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            SearchContentRequestRequest self = new SearchContentRequestRequest();
            return TeaModel.build(map, self);
        }

        public SearchContentRequestRequest setCate(String cate) {
            this.cate = cate;
            return this;
        }
        public String getCate() {
            return this.cate;
        }

        public SearchContentRequestRequest setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public SearchContentRequestRequest setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchContentRequestRequest setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public SearchContentRequestRequest setQueryAlbum(Boolean queryAlbum) {
            this.queryAlbum = queryAlbum;
            return this;
        }
        public Boolean getQueryAlbum() {
            return this.queryAlbum;
        }

        public SearchContentRequestRequest setSubCate(String subCate) {
            this.subCate = subCate;
            return this;
        }
        public String getSubCate() {
            return this.subCate;
        }

    }

    public static class SearchContentRequestUserInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type.</p>
         * <p>When the encoding type is SKILL_ID, the value is the Skill ID of the application.<br>When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the user identifier for Tmall Genie, and each method corresponds to a different encoding type.  </p>
         * <p><code>PACKAGE_NAME</code>: APK package name, used for the Android application customer link.<br><code>SKILL_ID</code>: Skill ID, used for the cloud-based link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User identifier, set to either <code>userOpenId</code> or <code>userUnionId</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The Type of the User ID.</p>
         * <p>OPEN_ID: The default User ID identity.<br>UNION_ID: The organization-dimension User ID identity. This value is available only after an organization has been requested on the Tmall Genie Skills Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when <code>IdType</code> is <code>UNION_ID</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static SearchContentRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchContentRequestUserInfo self = new SearchContentRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public SearchContentRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public SearchContentRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public SearchContentRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchContentRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public SearchContentRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
