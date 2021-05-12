// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentsWithSnapshotResponseBody extends TeaModel {
    @NameInMap("data")
    public ListEnvironmentsWithSnapshotResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ListEnvironmentsWithSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsWithSnapshotResponseBody self = new ListEnvironmentsWithSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsWithSnapshotResponseBody setData(ListEnvironmentsWithSnapshotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentsWithSnapshotResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentsWithSnapshotResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListEnvironmentsWithSnapshotResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListEnvironmentsWithSnapshotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnvironmentsWithSnapshotResponseBodyDataList extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public Integer id;

        @NameInMap("instanceStatus")
        public String instanceStatus;

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

        public static ListEnvironmentsWithSnapshotResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsWithSnapshotResponseBodyDataList self = new ListEnvironmentsWithSnapshotResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsWithSnapshotResponseBodyDataList setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListEnvironmentsWithSnapshotResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnvironmentsWithSnapshotResponseBodyDataList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListEnvironmentsWithSnapshotResponseBodyDataList setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListEnvironmentsWithSnapshotResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnvironmentsWithSnapshotResponseBodyDataList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListEnvironmentsWithSnapshotResponseBodyDataList setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListEnvironmentsWithSnapshotResponseBodyDataList setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public ListEnvironmentsWithSnapshotResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListEnvironmentsWithSnapshotResponseBodyDataList setVendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }
        public String getVendorType() {
            return this.vendorType;
        }

    }

    public static class ListEnvironmentsWithSnapshotResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListEnvironmentsWithSnapshotResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListEnvironmentsWithSnapshotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsWithSnapshotResponseBodyData self = new ListEnvironmentsWithSnapshotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsWithSnapshotResponseBodyData setList(java.util.List<ListEnvironmentsWithSnapshotResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEnvironmentsWithSnapshotResponseBodyDataList> getList() {
            return this.list;
        }

        public ListEnvironmentsWithSnapshotResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListEnvironmentsWithSnapshotResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListEnvironmentsWithSnapshotResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
