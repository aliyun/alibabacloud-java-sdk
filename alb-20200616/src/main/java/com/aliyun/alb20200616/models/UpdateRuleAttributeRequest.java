// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateRuleAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> value as the <strong>ClientToken</strong> value. The <strong>RequestId</strong> value of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, an <code>HTTP 2xx</code> status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The priority of the rule. Valid values: <strong>1</strong> to <strong>10000</strong>. A smaller value specifies a higher priority.</p>
     * <blockquote>
     * <p>Rule priorities within the same listener must be unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The forwarding rule actions.</p>
     */
    @NameInMap("RuleActions")
    public java.util.List<UpdateRuleAttributeRequestRuleActions> ruleActions;

    /**
     * <p>The forwarding rule conditions.</p>
     */
    @NameInMap("RuleConditions")
    public java.util.List<UpdateRuleAttributeRequestRuleConditions> ruleConditions;

    /**
     * <p>The forwarding rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-4dp5i6ea****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the forwarding rule. The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces. The name must start with a letter, Chinese character, or digit.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-instance-test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static UpdateRuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleAttributeRequest self = new UpdateRuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRuleAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRuleAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateRuleAttributeRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateRuleAttributeRequest setRuleActions(java.util.List<UpdateRuleAttributeRequestRuleActions> ruleActions) {
        this.ruleActions = ruleActions;
        return this;
    }
    public java.util.List<UpdateRuleAttributeRequestRuleActions> getRuleActions() {
        return this.ruleActions;
    }

    public UpdateRuleAttributeRequest setRuleConditions(java.util.List<UpdateRuleAttributeRequestRuleConditions> ruleConditions) {
        this.ruleConditions = ruleConditions;
        return this;
    }
    public java.util.List<UpdateRuleAttributeRequestRuleConditions> getRuleConditions() {
        return this.ruleConditions;
    }

    public UpdateRuleAttributeRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateRuleAttributeRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public static class UpdateRuleAttributeRequestRuleActionsCorsConfig extends TeaModel {
        /**
         * <p>Specifies whether to allow credentials. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: allows credentials.</li>
         * <li><strong>off</strong>: does not allow credentials.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AllowCredentials")
        public String allowCredentials;

        /**
         * <p>The list of headers allowed for cross-origin access.</p>
         */
        @NameInMap("AllowHeaders")
        public java.util.List<String> allowHeaders;

        /**
         * <p>The HTTP methods allowed for cross-origin access.</p>
         */
        @NameInMap("AllowMethods")
        public java.util.List<String> allowMethods;

        /**
         * <p>The list of allowed origins. You can configure a single element <code>*</code> or one or more values.</p>
         * <ul>
         * <li>Each value must start with <code>http://</code> or <code>https://</code>, followed by a valid domain name or a first-level wildcard domain name (for example, <code>http://*.test.abc.example.com</code>).</li>
         * <li>Each value can optionally include a port. Port range: <strong>1</strong> to <strong>65535</strong>.</li>
         * </ul>
         */
        @NameInMap("AllowOrigin")
        public java.util.List<String> allowOrigin;

        /**
         * <p>The list of headers that can be exposed.</p>
         */
        @NameInMap("ExposeHeaders")
        public java.util.List<String> exposeHeaders;

        /**
         * <p>The maximum cache time for preflight requests in the browser. Unit: seconds.</p>
         * <p>Valid values: <strong>-1</strong> to <strong>172800</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxAge")
        public Long maxAge;

        public static UpdateRuleAttributeRequestRuleActionsCorsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsCorsConfig self = new UpdateRuleAttributeRequestRuleActionsCorsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsCorsConfig setAllowCredentials(String allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public String getAllowCredentials() {
            return this.allowCredentials;
        }

        public UpdateRuleAttributeRequestRuleActionsCorsConfig setAllowHeaders(java.util.List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public java.util.List<String> getAllowHeaders() {
            return this.allowHeaders;
        }

        public UpdateRuleAttributeRequestRuleActionsCorsConfig setAllowMethods(java.util.List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public java.util.List<String> getAllowMethods() {
            return this.allowMethods;
        }

        public UpdateRuleAttributeRequestRuleActionsCorsConfig setAllowOrigin(java.util.List<String> allowOrigin) {
            this.allowOrigin = allowOrigin;
            return this;
        }
        public java.util.List<String> getAllowOrigin() {
            return this.allowOrigin;
        }

        public UpdateRuleAttributeRequestRuleActionsCorsConfig setExposeHeaders(java.util.List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public java.util.List<String> getExposeHeaders() {
            return this.exposeHeaders;
        }

        public UpdateRuleAttributeRequestRuleActionsCorsConfig setMaxAge(Long maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Long getMaxAge() {
            return this.maxAge;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsFixedResponseConfig extends TeaModel {
        /**
         * <p>The fixed content to return. The content can be up to 1 KB in size and can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>dssacav</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The format of the fixed content to return.</p>
         * <p>Valid values: <strong>text/plain</strong>, <strong>text/css</strong>, <strong>text/html</strong>, <strong>application/javascript</strong>, and <strong>application/json</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>text/plain</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The HTTP response code to return. Only numeric strings in the <strong>2xx</strong>, <strong>4xx</strong>, and <strong>5xx</strong> format are supported, where <strong>x</strong> is any digit.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        public static UpdateRuleAttributeRequestRuleActionsFixedResponseConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsFixedResponseConfig self = new UpdateRuleAttributeRequestRuleActionsFixedResponseConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsFixedResponseConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateRuleAttributeRequestRuleActionsFixedResponseConfig setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public UpdateRuleAttributeRequestRuleActionsFixedResponseConfig setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession extends TeaModel {
        /**
         * <p>Specifies whether to enable session persistence. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables session persistence.</li>
         * <li><strong>false</strong> (default): disables session persistence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The timeout period. Unit: seconds. Valid values: 1 to 86400.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession self = new UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The ID of the destination server group to which requests are forwarded.</p>
         * 
         * <strong>example:</strong>
         * <p>sg--atstuj3rtoptyui****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The weight. A larger value specifies a higher weight, which means more requests are forwarded to the server group. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
         * <ul>
         * <li><p>If only one destination server group is specified, the default weight is <strong>100</strong> when no weight is specified.</p>
         * </li>
         * <li><p>If more than one destination server group is specified, you must specify the weight value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples self = new UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsForwardGroupConfig extends TeaModel {
        /**
         * <p>The session persistence configuration between server groups.</p>
         */
        @NameInMap("ServerGroupStickySession")
        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession;

        /**
         * <p>The destination server groups to which requests are forwarded.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static UpdateRuleAttributeRequestRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsForwardGroupConfig self = new UpdateRuleAttributeRequestRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfig setServerGroupStickySession(UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession) {
            this.serverGroupStickySession = serverGroupStickySession;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession getServerGroupStickySession() {
            return this.serverGroupStickySession;
        }

        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfig setServerGroupTuples(java.util.List<UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig extends TeaModel {
        /**
         * <p>Specifies whether to overwrite the value in the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: overwrites the value.</li>
         * <li><strong>false</strong> (default): does not overwrite the value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CoverEnabled")
        public Boolean coverEnabled;

        /**
         * <p>The name of the header to insert. The name must be 1 to 40 characters in length and can contain uppercase and lowercase letters a to z, digits, underscores (_), and hyphens (-). The header name specified in <strong>InsertHeaderConfig</strong> must be unique.</p>
         * <blockquote>
         * <p>The header name cannot be set to the following fields (case-insensitive): <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>x-forwarded-host</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, <code>authority</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The content of the header to insert.</p>
         * <ul>
         * <li>If <strong>ValueType</strong> is set to <strong>SystemDefined</strong>, valid values are:<ul>
         * <li><strong>ClientSrcPort</strong>: the client port.</li>
         * <li><strong>ClientSrcIp</strong>: the client IP address.</li>
         * <li><strong>Protocol</strong>: the protocol used by the client request (HTTP or HTTPS).</li>
         * <li><strong>SLBId</strong>: the Application Load Balancer (ALB) instance ID.</li>
         * <li><strong>SLBPort</strong>: the Application Load Balancer (ALB) instance listener port.</li>
         * </ul>
         * </li>
         * <li>If <strong>ValueType</strong> is set to <strong>UserDefined</strong>: you can specify a custom header value. The value must be 1 to 128 characters in length and can contain wildcards asterisks (*), question marks (?), and printable characters whose ASCII values are <code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. The value cannot contain <code>&quot;</code>. The value cannot start or end with a space. The value cannot end with <code>\\</code>.</li>
         * <li>If <strong>ValueType</strong> is set to <strong>ReferenceHeader</strong>: you can reference a field in the request header. The value must be 1 to 128 characters in length and can contain lowercase letters a to z, digits, hyphens (-), and underscores (_).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserDefined</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The content type of the header value. Valid values:</p>
         * <ul>
         * <li><p><strong>UserDefined</strong>: a custom header value.</p>
         * </li>
         * <li><p><strong>ReferenceHeader</strong>: references a field in the request header.</p>
         * </li>
         * <li><p><strong>SystemDefined</strong>: a system-defined header value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserDefined</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig self = new UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig setCoverEnabled(Boolean coverEnabled) {
            this.coverEnabled = coverEnabled;
            return this;
        }
        public Boolean getCoverEnabled() {
            return this.coverEnabled;
        }

        public UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsRedirectConfig extends TeaModel {
        /**
         * <p>The host to redirect to. Valid values:</p>
         * <ul>
         * <li><strong>${host}</strong> (default): this value cannot be concatenated with other characters.</li>
         * <li>Other values. Character set and format restrictions are as follows:<ul>
         * <li>The hostname must be 3 to 256 characters in length and can contain lowercase letters a to z, digits, hyphens (-), periods (.), asterisks (*), and question marks (?).</li>
         * <li>The hostname must contain at least one period (.). Periods (.) cannot appear at the beginning or end.</li>
         * <li>The rightmost domain label can contain only letters and wildcards. It cannot contain digits or hyphens (-).</li>
         * <li>Hyphens (-) cannot appear at the beginning or end of other domain labels.</li>
         * <li>Asterisks (*) and question marks (?) can appear at any position of a domain label.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The redirect type. Valid values: <strong>301</strong>, <strong>302</strong>, <strong>303</strong>, <strong>307</strong>, and <strong>308</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>301</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        /**
         * <p>The path to redirect to. Valid values:</p>
         * <ul>
         * <li><strong>${path}</strong> (default): you can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. These variables can be used together or concatenated with characters within the allowed value range listed below.</li>
         * <li>Other values. Character set and format restrictions are as follows:<ul>
         * <li>The path must be 1 to 256 characters in length.</li>
         * <li>The path must start with a forward slash (/) and can contain letters, digits, and the following special characters: <code>$-_.+/&amp;~@:</code>. The path cannot contain <code>&quot;%#;!()[]^,&quot;\\&quot;</code>. Asterisks (*) and question marks (?) can be used as wildcards.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port to redirect to. Valid values:</p>
         * <ul>
         * <li><strong>${port}</strong> (default): this value can only be used alone and cannot be concatenated with other characters.</li>
         * <li>Other values: <strong>1</strong> to <strong>63335</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The protocol to redirect to. Valid values:</p>
         * <ul>
         * <li><p><strong>${protocol}</strong> (default): this value cannot be concatenated with other characters.</p>
         * </li>
         * <li><p><strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>HTTPS listeners support only redirects to HTTPS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The query string to redirect to. Valid values:</p>
         * <ul>
         * <li><strong>${query}</strong> (default): you can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. These variables can be used together or concatenated with characters within the allowed value range listed below.</li>
         * <li>Other values. Character set and format restrictions are as follows:<ul>
         * <li>The query string must be 1 to 128 characters in length.</li>
         * <li>The query string can contain printable characters but cannot contain spaces or <code>#[]{}\\|&lt;&gt;&quot;</code>. Letters must be lowercase.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>quert</p>
         */
        @NameInMap("Query")
        public String query;

        public static UpdateRuleAttributeRequestRuleActionsRedirectConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsRedirectConfig self = new UpdateRuleAttributeRequestRuleActionsRedirectConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsRedirectConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateRuleAttributeRequestRuleActionsRedirectConfig setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

        public UpdateRuleAttributeRequestRuleActionsRedirectConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateRuleAttributeRequestRuleActionsRedirectConfig setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public UpdateRuleAttributeRequestRuleActionsRedirectConfig setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateRuleAttributeRequestRuleActionsRedirectConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsRemoveHeaderConfig extends TeaModel {
        /**
         * <p>The name of the header to remove. The name must be 1 to 40 characters in length and can contain uppercase and lowercase letters a to z, digits, underscores (_), and hyphens (-). The header name cannot be duplicated in RemoveHeader.</p>
         * <ul>
         * <li>Request direction (Direction is set to Request): the header name cannot be set to the following fields (case-insensitive): <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>x-forwarded-host</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, <code>authority</code>.</li>
         * <li>Response direction (Direction is set to Response): the header name cannot be set to the following fields (case-insensitive): <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        public static UpdateRuleAttributeRequestRuleActionsRemoveHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsRemoveHeaderConfig self = new UpdateRuleAttributeRequestRuleActionsRemoveHeaderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsRemoveHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsRewriteConfig extends TeaModel {
        /**
         * <p>The destination host address for internal redirects. Valid values:</p>
         * <ul>
         * <li><p><strong>${host}</strong> (default): this value cannot be concatenated with other characters.</p>
         * </li>
         * <li><p>Other values. Character set and format restrictions are as follows:</p>
         * <ul>
         * <li><p>The hostname must be 3 to 256 characters in length and can contain lowercase letters a to z, digits, hyphens (-), periods (.), asterisks (*), and question marks (?).</p>
         * </li>
         * <li><p>The hostname must contain at least one period (.). Periods (.) cannot appear at the beginning or end.</p>
         * </li>
         * <li><p>The rightmost domain label can contain only letters and wildcards. It cannot contain digits or hyphens (-).</p>
         * </li>
         * <li><p>Hyphens (-) cannot appear at the beginning or end of other domain labels. Asterisks (*) and question marks (?) can appear at any position of a domain label.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The path to redirect to. Valid values:</p>
         * <ul>
         * <li><strong>${path}</strong> (default): you can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. These variables can be used together or concatenated with characters within the allowed value range listed below.</li>
         * <li>Other values. Character set and format restrictions are as follows:<ul>
         * <li>The path must be 1 to 256 characters in length.</li>
         * <li>The path must start with a forward slash (/) and can contain letters, digits, and the following special characters: <code>$-_.+/&amp;~@:</code>. The path cannot contain <code>&quot;%#;!()[]^,&quot;\\&quot;</code>. Asterisks (*) and question marks (?) can be used as wildcards.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/tsdf</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The query string for internal redirects. Valid values:</p>
         * <ul>
         * <li><strong>${query}</strong> (default): you can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. These variables can be used together or concatenated with characters within the allowed value range listed below.</li>
         * <li>Other values. Character set and format restrictions are as follows:<ul>
         * <li>The query string must be 1 to 128 characters in length.</li>
         * <li>The query string can contain printable characters but cannot contain spaces or <code>#[]{}\\|&lt;&gt;&quot;</code>. Letters must be lowercase.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>quedsa</p>
         */
        @NameInMap("Query")
        public String query;

        public static UpdateRuleAttributeRequestRuleActionsRewriteConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsRewriteConfig self = new UpdateRuleAttributeRequestRuleActionsRewriteConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsRewriteConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateRuleAttributeRequestRuleActionsRewriteConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateRuleAttributeRequestRuleActionsRewriteConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig extends TeaModel {
        /**
         * <p>The QPS per IP address. Valid values: <strong>1</strong> to <strong>1000000</strong>.</p>
         * <blockquote>
         * <p>If both <strong>QPS</strong> and <strong>PerIpQps</strong> are configured, the value of <strong>PerIpQps</strong> must be less than the value of <strong>QPS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("PerIpQps")
        public Integer perIpQps;

        /**
         * <p>The queries per second (QPS). Valid values: <strong>1</strong> to <strong>1000000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("QPS")
        public Integer QPS;

        public static UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig self = new UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig setPerIpQps(Integer perIpQps) {
            this.perIpQps = perIpQps;
            return this;
        }
        public Integer getPerIpQps() {
            return this.perIpQps;
        }

        public UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig setQPS(Integer QPS) {
            this.QPS = QPS;
            return this;
        }
        public Integer getQPS() {
            return this.QPS;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The server group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>srg-00mkgijak0w4qgz9****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples self = new UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig extends TeaModel {
        /**
         * <p>The configuration for mirroring traffic to a server group.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> serverGroupTuples;

        public static UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig self = new UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig setServerGroupTuples(java.util.List<UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig extends TeaModel {
        /**
         * <p>The configuration for mirroring traffic to a server group.</p>
         */
        @NameInMap("MirrorGroupConfig")
        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig;

        /**
         * <p>The type of the mirror target. Valid values:</p>
         * <ul>
         * <li><strong>ForwardGroupMirror</strong>: mirrors traffic to a server group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroupMirror</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig self = new UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig setMirrorGroupConfig(UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig) {
            this.mirrorGroupConfig = mirrorGroupConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig getMirrorGroupConfig() {
            return this.mirrorGroupConfig;
        }

        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActions extends TeaModel {
        /**
         * <p>The cross-origin resource sharing (CORS) configuration.</p>
         */
        @NameInMap("CorsConfig")
        public UpdateRuleAttributeRequestRuleActionsCorsConfig corsConfig;

        /**
         * <p>The fixed response configuration.</p>
         */
        @NameInMap("FixedResponseConfig")
        public UpdateRuleAttributeRequestRuleActionsFixedResponseConfig fixedResponseConfig;

        /**
         * <p>The forward group configuration.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The insert header configuration.</p>
         */
        @NameInMap("InsertHeaderConfig")
        public UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig insertHeaderConfig;

        /**
         * <p>The priority of the action in the forwarding rule. Valid values: <strong>1</strong> to <strong>50000</strong>. Actions are performed in ascending order of priority. This value cannot be empty or duplicated. You can specify up to 20 action priorities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The redirect configuration. You can add up to 20 redirects.</p>
         */
        @NameInMap("RedirectConfig")
        public UpdateRuleAttributeRequestRuleActionsRedirectConfig redirectConfig;

        /**
         * <p>The remove header configuration.</p>
         */
        @NameInMap("RemoveHeaderConfig")
        public UpdateRuleAttributeRequestRuleActionsRemoveHeaderConfig removeHeaderConfig;

        /**
         * <p>The rewrite configuration.</p>
         */
        @NameInMap("RewriteConfig")
        public UpdateRuleAttributeRequestRuleActionsRewriteConfig rewriteConfig;

        /**
         * <p>The traffic throttling configuration.</p>
         */
        @NameInMap("TrafficLimitConfig")
        public UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig trafficLimitConfig;

        /**
         * <p>The traffic mirroring configuration.</p>
         */
        @NameInMap("TrafficMirrorConfig")
        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig trafficMirrorConfig;

        /**
         * <p>The action type. You can add up to 11 action types. Valid values:</p>
         * <ul>
         * <li><p><strong>ForwardGroup</strong>: forwards requests to multiple virtual services.</p>
         * </li>
         * <li><p><strong>Redirect</strong>: redirects requests.</p>
         * </li>
         * <li><p><strong>FixedResponse</strong>: returns a fixed response.</p>
         * </li>
         * <li><p><strong>Rewrite</strong>: rewrites requests.</p>
         * </li>
         * <li><p><strong>InsertHeader</strong>: inserts a header.</p>
         * </li>
         * <li><p><strong>RemoveHeader</strong>: deletes a header.</p>
         * </li>
         * <li><p><strong>TrafficLimit</strong>: throttles traffic.</p>
         * </li>
         * <li><p><strong>TrafficMirror</strong>: mirrors traffic.</p>
         * </li>
         * <li><p><strong>Cors</strong>: enables cross-origin resource sharing (CORS).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>A forwarding rule must contain one <strong>ForwardGroup</strong>, <strong>Redirect</strong>, or <strong>FixedResponse</strong> action. When this action coexists with other action types, it must be the last action to execute.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroup</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateRuleAttributeRequestRuleActions build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActions self = new UpdateRuleAttributeRequestRuleActions();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActions setCorsConfig(UpdateRuleAttributeRequestRuleActionsCorsConfig corsConfig) {
            this.corsConfig = corsConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsCorsConfig getCorsConfig() {
            return this.corsConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setFixedResponseConfig(UpdateRuleAttributeRequestRuleActionsFixedResponseConfig fixedResponseConfig) {
            this.fixedResponseConfig = fixedResponseConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsFixedResponseConfig getFixedResponseConfig() {
            return this.fixedResponseConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setForwardGroupConfig(UpdateRuleAttributeRequestRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setInsertHeaderConfig(UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig insertHeaderConfig) {
            this.insertHeaderConfig = insertHeaderConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig getInsertHeaderConfig() {
            return this.insertHeaderConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public UpdateRuleAttributeRequestRuleActions setRedirectConfig(UpdateRuleAttributeRequestRuleActionsRedirectConfig redirectConfig) {
            this.redirectConfig = redirectConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsRedirectConfig getRedirectConfig() {
            return this.redirectConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setRemoveHeaderConfig(UpdateRuleAttributeRequestRuleActionsRemoveHeaderConfig removeHeaderConfig) {
            this.removeHeaderConfig = removeHeaderConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsRemoveHeaderConfig getRemoveHeaderConfig() {
            return this.removeHeaderConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setRewriteConfig(UpdateRuleAttributeRequestRuleActionsRewriteConfig rewriteConfig) {
            this.rewriteConfig = rewriteConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsRewriteConfig getRewriteConfig() {
            return this.rewriteConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setTrafficLimitConfig(UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig trafficLimitConfig) {
            this.trafficLimitConfig = trafficLimitConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig getTrafficLimitConfig() {
            return this.trafficLimitConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setTrafficMirrorConfig(UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig trafficMirrorConfig) {
            this.trafficMirrorConfig = trafficMirrorConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig getTrafficMirrorConfig() {
            return this.trafficMirrorConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsCookieConfigValues extends TeaModel {
        /**
         * <p>The cookie key. The key must be 1 to 100 characters in length and can contain lowercase letters, printable characters, asterisks (*), and question marks (?). The key cannot contain spaces or <code>#[]{}\\|&lt;&gt;&amp;&quot;;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The cookie value. The value must be 1 to 128 characters in length and can contain lowercase letters, printable characters, asterisks (*), and question marks (?). The value cannot contain spaces or <code>#[]{}\\|&lt;&gt;&amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateRuleAttributeRequestRuleConditionsCookieConfigValues build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsCookieConfigValues self = new UpdateRuleAttributeRequestRuleConditionsCookieConfigValues();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsCookieConfigValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRuleAttributeRequestRuleConditionsCookieConfigValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsCookieConfig extends TeaModel {
        /**
         * <p>The cookie configuration.</p>
         */
        @NameInMap("Values")
        public java.util.List<UpdateRuleAttributeRequestRuleConditionsCookieConfigValues> values;

        public static UpdateRuleAttributeRequestRuleConditionsCookieConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsCookieConfig self = new UpdateRuleAttributeRequestRuleConditionsCookieConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsCookieConfig setValues(java.util.List<UpdateRuleAttributeRequestRuleConditionsCookieConfigValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<UpdateRuleAttributeRequestRuleConditionsCookieConfigValues> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsHeaderConfig extends TeaModel {
        /**
         * <p>The header key. The key must be 1 to 40 characters in length and can contain letters, digits, hyphens (-), and underscores (_). Cookie and Host are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Port</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The header values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRuleAttributeRequestRuleConditionsHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsHeaderConfig self = new UpdateRuleAttributeRequestRuleConditionsHeaderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRuleAttributeRequestRuleConditionsHeaderConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsHostConfig extends TeaModel {
        /**
         * <p>The hostnames.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRuleAttributeRequestRuleConditionsHostConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsHostConfig self = new UpdateRuleAttributeRequestRuleConditionsHostConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsHostConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsMethodConfig extends TeaModel {
        /**
         * <p>The request methods.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRuleAttributeRequestRuleConditionsMethodConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsMethodConfig self = new UpdateRuleAttributeRequestRuleConditionsMethodConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsMethodConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsPathConfig extends TeaModel {
        /**
         * <p>The forwarding paths.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRuleAttributeRequestRuleConditionsPathConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsPathConfig self = new UpdateRuleAttributeRequestRuleConditionsPathConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsPathConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues extends TeaModel {
        /**
         * <p>The query string key. The key must be 1 to 100 characters in length and can contain lowercase letters, printable characters, asterisks (*), and question marks (?). The key cannot contain spaces or <code>#[]{}\\|&lt;&gt;&amp;&quot;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The query string value. The value must be 1 to 128 characters in length and can contain lowercase letters, printable characters, asterisks (*), and question marks (?). The value cannot contain spaces or <code>#[]{}\\|&lt;&gt;&amp;&quot;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues self = new UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsQueryStringConfig extends TeaModel {
        /**
         * <p>The query strings. You can add up to 20 query strings.</p>
         */
        @NameInMap("Values")
        public java.util.List<UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues> values;

        public static UpdateRuleAttributeRequestRuleConditionsQueryStringConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsQueryStringConfig self = new UpdateRuleAttributeRequestRuleConditionsQueryStringConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsQueryStringConfig setValues(java.util.List<UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsResponseHeaderConfig extends TeaModel {
        /**
         * <p>The header key.</p>
         * <ul>
         * <li>The key must be 1 to 40 characters in length.</li>
         * <li>The key can contain letters a to z, digits, hyphens (-), and underscores (_).</li>
         * <li>Cookie and Host are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The header values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRuleAttributeRequestRuleConditionsResponseHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsResponseHeaderConfig self = new UpdateRuleAttributeRequestRuleConditionsResponseHeaderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsResponseHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRuleAttributeRequestRuleConditionsResponseHeaderConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsResponseStatusCodeConfig extends TeaModel {
        /**
         * <p>The response status code list.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRuleAttributeRequestRuleConditionsResponseStatusCodeConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsResponseStatusCodeConfig self = new UpdateRuleAttributeRequestRuleConditionsResponseStatusCodeConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsResponseStatusCodeConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsSourceIpConfig extends TeaModel {
        /**
         * <p>One or more IP addresses or CIDR blocks.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRuleAttributeRequestRuleConditionsSourceIpConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsSourceIpConfig self = new UpdateRuleAttributeRequestRuleConditionsSourceIpConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsSourceIpConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditions extends TeaModel {
        /**
         * <p>The cookie configuration.</p>
         */
        @NameInMap("CookieConfig")
        public UpdateRuleAttributeRequestRuleConditionsCookieConfig cookieConfig;

        /**
         * <p>The header configuration.</p>
         */
        @NameInMap("HeaderConfig")
        public UpdateRuleAttributeRequestRuleConditionsHeaderConfig headerConfig;

        /**
         * <p>The host configuration.</p>
         */
        @NameInMap("HostConfig")
        public UpdateRuleAttributeRequestRuleConditionsHostConfig hostConfig;

        /**
         * <p>The request method configuration.</p>
         */
        @NameInMap("MethodConfig")
        public UpdateRuleAttributeRequestRuleConditionsMethodConfig methodConfig;

        /**
         * <p>The path configuration for forwarding.</p>
         */
        @NameInMap("PathConfig")
        public UpdateRuleAttributeRequestRuleConditionsPathConfig pathConfig;

        /**
         * <p>The query string configuration.</p>
         */
        @NameInMap("QueryStringConfig")
        public UpdateRuleAttributeRequestRuleConditionsQueryStringConfig queryStringConfig;

        /**
         * <p>The response header condition configuration.</p>
         */
        @NameInMap("ResponseHeaderConfig")
        public UpdateRuleAttributeRequestRuleConditionsResponseHeaderConfig responseHeaderConfig;

        /**
         * <p>The response status code configuration.</p>
         */
        @NameInMap("ResponseStatusCodeConfig")
        public UpdateRuleAttributeRequestRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig;

        /**
         * <p>The source IP-service traffic matching configuration. You can add up to 5 source IP-service traffic matching conditions.</p>
         */
        @NameInMap("SourceIpConfig")
        public UpdateRuleAttributeRequestRuleConditionsSourceIpConfig sourceIpConfig;

        /**
         * <p>The type of forwarding rule. You can add up to 7 types of forwarding rules. Valid values:</p>
         * <ul>
         * <li><p><strong>Host</strong>: host.</p>
         * </li>
         * <li><p><strong>Path</strong>: path.</p>
         * </li>
         * <li><p><strong>Header</strong>: HTTP header field.</p>
         * </li>
         * <li><p><strong>QueryString</strong>: query string.</p>
         * </li>
         * <li><p><strong>Method</strong>: request method.</p>
         * </li>
         * <li><p><strong>Cookie</strong>: cookie.</p>
         * </li>
         * <li><p><strong>SourceIp</strong>: source IP address.</p>
         * </li>
         * <li><p><strong>ResponseHeader</strong>: response HTTP header field.</p>
         * </li>
         * <li><p><strong>ResponseStatusCode</strong>: response status code.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateRuleAttributeRequestRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditions self = new UpdateRuleAttributeRequestRuleConditions();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditions setCookieConfig(UpdateRuleAttributeRequestRuleConditionsCookieConfig cookieConfig) {
            this.cookieConfig = cookieConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsCookieConfig getCookieConfig() {
            return this.cookieConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setHeaderConfig(UpdateRuleAttributeRequestRuleConditionsHeaderConfig headerConfig) {
            this.headerConfig = headerConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsHeaderConfig getHeaderConfig() {
            return this.headerConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setHostConfig(UpdateRuleAttributeRequestRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setMethodConfig(UpdateRuleAttributeRequestRuleConditionsMethodConfig methodConfig) {
            this.methodConfig = methodConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsMethodConfig getMethodConfig() {
            return this.methodConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setPathConfig(UpdateRuleAttributeRequestRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setQueryStringConfig(UpdateRuleAttributeRequestRuleConditionsQueryStringConfig queryStringConfig) {
            this.queryStringConfig = queryStringConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsQueryStringConfig getQueryStringConfig() {
            return this.queryStringConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setResponseHeaderConfig(UpdateRuleAttributeRequestRuleConditionsResponseHeaderConfig responseHeaderConfig) {
            this.responseHeaderConfig = responseHeaderConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsResponseHeaderConfig getResponseHeaderConfig() {
            return this.responseHeaderConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setResponseStatusCodeConfig(UpdateRuleAttributeRequestRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig) {
            this.responseStatusCodeConfig = responseStatusCodeConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsResponseStatusCodeConfig getResponseStatusCodeConfig() {
            return this.responseStatusCodeConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setSourceIpConfig(UpdateRuleAttributeRequestRuleConditionsSourceIpConfig sourceIpConfig) {
            this.sourceIpConfig = sourceIpConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsSourceIpConfig getSourceIpConfig() {
            return this.sourceIpConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
