// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListLogsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("headers")
    public ListLogsResponseBodyHeaders headers;

    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    public static ListLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogsResponseBody self = new ListLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLogsResponseBody setHeaders(ListLogsResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListLogsResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
