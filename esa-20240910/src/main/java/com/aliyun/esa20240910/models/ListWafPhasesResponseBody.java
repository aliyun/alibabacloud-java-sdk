// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafPhasesResponseBody extends TeaModel {
    /**
     * <p>The WAF rule categories.</p>
     */
    @NameInMap("Phases")
    public java.util.List<ListWafPhasesResponseBodyPhases> phases;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListWafPhasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWafPhasesResponseBody self = new ListWafPhasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWafPhasesResponseBody setPhases(java.util.List<ListWafPhasesResponseBodyPhases> phases) {
        this.phases = phases;
        return this;
    }
    public java.util.List<ListWafPhasesResponseBodyPhases> getPhases() {
        return this.phases;
    }

    public ListWafPhasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListWafPhasesResponseBodyPhasesRulesets extends TeaModel {
        /**
         * <p>The ID of the WAF ruleset.<a href="~~2850233~~"></a></p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the WAF ruleset.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rule configurations in the WAF ruleset.</p>
         */
        @NameInMap("Rules")
        public java.util.List<WafRuleConfig> rules;

        /**
         * <p>The configurations shared by the rules in the WAF ruleset.</p>
         */
        @NameInMap("Shared")
        public WafBatchRuleShared shared;

        public static ListWafPhasesResponseBodyPhasesRulesets build(java.util.Map<String, ?> map) throws Exception {
            ListWafPhasesResponseBodyPhasesRulesets self = new ListWafPhasesResponseBodyPhasesRulesets();
            return TeaModel.build(map, self);
        }

        public ListWafPhasesResponseBodyPhasesRulesets setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWafPhasesResponseBodyPhasesRulesets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWafPhasesResponseBodyPhasesRulesets setRules(java.util.List<WafRuleConfig> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<WafRuleConfig> getRules() {
            return this.rules;
        }

        public ListWafPhasesResponseBodyPhasesRulesets setShared(WafBatchRuleShared shared) {
            this.shared = shared;
            return this;
        }
        public WafBatchRuleShared getShared() {
            return this.shared;
        }

    }

    public static class ListWafPhasesResponseBodyPhases extends TeaModel {
        /**
         * <p>The name of the WAF rule category.</p>
         * 
         * <strong>example:</strong>
         * <p>http_custom</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <p>The WAF rulesets.</p>
         */
        @NameInMap("Rulesets")
        public java.util.List<ListWafPhasesResponseBodyPhasesRulesets> rulesets;

        public static ListWafPhasesResponseBodyPhases build(java.util.Map<String, ?> map) throws Exception {
            ListWafPhasesResponseBodyPhases self = new ListWafPhasesResponseBodyPhases();
            return TeaModel.build(map, self);
        }

        public ListWafPhasesResponseBodyPhases setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public ListWafPhasesResponseBodyPhases setRulesets(java.util.List<ListWafPhasesResponseBodyPhasesRulesets> rulesets) {
            this.rulesets = rulesets;
            return this;
        }
        public java.util.List<ListWafPhasesResponseBodyPhasesRulesets> getRulesets() {
            return this.rulesets;
        }

    }

}
