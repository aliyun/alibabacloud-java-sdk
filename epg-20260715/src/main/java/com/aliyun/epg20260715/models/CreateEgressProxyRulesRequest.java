// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyRulesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>Note If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run on the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run. The system checks the request for potential issues, including missing required parameters, invalid request formats, and service limits, but does not create the rules. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the egress proxy rule group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eprg-uf60966a9633667c****</p>
     */
    @NameInMap("EgressProxyRuleGroupId")
    public String egressProxyRuleGroupId;

    /**
     * <p>The list of egress rules grouped by effective phase (PreDns, PreRequest, or PostResponse).</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EgressProxyRules")
    public CreateEgressProxyRulesRequestEgressProxyRules egressProxyRules;

    public static CreateEgressProxyRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyRulesRequest self = new CreateEgressProxyRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEgressProxyRulesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateEgressProxyRulesRequest setEgressProxyRuleGroupId(String egressProxyRuleGroupId) {
        this.egressProxyRuleGroupId = egressProxyRuleGroupId;
        return this;
    }
    public String getEgressProxyRuleGroupId() {
        return this.egressProxyRuleGroupId;
    }

    public CreateEgressProxyRulesRequest setEgressProxyRules(CreateEgressProxyRulesRequestEgressProxyRules egressProxyRules) {
        this.egressProxyRules = egressProxyRules;
        return this;
    }
    public CreateEgressProxyRulesRequestEgressProxyRules getEgressProxyRules() {
        return this.egressProxyRules;
    }

    public static class CreateEgressProxyRulesRequestEgressProxyRulesPostResponseConditions extends TeaModel {
        /**
         * <p>The key of the matching condition. The value must match the effective phase (Phase) of the rule and be used with an operator (ConditionOperator) of the corresponding category. Valid values:</p>
         * <ul>
         * <li><p><strong>request:SourceIp</strong>: the source IP address of the request. Used with IP address operators. Supported in the PreDns and PreRequest phases.</p>
         * </li>
         * <li><p><strong>request:DestinationDomain</strong>: the destination domain name of the request. Used with string operators. Supported in the PreDns and PreRequest phases.</p>
         * </li>
         * <li><p><strong>request:Http:Uri</strong>: the URI of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * <li><p><strong>request:Http:Method</strong>: the HTTP request method. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * <li><p><strong>request:Http:UserAgent</strong>: the User-Agent of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * <li><p><strong>request:Http:ContentType</strong>: the Content-Type of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * <li><p><strong>request:Http:Header</strong>: the HTTP request header. Used with string operators. Supported in the PreRequest phase. When you use this key, append the request header name to the key in the format of request:Http:Header/<HeaderName>.</p>
         * </li>
         * <li><p><strong>request:Protocol</strong>: the request protocol. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>request:SourceIp</p>
         */
        @NameInMap("ConditionKey")
        public String conditionKey;

        /**
         * <p>The operator of the matching condition. Must be used with a condition key (ConditionKey). Valid values:</p>
         * <ul>
         * <li><p><strong>StringEquals</strong>: exact string match.</p>
         * </li>
         * <li><p><strong>StringNotEquals</strong>: string not equal.</p>
         * </li>
         * <li><p><strong>StringEqualsIgnoreCase</strong>: case-insensitive exact string match.</p>
         * </li>
         * <li><p><strong>StringNotEqualsIgnoreCase</strong>: case-insensitive string not equal.</p>
         * </li>
         * <li><p><strong>StringPrefixMatch</strong>: string prefix match.</p>
         * </li>
         * <li><p><strong>StringPrefixMatchIgnoreCase</strong>: case-insensitive string prefix match.</p>
         * </li>
         * <li><p><strong>StringPrefixNotMatch</strong>: string prefix not match.</p>
         * </li>
         * <li><p><strong>StringPrefixNotMatchIgnoreCase</strong>: case-insensitive string prefix not match.</p>
         * </li>
         * <li><p><strong>StringSuffixMatch</strong>: string suffix match.</p>
         * </li>
         * <li><p><strong>StringSuffixMatchIgnoreCase</strong>: case-insensitive string suffix match.</p>
         * </li>
         * <li><p><strong>StringSuffixNotMatch</strong>: string suffix not match.</p>
         * </li>
         * <li><p><strong>StringSuffixNotMatchIgnoreCase</strong>: case-insensitive string suffix not match.</p>
         * </li>
         * <li><p><strong>StringRegexMatch</strong>: string regular expression match.</p>
         * </li>
         * <li><p><strong>StringRegexNotMatch</strong>: string regular expression not match.</p>
         * </li>
         * <li><p><strong>StringWildcardMatch</strong>: string wildcard match.</p>
         * </li>
         * <li><p><strong>StringWildcardMatchIgnoreCase</strong>: case-insensitive string wildcard match.</p>
         * </li>
         * <li><p><strong>StringWildcardNotMatch</strong>: string wildcard not match.</p>
         * </li>
         * <li><p><strong>StringWildcardNotMatchIgnoreCase</strong>: case-insensitive string wildcard not match.</p>
         * </li>
         * <li><p><strong>IpAddress</strong>: the source IP address belongs to the specified IP address or CIDR block.</p>
         * </li>
         * <li><p><strong>NotIpAddress</strong>: the source IP address does not belong to the specified IP address or CIDR block.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IpAddress</p>
         */
        @NameInMap("ConditionOperator")
        public String conditionOperator;

        /**
         * <p>The list of condition values.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConditionValues")
        public java.util.List<String> conditionValues;

        public static CreateEgressProxyRulesRequestEgressProxyRulesPostResponseConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRulesRequestEgressProxyRulesPostResponseConditions self = new CreateEgressProxyRulesRequestEgressProxyRulesPostResponseConditions();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPostResponseConditions setConditionKey(String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public String getConditionKey() {
            return this.conditionKey;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPostResponseConditions setConditionOperator(String conditionOperator) {
            this.conditionOperator = conditionOperator;
            return this;
        }
        public String getConditionOperator() {
            return this.conditionOperator;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPostResponseConditions setConditionValues(java.util.List<String> conditionValues) {
            this.conditionValues = conditionValues;
            return this;
        }
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

    }

    public static class CreateEgressProxyRulesRequestEgressProxyRulesPostResponse extends TeaModel {
        /**
         * <p>The action to perform on the matched traffic after the rule is hit. Valid values:</p>
         * <ul>
         * <li><p><strong>Allow</strong>: allows the traffic that matches the rule.</p>
         * </li>
         * <li><p><strong>Deny</strong>: denies the traffic that matches the rule.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The list of matching conditions for the rule. Each condition consists of a condition key (ConditionKey), an operator (ConditionOperator), and condition values (ConditionValues). The combination of a condition key and an operator must be unique within the same rule.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPostResponseConditions> conditions;

        /**
         * <p>The description of the egress rule. The description must be 2 to 256 characters in length, and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the egress rule. The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("EgressProxyRuleName")
        public String egressProxyRuleName;

        /**
         * <p>The priority of the egress rule within the phase to which it belongs. Valid values: 1 to 1000. A smaller value indicates a higher priority. Within the same phase of a rule group, the priority of rules must be unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static CreateEgressProxyRulesRequestEgressProxyRulesPostResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRulesRequestEgressProxyRulesPostResponse self = new CreateEgressProxyRulesRequestEgressProxyRulesPostResponse();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPostResponse setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPostResponse setConditions(java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPostResponseConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPostResponseConditions> getConditions() {
            return this.conditions;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPostResponse setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPostResponse setEgressProxyRuleName(String egressProxyRuleName) {
            this.egressProxyRuleName = egressProxyRuleName;
            return this;
        }
        public String getEgressProxyRuleName() {
            return this.egressProxyRuleName;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPostResponse setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class CreateEgressProxyRulesRequestEgressProxyRulesPreDnsConditions extends TeaModel {
        /**
         * <p>The key of the matching condition. The value must match the effective phase (Phase) of the rule and be used with an operator (ConditionOperator) of the corresponding category. Valid values:</p>
         * <ul>
         * <li><p><strong>request:SourceIp</strong>: the source IP address of the request. Used with IP address operators. Supported in the PreDns and PreRequest phases.</p>
         * </li>
         * <li><p><strong>request:DestinationDomain</strong>: the destination domain name of the request. Used with string operators. Supported in the PreDns and PreRequest phases.</p>
         * </li>
         * <li><p><strong>request:Http:Uri</strong>: the URI of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * <li><p><strong>request:Http:Method</strong>: the HTTP request method. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * <li><p><strong>request:Http:UserAgent</strong>: the User-Agent of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * <li><p><strong>request:Http:ContentType</strong>: the Content-Type of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * <li><p><strong>request:Http:Header</strong>: the HTTP request header. Used with string operators. Supported in the PreRequest phase. When you use this key, append the request header name to the key in the format of request:Http:Header/<HeaderName>.</p>
         * </li>
         * <li><p><strong>request:Protocol</strong>: the request protocol. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>request:DestinationDomain</p>
         */
        @NameInMap("ConditionKey")
        public String conditionKey;

        /**
         * <p>The operator of the matching condition. Must be used with a condition key (ConditionKey). Valid values:</p>
         * <ul>
         * <li><p><strong>StringEquals</strong>: exact string match.</p>
         * </li>
         * <li><p><strong>StringNotEquals</strong>: string not equal.</p>
         * </li>
         * <li><p><strong>StringEqualsIgnoreCase</strong>: case-insensitive exact string match.</p>
         * </li>
         * <li><p><strong>StringNotEqualsIgnoreCase</strong>: case-insensitive string not equal.</p>
         * </li>
         * <li><p><strong>StringPrefixMatch</strong>: string prefix match.</p>
         * </li>
         * <li><p><strong>StringPrefixMatchIgnoreCase</strong>: case-insensitive string prefix match.</p>
         * </li>
         * <li><p><strong>StringPrefixNotMatch</strong>: string prefix not match.</p>
         * </li>
         * <li><p><strong>StringPrefixNotMatchIgnoreCase</strong>: case-insensitive string prefix not match.</p>
         * </li>
         * <li><p><strong>StringSuffixMatch</strong>: string suffix match.</p>
         * </li>
         * <li><p><strong>StringSuffixMatchIgnoreCase</strong>: case-insensitive string suffix match.</p>
         * </li>
         * <li><p><strong>StringSuffixNotMatch</strong>: string suffix not match.</p>
         * </li>
         * <li><p><strong>StringSuffixNotMatchIgnoreCase</strong>: case-insensitive string suffix not match.</p>
         * </li>
         * <li><p><strong>StringRegexMatch</strong>: string regular expression match.</p>
         * </li>
         * <li><p><strong>StringRegexNotMatch</strong>: string regular expression not match.</p>
         * </li>
         * <li><p><strong>StringWildcardMatch</strong>: string wildcard match.</p>
         * </li>
         * <li><p><strong>StringWildcardMatchIgnoreCase</strong>: case-insensitive string wildcard match.</p>
         * </li>
         * <li><p><strong>StringWildcardNotMatch</strong>: string wildcard not match.</p>
         * </li>
         * <li><p><strong>StringWildcardNotMatchIgnoreCase</strong>: case-insensitive string wildcard not match.</p>
         * </li>
         * <li><p><strong>IpAddress</strong>: the source IP address belongs to the specified IP address or CIDR block.</p>
         * </li>
         * <li><p><strong>NotIpAddress</strong>: the source IP address does not belong to the specified IP address or CIDR block.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>StringEquals</p>
         */
        @NameInMap("ConditionOperator")
        public String conditionOperator;

        /**
         * <p>The list of condition values.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConditionValues")
        public java.util.List<String> conditionValues;

        public static CreateEgressProxyRulesRequestEgressProxyRulesPreDnsConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRulesRequestEgressProxyRulesPreDnsConditions self = new CreateEgressProxyRulesRequestEgressProxyRulesPreDnsConditions();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreDnsConditions setConditionKey(String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public String getConditionKey() {
            return this.conditionKey;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreDnsConditions setConditionOperator(String conditionOperator) {
            this.conditionOperator = conditionOperator;
            return this;
        }
        public String getConditionOperator() {
            return this.conditionOperator;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreDnsConditions setConditionValues(java.util.List<String> conditionValues) {
            this.conditionValues = conditionValues;
            return this;
        }
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

    }

    public static class CreateEgressProxyRulesRequestEgressProxyRulesPreDns extends TeaModel {
        /**
         * <p>The action to perform on the matched traffic after the rule is hit. Valid values:</p>
         * <ul>
         * <li><p><strong>Allow</strong>: allows the traffic that matches the rule.</p>
         * </li>
         * <li><p><strong>Deny</strong>: denies the traffic that matches the rule.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The list of matching conditions for the rule. Each condition consists of a condition key (ConditionKey), an operator (ConditionOperator), and condition values (ConditionValues). The combination of a condition key and an operator must be unique within the same rule.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPreDnsConditions> conditions;

        /**
         * <p>The description of the egress rule. The description must be 2 to 256 characters in length and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the egress rule. The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("EgressProxyRuleName")
        public String egressProxyRuleName;

        /**
         * <p>The priority of the egress rule within the phase to which it belongs. Valid values: 1 to 1000. A smaller value indicates a higher priority. Within the same phase of a rule group, the priority of rules must be unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static CreateEgressProxyRulesRequestEgressProxyRulesPreDns build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRulesRequestEgressProxyRulesPreDns self = new CreateEgressProxyRulesRequestEgressProxyRulesPreDns();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreDns setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreDns setConditions(java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPreDnsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPreDnsConditions> getConditions() {
            return this.conditions;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreDns setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreDns setEgressProxyRuleName(String egressProxyRuleName) {
            this.egressProxyRuleName = egressProxyRuleName;
            return this;
        }
        public String getEgressProxyRuleName() {
            return this.egressProxyRuleName;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreDns setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class CreateEgressProxyRulesRequestEgressProxyRulesPreRequestConditions extends TeaModel {
        /**
         * <p>The key of the matching condition. The value must match the effective phase (Phase) of the rule and be used with an operator (ConditionOperator) of the corresponding category. Valid values:</p>
         * <ul>
         * <li><p><strong>request:SourceIp</strong>: the source IP address of the request. Used with IP address operators. Supported in the PreDns and PreRequest phases.</p>
         * </li>
         * <li><p><strong>request:DestinationDomain</strong>: the destination domain name of the request. Used with string operators. Supported in the PreDns and PreRequest phases.</p>
         * </li>
         * <li><p><strong>request:Http:Uri</strong>: the URI of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * <li><p><strong>request:Http:Method</strong>: the HTTP request method. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * <li><p><strong>request:Http:UserAgent</strong>: the User-Agent of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * <li><p><strong>request:Http:ContentType</strong>: the Content-Type of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * <li><p><strong>request:Http:Header</strong>: the HTTP request header. Used with string operators. Supported in the PreRequest phase. When you use this key, append the request header name to the key in the format of request:Http:Header/<HeaderName>.</p>
         * </li>
         * <li><p><strong>request:Protocol</strong>: the request protocol. Used with string operators. Supported in the PreRequest phase.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>request:DestinationDomain</p>
         */
        @NameInMap("ConditionKey")
        public String conditionKey;

        /**
         * <p>The operator of the matching condition. Must be used with a condition key (ConditionKey). Valid values:</p>
         * <ul>
         * <li><p><strong>StringEquals</strong>: exact string match.</p>
         * </li>
         * <li><p><strong>StringNotEquals</strong>: string not equal.</p>
         * </li>
         * <li><p><strong>StringEqualsIgnoreCase</strong>: case-insensitive exact string match.</p>
         * </li>
         * <li><p><strong>StringNotEqualsIgnoreCase</strong>: case-insensitive string not equal.</p>
         * </li>
         * <li><p><strong>StringPrefixMatch</strong>: string prefix match.</p>
         * </li>
         * <li><p><strong>StringPrefixMatchIgnoreCase</strong>: case-insensitive string prefix match.</p>
         * </li>
         * <li><p><strong>StringPrefixNotMatch</strong>: string prefix not match.</p>
         * </li>
         * <li><p><strong>StringPrefixNotMatchIgnoreCase</strong>: case-insensitive string prefix not match.</p>
         * </li>
         * <li><p><strong>StringSuffixMatch</strong>: string suffix match.</p>
         * </li>
         * <li><p><strong>StringSuffixMatchIgnoreCase</strong>: case-insensitive string suffix match.</p>
         * </li>
         * <li><p><strong>StringSuffixNotMatch</strong>: string suffix not match.</p>
         * </li>
         * <li><p><strong>StringSuffixNotMatchIgnoreCase</strong>: case-insensitive string suffix not match.</p>
         * </li>
         * <li><p><strong>StringRegexMatch</strong>: string regular expression match.</p>
         * </li>
         * <li><p><strong>StringRegexNotMatch</strong>: string regular expression not match.</p>
         * </li>
         * <li><p><strong>StringWildcardMatch</strong>: string wildcard match.</p>
         * </li>
         * <li><p><strong>StringWildcardMatchIgnoreCase</strong>: case-insensitive string wildcard match.</p>
         * </li>
         * <li><p><strong>StringWildcardNotMatch</strong>: string wildcard not match.</p>
         * </li>
         * <li><p><strong>StringWildcardNotMatchIgnoreCase</strong>: case-insensitive string wildcard not match.</p>
         * </li>
         * <li><p><strong>IpAddress</strong>: the source IP address belongs to the specified IP address or CIDR block.</p>
         * </li>
         * <li><p><strong>NotIpAddress</strong>: the source IP address does not belong to the specified IP address or CIDR block.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>StringEquals</p>
         */
        @NameInMap("ConditionOperator")
        public String conditionOperator;

        /**
         * <p>The list of condition values.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConditionValues")
        public java.util.List<String> conditionValues;

        public static CreateEgressProxyRulesRequestEgressProxyRulesPreRequestConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRulesRequestEgressProxyRulesPreRequestConditions self = new CreateEgressProxyRulesRequestEgressProxyRulesPreRequestConditions();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreRequestConditions setConditionKey(String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public String getConditionKey() {
            return this.conditionKey;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreRequestConditions setConditionOperator(String conditionOperator) {
            this.conditionOperator = conditionOperator;
            return this;
        }
        public String getConditionOperator() {
            return this.conditionOperator;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreRequestConditions setConditionValues(java.util.List<String> conditionValues) {
            this.conditionValues = conditionValues;
            return this;
        }
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

    }

    public static class CreateEgressProxyRulesRequestEgressProxyRulesPreRequest extends TeaModel {
        /**
         * <p>The action to perform on the matched traffic after the rule is hit. Valid values:</p>
         * <ul>
         * <li><p><strong>Allow</strong>: allows the traffic that matches the rule.</p>
         * </li>
         * <li><p><strong>Deny</strong>: denies the traffic that matches the rule.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The list of matching conditions for the rule. Each condition consists of a condition key (ConditionKey), an operator (ConditionOperator), and condition values (ConditionValues). The combination of a condition key and an operator must be unique within the same rule.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPreRequestConditions> conditions;

        /**
         * <p>The description of the egress rule. The description must be 2 to 256 characters in length, and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the egress rule. The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("EgressProxyRuleName")
        public String egressProxyRuleName;

        /**
         * <p>The priority of the egress rule within the phase to which it belongs. Valid values: 1 to 1000. A smaller value indicates a higher priority. Within the same phase of a rule group, the priority of rules must be unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static CreateEgressProxyRulesRequestEgressProxyRulesPreRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRulesRequestEgressProxyRulesPreRequest self = new CreateEgressProxyRulesRequestEgressProxyRulesPreRequest();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreRequest setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreRequest setConditions(java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPreRequestConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPreRequestConditions> getConditions() {
            return this.conditions;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreRequest setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreRequest setEgressProxyRuleName(String egressProxyRuleName) {
            this.egressProxyRuleName = egressProxyRuleName;
            return this;
        }
        public String getEgressProxyRuleName() {
            return this.egressProxyRuleName;
        }

        public CreateEgressProxyRulesRequestEgressProxyRulesPreRequest setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class CreateEgressProxyRulesRequestEgressProxyRules extends TeaModel {
        /**
         * <p>The list of rules in the PostResponse phase (after the response is returned).</p>
         */
        @NameInMap("PostResponse")
        public java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPostResponse> postResponse;

        /**
         * <p>The list of rules for the pre-DNS stage (before DNS resolution).</p>
         */
        @NameInMap("PreDns")
        public java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPreDns> preDns;

        /**
         * <p>The list of rules in the PreRequest stage (before request forwarding).</p>
         */
        @NameInMap("PreRequest")
        public java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPreRequest> preRequest;

        public static CreateEgressProxyRulesRequestEgressProxyRules build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRulesRequestEgressProxyRules self = new CreateEgressProxyRulesRequestEgressProxyRules();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRulesRequestEgressProxyRules setPostResponse(java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPostResponse> postResponse) {
            this.postResponse = postResponse;
            return this;
        }
        public java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPostResponse> getPostResponse() {
            return this.postResponse;
        }

        public CreateEgressProxyRulesRequestEgressProxyRules setPreDns(java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPreDns> preDns) {
            this.preDns = preDns;
            return this;
        }
        public java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPreDns> getPreDns() {
            return this.preDns;
        }

        public CreateEgressProxyRulesRequestEgressProxyRules setPreRequest(java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPreRequest> preRequest) {
            this.preRequest = preRequest;
            return this;
        }
        public java.util.List<CreateEgressProxyRulesRequestEgressProxyRulesPreRequest> getPreRequest() {
            return this.preRequest;
        }

    }

}
