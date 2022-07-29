// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListSubRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public ListSubRequestDeviceInfo deviceInfo;

    @NameInMap("Page")
    public ListSubRequestPage page;

    @NameInMap("UserInfo")
    public ListSubRequestUserInfo userInfo;

    public static ListSubRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubRequest self = new ListSubRequest();
        return TeaModel.build(map, self);
    }

    public ListSubRequest setDeviceInfo(ListSubRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ListSubRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ListSubRequest setPage(ListSubRequestPage page) {
        this.page = page;
        return this;
    }
    public ListSubRequestPage getPage() {
        return this.page;
    }

    public ListSubRequest setUserInfo(ListSubRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListSubRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListSubRequestDeviceInfo extends TeaModel {
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

        public static ListSubRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSubRequestDeviceInfo self = new ListSubRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ListSubRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListSubRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListSubRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSubRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListSubRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListSubRequestPage extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListSubRequestPage build(java.util.Map<String, ?> map) throws Exception {
            ListSubRequestPage self = new ListSubRequestPage();
            return TeaModel.build(map, self);
        }

        public ListSubRequestPage setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListSubRequestPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListSubRequestUserInfo extends TeaModel {
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

        public static ListSubRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSubRequestUserInfo self = new ListSubRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListSubRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListSubRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListSubRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSubRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListSubRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
