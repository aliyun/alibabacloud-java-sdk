// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateForwardingRulesResponseBody extends TeaModel {
    /**
     * <p>Details about the forwarding rules.</p>
     */
    @NameInMap("ForwardingRules")
    public java.util.List<CreateForwardingRulesResponseBodyForwardingRules> forwardingRules;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>64ADAB1E-0B7F-4FD8-A404-3BECC0E9CCFF</p>
     */
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
        /**
         * <p>The ID of the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>frule-bp1dii16gu9qdvb34****</p>
         */
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
