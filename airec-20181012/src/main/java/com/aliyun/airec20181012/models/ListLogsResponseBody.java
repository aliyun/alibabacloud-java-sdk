// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Headers")
    public ListLogsResponseBodyHeaders headers;

    @NameInMap("Result")
    public java.util.List<java.util.Map<String, ?>> result;

    public static ListLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogsResponseBody self = new ListLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogsResponseBody setHeaders(ListLogsResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListLogsResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListLogsResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

    public static class ListLogsResponseBodyHeaders extends TeaModel {
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListLogsResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListLogsResponseBodyHeaders self = new ListLogsResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListLogsResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

}
