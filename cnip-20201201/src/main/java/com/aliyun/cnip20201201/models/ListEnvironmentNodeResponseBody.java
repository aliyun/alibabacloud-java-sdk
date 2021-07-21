// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentNodeResponseBody extends TeaModel {
    @NameInMap("data")
    public ListEnvironmentNodeResponseBodyData data;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

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

    public ListEnvironmentNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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

    public static class ListEnvironmentNodeResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<InstanceInfo> list;

        @NameInMap("pageNum")
        public Long pageNum;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("total")
        public Long total;

        public static ListEnvironmentNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentNodeResponseBodyData self = new ListEnvironmentNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentNodeResponseBodyData setList(java.util.List<InstanceInfo> list) {
            this.list = list;
            return this;
        }
        public java.util.List<InstanceInfo> getList() {
            return this.list;
        }

        public ListEnvironmentNodeResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListEnvironmentNodeResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListEnvironmentNodeResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
