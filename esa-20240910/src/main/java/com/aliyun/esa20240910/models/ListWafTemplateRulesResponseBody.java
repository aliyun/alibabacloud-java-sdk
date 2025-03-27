// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafTemplateRulesResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of returned template rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<ListWafTemplateRulesResponseBodyRules> rules;

    public static ListWafTemplateRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWafTemplateRulesResponseBody self = new ListWafTemplateRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWafTemplateRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWafTemplateRulesResponseBody setRules(java.util.List<ListWafTemplateRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ListWafTemplateRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class ListWafTemplateRulesResponseBodyRules extends TeaModel {
        /**
         * <p>Rule configuration.</p>
         */
        @NameInMap("Config")
        public WafRuleConfig config;

        /**
         * <p>Rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP Directory Traversal Rule [Template]</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>WAF operation phase.</p>
         * 
         * <strong>example:</strong>
         * <p>http_anti_scan</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <p>Rule status.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>http_directory_traversal</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListWafTemplateRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            ListWafTemplateRulesResponseBodyRules self = new ListWafTemplateRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public ListWafTemplateRulesResponseBodyRules setConfig(WafRuleConfig config) {
            this.config = config;
            return this;
        }
        public WafRuleConfig getConfig() {
            return this.config;
        }

        public ListWafTemplateRulesResponseBodyRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWafTemplateRulesResponseBodyRules setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public ListWafTemplateRulesResponseBodyRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWafTemplateRulesResponseBodyRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
