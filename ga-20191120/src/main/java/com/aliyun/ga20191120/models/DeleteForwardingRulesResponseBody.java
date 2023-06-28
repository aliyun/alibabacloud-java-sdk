// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteForwardingRulesResponseBody extends TeaModel {
    /**
     * <p>The forwarding rules.</p>
     */
    @NameInMap("ForwardingRules")
    public java.util.List<DeleteForwardingRulesResponseBodyForwardingRules> forwardingRules;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteForwardingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteForwardingRulesResponseBody self = new DeleteForwardingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteForwardingRulesResponseBody setForwardingRules(java.util.List<DeleteForwardingRulesResponseBodyForwardingRules> forwardingRules) {
        this.forwardingRules = forwardingRules;
        return this;
    }
    public java.util.List<DeleteForwardingRulesResponseBodyForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    public DeleteForwardingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteForwardingRulesResponseBodyForwardingRules extends TeaModel {
        /**
         * <p>The forwarding rule ID.</p>
         */
        @NameInMap("ForwardingRuleId")
        public String forwardingRuleId;

        public static DeleteForwardingRulesResponseBodyForwardingRules build(java.util.Map<String, ?> map) throws Exception {
            DeleteForwardingRulesResponseBodyForwardingRules self = new DeleteForwardingRulesResponseBodyForwardingRules();
            return TeaModel.build(map, self);
        }

        public DeleteForwardingRulesResponseBodyForwardingRules setForwardingRuleId(String forwardingRuleId) {
            this.forwardingRuleId = forwardingRuleId;
            return this;
        }
        public String getForwardingRuleId() {
            return this.forwardingRuleId;
        }

    }

}
