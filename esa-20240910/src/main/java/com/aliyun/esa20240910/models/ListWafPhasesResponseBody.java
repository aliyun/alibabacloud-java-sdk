// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafPhasesResponseBody extends TeaModel {
    @NameInMap("Phases")
    public java.util.List<ListWafPhasesResponseBodyPhases> phases;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Rules")
        public java.util.List<WafRuleConfig> rules;

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
        @NameInMap("Phase")
        public String phase;

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
