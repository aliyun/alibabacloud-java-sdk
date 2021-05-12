// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentPackagesResponseBody extends TeaModel {
    @NameInMap("data")
    public ListEnvironmentPackagesResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ListEnvironmentPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentPackagesResponseBody self = new ListEnvironmentPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentPackagesResponseBody setData(ListEnvironmentPackagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentPackagesResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentPackagesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListEnvironmentPackagesResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListEnvironmentPackagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnvironmentPackagesResponseBodyDataList extends TeaModel {
        @NameInMap("envUID")
        public String envUID;

        @NameInMap("provider")
        public String provider;

        @NameInMap("status")
        public String status;

        @NameInMap("uid")
        public String uid;

        @NameInMap("url")
        public String url;

        public static ListEnvironmentPackagesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentPackagesResponseBodyDataList self = new ListEnvironmentPackagesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentPackagesResponseBodyDataList setEnvUID(String envUID) {
            this.envUID = envUID;
            return this;
        }
        public String getEnvUID() {
            return this.envUID;
        }

        public ListEnvironmentPackagesResponseBodyDataList setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListEnvironmentPackagesResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEnvironmentPackagesResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListEnvironmentPackagesResponseBodyDataList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListEnvironmentPackagesResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListEnvironmentPackagesResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListEnvironmentPackagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentPackagesResponseBodyData self = new ListEnvironmentPackagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentPackagesResponseBodyData setList(java.util.List<ListEnvironmentPackagesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEnvironmentPackagesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListEnvironmentPackagesResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListEnvironmentPackagesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListEnvironmentPackagesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
