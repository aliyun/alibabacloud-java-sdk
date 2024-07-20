// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListForwardingRulesResponseBody extends TeaModel {
    /**
     * <p>The forwarding rules.</p>
     */
    @NameInMap("ForwardingRules")
    public java.util.List<ListForwardingRulesResponseBodyForwardingRules> forwardingRules;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is not returned, it indicates that no additional results exist.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CFC67ED9-4AB1-431F-B6E3-A752B7B8CCD4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListForwardingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListForwardingRulesResponseBody self = new ListForwardingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListForwardingRulesResponseBody setForwardingRules(java.util.List<ListForwardingRulesResponseBodyForwardingRules> forwardingRules) {
        this.forwardingRules = forwardingRules;
        return this;
    }
    public java.util.List<ListForwardingRulesResponseBodyForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    public ListForwardingRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListForwardingRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListForwardingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListForwardingRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The endpoint group ID.</p>
         * <blockquote>
         * <p> GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>epg-bp1enpdcrqhl78g6r****</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        public static ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples self = new ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig extends TeaModel {
        /**
         * <p>The information about the endpoint groups.</p>
         * <blockquote>
         * <p> GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> operations.</p>
         * </blockquote>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig self = new ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig setServerGroupTuples(java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleActions extends TeaModel {
        /**
         * <p>The forwarding action configuration.</p>
         * <blockquote>
         * <p> GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> operations.</p>
         * </blockquote>
         */
        @NameInMap("ForwardGroupConfig")
        public ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The forwarding priority.</p>
         * <blockquote>
         * <p> This parameter does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The type of the forwarding action. Valid values:</p>
         * <ul>
         * <li><strong>ForwardGroup:</strong> forwards a request.</li>
         * <li><strong>Redirect:</strong> redirects a request.</li>
         * <li><strong>FixResponse:</strong> returns a fixed response.</li>
         * <li><strong>Rewrite:</strong> rewrites a request.</li>
         * <li><strong>AddHeader:</strong> adds a header to a request.</li>
         * <li><strong>RemoveHeaderConfig:</strong> deletes the header of a request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroup</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The value of the forwarding action type.</p>
         * <p>Different JSON strings are returned based on the value of the <strong>RuleActionType</strong> parameter.</p>
         * <ul>
         * <li><p>If you set <strong>RuleActionType</strong> to <strong>ForwardGroup</strong>, the information about a virtual endpoint group is returned. Parameter configuration:</p>
         * <ul>
         * <li><code>type:</code> the type of the resource that is returned. The value is <code>endpointgroup</code>.</li>
         * <li><code>value:</code> the ID of the virtual endpoint group that is returned.</li>
         * </ul>
         * </li>
         * <li><p>If you set <strong>RuleActionType</strong> to <strong>Redirect</strong>, the redirecting configuration is returned. Parameter configuration:</p>
         * <ul>
         * <li><code>protocol:</code> the protocol of requests after the requests are redirected.</li>
         * <li><code>domain:</code> the domain name to which requests are redirected.</li>
         * <li><code>port:</code> the port to which requests are redirected.</li>
         * <li><code>path:</code> the path to which requests are redirected.</li>
         * <li><code>query:</code> the query string of the requests that are redirected.</li>
         * <li><code>code:</code> the redirecting code.</li>
         * </ul>
         * </li>
         * <li><p>If you set <strong>RuleActionType</strong> to <strong>FixResponse</strong>, the information about the fixed response that you configured is returned. Parameter configuration:</p>
         * <ul>
         * <li><code>code:</code> the HTTP status code that is returned.</li>
         * <li><code>type:</code> the type of the response content that is returned.</li>
         * <li><code>content:</code> the response content that is returned.</li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>AddHeader</strong>, the information about the HTTP header that is added is returned. Parameter configuration:</p>
         * <ul>
         * <li><code>name:</code> the name of the HTTP header that is returned.</li>
         * <li><code>type:</code> the content type of the HTTP header that is returned.</li>
         * <li><code>value:</code> the content of the HTTP header that is returned.</li>
         * </ul>
         * </li>
         * <li><p>If you set <strong>RuleActionType</strong> to <strong>RemoveHeader</strong>, the information about the HTTP header that is deleted is returned.</p>
         * </li>
         * <li><p>If you set <strong>RuleActionType</strong> to <strong>Rewrite</strong>, the rewriting configuration is returned. Parameter configuration:</p>
         * <ul>
         * <li><code>domain:</code> the domain name to which requests are redirected.</li>
         * <li><code>path:</code> the path to which requests are redirected.</li>
         * <li><code>query:</code> the query string of the requests that are redirected.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;endpointgroup&quot;, &quot;value&quot;:&quot;epg-bp1enpdcrqhl78g6r****&quot;}]</p>
         */
        @NameInMap("RuleActionValue")
        public String ruleActionValue;

        public static ListForwardingRulesResponseBodyForwardingRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesRuleActions self = new ListForwardingRulesResponseBodyForwardingRulesRuleActions();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleActions setForwardGroupConfig(ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleActions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleActions setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleActions setRuleActionValue(String ruleActionValue) {
            this.ruleActionValue = ruleActionValue;
            return this;
        }
        public String getRuleActionValue() {
            return this.ruleActionValue;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig extends TeaModel {
        /**
         * <p>The domain name configuration.</p>
         * <blockquote>
         * <p> GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> operations.</p>
         * </blockquote>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig self = new ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig extends TeaModel {
        /**
         * <p>The path configuration.</p>
         * <blockquote>
         * <p> GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> operations.</p>
         * </blockquote>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig self = new ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleConditions extends TeaModel {
        /**
         * <p>The domain name configuration.</p>
         * <blockquote>
         * <p> GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> operations.</p>
         * </blockquote>
         */
        @NameInMap("HostConfig")
        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig hostConfig;

        /**
         * <p>The path configuration.</p>
         * <blockquote>
         * <p> GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> operations.</p>
         * </blockquote>
         */
        @NameInMap("PathConfig")
        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig pathConfig;

        /**
         * <p>The type of the forwarding condition. Valid values:</p>
         * <ul>
         * <li><strong>Host:</strong> domain name.</li>
         * <li><strong>Path:</strong> path.</li>
         * <li><strong>RequestHeader:</strong> HTTP header.</li>
         * <li><strong>Query:</strong> query string.</li>
         * <li><strong>Method:</strong> HTTP method.</li>
         * <li><strong>Cookie:</strong> cookie.</li>
         * <li><strong>SourceIP:</strong> source IP address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("RuleConditionType")
        public String ruleConditionType;

        /**
         * <p>The value of the forwarding condition type.</p>
         * <p>Different JSON strings are returned based on the value of the <strong>RuleConditionType</strong> parameter.</p>
         * <ul>
         * <li>If you set <strong>RuleConditionType</strong> to <strong>Host</strong>, a domain name condition is returned. If multiple domain names are returned in a forwarding condition, the relationship between the domain names is OR.</li>
         * <li>If you set <strong>RuleConditionType</strong> to <strong>Path</strong>, a path condition is returned. If multiple forwarding conditions of the path type are returned in a forwarding rule, the relationship between the forwarding conditions is OR. If multiple paths are returned in a forwarding condition, the relationship between the paths is OR.</li>
         * <li>If you set <strong>RuleConditionType</strong> to <strong>RequestHeader</strong>, an HTTP header condition that consists of key-value pairs is returned.</li>
         * <li>If you set <strong>RuleConditionType</strong> to <strong>Query</strong>, a query string condition that consists of key-value pairs is returned.</li>
         * <li>If you set <strong>RuleConditionType</strong> to <strong>Method</strong>, an HTTP method condition is returned.</li>
         * <li>If you set <strong>RuleConditionType</strong> to <strong>Cookie</strong>, a cookie condition that consists of key-value pairs is returned.</li>
         * <li>If you set <strong>RuleConditionType</strong> to <strong>SourceIP</strong>, a source IP address condition is returned. If multiple source IP addresses are returned in a forwarding condition, the relationship between the source IP addresses is OR.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="http://www.example.com">www.example.com</a>&quot;, &quot;<a href="http://www.aliyun.com%22%5D">www.aliyun.com&quot;]</a></p>
         */
        @NameInMap("RuleConditionValue")
        public String ruleConditionValue;

        public static ListForwardingRulesResponseBodyForwardingRulesRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesRuleConditions self = new ListForwardingRulesResponseBodyForwardingRulesRuleConditions();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditions setHostConfig(ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditions setPathConfig(ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditions setRuleConditionType(String ruleConditionType) {
            this.ruleConditionType = ruleConditionType;
            return this;
        }
        public String getRuleConditionType() {
            return this.ruleConditionType;
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditions setRuleConditionValue(String ruleConditionValue) {
            this.ruleConditionValue = ruleConditionValue;
            return this;
        }
        public String getRuleConditionValue() {
            return this.ruleConditionValue;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRulesServiceManagedInfos extends TeaModel {
        /**
         * <p>Managed policy action name, Valid values:</p>
         * <ul>
         * <li>Create</li>
         * <li>Update</li>
         * <li>Delete</li>
         * <li>Associate</li>
         * <li>UserUnmanaged</li>
         * <li>CreateChild</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Update</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>Sub resource type, Valid values:</p>
         * <ul>
         * <li>Listener</li>
         * <li>IpSet</li>
         * <li>EndpointGroup</li>
         * <li>ForwardingRule</li>
         * <li>Endpoint</li>
         * <li>EndpointGroupDestination</li>
         * <li>EndpointPolicy</li>
         * </ul>
         * <blockquote>
         * <p>Only valid when the Action parameter is CreateChild.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Is the managed policy action managed, Valid values:</p>
         * <ul>
         * <li><p>true: The managed policy action is managed, and users do not have permission to perform the operation specified in the Action on the managed instance.</p>
         * </li>
         * <li><p>false: The managed policy action is not managed, and users have permission to perform the operation specified in the Action on the managed instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        public static ListForwardingRulesResponseBodyForwardingRulesServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesServiceManagedInfos self = new ListForwardingRulesResponseBodyForwardingRulesServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRulesServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListForwardingRulesResponseBodyForwardingRulesServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public ListForwardingRulesResponseBodyForwardingRulesServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRules extends TeaModel {
        /**
         * <p>The direction in which the forwarding rule takes effect.</p>
         * <p>By default, <strong>request</strong> is returned, which indicates that the forwarding rule takes effect on requests.</p>
         * 
         * <strong>example:</strong>
         * <p>request</p>
         */
        @NameInMap("ForwardingRuleDirection")
        public String forwardingRuleDirection;

        /**
         * <p>The forwarding rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>frule-bp19a3t3yzr21q3****</p>
         */
        @NameInMap("ForwardingRuleId")
        public String forwardingRuleId;

        /**
         * <p>The forwarding rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_named_rule</p>
         */
        @NameInMap("ForwardingRuleName")
        public String forwardingRuleName;

        /**
         * <p>The state of the forwarding rule. Valid values:</p>
         * <ul>
         * <li><strong>active:</strong> The forwarding rule is normal.</li>
         * <li><strong>configuring:</strong> The forwarding rule is being modified.</li>
         * <li><strong>deleting:</strong> The forwarding rule is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("ForwardingRuleStatus")
        public String forwardingRuleStatus;

        /**
         * <p>The listener ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1s0vzbi5bxlx5****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The priority of the forwarding rule.</p>
         * <p>A value between <strong>1</strong> and <strong>10000</strong> is returned. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The forwarding actions.</p>
         */
        @NameInMap("RuleActions")
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActions> ruleActions;

        /**
         * <p>The conditions that trigger the forwarding rule.</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleConditions> ruleConditions;

        /**
         * <p>The service ID to which the managed instance belongs.</p>
         * <blockquote>
         * <p> Valid only when the ServiceManaged parameter is True.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Is it a managed instance. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>A list of action policies that users can execute on this managed instance.</p>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesServiceManagedInfos> serviceManagedInfos;

        public static ListForwardingRulesResponseBodyForwardingRules build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRules self = new ListForwardingRulesResponseBodyForwardingRules();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRules setForwardingRuleDirection(String forwardingRuleDirection) {
            this.forwardingRuleDirection = forwardingRuleDirection;
            return this;
        }
        public String getForwardingRuleDirection() {
            return this.forwardingRuleDirection;
        }

        public ListForwardingRulesResponseBodyForwardingRules setForwardingRuleId(String forwardingRuleId) {
            this.forwardingRuleId = forwardingRuleId;
            return this;
        }
        public String getForwardingRuleId() {
            return this.forwardingRuleId;
        }

        public ListForwardingRulesResponseBodyForwardingRules setForwardingRuleName(String forwardingRuleName) {
            this.forwardingRuleName = forwardingRuleName;
            return this;
        }
        public String getForwardingRuleName() {
            return this.forwardingRuleName;
        }

        public ListForwardingRulesResponseBodyForwardingRules setForwardingRuleStatus(String forwardingRuleStatus) {
            this.forwardingRuleStatus = forwardingRuleStatus;
            return this;
        }
        public String getForwardingRuleStatus() {
            return this.forwardingRuleStatus;
        }

        public ListForwardingRulesResponseBodyForwardingRules setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListForwardingRulesResponseBodyForwardingRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListForwardingRulesResponseBodyForwardingRules setRuleActions(java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

        public ListForwardingRulesResponseBodyForwardingRules setRuleConditions(java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        public ListForwardingRulesResponseBodyForwardingRules setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListForwardingRulesResponseBodyForwardingRules setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListForwardingRulesResponseBodyForwardingRules setServiceManagedInfos(java.util.List<ListForwardingRulesResponseBodyForwardingRulesServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

    }

}
