// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpIncomingRequestHeaderModificationRuleRequest extends TeaModel {
    /**
     * <p>The configurations of modifying request headers. You can add, delete, or modify a request header.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestHeaderModification")
    public java.util.List<CreateHttpIncomingRequestHeaderModificationRuleRequestRequestHeaderModification> requestHeaderModification;

    /**
     * <p>The content of the rule. A conditional expression is used to match a user request. You do not need to set this parameter when you add global configuration. Use cases:</p>
     * <ul>
     * <li>true: Match all incoming requests.</li>
     * <li>Set the value to a custom expression, for example: (http.host eq &quot;video.example.com&quot;): Match the specified request</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether to enable the rule. Valid values: You do not need to set this parameter when you add global configuration. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The rule name. You do not need to set this parameter when you add global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The order in which the rule is executed. A smaller value gives priority to the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>478016908379824</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the website configurations. You can use this parameter to specify a version of your website to apply the feature settings. By default, version 0 is used.</p>
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
         * <p>The action. Valid values:</p>
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
         * <p>The type of the value. Valid values:</p>
         * <ul>
         * <li>static</li>
         * <li>dynamic</li>
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
