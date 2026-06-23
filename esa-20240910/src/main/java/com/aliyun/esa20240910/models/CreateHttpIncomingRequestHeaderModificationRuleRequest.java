// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpIncomingRequestHeaderModificationRuleRequest extends TeaModel {
    /**
     * <p>The request header modifications. Three operations are supported: add, delete, and modify.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestHeaderModification")
    public java.util.List<CreateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification> requestHeaderModification;

    /**
     * <p>The rule content, which uses a conditional expression to match user requests. This parameter is not required when you add a global configuration. Two scenarios are supported:</p>
     * <ul>
     * <li>Match all incoming requests: set the value to true.</li>
     * <li>Match specified requests: set the value to a custom expression, such as (http.host eq \&quot;video.example.com\&quot;).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The rule switch. This parameter is not required when you add a global configuration. Valid values:</p>
     * <ul>
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The rule name. This parameter is not required when you add a global configuration.</p>
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
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>478016908379824</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the site configuration. For sites with configuration version management enabled, you can use this parameter to specify the site version on which the configuration takes effect. The default value is 0.</p>
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
         * <p>The request header name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>headername</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>add: adds a request header.</li>
         * <li>del: deletes a request header.</li>
         * <li>modify: modifies a request header.</li>
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
         * <li>static: static pattern.</li>
         * <li>dynamic: dynamic pattern.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The request header value.</p>
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
