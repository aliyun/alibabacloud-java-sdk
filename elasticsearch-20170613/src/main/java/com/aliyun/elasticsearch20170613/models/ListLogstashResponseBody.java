// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListLogstashResponseBodyHeaders headers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<Logstash> result;

    public static ListLogstashResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogstashResponseBody self = new ListLogstashResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogstashResponseBody setHeaders(ListLogstashResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListLogstashResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListLogstashResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogstashResponseBody setResult(java.util.List<Logstash> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Logstash> getResult() {
        return this.result;
    }

    public static class ListLogstashResponseBodyHeaders extends TeaModel {
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListLogstashResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListLogstashResponseBodyHeaders self = new ListLogstashResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListLogstashResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

}
