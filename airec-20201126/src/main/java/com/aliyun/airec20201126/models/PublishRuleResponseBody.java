// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class PublishRuleResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public PublishRuleResponseBodyResult result;

    public static PublishRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishRuleResponseBody self = new PublishRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PublishRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PublishRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishRuleResponseBody setResult(PublishRuleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public PublishRuleResponseBodyResult getResult() {
        return this.result;
    }

    public static class PublishRuleResponseBodyResult extends TeaModel {
        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>98493A14-D619-4E88-9F8D-108939817F9F</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        public static PublishRuleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            PublishRuleResponseBodyResult self = new PublishRuleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public PublishRuleResponseBodyResult setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
