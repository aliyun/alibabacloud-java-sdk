// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpIncomingRequestHeaderModificationRuleRequest extends TeaModel {
    /**
     * <p>An array of objects, where each object defines a modification to a request header.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestHeaderModification")
    public java.util.List<CreateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification> requestHeaderModification;

    /**
     * <p>The conditional expression that the Rule uses to match incoming requests. This parameter is not required for a Global configuration. There are two use cases:</p>
     * <ul>
     * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, use a custom expression. For example: <code>(http.host eq &quot;video.example.com&quot;)</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether the Rule is enabled. This parameter is not required for a Global configuration. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: The Rule is enabled.</p>
     * </li>
     * <li><p><code>off</code>: The Rule is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The name of the Rule. This parameter is not required for a Global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The execution order of the Rule. A lower value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The ID of the Site. You can obtain this value by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>478016908379824</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The Version of the Site configuration. For Sites with configuration versioning enabled, this parameter specifies the Version to which the Rule applies. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static CreateHttpIncomingRequestHeaderModificationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpIncomingRequestHeaderModificationRuleRequest self = new CreateHttpIncomingRequestHeaderModificationRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateHttpIncomingRequestHeaderModificationRuleRequest setRequestHeaderModification(java.util.List<CreateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification> requestHeaderModification) {
        this.requestHeaderModification = requestHeaderModification;
        return this;
    }
    public java.util.List<CreateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification> getRequestHeaderModification() {
        return this.requestHeaderModification;
    }

    public CreateHttpIncomingRequestHeaderModificationRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateHttpIncomingRequestHeaderModificationRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateHttpIncomingRequestHeaderModificationRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateHttpIncomingRequestHeaderModificationRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public CreateHttpIncomingRequestHeaderModificationRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateHttpIncomingRequestHeaderModificationRuleRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static class CreateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification extends TeaModel {
        /**
         * <p>The name of the request header.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>headername</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Operation to perform. Valid values:</p>
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
         * <p>The type of the header value. Valid values:</p>
         * <ul>
         * <li><p><code>static</code>: Static mode.</p>
         * </li>
         * <li><p><code>dynamic</code>: Dynamic mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value to set for the request header. This parameter is not required if the <code>Operation</code> is <code>del</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>headvalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            CreateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification self = new CreateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification();
            return TeaModel.build(map, self);
        }

        public CreateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public CreateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
