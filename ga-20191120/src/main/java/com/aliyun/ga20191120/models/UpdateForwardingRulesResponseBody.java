// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateForwardingRulesResponseBody extends TeaModel {
    /**
     * <p>Details about the forwarding rules.</p>
     */
    @NameInMap("ForwardingRules")
    public java.util.List<UpdateForwardingRulesResponseBodyForwardingRules> forwardingRules;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateForwardingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateForwardingRulesResponseBody self = new UpdateForwardingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateForwardingRulesResponseBody setForwardingRules(java.util.List<UpdateForwardingRulesResponseBodyForwardingRules> forwardingRules) {
        this.forwardingRules = forwardingRules;
        return this;
    }
    public java.util.List<UpdateForwardingRulesResponseBodyForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    public UpdateForwardingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateForwardingRulesResponseBodyForwardingRules extends TeaModel {
        /**
         * <p>The forwarding rule ID.</p>
         */
        @NameInMap("ForwardingRuleId")
        public String forwardingRuleId;

        public static UpdateForwardingRulesResponseBodyForwardingRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesResponseBodyForwardingRules self = new UpdateForwardingRulesResponseBodyForwardingRules();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesResponseBodyForwardingRules setForwardingRuleId(String forwardingRuleId) {
            this.forwardingRuleId = forwardingRuleId;
            return this;
        }
        public String getForwardingRuleId() {
            return this.forwardingRuleId;
        }

    }

}
