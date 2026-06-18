// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpIncomingRequestHeaderModificationRuleRequest extends TeaModel {
    /**
     * <p>The ID of the configuration. To obtain this ID, call the ListHttpIncomingRequestHeaderModificationRules API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>419717024278528</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>An array of objects that defines the request header modifications. Supported operations include <code>add</code>, <code>del</code>, and <code>modify</code>.</p>
     */
    @NameInMap("RequestHeaderModification")
    public java.util.List<UpdateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification> requestHeaderModification;

    /**
     * <p>The rule expression, a conditional expression that matches user requests. This parameter is not required for a global configuration. You can use this parameter in two ways:</p>
     * <ul>
     * <li><p>To match all incoming requests, set this value to <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, provide a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The status of the rule. This parameter is not required for a global configuration. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: The rule is enabled.</p>
     * </li>
     * <li><p><code>off</code>: The rule is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The name of the rule. This parameter is not required for a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Specifies the rule\&quot;s priority. Rules with a lower value are executed first.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The ID of the site. To obtain this ID, call the <a href="~~ListSites~~">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>568181195163328</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateHttpIncomingRequestHeaderModificationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpIncomingRequestHeaderModificationRuleRequest self = new UpdateHttpIncomingRequestHeaderModificationRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleRequest setRequestHeaderModification(java.util.List<UpdateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification> requestHeaderModification) {
        this.requestHeaderModification = requestHeaderModification;
        return this;
    }
    public java.util.List<UpdateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification> getRequestHeaderModification() {
        return this.requestHeaderModification;
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public static class UpdateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification extends TeaModel {
        /**
         * <p>The name of the request header.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>headerName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation to perform on the request header. Valid values:</p>
         * <ul>
         * <li><p><code>add</code>: Adds a request header.</p>
         * </li>
         * <li><p><code>del</code>: Deletes a request header.</p>
         * </li>
         * <li><p><code>modify</code>: Modifies an existing request header.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The type of value. Valid values:</p>
         * <ul>
         * <li><p><code>static</code>: The value is a fixed, literal string.</p>
         * </li>
         * <li><p><code>dynamic</code>: The value is generated dynamically at runtime.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the request header.</p>
         * 
         * <strong>example:</strong>
         * <p>headerValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification self = new UpdateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification();
            return TeaModel.build(map, self);
        }

        public UpdateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public UpdateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
