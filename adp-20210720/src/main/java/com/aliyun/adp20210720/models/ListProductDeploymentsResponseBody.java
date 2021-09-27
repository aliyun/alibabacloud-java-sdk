// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductDeploymentsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListProductDeploymentsResponseBodyData data;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static ListProductDeploymentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductDeploymentsResponseBody self = new ListProductDeploymentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductDeploymentsResponseBody setData(ListProductDeploymentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductDeploymentsResponseBodyData getData() {
        return this.data;
    }

    public ListProductDeploymentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductDeploymentsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListProductDeploymentsResponseBodyDataList extends TeaModel {
        @NameInMap("envUID")
        public String envUID;

        @NameInMap("status")
        public String status;

        @NameInMap("uid")
        public String uid;

        @NameInMap("productVersion")
        public String productVersion;

        @NameInMap("oldProductVersion")
        public String oldProductVersion;

        @NameInMap("packageInfoUID")
        public String packageInfoUID;

        @NameInMap("envParams")
        public String envParams;

        @NameInMap("packageType")
        public String packageType;

        @NameInMap("packageContentType")
        public String packageContentType;

        @NameInMap("productName")
        public String productName;

        public static ListProductDeploymentsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListProductDeploymentsResponseBodyDataList self = new ListProductDeploymentsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListProductDeploymentsResponseBodyDataList setEnvUID(String envUID) {
            this.envUID = envUID;
            return this;
        }
        public String getEnvUID() {
            return this.envUID;
        }

        public ListProductDeploymentsResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProductDeploymentsResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListProductDeploymentsResponseBodyDataList setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListProductDeploymentsResponseBodyDataList setOldProductVersion(String oldProductVersion) {
            this.oldProductVersion = oldProductVersion;
            return this;
        }
        public String getOldProductVersion() {
            return this.oldProductVersion;
        }

        public ListProductDeploymentsResponseBodyDataList setPackageInfoUID(String packageInfoUID) {
            this.packageInfoUID = packageInfoUID;
            return this;
        }
        public String getPackageInfoUID() {
            return this.packageInfoUID;
        }

        public ListProductDeploymentsResponseBodyDataList setEnvParams(String envParams) {
            this.envParams = envParams;
            return this;
        }
        public String getEnvParams() {
            return this.envParams;
        }

        public ListProductDeploymentsResponseBodyDataList setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public ListProductDeploymentsResponseBodyDataList setPackageContentType(String packageContentType) {
            this.packageContentType = packageContentType;
            return this;
        }
        public String getPackageContentType() {
            return this.packageContentType;
        }

        public ListProductDeploymentsResponseBodyDataList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class ListProductDeploymentsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListProductDeploymentsResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListProductDeploymentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductDeploymentsResponseBodyData self = new ListProductDeploymentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductDeploymentsResponseBodyData setList(java.util.List<ListProductDeploymentsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListProductDeploymentsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListProductDeploymentsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListProductDeploymentsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProductDeploymentsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
