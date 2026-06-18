// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpRequestHeaderModificationRuleRequest extends TeaModel {
    /**
     * <p>An array of objects that define Request Header modifications. Supported operations include add, del, and modify.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestHeaderModification")
    public java.util.List<CreateHttpRequestHeaderModificationRuleRequestRequestHeaderModification> requestHeaderModification;

    /**
     * <p>The content of the Rule, which uses a Conditional Expression to match user requests. This parameter is not required when you add a global configuration. Supports two Use Cases:</p>
     * <ul>
     * <li><p>To match all incoming requests, set the value to true.</p>
     * </li>
     * <li><p>To match specific requests, set the value to a custom expression, for example, (http.host eq &quot;video.example.com&quot;).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether to enable the Rule. This parameter is not required when you add a global configuration. Valid values are:</p>
     * <ul>
     * <li><p>on: Enables the Rule.</p>
     * </li>
     * <li><p>off: Disables the Rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The name of the Rule. This parameter is not required when you add a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The execution order of the Rule. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The ID of the Site. You can get this ID by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5407498413****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The Version of the Site configuration. For a Site with configuration versioning enabled, this parameter specifies the configuration\&quot;s target Version. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static CreateHttpRequestHeaderModificationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpRequestHeaderModificationRuleRequest self = new CreateHttpRequestHeaderModificationRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateHttpRequestHeaderModificationRuleRequest setRequestHeaderModification(java.util.List<CreateHttpRequestHeaderModificationRuleRequestRequestHeaderModification> requestHeaderModification) {
        this.requestHeaderModification = requestHeaderModification;
        return this;
    }
    public java.util.List<CreateHttpRequestHeaderModificationRuleRequestRequestHeaderModification> getRequestHeaderModification() {
        return this.requestHeaderModification;
    }

    public CreateHttpRequestHeaderModificationRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateHttpRequestHeaderModificationRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateHttpRequestHeaderModificationRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateHttpRequestHeaderModificationRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public CreateHttpRequestHeaderModificationRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateHttpRequestHeaderModificationRuleRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static class CreateHttpRequestHeaderModificationRuleRequestRequestHeaderModification extends TeaModel {
        /**
         * <p>The Request Header name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>headername</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation to perform. Valid values are:</p>
         * <ul>
         * <li><p>add: Adds a header.</p>
         * </li>
         * <li><p>del: Deletes a header.</p>
         * </li>
         * <li><p>modify: Modifies a header.</p>
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
         * <p>The type of the header value. Valid values are:</p>
         * <ul>
         * <li><p>static: Static value.</p>
         * </li>
         * <li><p>dynamic: Dynamic value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The Request Header value.</p>
         * 
         * <strong>example:</strong>
         * <p>headervalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateHttpRequestHeaderModificationRuleRequestRequestHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            CreateHttpRequestHeaderModificationRuleRequestRequestHeaderModification self = new CreateHttpRequestHeaderModificationRuleRequestRequestHeaderModification();
            return TeaModel.build(map, self);
        }

        public CreateHttpRequestHeaderModificationRuleRequestRequestHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateHttpRequestHeaderModificationRuleRequestRequestHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public CreateHttpRequestHeaderModificationRuleRequestRequestHeaderModification setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHttpRequestHeaderModificationRuleRequestRequestHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
