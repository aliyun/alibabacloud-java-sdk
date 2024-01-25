// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductInstancesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListProductInstancesResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static ListProductInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductInstancesResponseBody self = new ListProductInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductInstancesResponseBody setData(ListProductInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductInstancesResponseBodyData getData() {
        return this.data;
    }

    public ListProductInstancesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListProductInstancesResponseBodyDataList extends TeaModel {
        @NameInMap("clusterUID")
        public String clusterUID;

        @NameInMap("continuousDeployment")
        public Boolean continuousDeployment;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("productName")
        public String productName;

        @NameInMap("productUID")
        public String productUID;

        @NameInMap("productVersion")
        public String productVersion;

        @NameInMap("productVersionSpecUID")
        public String productVersionSpecUID;

        @NameInMap("productVersionUID")
        public String productVersionUID;

        @NameInMap("status")
        public String status;

        @NameInMap("timeout")
        public Long timeout;

        @NameInMap("uid")
        public String uid;

        public static ListProductInstancesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListProductInstancesResponseBodyDataList self = new ListProductInstancesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListProductInstancesResponseBodyDataList setClusterUID(String clusterUID) {
            this.clusterUID = clusterUID;
            return this;
        }
        public String getClusterUID() {
            return this.clusterUID;
        }

        public ListProductInstancesResponseBodyDataList setContinuousDeployment(Boolean continuousDeployment) {
            this.continuousDeployment = continuousDeployment;
            return this;
        }
        public Boolean getContinuousDeployment() {
            return this.continuousDeployment;
        }

        public ListProductInstancesResponseBodyDataList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListProductInstancesResponseBodyDataList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductInstancesResponseBodyDataList setProductUID(String productUID) {
            this.productUID = productUID;
            return this;
        }
        public String getProductUID() {
            return this.productUID;
        }

        public ListProductInstancesResponseBodyDataList setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListProductInstancesResponseBodyDataList setProductVersionSpecUID(String productVersionSpecUID) {
            this.productVersionSpecUID = productVersionSpecUID;
            return this;
        }
        public String getProductVersionSpecUID() {
            return this.productVersionSpecUID;
        }

        public ListProductInstancesResponseBodyDataList setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public ListProductInstancesResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProductInstancesResponseBodyDataList setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public ListProductInstancesResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListProductInstancesResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListProductInstancesResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListProductInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductInstancesResponseBodyData self = new ListProductInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductInstancesResponseBodyData setList(java.util.List<ListProductInstancesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListProductInstancesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListProductInstancesResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListProductInstancesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProductInstancesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
