// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListInterveneCntResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListInterveneCntResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListInterveneCntResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInterveneCntResponseBody self = new ListInterveneCntResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInterveneCntResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInterveneCntResponseBody setData(ListInterveneCntResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInterveneCntResponseBodyData getData() {
        return this.data;
    }

    public ListInterveneCntResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInterveneCntResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInterveneCntResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInterveneCntResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInterveneCntResponseBodyData extends TeaModel {
        @NameInMap("CntList")
        public java.util.List<?> cntList;

        @NameInMap("PageCnt")
        public Integer pageCnt;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListInterveneCntResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInterveneCntResponseBodyData self = new ListInterveneCntResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInterveneCntResponseBodyData setCntList(java.util.List<?> cntList) {
            this.cntList = cntList;
            return this;
        }
        public java.util.List<?> getCntList() {
            return this.cntList;
        }

        public ListInterveneCntResponseBodyData setPageCnt(Integer pageCnt) {
            this.pageCnt = pageCnt;
            return this;
        }
        public Integer getPageCnt() {
            return this.pageCnt;
        }

        public ListInterveneCntResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListInterveneCntResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
