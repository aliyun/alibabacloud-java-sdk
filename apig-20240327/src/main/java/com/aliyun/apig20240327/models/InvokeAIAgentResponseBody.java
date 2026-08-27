// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class InvokeAIAgentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public InvokeAIAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A60EE5CA-1294-532A-9775-8D2FD1C6EFBF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static InvokeAIAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeAIAgentResponseBody self = new InvokeAIAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeAIAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvokeAIAgentResponseBody setData(InvokeAIAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InvokeAIAgentResponseBodyData getData() {
        return this.data;
    }

    public InvokeAIAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InvokeAIAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InvokeAIAgentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;choices&quot;:[{&quot;delta&quot;:{&quot;content&quot;:&quot;分析结果...&quot;}}]}</p>
         */
        @NameInMap("body")
        public String body;

        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("httpCode")
        public Integer httpCode;

        public static InvokeAIAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InvokeAIAgentResponseBodyData self = new InvokeAIAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InvokeAIAgentResponseBodyData setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public InvokeAIAgentResponseBodyData setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public InvokeAIAgentResponseBodyData setHttpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public Integer getHttpCode() {
            return this.httpCode;
        }

    }

}
