// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateForwardingRulesRequest extends TeaModel {
    /**
     * <p>The GA instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4q****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
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
     * <p>The listener ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1s0vzbi5bxlx5****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
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
         * <p>The ID of an endpoint group.</p>
         * <blockquote>
         * <p> We recommend that you use <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> rather than this parameter to configure forwarding actions.</p>
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
         * <p>The configuration of an endpoint group.</p>
         * <blockquote>
         * <p> We recommend that you use <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> rather than this parameter to configure forwarding actions.</p>
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
         * <p> We recommend that you use <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> rather than this parameter to configure forwarding actions.</p>
         * </blockquote>
         */
        @NameInMap("ForwardGroupConfig")
        public UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The forwarding priority.</p>
         * <blockquote>
         * <p> This parameter does not take effect. Ignore this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The type of the forwarding action. Valid values:</p>
         * <ul>
         * <li><strong>ForwardGroup</strong>: forwards a request.</li>
         * <li><strong>Redirect</strong>: redirects a request.</li>
         * <li><strong>FixResponse</strong>: returns a fixed response.</li>
         * <li><strong>Rewrite</strong>: rewrites a request.</li>
         * <li><strong>AddHeader</strong>: adds a header to a request.</li>
         * <li><strong>RemoveHeader</strong>: deletes the header of a request.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroup</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The value of the forwarding action.</p>
         * <p>You must specify different JSON strings based on the value of <strong>RuleActionType</strong>.</p>
         * <p>A forwarding rule can contain only one forwarding action whose type is <strong>ForwardGroup</strong>, <strong>Redirect</strong>, or <strong>FixResponse</strong>. You must specify a forwarding action whose type is <strong>Rewrite</strong>, <strong>AddHeader</strong>, or <strong>RemoveHeader</strong> before a forwarding action whose type is <strong>ForwardGroup</strong>.</p>
         * <ul>
         * <li><p>If you set <strong>RuleActionType</strong> to <strong>ForwardGroup</strong>, this parameter specifies the information of a virtual endpoint group. You can forward requests to only one virtual endpoint group. Example: <code>{&quot;type&quot;:&quot;endpointgroup&quot;, &quot;value&quot;:&quot;epg-bp1enpdcrqhl78g6r****&quot;}</code>.</p>
         * <ul>
         * <li><code>type</code>: Set this parameter to <code>endpointgroup</code>.</li>
         * <li><code>value</code>: Set this parameter to the ID of a virtual endpoint group.</li>
         * </ul>
         * </li>
         * <li><p>If you set <strong>RuleActionType</strong> to <strong>Redirect</strong>, this parameter specifies the redirect configuration. You cannot leave all the following parameters empty or use the default values for all the following parameters for a forwarding action whose type is <strong>Redirect</strong>: <code>protocol</code>, <code>domain</code>, <code>port</code>, <code>path</code>, and <code>query</code>. Example: <code>{&quot;protocol&quot;:&quot;HTTP&quot;, &quot;domain&quot;:&quot;www.example.com&quot;, &quot;port&quot;:&quot;80&quot;, &quot;path&quot;:&quot;/a&quot;,&quot;query&quot;:&quot;value1&quot;, &quot;code&quot;:&quot;301&quot; }</code>.</p>
         * <ul>
         * <li><code>protocol</code>: the protocol of requests after the requests are redirected. Valid values: <code>${protocol}</code> (default), <code>HTTP</code>, and <code>HTTPS</code>.</li>
         * <li><code>domain</code>: the domain name to which requests are redirected. Default value: <code>${host}</code>. You can also enter a domain name. The domain name must be 3 to 128 characters in length, and can contain only letters, digits, and the following special characters: <code>. - ? = ~ _ - + / ^ * ! $ &amp; | ( ) [ ]</code>.</li>
         * <li><code>port</code>: the port to which requests are redirected. Default value: <code>${port}</code>. You can enter a port number that ranges from 1 to 63335.</li>
         * <li><code>path</code>: the path to which requests are redirected. Default value: <code>${path}</code>. The path must be 1 to 128 characters in length. To use a regular expression, the path can contain letters, digits, and the following special characters: <code>. - _ / = ? ~ ^ * $ : ( ) [ ] + |</code>. The path must start with a tilde (~). If you do not want to use a regular expression, the path can contain letters, digits, and the following special characters: <code>. - _ / = ? :</code>. The path must start with a forward slash (/).</li>
         * <li><code>query</code>: the query string to which requests are redirected. Default value: <code>${query}</code>. You can also specify a query string. The query string must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are <code>greater than or equal to 32 and smaller than 127</code>. The query string cannot contain uppercase letters, space characters, or the following special characters: <code>[ ] { } &lt; &gt; # | &amp;</code>.</li>
         * <li><code>code</code>: the redirect code. Valid values: <code>301</code>, <code>302</code>, <code>303</code>, <code>307</code>, and <code>308</code>.</li>
         * </ul>
         * </li>
         * <li><p>If you set <strong>RuleActionType</strong> to <strong>FixResponse</strong>, this parameter specifies a fixed response. Example: <code>{&quot;code&quot;:&quot;200&quot;, &quot;type&quot;:&quot;text/plain&quot;, &quot;content&quot;:&quot;dssacav&quot; }</code>.</p>
         * <ul>
         * <li><code>code</code>: the HTTP response status code. The response status code must be one of the following numeric strings: <code>2xx</code>, <code>4xx</code>, and <code>5xx</code>. The letter <code>x</code> is a digit.</li>
         * <li><code>type</code>: the type of the response content. Valid values: <strong>text/plain</strong>, <strong>text/css</strong>, <strong>text/html</strong>, <strong>application/javascript</strong>, and <strong>application/json</strong>.</li>
         * <li><code>content</code>: the response content. The response content cannot exceed 1,000 characters in length and does not support Chinese characters.</li>
         * </ul>
         * </li>
         * <li><p>If you set <strong>RuleActionType</strong> to <strong>AddHeader</strong>, this parameter specifies an HTTP header to be added. If a forwarding rule contains a forwarding action whose type is <strong>AddHeader</strong>, you must specify another forwarding action whose type is <strong>ForwardGroup</strong>. Example: <code>[{&quot;name&quot;:&quot;header1&quot;,&quot;type&quot;:&quot;userdefined&quot;, &quot;value&quot;:&quot;value&quot;}]</code>.</p>
         * <ul>
         * <li><code>name</code>: the name of the HTTP header. The name must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). The name of the HTTP header specified by <strong>AddHeader</strong> must be unique and cannot be the same as the name of the HTTP header specified by <strong>RemoveHeader</strong>.</li>
         * <li><code>type</code>: the content type of the HTTP header. Valid values: <code>user-defined</code>, <code>ref</code>, and <code>system-defined</code>.</li>
         * <li><code>value</code>: the content of the HTTP header. You cannot leave this parameter empty. If you set <code>type</code> to <code>user-defined</code>, the content must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are <code>greater than or equal to 32 and smaller than 127</code>. The content can contain letters, digits, hyphens (-), and underscores (<em>). The content cannot start or end with a space character. If you set <code>type</code> to <code>ref</code>, the content must be 1 to 128 characters in length, and can contain letters, digits, hyphens (-), and underscores (</em>). The content cannot start or end with a space character. If you set <code>type</code> to <code>system-defined</code>, only <code>ClientSrcIp</code> is supported.**</li>
         * </ul>
         * </li>
         * <li><p>If you set <strong>RuleActionType</strong> to <strong>RemoveHeader</strong>, this parameter specifies an HTTP header to be removed. If a forwarding rule contains a forwarding action whose type is <strong>RemoveHeader</strong>, you must specify another forwarding action whose type is <strong>ForwardGroup</strong>. The header must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). Example: <code>[&quot;header1&quot;]</code>.</p>
         * </li>
         * <li><p>If you set <strong>RuleActionType</strong> to <strong>Rewrite</strong>, this parameter specifies the rewriting configuration. If a forwarding rule contains a forwarding action whose type is <strong>Rewrite</strong>, you must specify another forwarding action whose type is <strong>ForwardGroup</strong>. Example: <code>{&quot;domain&quot;:&quot;value1&quot;, &quot;path&quot;:&quot;value2&quot;, &quot;query&quot;:&quot;value3&quot;}</code>.</p>
         * <ul>
         * <li><code>domain</code>: the domain name to which requests are redirected. Default value: <code>${host}</code>. You can also enter a domain name. The domain name must be 3 to 128 characters in length, and can contain only lowercase letters, digits, and the following special characters: <code>. - ? = ~ _ - + / ^ * ! $ &amp; | ( ) [ ]</code>.</li>
         * <li><code>path</code>: the path to which requests are redirected. Default value: <code>${path}</code>. The path must be 1 to 128 characters in length. To use a regular expression, the path can contain letters, digits, and the following special characters: <code>. - _ / = ? ~ ^ * $ : ( ) [ ] + |</code>. The path must start with a tilde (~). If you do not want to use a regular expression, the path can contain letters, digits, and the following special characters: <code>. - _ / = ? :</code>. The path must start with a forward slash (/).</li>
         * <li><code>query</code>: the query string to which requests are redirected. Default value: <code>${query}</code>. You can also specify a query string. The query string must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are <code>greater than or equal to 32 and smaller than 127</code>. The query string cannot contain uppercase letters, space characters, or the following special characters: <code>[ ] { } &lt; &gt; # | &amp;</code>.</li>
         * </ul>
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
         * <p>The domain name configuration.</p>
         * <blockquote>
         * <p> We recommend that you use <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> rather than this parameter to configure forwarding conditions.</p>
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
         * <p> We recommend that you use <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> rather than this parameter to configure forwarding conditions.</p>
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
         * <p>The domain name configuration.</p>
         * <blockquote>
         * <p> We recommend that you use <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> rather than this parameter to configure forwarding conditions.</p>
         * </blockquote>
         */
        @NameInMap("HostConfig")
        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig hostConfig;

        /**
         * <p>The path configuration.</p>
         * <blockquote>
         * <p> We recommend that you use <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> rather than this parameter to configure forwarding conditions.</p>
         * </blockquote>
         */
        @NameInMap("PathConfig")
        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig pathConfig;

        /**
         * <p>The type of the forwarding condition. Valid values:</p>
         * <ul>
         * <li><strong>Host</strong>: Requests are forwarded based on domain names.</li>
         * <li><strong>Path</strong>: Requests are forwarded based on paths.</li>
         * <li><strong>RequestHeader</strong>: Requests are forwarded based on HTTP headers.</li>
         * <li><strong>Query</strong>: Requests are forwarded based on query strings.</li>
         * <li><strong>Method</strong>: Requests are forwarded based on HTTP request methods.</li>
         * <li><strong>Cookie</strong>: Requests are forwarded based on cookies.</li>
         * <li><strong>SourceIP</strong>: Requests are forwarded based on source IP addresses.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("RuleConditionType")
        public String ruleConditionType;

        /**
         * <p>The value of the forwarding condition. You must specify different JSON strings based on the value of <strong>RuleConditionType</strong>.</p>
         * <ul>
         * <li><p>If you set <strong>RuleConditionType</strong> to <strong>Host</strong>, this parameter specifies a domain name condition. A forwarding rule can contain only one forwarding condition of the Host type. You can specify multiple domain names in a forwarding condition. The relationship between multiple domain names is OR. The domain name must be 3 to 128 characters in length and can contain letters, digits, hyphens (-), and periods (.). Supported wildcard characters are asterisks (\*) and question marks (?). Example: <code>[&quot;www.example.com&quot;, &quot;www.aliyun.com&quot;]</code>.</p>
         * </li>
         * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Path</strong>, this parameter specifies a path condition. A forwarding rule can contain multiple forwarding conditions of the Path type. The relationship between multiple path conditions is OR. You can specify multiple paths in a forwarding condition. The relationship between multiple paths is OR. The path must be 1 to 128 characters in length, and must start with a forward slash (/). The path can contain letters, digits, and the following special characters: $ - _ . + / &amp; ~ @ : \&quot;. Supported wildcard characters are asterisks (\*) and question marks (?). Example: <code>[&quot;/a&quot;, &quot;/b/&quot;]</code>.</p>
         * </li>
         * <li><p>If you set <strong>RuleConditionType</strong> to <strong>RequestHeader</strong>, this parameter specifies an HTTP header condition that consists of key-value pairs. The header values in a forwarding condition must be unique. Example: <code>[{&quot;header1&quot;:[&quot;value1&quot;,&quot;value2&quot;]}]</code>.</p>
         * <ul>
         * <li>Key: The key of an HTTP header must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (_).</li>
         * <li>Value: The value of an HTTP header must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are <code>greater than or equal to 32 and less than 127</code>. The value cannot start or end with a space character.</li>
         * </ul>
         * </li>
         * <li><p>If you set <strong>RuleConditionType</strong> to <strong>Query</strong>, this parameter specifies a query string condition that consists of key-value pairs. Example: <code>[{&quot;query1&quot;:[&quot;value1&quot;]}, {&quot;query2&quot;:[&quot;value2&quot;]}]</code>.</p>
         * <ul>
         * <li>Key: The key of an HTTP header must be 1 to 100 characters in length, and can contain printable characters whose ASCII values are <code>greater than or equal to 32 and less than 127</code>. The key cannot contain uppercase letters, space characters, or the following special characters: <code>[ ] { } &lt; &gt; \\ ; / ? : @ &amp; = + , $ % | &quot; ^ ~</code>.</li>
         * <li>Value: The value of an HTTP header must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are <code>greater than or equal to 32 and less than 127</code>. The value cannot contain uppercase letters, space characters, or the following special characters: <code>[ ] { } &lt; &gt; \\ ; / ? : @ &amp; = + , $ % | &quot; ^ ~</code>.</li>
         * </ul>
         * </li>
         * <li><p>If you set <strong>RuleConditionType</strong> to <strong>Method</strong>, this parameter specifies an HTTP request method condition. Valid values: <strong>HEAD</strong>, <strong>GET</strong>, <strong>POST</strong>, <strong>OPTIONS</strong>, <strong>PUT</strong>, <strong>PATCH</strong>, and <strong>DELETE</strong>. Example: <code>[&quot;GET&quot;, &quot;OPTIONS&quot;, &quot;POST&quot;]</code>.</p>
         * </li>
         * <li><p>If you set <strong>RuleConditionType</strong> to <strong>Cookie</strong>, this parameter specifies a cookie condition that consists of key-value pairs. Example: <code>[{&quot;cookie1&quot;:[&quot;value1&quot;]}, {&quot;cookie2&quot;:[&quot;value2&quot;]}]</code>.</p>
         * <ul>
         * <li>Key: The key of a cookie must be 1 to 100 characters in length, and can contain printable characters whose ASCII values are <code>greater than or equal to 32 and less than 127</code>. The key cannot contain uppercase letters, space characters, or the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</li>
         * <li>Value: The value of a cookie must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are <code>greater than or equal to 32 and less than 127</code>. The value cannot contain uppercase letters, space characters, or the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</li>
         * </ul>
         * </li>
         * <li><p>If you set <strong>RuleConditionType</strong> to <strong>SourceIP</strong>, this parameter specifies a source IP address condition. You can specify IP addresses, such as 1.1.XX.XX/32. You can also specify CIDR blocks, such as 2.2.XX.XX/24. A forwarding rule can contain only one forwarding condition whose type is SourceIP. You can specify multiple source IP addresses in a forwarding condition. The relationship between multiple source IP addresses is OR. Example: <code>[&quot;1.1.XX.XX/32&quot;, &quot;2.2.XX.XX/24&quot;]</code>.</p>
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
         * <p>The forwarding rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>frule-bp1dii16gu9qdvb34****</p>
         */
        @NameInMap("ForwardingRuleId")
        public String forwardingRuleId;

        /**
         * <p>The forwarding rule name.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ForwardingRuleName")
        public String forwardingRuleName;

        /**
         * <p>The priority of the forwarding rule. Valid values: <strong>1</strong> to <strong>10000</strong>. A smaller value specifies a higher priority.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The configurations of the forwarding actions.</p>
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
         * <p>The direction in which the rule takes effect. You do not need to configure this parameter.</p>
         * <p>By default, this parameter is set to <strong>request</strong>, which specifies that the rule takes effect on requests.</p>
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
