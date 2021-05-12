// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListEnvironmentsResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ListEnvironmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsResponseBody self = new ListEnvironmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsResponseBody setData(ListEnvironmentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentsResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListEnvironmentsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListEnvironmentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnvironmentsResponseBodyDataListPlatform extends TeaModel {
        @NameInMap("architecture")
        public String architecture;

        @NameInMap("os")
        public String os;

        public static ListEnvironmentsResponseBodyDataListPlatform build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsResponseBodyDataListPlatform self = new ListEnvironmentsResponseBodyDataListPlatform();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsResponseBodyDataListPlatform setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListEnvironmentsResponseBodyDataListPlatform setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

    }

    public static class ListEnvironmentsResponseBodyDataList extends TeaModel {
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public Integer id;

        @NameInMap("location")
        public String location;

        @NameInMap("name")
        public String name;

        @NameInMap("platform")
        public ListEnvironmentsResponseBodyDataListPlatform platform;

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

        public static ListEnvironmentsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsResponseBodyDataList self = new ListEnvironmentsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsResponseBodyDataList setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListEnvironmentsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnvironmentsResponseBodyDataList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListEnvironmentsResponseBodyDataList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListEnvironmentsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnvironmentsResponseBodyDataList setPlatform(ListEnvironmentsResponseBodyDataListPlatform platform) {
            this.platform = platform;
            return this;
        }
        public ListEnvironmentsResponseBodyDataListPlatform getPlatform() {
            return this.platform;
        }

        public ListEnvironmentsResponseBodyDataList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListEnvironmentsResponseBodyDataList setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListEnvironmentsResponseBodyDataList setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public ListEnvironmentsResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListEnvironmentsResponseBodyDataList setVendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }
        public String getVendorType() {
            return this.vendorType;
        }

    }

    public static class ListEnvironmentsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListEnvironmentsResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListEnvironmentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsResponseBodyData self = new ListEnvironmentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsResponseBodyData setList(java.util.List<ListEnvironmentsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEnvironmentsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListEnvironmentsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListEnvironmentsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListEnvironmentsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
