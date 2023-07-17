// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListDispatchRuleResponseBody extends TeaModel {
    @NameInMap("DispatchRules")
    public java.util.List<ListDispatchRuleResponseBodyDispatchRules> dispatchRules;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDispatchRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDispatchRuleResponseBody self = new ListDispatchRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDispatchRuleResponseBody setDispatchRules(java.util.List<ListDispatchRuleResponseBodyDispatchRules> dispatchRules) {
        this.dispatchRules = dispatchRules;
        return this;
    }
    public java.util.List<ListDispatchRuleResponseBodyDispatchRules> getDispatchRules() {
        return this.dispatchRules;
    }

    public ListDispatchRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDispatchRuleResponseBodyDispatchRules extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("State")
        public String state;

        public static ListDispatchRuleResponseBodyDispatchRules build(java.util.Map<String, ?> map) throws Exception {
            ListDispatchRuleResponseBodyDispatchRules self = new ListDispatchRuleResponseBodyDispatchRules();
            return TeaModel.build(map, self);
        }

        public ListDispatchRuleResponseBodyDispatchRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDispatchRuleResponseBodyDispatchRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListDispatchRuleResponseBodyDispatchRules setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
