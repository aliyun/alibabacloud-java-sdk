// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateForwardingRulesRequest extends TeaModel {
    /**
     * <p>The ID of the Global Accelerator instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4q****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the request as the <strong>client token</strong>. The <strong>RequestId</strong> of each request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configurations of the forwarding rules.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ForwardingRules")
    public java.util.List<UpdateForwardingRulesRequestForwardingRules> forwardingRules;

    /**
     * <p>The ID of the listener.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1s0vzbi5bxlx5****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The region ID of the Global Accelerator instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateForwardingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateForwardingRulesRequest self = new UpdateForwardingRulesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateForwardingRulesRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public UpdateForwardingRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateForwardingRulesRequest setForwardingRules(java.util.List<UpdateForwardingRulesRequestForwardingRules> forwardingRules) {
        this.forwardingRules = forwardingRules;
        return this;
    }
    public java.util.List<UpdateForwardingRulesRequestForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    public UpdateForwardingRulesRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateForwardingRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The ID of the endpoint group.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> parameters.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-bp1ieei9664r5nv****</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        public static UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples self = new UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig extends TeaModel {
        /**
         * <p>The endpoint group configuration.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> parameters.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig self = new UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig setServerGroupTuples(java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleActions extends TeaModel {
        /**
         * <p>The forwarding configuration.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> parameters.</p>
         * </blockquote>
         */
        @NameInMap("ForwardGroupConfig")
        public UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The priority of the action.</p>
         * <blockquote>
         * <p>This parameter is not in use. You do not need to specify this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The type of the action. Valid values:</p>
         * <ul>
         * <li><p><strong>ForwardGroup</strong>: forwards a request to an endpoint group.</p>
         * </li>
         * <li><p><strong>Redirect</strong>: redirects a request.</p>
         * </li>
         * <li><p><strong>FixResponse</strong>: returns a fixed response.</p>
         * </li>
         * <li><p><strong>Rewrite</strong>: rewrites a request.</p>
         * </li>
         * <li><p><strong>AddHeader</strong>: adds a header to a request.</p>
         * </li>
         * <li><p><strong>RemoveHeader</strong>: removes a header from a request.</p>
         * </li>
         * <li><p><strong>Drop</strong>: drops a request.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroup</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The value of the action.</p>
         * <p>The value is a JSON string that varies based on the value of <strong>RuleActionType</strong>.</p>
         * <p>A forwarding rule can have at most one action of the <strong>ForwardGroup</strong>, <strong>Redirect</strong>, or <strong>FixResponse</strong> type. The <code>Rewrite</code>, <code>AddHeader</code>, and <code>RemoveHeader</code> actions must precede a <code>ForwardGroup</code> action.</p>
         * <ul>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>ForwardGroup</strong>, this parameter specifies the endpoint group configuration. You can forward requests to only one endpoint group. Example: <code>{&quot;type&quot;:&quot;endpointgroup&quot;, &quot;value&quot;:&quot;epg-bp1enpdcrqhl78g6r****&quot;}</code>, where:</p>
         * <ul>
         * <li><p><code>type</code>: Set the value to <code>endpointgroup</code>.</p>
         * </li>
         * <li><p><code>value</code>: The ID of the destination endpoint group.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>Redirect</strong>, this parameter specifies the redirect configuration. In a <strong>Redirect</strong> action, at least one of the following fields must be specified with a non-default value: <code>protocol</code>, <code>domain</code>, <code>port</code>, <code>path</code>, or <code>query</code>. Example: <code>{&quot;protocol&quot;:&quot;HTTP&quot;, &quot;domain&quot;:&quot;www.example.com&quot;, &quot;port&quot;:&quot;80&quot;, &quot;path&quot;:&quot;/a&quot;,&quot;query&quot;:&quot;value1&quot;, &quot;code&quot;:&quot;301&quot; }</code>, where:</p>
         * <ul>
         * <li><p><code>protocol</code>: The protocol to which requests are redirected. Valid values: <code>${protocol}</code> (default), <code>HTTP</code>, and <code>HTTPS</code>.</p>
         * </li>
         * <li><p><code>domain</code>: The domain to which requests are redirected. The default value is <code>${host}</code>. You can also specify another domain. The domain must be 3 to 128 characters in length and can contain only lowercase letters, digits, and the following special characters: <code>.-?=~_-+/^*!$&amp;|()[]</code>.</p>
         * </li>
         * <li><p><code>port</code>: The port to which requests are redirected. The default value is <code>${port}</code>. You can also specify another port. Valid values: 1 to 63335.</p>
         * </li>
         * <li><p><code>path</code>: The path to which requests are redirected. The default value is <code>${path}</code>. The path must be 1 to 128 characters in length. A regular expression-based path must start with a tilde (\<del>) and can contain letters, digits, and the following special characters: `.-_/=?</del>^*$:()[]+|<code>. A path that is not a regular expression must start with a forward slash (/) and can contain letters, digits, and the following special characters: </code>.-_/=?:`.</p>
         * </li>
         * <li><p><code>query</code>: The query string to which requests are redirected. The default value is <code>${query}</code>. You can also specify another query string. The query string must be 1 to 128 characters in length and can contain printable ASCII characters whose character codes are in the range of <code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. The letters must be in lowercase. Spaces and the following characters are not allowed: <code>[]{}&lt;&gt;\\#|&amp;</code>.</p>
         * </li>
         * <li><p><code>code</code>: The redirect type. Valid values: <code>301</code>, <code>302</code>, <code>303</code>, <code>307</code>, and <code>308</code>.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>FixResponse</strong>, this parameter specifies the fixed response configuration. Example: <code>{&quot;code&quot;:&quot;200&quot;, &quot;type&quot;:&quot;text/plain&quot;, &quot;content&quot;:&quot;dssacav&quot; }</code>, where:</p>
         * <ul>
         * <li><p><code>code</code>: The HTTP status code. You can specify a numeric string that represents a <code>2xx</code>, <code>4xx</code>, or <code>5xx</code> status code, where <code>x</code> indicates a digit.</p>
         * </li>
         * <li><p><code>type</code>: The content type of the response body. Valid values: <strong>text/plain</strong>, <strong>text/css</strong>, <strong>text/html</strong>, <strong>application/javascript</strong>, and <strong>application/json</strong>.</p>
         * </li>
         * <li><p><code>content</code>: The content of the response body. The content can be up to 1,024 characters in length and cannot contain Chinese characters.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>AddHeader</strong>, this parameter specifies the configuration for adding an HTTP header. An <strong>AddHeader</strong> action must be used together with a <strong>ForwardGroup</strong> action. Example: <code>[{&quot;name&quot;:&quot;header1&quot;,&quot;type&quot;:&quot;user-defined&quot;, &quot;value&quot;:&quot;value&quot;}]</code>, where:</p>
         * <ul>
         * <li><p><code>name</code>: The name of the HTTP header. The name must be 1 to 40 characters in length and can contain letters, digits, hyphens (-), and underscores (_). The header names specified for <strong>AddHeader</strong> must be unique and cannot be the same as those specified for <strong>RemoveHeader</strong>.</p>
         * </li>
         * <li><p><code>type</code>: The content type of the HTTP header. Valid values: <code>user-defined</code>, <code>ref</code> (reference), and <code>system-defined</code>.</p>
         * </li>
         * <li><p><code>value</code>: The content of the HTTP header. This parameter cannot be left empty. If <code>type</code> is set to <code>user-defined</code>, the content must be 1 to 128 characters in length and can contain printable ASCII characters whose character codes are in the range of <code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. The content can include letters, digits, hyphens (-), and underscores (<em>). The content cannot start or end with a space. If <code>type</code> is set to <code>ref</code> (reference), the content must be 1 to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (</em>). The content cannot start or end with a space. If <code>type</code> is set to <code>system-defined</code>, the only valid value is <code>ClientSrcIp</code>.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>RemoveHeader</strong>, this parameter specifies the configuration for removing an HTTP header. A <strong>RemoveHeader</strong> action must be used together with a <strong>ForwardGroup</strong> action. The header name must be 1 to 40 characters in length and can contain letters, digits, hyphens (-), and underscores (_). Example: <code>[&quot;header1&quot;]</code>.</p>
         * </li>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>Rewrite</strong>, this parameter specifies the rewrite configuration. A <strong>Rewrite</strong> action must be used together with a <strong>ForwardGroup</strong> action. Example: <code>{&quot;domain&quot;:&quot;value1&quot;, &quot;path&quot;:&quot;value2&quot;, &quot;query&quot;:&quot;value3&quot;}</code>, where:</p>
         * <ul>
         * <li><p><code>domain</code>: The domain to which requests are rewritten. The default value is <code>${host}</code>. You can also specify another domain. The domain must be 3 to 128 characters in length and can contain only lowercase letters, digits, and the following special characters: <code>.-?=~_-+/^*!$&amp;|()[]</code>.</p>
         * </li>
         * <li><p><code>path</code>: The path to which requests are rewritten. The default value is <code>${path}</code>. The path must be 1 to 128 characters in length. A regular expression-based path must start with a tilde (\<del>) and can contain letters, digits, and the following special characters: `.-_/=?</del>^*$:()[]+|<code>. A path that is not a regular expression must start with a forward slash (/) and can contain letters, digits, and the following special characters: </code>.-_/=?:`.</p>
         * </li>
         * <li><p><code>query</code>: The query string to which requests are rewritten. The default value is <code>${query}</code>. You can also specify another query string. The query string must be 1 to 128 characters in length and can contain printable ASCII characters whose character codes are in the range of <code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. The letters must be in lowercase. Spaces and the following characters are not allowed: <code>[]{}&lt;&gt;\\#|&amp;</code>.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>Drop</strong>, you do not need to specify this parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;endpointgroup&quot;, &quot;value&quot;:&quot;epg-bp1enpdcrqhl78g6r****&quot;}]</p>
         */
        @NameInMap("RuleActionValue")
        public String ruleActionValue;

        public static UpdateForwardingRulesRequestForwardingRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleActions self = new UpdateForwardingRulesRequestForwardingRulesRuleActions();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActions setForwardGroupConfig(UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActions setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActions setRuleActionValue(String ruleActionValue) {
            this.ruleActionValue = ruleActionValue;
            return this;
        }
        public String getRuleActionValue() {
            return this.ruleActionValue;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig extends TeaModel {
        /**
         * <p>The domain configuration.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use the <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> parameters.</p>
         * </blockquote>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig self = new UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig extends TeaModel {
        /**
         * <p>The path configuration.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use the <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> parameters.</p>
         * </blockquote>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig self = new UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleConditions extends TeaModel {
        /**
         * <p>The domain configuration.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use the <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> parameters.</p>
         * </blockquote>
         */
        @NameInMap("HostConfig")
        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig hostConfig;

        /**
         * <p>The path configuration.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use the <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> parameters.</p>
         * </blockquote>
         */
        @NameInMap("PathConfig")
        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig pathConfig;

        /**
         * <p>The type of the forwarding condition. Valid values:</p>
         * <ul>
         * <li><p><strong>Host</strong>: matches a request based on its domain name.</p>
         * </li>
         * <li><p><strong>Path</strong>: matches a request based on its path.</p>
         * </li>
         * <li><p><strong>RequestHeader</strong>: matches a request based on its HTTP header.</p>
         * </li>
         * <li><p><strong>Query</strong>: matches a request based on its query string.</p>
         * </li>
         * <li><p><strong>Method</strong>: matches a request based on its HTTP request method.</p>
         * </li>
         * <li><p><strong>Cookie</strong>: matches a request based on its cookie.</p>
         * </li>
         * <li><p><strong>SourceIP</strong>: matches a request based on its source IP address.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("RuleConditionType")
        public String ruleConditionType;

        /**
         * <p>The value of the forwarding condition.
         * The value is a JSON string that varies based on the value of <strong>RuleConditionType</strong>.</p>
         * <ul>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Host</strong>, this parameter specifies the domain configuration. A forwarding rule can contain only one Host-based rule condition. The condition can contain multiple domains that are evaluated with a logical OR. A domain must be 3 to 128 characters in length and can contain letters, digits, hyphens (-), and periods (.). You can use asterisks (\*) and question marks (?) as wildcards. Example: <code>[&quot;www.example.com&quot;, &quot;www.aliyun.com&quot;]</code>.</p>
         * </li>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Path</strong>, this parameter specifies the path configuration. A forwarding rule can contain multiple path-based rule conditions, which are evaluated with a logical OR. Each condition can contain multiple paths, which are also evaluated with a logical OR. A path must be 1 to 128 characters in length, start with a forward slash (/), and contain only letters, digits, and the following special characters: <code>$</code>, <code>-</code>, <code>_</code>, <code>.</code>, <code>+</code>, <code>/</code>, <code>&amp;</code>, <code>~</code>, <code>@</code>, <code>:</code>, and <code>\\&quot;</code>. You can use asterisks (\*) and question marks (?) as wildcards. Example: <code>[&quot;/a&quot;, &quot;/b/&quot;]</code>.</p>
         * </li>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>RequestHeader</strong>, this parameter specifies the HTTP header configuration, which consists of key-value pairs. The values for a specific header must be unique. Example: <code>[{&quot;header1&quot;:[&quot;value1&quot;,&quot;value2&quot;]}]</code>.</p>
         * <ul>
         * <li><p>Key: The key of the HTTP header. The key must be 1 to 40 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * </li>
         * <li><p>Value: The value of the HTTP header. The value must be 1 to 128 characters in length and can contain printable ASCII characters whose character codes are in the range of <code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. The value cannot start or end with a space.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Query</strong>, this parameter specifies the query string configuration, which consists of key-value pairs. Example: <code>[{&quot;query1&quot;:[&quot;value1&quot;]}, {&quot;query2&quot;:[&quot;value2&quot;]}]</code>.</p>
         * <ul>
         * <li><p>Key: The key of the query string. The key must be 1 to 100 characters in length and can contain printable ASCII characters whose character codes are in the range of <code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. The letters must be in lowercase. Spaces and the following characters are not allowed: <code>[]{}&lt;&gt;\\;/?:@&amp;=+,$%|&quot;^~</code>.</p>
         * </li>
         * <li><p>Value: The value of the query string. The value must be 1 to 128 characters in length and can contain printable ASCII characters whose character codes are in the range of <code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. The letters must be in lowercase. Spaces and the following characters are not allowed: <code>[]{}&lt;&gt;\\;/?:@&amp;=+,$%|&quot;^~</code>.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Method</strong>, this parameter specifies the HTTP request method configuration. Valid values: <strong>HEAD</strong>, <strong>GET</strong>, <strong>POST</strong>, <strong>OPTIONS</strong>, <strong>PUT</strong>, <strong>PATCH</strong>, and <strong>DELETE</strong>. Example: <code>[&quot;GET&quot;, &quot;OPTIONS&quot;, &quot;POST&quot;]</code>.</p>
         * </li>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Cookie</strong>, this parameter specifies the cookie configuration, which consists of key-value pairs. Example: <code>[{&quot;cookie1&quot;:[&quot;value1&quot;]}, {&quot;cookie2&quot;:[&quot;value2&quot;]}]</code></p>
         * <ul>
         * <li><p>Key: The key of the cookie. The key must be 1 to 100 characters in length and can contain printable ASCII characters whose character codes are in the range of <code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. The letters must be in lowercase. Spaces and the following characters are not allowed: <code>#[]{}\\|&lt;&gt;&amp;</code>.</p>
         * </li>
         * <li><p>Value: The value of the cookie. The value must be 1 to 128 characters in length and can contain printable ASCII characters whose character codes are in the range of <code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. The letters must be in lowercase. Spaces and the following characters are not allowed: <code>#[]{}\\|&lt;&gt;&amp;</code>.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>SourceIP</strong>, this parameter specifies the source IP configuration. You can specify IP addresses such as 1.1.XX.XX/32 or CIDR blocks such as 2.2.XX.XX/24. A forwarding rule can contain only one source IP-based rule condition, which can contain multiple source IP addresses or CIDR blocks that are evaluated with a logical OR. Example: <code>[&quot;1.1.XX.XX/32&quot;, &quot;2.2.XX.XX/24&quot;]</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="http://www.example.com">www.example.com</a>&quot;, &quot;<a href="http://www.aliyun.com%22%5D">www.aliyun.com&quot;]</a></p>
         */
        @NameInMap("RuleConditionValue")
        public String ruleConditionValue;

        public static UpdateForwardingRulesRequestForwardingRulesRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleConditions self = new UpdateForwardingRulesRequestForwardingRulesRuleConditions();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditions setHostConfig(UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditions setPathConfig(UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditions setRuleConditionType(String ruleConditionType) {
            this.ruleConditionType = ruleConditionType;
            return this;
        }
        public String getRuleConditionType() {
            return this.ruleConditionType;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditions setRuleConditionValue(String ruleConditionValue) {
            this.ruleConditionValue = ruleConditionValue;
            return this;
        }
        public String getRuleConditionValue() {
            return this.ruleConditionValue;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRules extends TeaModel {
        /**
         * <p>The ID of the forwarding rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>frule-bp1dii16gu9qdvb34****</p>
         */
        @NameInMap("ForwardingRuleId")
        public String forwardingRuleId;

        /**
         * <p>The name of the forwarding rule.</p>
         * <p>The name must be 2 to 128 characters in length, start with a letter or a Chinese character, and can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ForwardingRuleName")
        public String forwardingRuleName;

        /**
         * <p>The priority of the forwarding rule. A smaller value indicates a higher priority. Valid values: <strong>1</strong> to <strong>10000</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The actions that are performed when the forwarding conditions are met.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleActions")
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActions> ruleActions;

        /**
         * <p>The forwarding conditions.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleConditions> ruleConditions;

        /**
         * <p>The direction of the rule. You do not need to specify this parameter.</p>
         * <p>This parameter is set to <strong>request</strong> by default, which indicates that the rule applies to inbound requests.</p>
         * 
         * <strong>example:</strong>
         * <p>request</p>
         */
        @NameInMap("RuleDirection")
        public String ruleDirection;

        public static UpdateForwardingRulesRequestForwardingRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRules self = new UpdateForwardingRulesRequestForwardingRules();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRules setForwardingRuleId(String forwardingRuleId) {
            this.forwardingRuleId = forwardingRuleId;
            return this;
        }
        public String getForwardingRuleId() {
            return this.forwardingRuleId;
        }

        public UpdateForwardingRulesRequestForwardingRules setForwardingRuleName(String forwardingRuleName) {
            this.forwardingRuleName = forwardingRuleName;
            return this;
        }
        public String getForwardingRuleName() {
            return this.forwardingRuleName;
        }

        public UpdateForwardingRulesRequestForwardingRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateForwardingRulesRequestForwardingRules setRuleActions(java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

        public UpdateForwardingRulesRequestForwardingRules setRuleConditions(java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        public UpdateForwardingRulesRequestForwardingRules setRuleDirection(String ruleDirection) {
            this.ruleDirection = ruleDirection;
            return this;
        }
        public String getRuleDirection() {
            return this.ruleDirection;
        }

    }

}
