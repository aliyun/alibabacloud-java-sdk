// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateForwardingRulesRequest extends TeaModel {
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
     * <p>You can generate a client token from your client and make sure that the client token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The forwarding rule configurations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ForwardingRules")
    public java.util.List<CreateForwardingRulesRequestForwardingRules> forwardingRules;

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
     * <p>The ID of the region where the Global Accelerator instance is deployed. The only valid value is <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateForwardingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardingRulesRequest self = new CreateForwardingRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateForwardingRulesRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateForwardingRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateForwardingRulesRequest setForwardingRules(java.util.List<CreateForwardingRulesRequestForwardingRules> forwardingRules) {
        this.forwardingRules = forwardingRules;
        return this;
    }
    public java.util.List<CreateForwardingRulesRequestForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    public CreateForwardingRulesRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateForwardingRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The ID of the endpoint group.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> to configure rule actions.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-bp1nktp3qgbcq9ih6****</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        public static CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples self = new CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

    }

    public static class CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig extends TeaModel {
        /**
         * <p>The endpoint group configuration.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> to configure rule actions.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig self = new CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig setServerGroupTuples(java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class CreateForwardingRulesRequestForwardingRulesRuleActions extends TeaModel {
        /**
         * <p>The forwarding configuration.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> to configure rule actions.</p>
         * </blockquote>
         */
        @NameInMap("ForwardGroupConfig")
        public CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The priority of the action.</p>
         * <blockquote>
         * <p>This parameter is not in use and can be ignored.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The type of the rule action. Valid values:</p>
         * <ul>
         * <li><p><strong>ForwardGroup</strong>: Forwards requests.</p>
         * </li>
         * <li><p><strong>Redirect</strong>: Redirects requests.</p>
         * </li>
         * <li><p><strong>FixResponse</strong>: Returns a fixed response.</p>
         * </li>
         * <li><p><strong>Rewrite</strong>: Rewrites requests.</p>
         * </li>
         * <li><p><strong>AddHeader</strong>: Adds a header.</p>
         * </li>
         * <li><p><strong>RemoveHeader</strong>: Removes a header.</p>
         * </li>
         * <li><p><strong>Drop</strong>: Drops requests.</p>
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
         * <p>The value for the rule action.</p>
         * <p>This is a JSON-formatted string whose structure depends on the specified <strong>RuleActionType</strong>.</p>
         * <p>A forwarding rule can have at most one action of type <strong>ForwardGroup</strong>, <strong>Redirect</strong>, or <strong>FixResponse</strong>. Actions of type <strong>Rewrite</strong>, <strong>AddHeader</strong>, and <strong>RemoveHeader</strong> must be specified before a <strong>ForwardGroup</strong> action.</p>
         * <ul>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>ForwardGroup</strong>, this parameter specifies the endpoint group. You can forward requests to only one endpoint group. Example: <code>{&quot;type&quot;:&quot;endpointgroup&quot;, &quot;value&quot;:&quot;epg-bp1enpdcrqhl78g6r****&quot;}</code>, where:</p>
         * <ul>
         * <li><p><code>type</code>: Set the value to<code> endpointgroup</code>.</p>
         * </li>
         * <li><p><code>value</code>: The ID of the target endpoint group.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>Redirect</strong>, this parameter specifies the redirect configuration. At least one of the <code>protocol</code>, <code>domain</code>, <code>port</code>, <code>path</code>, or <code>query</code> fields must be set to a value other than its default. Example: <code>{&quot;protocol&quot;:&quot;HTTP&quot;, &quot;domain&quot;:&quot;www.example.com&quot;, &quot;port&quot;:&quot;80&quot;, &quot;path&quot;:&quot;/a&quot;,&quot;query&quot;:&quot;value1&quot;, &quot;code&quot;:&quot;301&quot; }</code>, where:</p>
         * <ul>
         * <li><p><code>protocol</code>: The protocol for the redirect. Valid values: <code>${protocol}</code> (default), <code>HTTP</code>, and <code>HTTPS</code>.</p>
         * </li>
         * <li><p><code>domain</code>: The domain name for the redirect. The default value is <code>${host}</code>. You can also specify another domain name. A domain name must be 3 to 128 characters long and can contain only lowercase letters, digits, and the following special characters:<code> .-=~_-+/^*!$&amp;()[]?</code>.</p>
         * </li>
         * <li><p><code>port</code>: The port for the redirect. The default value is <code>${port}</code>. You can also specify a port number. Valid values: 1 to 63335.</p>
         * </li>
         * <li><p><code>path</code>: The path for the redirect. The default value is <code>${path}</code>. The path must be 1 to 128 characters long. For a regular expression path, it must start with a tilde (\<del>) and can contain uppercase and lowercase letters, digits, and the following special characters:` .-_/=?</del>^*$:()[]+<code>. For a non-regular expression path, it must start with a forward slash (/) and can contain uppercase and lowercase letters, digits, and the following special characters:</code> .-_/=:?`.</p>
         * </li>
         * <li><p><code>query</code>: The query string for the redirect. The default value is <code>${query}</code>. You can also specify another query string. The query string must be 1 to 128 characters long and contain only printable characters within the ASCII range of<code> ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. Letters must be lowercase. Spaces and the following special characters are not supported:<code> []{}&lt;&gt;\\#&amp;</code>.</p>
         * </li>
         * <li><p><code>code</code>: The redirect code. Valid values: <code>301</code>, <code>302</code>, <code>303</code>, <code>307</code>, and <code>308</code>.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>FixResponse</strong>, this parameter specifies the fixed response configuration. Example: <code>{&quot;code&quot;:&quot;200&quot;, &quot;type&quot;:&quot;text/plain&quot;, &quot;content&quot;:&quot;dssacav&quot; }</code>, where:</p>
         * <ul>
         * <li><p><code>code</code>: The response status code. The value must be a numeric string in the <code>2xx</code>, <code>4xx</code>, or <code>5xx</code> format, where <code>x</code> is any digit.</p>
         * </li>
         * <li><p><code>type</code>: The content type of the response body. Valid values: <strong>text/plain</strong>, <strong>text/css</strong>, <strong>text/html</strong>, <strong>application/javascript</strong>, and <strong>application/json</strong>.</p>
         * </li>
         * <li><p><code>content</code>: The content of the response body. The content cannot exceed 1,000 characters and does not support Chinese characters.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>AddHeader</strong>, this parameter specifies the configuration for adding an HTTP header. If a forwarding rule contains an <strong>AddHeader</strong> action, it must also contain a <strong>ForwardGroup</strong> action. Example: <code>[{&quot;name&quot;:&quot;header1&quot;,&quot;type&quot;:&quot;user-defined&quot;, &quot;value&quot;:&quot;value&quot;}]</code>, where:</p>
         * <ul>
         * <li><p><code>name</code>: The name of the HTTP header. The name must be 1 to 40 characters long and can contain uppercase and lowercase letters, digits, hyphens (-), and underscores (_). The header names in <strong>AddHeader</strong> actions must be unique and cannot be the same as any header name in a <strong>RemoveHeader</strong> action.</p>
         * </li>
         * <li><p><code>type</code>: The type of the header value. Valid values: <code>user-defined</code>, <code>ref</code> (reference), and <code>system-defined</code>.</p>
         * </li>
         * <li><p><code>value</code>: The content of the HTTP header. This field cannot be empty. If <code>type</code> is <code>user-defined</code>, the value must be 1 to 128 characters long and contain only printable characters within the ASCII range of <code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. The value can contain uppercase and lowercase letters, digits, hyphens (-), and underscores (<em>), and cannot start or end with a space. If <code>type</code> is <code>ref</code>, the value must be 1 to 128 characters long and can contain uppercase and lowercase letters, digits, hyphens (-), and underscores (</em>). The value cannot start or end with a space. If <code>type</code> is <code>system-defined</code>, the only valid value is <code>ClientSrcIp</code>.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>RemoveHeader</strong>, this parameter specifies the HTTP headers to remove. If a forwarding rule contains a <strong>RemoveHeader</strong> action, it must also contain a <strong>ForwardGroup</strong> action. The value must be 1 to 40 characters long and can contain uppercase and lowercase letters, digits, hyphens (-), and underscores (_). Example: <code>[&quot;header1&quot;]</code>.</p>
         * </li>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>Rewrite</strong>, this parameter specifies the rewrite configuration. If a forwarding rule contains a <strong>Rewrite</strong> action, it must also contain a <strong>ForwardGroup</strong> action. Example: <code>{&quot;domain&quot;:&quot;value1&quot;, &quot;path&quot;:&quot;value2&quot;, &quot;query&quot;:&quot;value3&quot;}</code>, where:</p>
         * <ul>
         * <li><p><code>domain</code>: The domain name to rewrite. The default value is <code>${host}</code>. You can also specify another domain name. A domain name must be 3 to 128 characters long and can contain only lowercase letters, digits, and the following special characters:<code> .-=~_-+/^*!$&amp;()[]?</code>.</p>
         * </li>
         * <li><p><code>path</code>: The path to rewrite. The default value is <code>${path}</code>. The path must be 1 to 128 characters long. For a regular expression path, it must start with a tilde (\<del>) and can contain uppercase and lowercase letters, digits, and the following special characters:` .-_/=?</del>^*$:()[]+<code>. For a non-regular expression path, it must start with a forward slash (/) and can contain uppercase and lowercase letters, digits, and the following special characters:</code> .-_/=:?`.</p>
         * </li>
         * <li><p><code>query</code>: The query string to rewrite. The default value is <code>${query}</code>. You can also specify another query string. The query string must be 1 to 128 characters long and contain only printable characters within the ASCII range of<code> ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. Letters must be lowercase. Spaces and the following special characters are not supported:<code> []{}&lt;&gt;\\#&amp;</code>.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleActionType</strong> is set to <strong>Drop</strong>, you do not need to specify a value for this parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;endpointgroup&quot;,&quot;value&quot;:&quot;epg-bp1l49ltx6iengvf2ks5z****&quot;}]</p>
         */
        @NameInMap("RuleActionValue")
        public String ruleActionValue;

        public static CreateForwardingRulesRequestForwardingRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRulesRuleActions self = new CreateForwardingRulesRequestForwardingRulesRuleActions();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRulesRuleActions setForwardGroupConfig(CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public CreateForwardingRulesRequestForwardingRulesRuleActions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public CreateForwardingRulesRequestForwardingRulesRuleActions setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public CreateForwardingRulesRequestForwardingRulesRuleActions setRuleActionValue(String ruleActionValue) {
            this.ruleActionValue = ruleActionValue;
            return this;
        }
        public String getRuleActionValue() {
            return this.ruleActionValue;
        }

    }

    public static class CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig extends TeaModel {
        /**
         * <p>The domain name configuration.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> to configure rule conditions.</p>
         * </blockquote>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig self = new CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig extends TeaModel {
        /**
         * <p>The path configuration.</p>
         * <p>A path must be 1 to 128 characters long and must start with a forward slash (/). It can contain letters, digits, dollar signs ($), hyphens (-), underscores (_), periods (.), plus signs (+), forward slashes (/), ampersands (&amp;), tildes (\~), at signs (@), colons (:), and apostrophes (\&quot;). You can use asterisks (\*) and question marks (?) as wildcards.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> to configure rule conditions.</p>
         * </blockquote>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig self = new CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateForwardingRulesRequestForwardingRulesRuleConditions extends TeaModel {
        /**
         * <p>The domain name configuration.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> to configure rule conditions.</p>
         * </blockquote>
         */
        @NameInMap("HostConfig")
        public CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig hostConfig;

        /**
         * <p>The path configuration.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> to configure rule conditions.</p>
         * </blockquote>
         */
        @NameInMap("PathConfig")
        public CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig pathConfig;

        /**
         * <p>The type of the rule condition. Valid values:</p>
         * <ul>
         * <li><p><strong>Host</strong>: Matches requests by domain name.</p>
         * </li>
         * <li><p><strong>Path</strong>: Matches requests by path.</p>
         * </li>
         * <li><p><strong>RequestHeader</strong>: Matches requests by HTTP header.</p>
         * </li>
         * <li><p><strong>Query</strong>: Matches requests by query string.</p>
         * </li>
         * <li><p><strong>Method</strong>: Matches requests by HTTP method.</p>
         * </li>
         * <li><p><strong>Cookie</strong>: Matches requests by cookie.</p>
         * </li>
         * <li><p><strong>SourceIP</strong>: Matches requests by source IP address.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("RuleConditionType")
        public String ruleConditionType;

        /**
         * <p>The value of the rule condition.
         * This is a JSON-formatted string whose structure depends on the specified <strong>RuleConditionType</strong>.</p>
         * <ul>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Host</strong>, this parameter specifies the domain name conditions. A forwarding rule can have only one <strong>Host</strong> rule condition. This rule condition can contain multiple domain names, which are evaluated with a logical OR. A domain name must be 3 to 128 characters long and can contain letters, digits, hyphens (-), and periods (.). You can use asterisks (\*) and question marks (?) as wildcards. Example: <code>[&quot;www.example.com&quot;, &quot;www.aliyun.com&quot;]</code>.</p>
         * </li>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Path</strong>, this parameter specifies the path conditions. A forwarding rule can have multiple <strong>Path</strong> rule conditions, which are evaluated with a logical OR. Each path rule condition can contain multiple paths, which are also evaluated with a logical OR. A path must be 1 to 128 characters long and must start with a forward slash (/). It can contain letters, digits, dollar signs ($), hyphens (-), underscores (_), periods (.), plus signs (+), forward slashes (/), ampersands (&amp;), tildes (\~), at signs (@), colons (:), and apostrophes (\&quot;). You can use asterisks (\*) and question marks (?) as wildcards. Example: <code>[&quot;/a&quot;, &quot;/b/&quot;]</code>.</p>
         * </li>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>RequestHeader</strong>, this parameter specifies the HTTP header conditions. The value is a key-value pair. The header values within the same rule condition must be unique. Example: <code>[{&quot;header1&quot;:[&quot;value1&quot;,&quot;value2&quot;]}]</code>.</p>
         * <ul>
         * <li><p>Key: The HTTP header key must be 1 to 40 characters long and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * </li>
         * <li><p>Value: The HTTP header value must be 1 to 128 characters long and contain only printable characters within the ASCII range of<code> ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. The value cannot start or end with a space.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Query</strong>, this parameter specifies the query string conditions. The value is a key-value pair. Example: <code>[{&quot;query1&quot;:[&quot;value1&quot;]}, {&quot;query2&quot;:[&quot;value2&quot;]}]</code>.</p>
         * <ul>
         * <li><p>Key: The key must be 1 to 100 characters long and contain only printable characters within the ASCII range of<code> ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. Letters must be lowercase. Spaces and the following characters are not supported:<code> []{}&lt;&gt;\\;/?:@&amp;=+,$%&quot;^~</code>.</p>
         * </li>
         * <li><p>Value: The value must be 1 to 128 characters long and contain only printable characters within the ASCII range of<code> ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. Letters must be lowercase. Spaces and the following characters are not supported:<code> []{}&lt;&gt;\\;/?:@&amp;=+,$%&quot;^~</code>.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Method</strong>, this parameter specifies the HTTP method conditions. Valid values: <strong>HEAD</strong>, <strong>GET</strong>, <strong>POST</strong>, <strong>OPTIONS</strong>, <strong>PUT</strong>, <strong>PATCH</strong>, and <strong>DELETE</strong>. Example: <code>[&quot;GET&quot;, &quot;OPTIONS&quot;, &quot;POST&quot;]</code>.</p>
         * </li>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Cookie</strong>, this parameter specifies the cookie conditions. The value is a key-value pair. Example: <code>[{&quot;cookie1&quot;:[&quot;value1&quot;]}, {&quot;cookie2&quot;:[&quot;value2&quot;]}]</code></p>
         * <ul>
         * <li><p>Key: The cookie key must be 1 to 100 characters long and contain only printable characters within the ASCII range of<code> ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. Letters must be lowercase. Spaces and the following characters are not supported:<code> #[]{}\\&lt;&gt;&amp;</code>.</p>
         * </li>
         * <li><p>Value: The cookie value must be 1 to 128 characters long and contain only printable characters within the ASCII range of<code> ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. Letters must be lowercase. Spaces and the following characters are not supported:<code> #[]{}\\&lt;&gt;&amp;</code>.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>SourceIP</strong>, this parameter specifies the source IP conditions. You can specify IP addresses, for example, <code>1.1.XX.XX/32</code>, or CIDR blocks, for example, <code>2.2.XX.XX/24</code>. A forwarding rule can have only one <strong>SourceIP</strong> rule condition. This rule condition can contain multiple source IP addresses, which are evaluated with a logical OR. Example: <code>[&quot;1.1.XX.XX/32&quot;, &quot;2.2.XX.XX/24&quot;]</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="http://www.example.com">www.example.com</a>&quot;, &quot;<a href="http://www.aliyun.com%22%5D">www.aliyun.com&quot;]</a></p>
         */
        @NameInMap("RuleConditionValue")
        public String ruleConditionValue;

        public static CreateForwardingRulesRequestForwardingRulesRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRulesRuleConditions self = new CreateForwardingRulesRequestForwardingRulesRuleConditions();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditions setHostConfig(CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditions setPathConfig(CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditions setRuleConditionType(String ruleConditionType) {
            this.ruleConditionType = ruleConditionType;
            return this;
        }
        public String getRuleConditionType() {
            return this.ruleConditionType;
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditions setRuleConditionValue(String ruleConditionValue) {
            this.ruleConditionValue = ruleConditionValue;
            return this;
        }
        public String getRuleConditionValue() {
            return this.ruleConditionValue;
        }

    }

    public static class CreateForwardingRulesRequestForwardingRules extends TeaModel {
        /**
         * <p>The name of the forwarding rule. The name must be 2 to 128 characters long. It must start with a letter or a Chinese character, and can contain letters, Chinese characters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ForwardingRuleName")
        public String forwardingRuleName;

        /**
         * <p>The priority of the forwarding rule.
         * Valid values: <strong>1</strong> to <strong>10000</strong>. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The rule actions.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleActions")
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActions> ruleActions;

        /**
         * <p>The rule conditions.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleConditions> ruleConditions;

        /**
         * <p>The direction in which the rule takes effect. This parameter does not need to be configured.</p>
         * <p>By default, this parameter is set to <strong>request</strong>, which indicates that the rule applies to requests.</p>
         * 
         * <strong>example:</strong>
         * <p>request</p>
         */
        @NameInMap("RuleDirection")
        public String ruleDirection;

        public static CreateForwardingRulesRequestForwardingRules build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRules self = new CreateForwardingRulesRequestForwardingRules();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRules setForwardingRuleName(String forwardingRuleName) {
            this.forwardingRuleName = forwardingRuleName;
            return this;
        }
        public String getForwardingRuleName() {
            return this.forwardingRuleName;
        }

        public CreateForwardingRulesRequestForwardingRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateForwardingRulesRequestForwardingRules setRuleActions(java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

        public CreateForwardingRulesRequestForwardingRules setRuleConditions(java.util.List<CreateForwardingRulesRequestForwardingRulesRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        public CreateForwardingRulesRequestForwardingRules setRuleDirection(String ruleDirection) {
            this.ruleDirection = ruleDirection;
            return this;
        }
        public String getRuleDirection() {
            return this.ruleDirection;
        }

    }

}
