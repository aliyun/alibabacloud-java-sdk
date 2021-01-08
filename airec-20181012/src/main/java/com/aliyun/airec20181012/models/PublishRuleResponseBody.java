// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class PublishRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public PublishRuleResponseBodyResult result;

    public static PublishRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishRuleResponseBody self = new PublishRuleResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("RuleId")
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
