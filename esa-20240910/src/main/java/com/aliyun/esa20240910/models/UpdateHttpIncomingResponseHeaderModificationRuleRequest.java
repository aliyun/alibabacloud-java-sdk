// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpIncomingResponseHeaderModificationRuleRequest extends TeaModel {
    /**
     * <p>The configuration ID. You can call the ListHttpIncomingResponseHeaderModificationRules operation to obtain the configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>352816096987136</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The response header modifications. Three operation types are supported: add, delete, and modify.</p>
     */
    @NameInMap("ResponseHeaderModification")
    public java.util.List<UpdateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification> responseHeaderModification;

    /**
     * <p>The rule content, which uses a conditional expression to match user requests. This parameter is not required when adding a global configuration. There are two usage scenarios:</p>
     * <ul>
     * <li>Match all incoming requests: Set the value to true.</li>
     * <li>Match specified requests: Set the value to a custom expression, for example, (http.host eq \&quot;video.example.com\&quot;).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The rule switch. This parameter is not required when adding a global configuration. Valid values:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The rule name. This parameter is not required when adding a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The rule execution order. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>498607398028944</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateHttpIncomingResponseHeaderModificationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpIncomingResponseHeaderModificationRuleRequest self = new UpdateHttpIncomingResponseHeaderModificationRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleRequest setResponseHeaderModification(java.util.List<UpdateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification> responseHeaderModification) {
        this.responseHeaderModification = responseHeaderModification;
        return this;
    }
    public java.util.List<UpdateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification> getResponseHeaderModification() {
        return this.responseHeaderModification;
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public static class UpdateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification extends TeaModel {
        /**
         * <p>The response header name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>headerName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>add: Add.</li>
         * <li>del: Delete.</li>
         * <li>modify: Modify.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The value type. Valid values:</p>
         * <ul>
         * <li>static: Static pattern.</li>
         * <li>dynamic: Dynamic schema.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The response header value.</p>
         * 
         * <strong>example:</strong>
         * <p>headerValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification self = new UpdateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification();
            return TeaModel.build(map, self);
        }

        public UpdateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public UpdateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
