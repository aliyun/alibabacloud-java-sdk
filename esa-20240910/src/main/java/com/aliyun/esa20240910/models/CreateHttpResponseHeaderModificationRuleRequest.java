// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpResponseHeaderModificationRuleRequest extends TeaModel {
    /**
     * <p>An array of objects that specify modifications to the response header. The supported operations are <code>add</code>, <code>del</code>, and <code>modify</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResponseHeaderModification")
    public java.util.List<CreateHttpResponseHeaderModificationRuleRequestResponseHeaderModification> responseHeaderModification;

    /**
     * <p>Specifies the conditional expression that an incoming request must match for the rule to apply. This parameter is not required when adding a Global Configuration. You can set the value in one of the following ways:</p>
     * <ul>
     * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, set the value to a custom expression. For example: <code>(http.host eq &quot;video.example.com&quot;)</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether to enable the rule. This parameter is not required when adding a Global Configuration. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables the rule.</p>
     * </li>
     * <li><p><code>off</code>: Disables the rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The name of the rule. This parameter is not required when adding a Global Configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The rule\&quot;s execution order. A lower value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The Site ID. You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456******</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the Site configuration. For sites with Configuration Version Management enabled, this parameter specifies the configuration version that the Rule applies to. If omitted, this parameter defaults to version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static CreateHttpResponseHeaderModificationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpResponseHeaderModificationRuleRequest self = new CreateHttpResponseHeaderModificationRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateHttpResponseHeaderModificationRuleRequest setResponseHeaderModification(java.util.List<CreateHttpResponseHeaderModificationRuleRequestResponseHeaderModification> responseHeaderModification) {
        this.responseHeaderModification = responseHeaderModification;
        return this;
    }
    public java.util.List<CreateHttpResponseHeaderModificationRuleRequestResponseHeaderModification> getResponseHeaderModification() {
        return this.responseHeaderModification;
    }

    public CreateHttpResponseHeaderModificationRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateHttpResponseHeaderModificationRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateHttpResponseHeaderModificationRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateHttpResponseHeaderModificationRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public CreateHttpResponseHeaderModificationRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateHttpResponseHeaderModificationRuleRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static class CreateHttpResponseHeaderModificationRuleRequestResponseHeaderModification extends TeaModel {
        /**
         * <p>The name of the response header.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>headername</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The modification to perform on the header. Valid values:</p>
         * <ul>
         * <li><p><code>add</code>: Adds a header.</p>
         * </li>
         * <li><p><code>del</code>: Deletes a header.</p>
         * </li>
         * <li><p><code>modify</code>: Modifies a header.</p>
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
         * <p>The value type. Valid values:</p>
         * <ul>
         * <li><p><code>static</code>: Static value.</p>
         * </li>
         * <li><p><code>dynamic</code>: Dynamic value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value to assign to the header. This parameter is not required when the <code>Operation</code> is <code>del</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>headervalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateHttpResponseHeaderModificationRuleRequestResponseHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            CreateHttpResponseHeaderModificationRuleRequestResponseHeaderModification self = new CreateHttpResponseHeaderModificationRuleRequestResponseHeaderModification();
            return TeaModel.build(map, self);
        }

        public CreateHttpResponseHeaderModificationRuleRequestResponseHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateHttpResponseHeaderModificationRuleRequestResponseHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public CreateHttpResponseHeaderModificationRuleRequestResponseHeaderModification setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHttpResponseHeaderModificationRuleRequestResponseHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
