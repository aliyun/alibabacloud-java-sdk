// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class InvokeActionResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>346E5EE9-D5FE-56A0-B3E2-A43E0F67302A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public InvokeActionResponseBodyResult result;

    public static InvokeActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeActionResponseBody self = new InvokeActionResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeActionResponseBody setResult(InvokeActionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public InvokeActionResponseBodyResult getResult() {
        return this.result;
    }

    public static class InvokeActionResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>The provided parameter xxx is invalid.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;output&quot;: {
         *     &quot;finishReason&quot;: &quot;stop&quot;,
         *     &quot;text&quot;: &quot;hello&quot;
         *   },
         *   &quot;requestId&quot;: &quot;433944e3-2163-9c7a-9664-2a27c0dda0ec&quot;,
         *   &quot;usage&quot;: {
         *     &quot;inputTokens&quot;: 13,
         *     &quot;outputTokens&quot;: 16,
         *     &quot;totalTokens&quot;: 29
         *   }
         * }</p>
         */
        @NameInMap("Output")
        public Object output;

        /**
         * <strong>example:</strong>
         * <p>RUNNING、COMPLETED</p>
         */
        @NameInMap("Status")
        public String status;

        public static InvokeActionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            InvokeActionResponseBodyResult self = new InvokeActionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public InvokeActionResponseBodyResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public InvokeActionResponseBodyResult setOutput(Object output) {
            this.output = output;
            return this;
        }
        public Object getOutput() {
            return this.output;
        }

        public InvokeActionResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
