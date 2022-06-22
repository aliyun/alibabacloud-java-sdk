// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySystemResourceMetricOfGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QuerySystemResourceMetricOfGroupResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySystemResourceMetricOfGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemResourceMetricOfGroupResponseBody self = new QuerySystemResourceMetricOfGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySystemResourceMetricOfGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySystemResourceMetricOfGroupResponseBody setData(java.util.List<QuerySystemResourceMetricOfGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySystemResourceMetricOfGroupResponseBodyData> getData() {
        return this.data;
    }

    public QuerySystemResourceMetricOfGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySystemResourceMetricOfGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySystemResourceMetricOfGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySystemResourceMetricOfGroupResponseBodyData extends TeaModel {
        @NameInMap("Resource")
        public String resource;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Val")
        public Float val;

        public static QuerySystemResourceMetricOfGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySystemResourceMetricOfGroupResponseBodyData self = new QuerySystemResourceMetricOfGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySystemResourceMetricOfGroupResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public QuerySystemResourceMetricOfGroupResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QuerySystemResourceMetricOfGroupResponseBodyData setVal(Float val) {
            this.val = val;
            return this;
        }
        public Float getVal() {
            return this.val;
        }

    }

}
