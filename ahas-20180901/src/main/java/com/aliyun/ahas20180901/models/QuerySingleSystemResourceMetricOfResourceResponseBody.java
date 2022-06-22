// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySingleSystemResourceMetricOfResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QuerySingleSystemResourceMetricOfResourceResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySingleSystemResourceMetricOfResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleSystemResourceMetricOfResourceResponseBody self = new QuerySingleSystemResourceMetricOfResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySingleSystemResourceMetricOfResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySingleSystemResourceMetricOfResourceResponseBody setData(java.util.List<QuerySingleSystemResourceMetricOfResourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySingleSystemResourceMetricOfResourceResponseBodyData> getData() {
        return this.data;
    }

    public QuerySingleSystemResourceMetricOfResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySingleSystemResourceMetricOfResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySingleSystemResourceMetricOfResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySingleSystemResourceMetricOfResourceResponseBodyData extends TeaModel {
        @NameInMap("Resource")
        public String resource;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Val")
        public Float val;

        public static QuerySingleSystemResourceMetricOfResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySingleSystemResourceMetricOfResourceResponseBodyData self = new QuerySingleSystemResourceMetricOfResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySingleSystemResourceMetricOfResourceResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public QuerySingleSystemResourceMetricOfResourceResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QuerySingleSystemResourceMetricOfResourceResponseBodyData setVal(Float val) {
            this.val = val;
            return this;
        }
        public Float getVal() {
            return this.val;
        }

    }

}
