// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class SearchContentRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public SearchContentRequestDeviceInfo deviceInfo;

    @NameInMap("Request")
    public SearchContentRequestRequest request;

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
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdType")
        public String idType;

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
        @NameInMap("Cate")
        public String cate;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Query")
        public String query;

        @NameInMap("QueryAlbum")
        public Boolean queryAlbum;

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
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdType")
        public String idType;

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
