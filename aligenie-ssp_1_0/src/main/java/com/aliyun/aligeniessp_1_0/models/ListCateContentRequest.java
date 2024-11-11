// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCateContentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public ListCateContentRequestDeviceInfo deviceInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Request")
    public ListCateContentRequestRequest request;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public ListCateContentRequestUserInfo userInfo;

    public static ListCateContentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCateContentRequest self = new ListCateContentRequest();
        return TeaModel.build(map, self);
    }

    public ListCateContentRequest setDeviceInfo(ListCateContentRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ListCateContentRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ListCateContentRequest setRequest(ListCateContentRequestRequest request) {
        this.request = request;
        return this;
    }
    public ListCateContentRequestRequest getRequest() {
        return this.request;
    }

    public ListCateContentRequest setUserInfo(ListCateContentRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListCateContentRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListCateContentRequestDeviceInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListCateContentRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCateContentRequestDeviceInfo self = new ListCateContentRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ListCateContentRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListCateContentRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListCateContentRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCateContentRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListCateContentRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListCateContentRequestRequest extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80010</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAlbum")
        public Boolean isAlbum;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>hot_score</p>
         */
        @NameInMap("SortBy")
        public String sortBy;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        @NameInMap("SortOrder")
        public String sortOrder;

        public static ListCateContentRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            ListCateContentRequestRequest self = new ListCateContentRequestRequest();
            return TeaModel.build(map, self);
        }

        public ListCateContentRequestRequest setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public ListCateContentRequestRequest setIsAlbum(Boolean isAlbum) {
            this.isAlbum = isAlbum;
            return this;
        }
        public Boolean getIsAlbum() {
            return this.isAlbum;
        }

        public ListCateContentRequestRequest setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListCateContentRequestRequest setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCateContentRequestRequest setSortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }
        public String getSortBy() {
            return this.sortBy;
        }

        public ListCateContentRequestRequest setSortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public String getSortOrder() {
            return this.sortOrder;
        }

    }

    public static class ListCateContentRequestUserInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListCateContentRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCateContentRequestUserInfo self = new ListCateContentRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListCateContentRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListCateContentRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListCateContentRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCateContentRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListCateContentRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
