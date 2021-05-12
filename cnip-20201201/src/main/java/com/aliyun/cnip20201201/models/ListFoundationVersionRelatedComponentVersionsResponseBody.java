// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListFoundationVersionRelatedComponentVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public ListFoundationVersionRelatedComponentVersionsResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ListFoundationVersionRelatedComponentVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFoundationVersionRelatedComponentVersionsResponseBody self = new ListFoundationVersionRelatedComponentVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFoundationVersionRelatedComponentVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFoundationVersionRelatedComponentVersionsResponseBody setData(ListFoundationVersionRelatedComponentVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFoundationVersionRelatedComponentVersionsResponseBodyData getData() {
        return this.data;
    }

    public ListFoundationVersionRelatedComponentVersionsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListFoundationVersionRelatedComponentVersionsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListFoundationVersionRelatedComponentVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFoundationVersionRelatedComponentVersionsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ComponentVersion> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListFoundationVersionRelatedComponentVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFoundationVersionRelatedComponentVersionsResponseBodyData self = new ListFoundationVersionRelatedComponentVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFoundationVersionRelatedComponentVersionsResponseBodyData setList(java.util.List<ComponentVersion> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ComponentVersion> getList() {
            return this.list;
        }

        public ListFoundationVersionRelatedComponentVersionsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListFoundationVersionRelatedComponentVersionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFoundationVersionRelatedComponentVersionsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
