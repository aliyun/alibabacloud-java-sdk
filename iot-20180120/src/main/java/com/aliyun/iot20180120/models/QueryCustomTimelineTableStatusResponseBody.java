// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryCustomTimelineTableStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryCustomTimelineTableStatusResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCustomTimelineTableStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomTimelineTableStatusResponseBody self = new QueryCustomTimelineTableStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCustomTimelineTableStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCustomTimelineTableStatusResponseBody setData(QueryCustomTimelineTableStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCustomTimelineTableStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryCustomTimelineTableStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryCustomTimelineTableStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCustomTimelineTableStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCustomTimelineTableStatusResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("HasNext")
        public Boolean hasNext;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ResultJson")
        public String resultJson;

        public static QueryCustomTimelineTableStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomTimelineTableStatusResponseBodyData self = new QueryCustomTimelineTableStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCustomTimelineTableStatusResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public QueryCustomTimelineTableStatusResponseBodyData setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public QueryCustomTimelineTableStatusResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryCustomTimelineTableStatusResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryCustomTimelineTableStatusResponseBodyData setResultJson(String resultJson) {
            this.resultJson = resultJson;
            return this;
        }
        public String getResultJson() {
            return this.resultJson;
        }

    }

}
