// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafDefaultRulesResponseBody extends TeaModel {
    /**
     * <p>The configurations of the rule.</p>
     */
    @NameInMap("Content")
    public java.util.List<DescribeDcdnWafDefaultRulesResponseBodyContent> content;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnWafDefaultRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafDefaultRulesResponseBody self = new DescribeDcdnWafDefaultRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafDefaultRulesResponseBody setContent(java.util.List<DescribeDcdnWafDefaultRulesResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DescribeDcdnWafDefaultRulesResponseBodyContent> getContent() {
        return this.content;
    }

    public DescribeDcdnWafDefaultRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnWafDefaultRulesResponseBodyContentRules extends TeaModel {
        /**
         * <p>The default action of the rule. Valid values:</p>
         * <br>
         * <p>*   **monitor**: monitors requests.</p>
         * <p>*   **deny**: denies requests.</p>
         * <p>*   **block**: blocks requests.</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The default configuration of the rule.</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The default name of the rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The default status of the rule. Valid values:</p>
         * <br>
         * <p>*   **on**</p>
         * <p>*   **off**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The rule type. Valid values:</p>
         * <br>
         * <p>*   **waf_group**: basic web protection</p>
         * <p>*   **high_frequency**: high-frequency scanning blocking</p>
         * <p>*   **directory_traversal**: directory traversal blocking</p>
         * <p>*   **scan_tools**: scanner blocking</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDcdnWafDefaultRulesResponseBodyContentRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafDefaultRulesResponseBodyContentRules self = new DescribeDcdnWafDefaultRulesResponseBodyContentRules();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafDefaultRulesResponseBodyContentRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeDcdnWafDefaultRulesResponseBodyContentRules setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeDcdnWafDefaultRulesResponseBodyContentRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDcdnWafDefaultRulesResponseBodyContentRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDcdnWafDefaultRulesResponseBodyContentRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDcdnWafDefaultRulesResponseBodyContent extends TeaModel {
        /**
         * <p>The protection scenario. Valid values:</p>
         * <br>
         * <p>*   **waf_group**: basic web protection</p>
         * <p>*   **anti_scan**: scan protection</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <p>The configurations of the rule.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeDcdnWafDefaultRulesResponseBodyContentRules> rules;

        public static DescribeDcdnWafDefaultRulesResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafDefaultRulesResponseBodyContent self = new DescribeDcdnWafDefaultRulesResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafDefaultRulesResponseBodyContent setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDcdnWafDefaultRulesResponseBodyContent setRules(java.util.List<DescribeDcdnWafDefaultRulesResponseBodyContentRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeDcdnWafDefaultRulesResponseBodyContentRules> getRules() {
            return this.rules;
        }

    }

}
