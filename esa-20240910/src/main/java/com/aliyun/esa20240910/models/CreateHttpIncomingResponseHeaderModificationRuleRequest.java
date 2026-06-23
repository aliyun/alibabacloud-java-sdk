// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpIncomingResponseHeaderModificationRuleRequest extends TeaModel {
    /**
     * <p>The response header modifications. Three operation types are supported: add, delete, and modify.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResponseHeaderModification")
    public java.util.List<CreateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification> responseHeaderModification;

    /**
     * <p>The rule content, which uses a conditional expression to match user requests. You do not need to set this parameter when you add a global configuration. Two scenarios are supported:</p>
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
     * <p>The rule switch. You do not need to set this parameter when you add a global configuration. Valid values:</p>
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
     * <p>The rule name. You do not need to set this parameter when you add a global configuration.</p>
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
     * <p>608665779308176</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the site version on which the configuration takes effect. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static CreateHttpIncomingResponseHeaderModificationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpIncomingResponseHeaderModificationRuleRequest self = new CreateHttpIncomingResponseHeaderModificationRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateHttpIncomingResponseHeaderModificationRuleRequest setResponseHeaderModification(java.util.List<CreateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification> responseHeaderModification) {
        this.responseHeaderModification = responseHeaderModification;
        return this;
    }
    public java.util.List<CreateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification> getResponseHeaderModification() {
        return this.responseHeaderModification;
    }

    public CreateHttpIncomingResponseHeaderModificationRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateHttpIncomingResponseHeaderModificationRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateHttpIncomingResponseHeaderModificationRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateHttpIncomingResponseHeaderModificationRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public CreateHttpIncomingResponseHeaderModificationRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateHttpIncomingResponseHeaderModificationRuleRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static class CreateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification extends TeaModel {
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
         * <li>add: adds a response header.</li>
         * <li>del: deletes a response header.</li>
         * <li>modify: modifies a response header.</li>
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
         * <p>The response header value.</p>
         * 
         * <strong>example:</strong>
         * <p>headerValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            CreateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification self = new CreateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification();
            return TeaModel.build(map, self);
        }

        public CreateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public CreateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHttpIncomingResponseHeaderModificationRuleRequestResponseHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
