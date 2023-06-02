// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListSubAlbumRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public ListSubAlbumRequestDeviceInfo deviceInfo;

    /**
     * <p>request</p>
     */
    @NameInMap("QuerySubscriptionAlbumRequest")
    public ListSubAlbumRequestQuerySubscriptionAlbumRequest querySubscriptionAlbumRequest;

    @NameInMap("UserInfo")
    public ListSubAlbumRequestUserInfo userInfo;

    public static ListSubAlbumRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubAlbumRequest self = new ListSubAlbumRequest();
        return TeaModel.build(map, self);
    }

    public ListSubAlbumRequest setDeviceInfo(ListSubAlbumRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ListSubAlbumRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ListSubAlbumRequest setQuerySubscriptionAlbumRequest(ListSubAlbumRequestQuerySubscriptionAlbumRequest querySubscriptionAlbumRequest) {
        this.querySubscriptionAlbumRequest = querySubscriptionAlbumRequest;
        return this;
    }
    public ListSubAlbumRequestQuerySubscriptionAlbumRequest getQuerySubscriptionAlbumRequest() {
        return this.querySubscriptionAlbumRequest;
    }

    public ListSubAlbumRequest setUserInfo(ListSubAlbumRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListSubAlbumRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListSubAlbumRequestDeviceInfo extends TeaModel {
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

        public static ListSubAlbumRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSubAlbumRequestDeviceInfo self = new ListSubAlbumRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ListSubAlbumRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListSubAlbumRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListSubAlbumRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSubAlbumRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListSubAlbumRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListSubAlbumRequestQuerySubscriptionAlbumRequestPage extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListSubAlbumRequestQuerySubscriptionAlbumRequestPage build(java.util.Map<String, ?> map) throws Exception {
            ListSubAlbumRequestQuerySubscriptionAlbumRequestPage self = new ListSubAlbumRequestQuerySubscriptionAlbumRequestPage();
            return TeaModel.build(map, self);
        }

        public ListSubAlbumRequestQuerySubscriptionAlbumRequestPage setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListSubAlbumRequestQuerySubscriptionAlbumRequestPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListSubAlbumRequestQuerySubscriptionAlbumRequest extends TeaModel {
        @NameInMap("AlbumId")
        public String albumId;

        @NameInMap("CategoryId")
        public Integer categoryId;

        @NameInMap("Page")
        public ListSubAlbumRequestQuerySubscriptionAlbumRequestPage page;

        @NameInMap("Title")
        public String title;

        public static ListSubAlbumRequestQuerySubscriptionAlbumRequest build(java.util.Map<String, ?> map) throws Exception {
            ListSubAlbumRequestQuerySubscriptionAlbumRequest self = new ListSubAlbumRequestQuerySubscriptionAlbumRequest();
            return TeaModel.build(map, self);
        }

        public ListSubAlbumRequestQuerySubscriptionAlbumRequest setAlbumId(String albumId) {
            this.albumId = albumId;
            return this;
        }
        public String getAlbumId() {
            return this.albumId;
        }

        public ListSubAlbumRequestQuerySubscriptionAlbumRequest setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public ListSubAlbumRequestQuerySubscriptionAlbumRequest setPage(ListSubAlbumRequestQuerySubscriptionAlbumRequestPage page) {
            this.page = page;
            return this;
        }
        public ListSubAlbumRequestQuerySubscriptionAlbumRequestPage getPage() {
            return this.page;
        }

        public ListSubAlbumRequestQuerySubscriptionAlbumRequest setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListSubAlbumRequestUserInfo extends TeaModel {
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

        public static ListSubAlbumRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSubAlbumRequestUserInfo self = new ListSubAlbumRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListSubAlbumRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListSubAlbumRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListSubAlbumRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSubAlbumRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListSubAlbumRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
