// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentNodeResponseBody extends TeaModel {
    @NameInMap("data")
    public ListEnvironmentNodeResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ListEnvironmentNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentNodeResponseBody self = new ListEnvironmentNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentNodeResponseBody setData(ListEnvironmentNodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentNodeResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentNodeResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListEnvironmentNodeResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListEnvironmentNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnvironmentNodeResponseBodyDataList extends TeaModel {
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

        public static ListEnvironmentNodeResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentNodeResponseBodyDataList self = new ListEnvironmentNodeResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentNodeResponseBodyDataList setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListEnvironmentNodeResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnvironmentNodeResponseBodyDataList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListEnvironmentNodeResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnvironmentNodeResponseBodyDataList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListEnvironmentNodeResponseBodyDataList setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListEnvironmentNodeResponseBodyDataList setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public ListEnvironmentNodeResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListEnvironmentNodeResponseBodyDataList setVendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }
        public String getVendorType() {
            return this.vendorType;
        }

    }

    public static class ListEnvironmentNodeResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListEnvironmentNodeResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListEnvironmentNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentNodeResponseBodyData self = new ListEnvironmentNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentNodeResponseBodyData setList(java.util.List<ListEnvironmentNodeResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEnvironmentNodeResponseBodyDataList> getList() {
            return this.list;
        }

        public ListEnvironmentNodeResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListEnvironmentNodeResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListEnvironmentNodeResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
