// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafPhasesResponseBody extends TeaModel {
    /**
     * <p>List of WAF operation phases.</p>
     */
    @NameInMap("Phases")
    public java.util.List<ListWafPhasesResponseBodyPhases> phases;

    /**
     * <p>Request ID.</p>
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
         * <p>ID of the WAF ruleset.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Name of the WAF ruleset.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>List of rule configurations in the WAF ruleset.</p>
         */
        @NameInMap("Rules")
        public java.util.List<WafRuleConfig> rules;

        /**
         * <p>Shared configuration for rules in the WAF ruleset.</p>
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
         * <p>Name of the WAF operation phase.</p>
         * 
         * <strong>example:</strong>
         * <p>http_custom</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <p>List of WAF rulesets.</p>
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
