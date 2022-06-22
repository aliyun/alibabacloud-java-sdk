// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySingleSystemResourceMetricOfResourceOnNodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QuerySingleSystemResourceMetricOfResourceOnNodeResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySingleSystemResourceMetricOfResourceOnNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleSystemResourceMetricOfResourceOnNodeResponseBody self = new QuerySingleSystemResourceMetricOfResourceOnNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySingleSystemResourceMetricOfResourceOnNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySingleSystemResourceMetricOfResourceOnNodeResponseBody setData(java.util.List<QuerySingleSystemResourceMetricOfResourceOnNodeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySingleSystemResourceMetricOfResourceOnNodeResponseBodyData> getData() {
        return this.data;
    }

    public QuerySingleSystemResourceMetricOfResourceOnNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySingleSystemResourceMetricOfResourceOnNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySingleSystemResourceMetricOfResourceOnNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySingleSystemResourceMetricOfResourceOnNodeResponseBodyData extends TeaModel {
        @NameInMap("Resource")
        public String resource;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Val")
        public Float val;

        public static QuerySingleSystemResourceMetricOfResourceOnNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySingleSystemResourceMetricOfResourceOnNodeResponseBodyData self = new QuerySingleSystemResourceMetricOfResourceOnNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySingleSystemResourceMetricOfResourceOnNodeResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public QuerySingleSystemResourceMetricOfResourceOnNodeResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QuerySingleSystemResourceMetricOfResourceOnNodeResponseBodyData setVal(Float val) {
            this.val = val;
            return this;
        }
        public Float getVal() {
            return this.val;
        }

    }

}
