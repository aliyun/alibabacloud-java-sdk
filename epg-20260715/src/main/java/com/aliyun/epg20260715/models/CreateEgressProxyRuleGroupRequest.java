// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyRuleGroupRequest extends TeaModel {
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
     * <p>The description of the egress rule group. The description must be 2 to 256 characters in length and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform only a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: sends a dry run request and does not create the rule group. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the egress IP address pool associated with the egress rule group.</p>
     * 
     * <strong>example:</strong>
     * <p>eppool-gw80d96a96ca0b00****</p>
     */
    @NameInMap("EgressProxyIpPoolId")
    public String egressProxyIpPoolId;

    /**
     * <p>The name of the egress rule group. The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("EgressProxyRuleGroupName")
    public String egressProxyRuleGroupName;

    /**
     * <p>The list of egress rules grouped by phase (PreDns, PreRequest, and PostResponse).</p>
     */
    @NameInMap("EgressProxyRules")
    public CreateEgressProxyRuleGroupRequestEgressProxyRules egressProxyRules;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-gw80bb6a94f835db****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateEgressProxyRuleGroupRequestTag> tag;

    public static CreateEgressProxyRuleGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyRuleGroupRequest self = new CreateEgressProxyRuleGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyRuleGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEgressProxyRuleGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEgressProxyRuleGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateEgressProxyRuleGroupRequest setEgressProxyIpPoolId(String egressProxyIpPoolId) {
        this.egressProxyIpPoolId = egressProxyIpPoolId;
        return this;
    }
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    public CreateEgressProxyRuleGroupRequest setEgressProxyRuleGroupName(String egressProxyRuleGroupName) {
        this.egressProxyRuleGroupName = egressProxyRuleGroupName;
        return this;
    }
    public String getEgressProxyRuleGroupName() {
        return this.egressProxyRuleGroupName;
    }

    public CreateEgressProxyRuleGroupRequest setEgressProxyRules(CreateEgressProxyRuleGroupRequestEgressProxyRules egressProxyRules) {
        this.egressProxyRules = egressProxyRules;
        return this;
    }
    public CreateEgressProxyRuleGroupRequestEgressProxyRules getEgressProxyRules() {
        return this.egressProxyRules;
    }

    public CreateEgressProxyRuleGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEgressProxyRuleGroupRequest setTag(java.util.List<CreateEgressProxyRuleGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateEgressProxyRuleGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponseConditions extends TeaModel {
        /**
         * <p>The key of the matching condition. The value must match the phase of the rule and be used with an operator (ConditionOperator) of the corresponding category. Valid values:</p>
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
         * <li><p><strong>request:Http:Header</strong>: the HTTP request header. Used with string operators. Supported in the PreRequest phase. When you use this key, append the header name to the key in the format of request:Http:Header/<HeaderName>.</p>
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
         * <p>The operator of the matching condition. It must be used with a condition key (ConditionKey). Valid values:</p>
         * <ul>
         * <li><p><strong>StringEquals</strong>: exact string match.</p>
         * </li>
         * <li><p><strong>StringNotEquals</strong>: string inequality.</p>
         * </li>
         * <li><p><strong>StringEqualsIgnoreCase</strong>: case-insensitive exact string match.</p>
         * </li>
         * <li><p><strong>StringNotEqualsIgnoreCase</strong>: case-insensitive string inequality.</p>
         * </li>
         * <li><p><strong>StringPrefixMatch</strong>: string prefix match.</p>
         * </li>
         * <li><p><strong>StringPrefixMatchIgnoreCase</strong>: case-insensitive string prefix match.</p>
         * </li>
         * <li><p><strong>StringPrefixNotMatch</strong>: string prefix mismatch.</p>
         * </li>
         * <li><p><strong>StringPrefixNotMatchIgnoreCase</strong>: case-insensitive string prefix mismatch.</p>
         * </li>
         * <li><p><strong>StringSuffixMatch</strong>: string suffix match.</p>
         * </li>
         * <li><p><strong>StringSuffixMatchIgnoreCase</strong>: case-insensitive string suffix match.</p>
         * </li>
         * <li><p><strong>StringSuffixNotMatch</strong>: string suffix mismatch.</p>
         * </li>
         * <li><p><strong>StringSuffixNotMatchIgnoreCase</strong>: case-insensitive string suffix mismatch.</p>
         * </li>
         * <li><p><strong>StringRegexMatch</strong>: string regular expression match.</p>
         * </li>
         * <li><p><strong>StringRegexNotMatch</strong>: string regular expression mismatch.</p>
         * </li>
         * <li><p><strong>StringWildcardMatch</strong>: string wildcard match.</p>
         * </li>
         * <li><p><strong>StringWildcardMatchIgnoreCase</strong>: case-insensitive string wildcard match.</p>
         * </li>
         * <li><p><strong>StringWildcardNotMatch</strong>: string wildcard mismatch.</p>
         * </li>
         * <li><p><strong>StringWildcardNotMatchIgnoreCase</strong>: case-insensitive string wildcard mismatch.</p>
         * </li>
         * <li><p><strong>IpAddress</strong>: The source IP address belongs to the specified IP address or CIDR block.</p>
         * </li>
         * <li><p><strong>NotIpAddress</strong>: The source IP address does not belong to the specified IP address or CIDR block.</p>
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

        public static CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponseConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponseConditions self = new CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponseConditions();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponseConditions setConditionKey(String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public String getConditionKey() {
            return this.conditionKey;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponseConditions setConditionOperator(String conditionOperator) {
            this.conditionOperator = conditionOperator;
            return this;
        }
        public String getConditionOperator() {
            return this.conditionOperator;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponseConditions setConditionValues(java.util.List<String> conditionValues) {
            this.conditionValues = conditionValues;
            return this;
        }
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

    }

    public static class CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponse extends TeaModel {
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
        public java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponseConditions> conditions;

        /**
         * <p>The description of the egress rule. The description must be 2 to 256 characters in length and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the egress rule. The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("EgressProxyRuleName")
        public String egressProxyRuleName;

        /**
         * <p>The priority of the egress rule within its phase. Valid values: 1 to 1000. A smaller value indicates a higher priority. The priority must be unique within the same phase of a rule group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponse self = new CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponse();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponse setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponse setConditions(java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponseConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponseConditions> getConditions() {
            return this.conditions;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponse setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponse setEgressProxyRuleName(String egressProxyRuleName) {
            this.egressProxyRuleName = egressProxyRuleName;
            return this;
        }
        public String getEgressProxyRuleName() {
            return this.egressProxyRuleName;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponse setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDnsConditions extends TeaModel {
        /**
         * <p>The key of the matching condition. The value must match the phase of the rule and be used with an operator (ConditionOperator) of the corresponding category. Valid values:</p>
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
         * <li><p><strong>request:Http:Header</strong>: the HTTP request header. Used with string operators. Supported in the PreRequest phase. When you use this key, append the header name to the key in the format of request:Http:Header/<HeaderName>.</p>
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
         * <p>The operator of the matching condition. It must be used with a condition key (ConditionKey). Valid values:</p>
         * <ul>
         * <li><p><strong>StringEquals</strong>: exact string match.</p>
         * </li>
         * <li><p><strong>StringNotEquals</strong>: string inequality.</p>
         * </li>
         * <li><p><strong>StringEqualsIgnoreCase</strong>: case-insensitive exact string match.</p>
         * </li>
         * <li><p><strong>StringNotEqualsIgnoreCase</strong>: case-insensitive string inequality.</p>
         * </li>
         * <li><p><strong>StringPrefixMatch</strong>: string prefix match.</p>
         * </li>
         * <li><p><strong>StringPrefixMatchIgnoreCase</strong>: case-insensitive string prefix match.</p>
         * </li>
         * <li><p><strong>StringPrefixNotMatch</strong>: string prefix mismatch.</p>
         * </li>
         * <li><p><strong>StringPrefixNotMatchIgnoreCase</strong>: case-insensitive string prefix mismatch.</p>
         * </li>
         * <li><p><strong>StringSuffixMatch</strong>: string suffix match.</p>
         * </li>
         * <li><p><strong>StringSuffixMatchIgnoreCase</strong>: case-insensitive string suffix match.</p>
         * </li>
         * <li><p><strong>StringSuffixNotMatch</strong>: string suffix mismatch.</p>
         * </li>
         * <li><p><strong>StringSuffixNotMatchIgnoreCase</strong>: case-insensitive string suffix mismatch.</p>
         * </li>
         * <li><p><strong>StringRegexMatch</strong>: string regular expression match.</p>
         * </li>
         * <li><p><strong>StringRegexNotMatch</strong>: string regular expression mismatch.</p>
         * </li>
         * <li><p><strong>StringWildcardMatch</strong>: string wildcard match.</p>
         * </li>
         * <li><p><strong>StringWildcardMatchIgnoreCase</strong>: case-insensitive string wildcard match.</p>
         * </li>
         * <li><p><strong>StringWildcardNotMatch</strong>: string wildcard mismatch.</p>
         * </li>
         * <li><p><strong>StringWildcardNotMatchIgnoreCase</strong>: case-insensitive string wildcard mismatch.</p>
         * </li>
         * <li><p><strong>IpAddress</strong>: The source IP address belongs to the specified IP address or CIDR block.</p>
         * </li>
         * <li><p><strong>NotIpAddress</strong>: The source IP address does not belong to the specified IP address or CIDR block.</p>
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

        public static CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDnsConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDnsConditions self = new CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDnsConditions();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDnsConditions setConditionKey(String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public String getConditionKey() {
            return this.conditionKey;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDnsConditions setConditionOperator(String conditionOperator) {
            this.conditionOperator = conditionOperator;
            return this;
        }
        public String getConditionOperator() {
            return this.conditionOperator;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDnsConditions setConditionValues(java.util.List<String> conditionValues) {
            this.conditionValues = conditionValues;
            return this;
        }
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

    }

    public static class CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDns extends TeaModel {
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
        public java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDnsConditions> conditions;

        /**
         * <p>The description of the egress rule. The description must be 2 to 256 characters in length and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the egress rule. The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("EgressProxyRuleName")
        public String egressProxyRuleName;

        /**
         * <p>The priority of the egress rule within its phase. Valid values: 1 to 1000. A smaller value indicates a higher priority. The priority must be unique within the same phase of a rule group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDns build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDns self = new CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDns();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDns setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDns setConditions(java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDnsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDnsConditions> getConditions() {
            return this.conditions;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDns setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDns setEgressProxyRuleName(String egressProxyRuleName) {
            this.egressProxyRuleName = egressProxyRuleName;
            return this;
        }
        public String getEgressProxyRuleName() {
            return this.egressProxyRuleName;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDns setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequestConditions extends TeaModel {
        /**
         * <p>The key of the matching condition. The value must match the phase of the rule and be used with an operator (ConditionOperator) of the corresponding category. Valid values:</p>
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
         * <li><p><strong>request:Http:Header</strong>: the HTTP request header. Used with string operators. Supported in the PreRequest phase. When you use this key, append the header name to the key in the format of request:Http:Header/<HeaderName>.</p>
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
         * <p>The operator of the matching condition. It must be used with a condition key (ConditionKey). Valid values:</p>
         * <ul>
         * <li><p><strong>StringEquals</strong>: exact string match.</p>
         * </li>
         * <li><p><strong>StringNotEquals</strong>: string inequality.</p>
         * </li>
         * <li><p><strong>StringEqualsIgnoreCase</strong>: case-insensitive exact string match.</p>
         * </li>
         * <li><p><strong>StringNotEqualsIgnoreCase</strong>: case-insensitive string inequality.</p>
         * </li>
         * <li><p><strong>StringPrefixMatch</strong>: string prefix match.</p>
         * </li>
         * <li><p><strong>StringPrefixMatchIgnoreCase</strong>: case-insensitive string prefix match.</p>
         * </li>
         * <li><p><strong>StringPrefixNotMatch</strong>: string prefix mismatch.</p>
         * </li>
         * <li><p><strong>StringPrefixNotMatchIgnoreCase</strong>: case-insensitive string prefix mismatch.</p>
         * </li>
         * <li><p><strong>StringSuffixMatch</strong>: string suffix match.</p>
         * </li>
         * <li><p><strong>StringSuffixMatchIgnoreCase</strong>: case-insensitive string suffix match.</p>
         * </li>
         * <li><p><strong>StringSuffixNotMatch</strong>: string suffix mismatch.</p>
         * </li>
         * <li><p><strong>StringSuffixNotMatchIgnoreCase</strong>: case-insensitive string suffix mismatch.</p>
         * </li>
         * <li><p><strong>StringRegexMatch</strong>: string regular expression match.</p>
         * </li>
         * <li><p><strong>StringRegexNotMatch</strong>: string regular expression mismatch.</p>
         * </li>
         * <li><p><strong>StringWildcardMatch</strong>: string wildcard match.</p>
         * </li>
         * <li><p><strong>StringWildcardMatchIgnoreCase</strong>: case-insensitive string wildcard match.</p>
         * </li>
         * <li><p><strong>StringWildcardNotMatch</strong>: string wildcard mismatch.</p>
         * </li>
         * <li><p><strong>StringWildcardNotMatchIgnoreCase</strong>: case-insensitive string wildcard mismatch.</p>
         * </li>
         * <li><p><strong>IpAddress</strong>: The source IP address belongs to the specified IP address or CIDR block.</p>
         * </li>
         * <li><p><strong>NotIpAddress</strong>: The source IP address does not belong to the specified IP address or CIDR block.</p>
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

        public static CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequestConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequestConditions self = new CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequestConditions();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequestConditions setConditionKey(String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public String getConditionKey() {
            return this.conditionKey;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequestConditions setConditionOperator(String conditionOperator) {
            this.conditionOperator = conditionOperator;
            return this;
        }
        public String getConditionOperator() {
            return this.conditionOperator;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequestConditions setConditionValues(java.util.List<String> conditionValues) {
            this.conditionValues = conditionValues;
            return this;
        }
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

    }

    public static class CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequest extends TeaModel {
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
        public java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequestConditions> conditions;

        /**
         * <p>The description of the egress rule. The description must be 2 to 256 characters in length and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the egress rule. The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("EgressProxyRuleName")
        public String egressProxyRuleName;

        /**
         * <p>The priority of the egress rule within its phase. Valid values: 1 to 1000. A smaller value indicates a higher priority. The priority must be unique within the same phase of a rule group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequest self = new CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequest();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequest setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequest setConditions(java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequestConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequestConditions> getConditions() {
            return this.conditions;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequest setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequest setEgressProxyRuleName(String egressProxyRuleName) {
            this.egressProxyRuleName = egressProxyRuleName;
            return this;
        }
        public String getEgressProxyRuleName() {
            return this.egressProxyRuleName;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequest setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class CreateEgressProxyRuleGroupRequestEgressProxyRules extends TeaModel {
        /**
         * <p>The list of rules in the PostResponse phase (after the response is returned).</p>
         */
        @NameInMap("PostResponse")
        public java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponse> postResponse;

        /**
         * <p>The list of rules for the Pre-DNS stage (before DNS resolution).</p>
         */
        @NameInMap("PreDns")
        public java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDns> preDns;

        /**
         * <p>The list of rules in the PreRequest stage, which is executed before the request is forwarded.</p>
         */
        @NameInMap("PreRequest")
        public java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequest> preRequest;

        public static CreateEgressProxyRuleGroupRequestEgressProxyRules build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRuleGroupRequestEgressProxyRules self = new CreateEgressProxyRuleGroupRequestEgressProxyRules();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRules setPostResponse(java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponse> postResponse) {
            this.postResponse = postResponse;
            return this;
        }
        public java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPostResponse> getPostResponse() {
            return this.postResponse;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRules setPreDns(java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDns> preDns) {
            this.preDns = preDns;
            return this;
        }
        public java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPreDns> getPreDns() {
            return this.preDns;
        }

        public CreateEgressProxyRuleGroupRequestEgressProxyRules setPreRequest(java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequest> preRequest) {
            this.preRequest = preRequest;
            return this;
        }
        public java.util.List<CreateEgressProxyRuleGroupRequestEgressProxyRulesPreRequest> getPreRequest() {
            return this.preRequest;
        }

    }

    public static class CreateEgressProxyRuleGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key. It can be up to 128 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. It can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEgressProxyRuleGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRuleGroupRequestTag self = new CreateEgressProxyRuleGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRuleGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEgressProxyRuleGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
