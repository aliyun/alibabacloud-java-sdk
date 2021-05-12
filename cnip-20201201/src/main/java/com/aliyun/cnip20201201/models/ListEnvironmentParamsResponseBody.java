// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentParamsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListEnvironmentParamsResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ListEnvironmentParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentParamsResponseBody self = new ListEnvironmentParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentParamsResponseBody setData(ListEnvironmentParamsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentParamsResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentParamsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListEnvironmentParamsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListEnvironmentParamsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnvironmentParamsResponseBodyDataList extends TeaModel {
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public Integer id;

        @NameInMap("name")
        public String name;

        @NameInMap("productName")
        public String productName;

        @NameInMap("productVersion")
        public String productVersion;

        @NameInMap("productVersionUID")
        public String productVersionUID;

        @NameInMap("uid")
        public String uid;

        @NameInMap("vendorType")
        public String vendorType;

        public static ListEnvironmentParamsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentParamsResponseBodyDataList self = new ListEnvironmentParamsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentParamsResponseBodyDataList setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListEnvironmentParamsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnvironmentParamsResponseBodyDataList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListEnvironmentParamsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnvironmentParamsResponseBodyDataList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListEnvironmentParamsResponseBodyDataList setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListEnvironmentParamsResponseBodyDataList setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public ListEnvironmentParamsResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListEnvironmentParamsResponseBodyDataList setVendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }
        public String getVendorType() {
            return this.vendorType;
        }

    }

    public static class ListEnvironmentParamsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListEnvironmentParamsResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListEnvironmentParamsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentParamsResponseBodyData self = new ListEnvironmentParamsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentParamsResponseBodyData setList(java.util.List<ListEnvironmentParamsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEnvironmentParamsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListEnvironmentParamsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListEnvironmentParamsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListEnvironmentParamsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
