// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentDeployRecordResponseBody extends TeaModel {
    @NameInMap("data")
    public ListEnvironmentDeployRecordResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ListEnvironmentDeployRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentDeployRecordResponseBody self = new ListEnvironmentDeployRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentDeployRecordResponseBody setData(ListEnvironmentDeployRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentDeployRecordResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentDeployRecordResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListEnvironmentDeployRecordResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListEnvironmentDeployRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnvironmentDeployRecordResponseBodyDataList extends TeaModel {
        @NameInMap("envUID")
        public String envUID;

        @NameInMap("provider")
        public String provider;

        @NameInMap("status")
        public String status;

        @NameInMap("uid")
        public String uid;

        public static ListEnvironmentDeployRecordResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentDeployRecordResponseBodyDataList self = new ListEnvironmentDeployRecordResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentDeployRecordResponseBodyDataList setEnvUID(String envUID) {
            this.envUID = envUID;
            return this;
        }
        public String getEnvUID() {
            return this.envUID;
        }

        public ListEnvironmentDeployRecordResponseBodyDataList setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListEnvironmentDeployRecordResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEnvironmentDeployRecordResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListEnvironmentDeployRecordResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListEnvironmentDeployRecordResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListEnvironmentDeployRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentDeployRecordResponseBodyData self = new ListEnvironmentDeployRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentDeployRecordResponseBodyData setList(java.util.List<ListEnvironmentDeployRecordResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEnvironmentDeployRecordResponseBodyDataList> getList() {
            return this.list;
        }

        public ListEnvironmentDeployRecordResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListEnvironmentDeployRecordResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListEnvironmentDeployRecordResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
