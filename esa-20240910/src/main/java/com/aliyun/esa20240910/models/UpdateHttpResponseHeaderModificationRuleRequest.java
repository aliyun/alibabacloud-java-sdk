// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpResponseHeaderModificationRuleRequest extends TeaModel {
    /**
     * <p>The ID of the Configuration. You can get this value by calling the <a href="https://help.aliyun.com/document_detail/2867483.html">ListHttpResponseHeaderModificationRules</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>A list of objects, each defining a modification to a Response Header. Supported operations are <code>add</code>, <code>del</code>, and <code>modify</code>.</p>
     */
    @NameInMap("ResponseHeaderModification")
    public java.util.List<UpdateHttpResponseHeaderModificationRuleRequestResponseHeaderModification> responseHeaderModification;

    /**
     * <p>The matching condition for the Rule, written as a Conditional Expression. This parameter is optional for global Configurations. Use cases:</p>
     * <ul>
     * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, set the value to a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether the rule is enabled. This parameter is optional for a global Configuration. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables the Rule.</p>
     * </li>
     * <li><p><code>off</code>: Disables the Rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The name of the Rule. This parameter is optional for a global Configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The execution order for the Rule. A lower value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The ID of the Site. You can get this value by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456******</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateHttpResponseHeaderModificationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpResponseHeaderModificationRuleRequest self = new UpdateHttpResponseHeaderModificationRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpResponseHeaderModificationRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateHttpResponseHeaderModificationRuleRequest setResponseHeaderModification(java.util.List<UpdateHttpResponseHeaderModificationRuleRequestResponseHeaderModification> responseHeaderModification) {
        this.responseHeaderModification = responseHeaderModification;
        return this;
    }
    public java.util.List<UpdateHttpResponseHeaderModificationRuleRequestResponseHeaderModification> getResponseHeaderModification() {
        return this.responseHeaderModification;
    }

    public UpdateHttpResponseHeaderModificationRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateHttpResponseHeaderModificationRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateHttpResponseHeaderModificationRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateHttpResponseHeaderModificationRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateHttpResponseHeaderModificationRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public static class UpdateHttpResponseHeaderModificationRuleRequestResponseHeaderModification extends TeaModel {
        /**
         * <p>The name of the Response Header to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>headerName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation to perform on the Response Header. Valid values:</p>
         * <ul>
         * <li><p><code>add</code>: Adds the specified Response Header.</p>
         * </li>
         * <li><p><code>del</code>: Deletes the specified Response Header.</p>
         * </li>
         * <li><p><code>modify</code>: Modifies the specified Response Header.</p>
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
         * <p>The mode for assigning the header <code>Value</code>. Valid values:</p>
         * <ul>
         * <li><p><code>static</code>: Static mode. The <code>Value</code> is a fixed string.</p>
         * </li>
         * <li><p><code>dynamic</code>: Dynamic mode. The <code>Value</code> is generated dynamically.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The new or modified Value for the Response Header. This parameter is required when the <code>Operation</code> is <code>add</code> or <code>modify</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>headerValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateHttpResponseHeaderModificationRuleRequestResponseHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpResponseHeaderModificationRuleRequestResponseHeaderModification self = new UpdateHttpResponseHeaderModificationRuleRequestResponseHeaderModification();
            return TeaModel.build(map, self);
        }

        public UpdateHttpResponseHeaderModificationRuleRequestResponseHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateHttpResponseHeaderModificationRuleRequestResponseHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public UpdateHttpResponseHeaderModificationRuleRequestResponseHeaderModification setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateHttpResponseHeaderModificationRuleRequestResponseHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
