// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateForwardingRulesResponseBody extends TeaModel {
    @NameInMap("ForwardingRules")
    public java.util.List<CreateForwardingRulesResponseBodyForwardingRules> forwardingRules;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateForwardingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardingRulesResponseBody self = new CreateForwardingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateForwardingRulesResponseBody setForwardingRules(java.util.List<CreateForwardingRulesResponseBodyForwardingRules> forwardingRules) {
        this.forwardingRules = forwardingRules;
        return this;
    }
    public java.util.List<CreateForwardingRulesResponseBodyForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    public CreateForwardingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateForwardingRulesResponseBodyForwardingRules extends TeaModel {
        @NameInMap("ForwardingRuleId")
        public String forwardingRuleId;

        public static CreateForwardingRulesResponseBodyForwardingRules build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesResponseBodyForwardingRules self = new CreateForwardingRulesResponseBodyForwardingRules();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesResponseBodyForwardingRules setForwardingRuleId(String forwardingRuleId) {
            this.forwardingRuleId = forwardingRuleId;
            return this;
        }
        public String getForwardingRuleId() {
            return this.forwardingRuleId;
        }

    }

}
