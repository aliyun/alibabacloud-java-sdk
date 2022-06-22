// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySystemResourceMetricOfGroupOnNodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QuerySystemResourceMetricOfGroupOnNodeResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySystemResourceMetricOfGroupOnNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemResourceMetricOfGroupOnNodeResponseBody self = new QuerySystemResourceMetricOfGroupOnNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySystemResourceMetricOfGroupOnNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySystemResourceMetricOfGroupOnNodeResponseBody setData(java.util.List<QuerySystemResourceMetricOfGroupOnNodeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySystemResourceMetricOfGroupOnNodeResponseBodyData> getData() {
        return this.data;
    }

    public QuerySystemResourceMetricOfGroupOnNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySystemResourceMetricOfGroupOnNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySystemResourceMetricOfGroupOnNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySystemResourceMetricOfGroupOnNodeResponseBodyData extends TeaModel {
        @NameInMap("Resource")
        public String resource;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Val")
        public Float val;

        public static QuerySystemResourceMetricOfGroupOnNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySystemResourceMetricOfGroupOnNodeResponseBodyData self = new QuerySystemResourceMetricOfGroupOnNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySystemResourceMetricOfGroupOnNodeResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public QuerySystemResourceMetricOfGroupOnNodeResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QuerySystemResourceMetricOfGroupOnNodeResponseBodyData setVal(Float val) {
            this.val = val;
            return this;
        }
        public Float getVal() {
            return this.val;
        }

    }

}
