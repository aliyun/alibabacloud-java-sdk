// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateRuleAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
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
     * <li><strong>true</strong>: performs a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a <code>2xx HTTP</code> status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The priority of the forwarding rule. Valid values: <strong>1 to 10000</strong>. A lower value specifies a higher priority.</p>
     * <blockquote>
     * <p>The priorities of the forwarding rules created for the same listener must be unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The actions of the forwarding rule.</p>
     */
    @NameInMap("RuleActions")
    public java.util.List<UpdateRuleAttributeRequestRuleActions> ruleActions;

    /**
     * <p>The match condition of the forwarding rule.</p>
     */
    @NameInMap("RuleConditions")
    public java.util.List<UpdateRuleAttributeRequestRuleConditions> ruleConditions;

    /**
     * <p>The ID of the forwarding rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-4dp5i6ea****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
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
         * <p>Specifies whether to allow credentials to be carried in CORS requests. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AllowCredentials")
        public String allowCredentials;

        /**
         * <p>The trusted headers of CORS requests.</p>
         */
        @NameInMap("AllowHeaders")
        public java.util.List<String> allowHeaders;

        /**
         * <p>The trusted HTTP methods of CORS requests.</p>
         */
        @NameInMap("AllowMethods")
        public java.util.List<String> allowMethods;

        /**
         * <p>The trusted origins. You can specify one or more values, or only an asterisk (<code>*</code>).</p>
         * <ul>
         * <li>The value must start with <code>http://</code> or <code>https://</code>, and be followed by a valid domain name, including top-level wildcard domain names. Example: <code>http://*.test.abc.example.com</code>.</li>
         * <li>You can specify ports for a single value. Valid values: <strong>1</strong> to <strong>65535</strong>.</li>
         * </ul>
         */
        @NameInMap("AllowOrigin")
        public java.util.List<String> allowOrigin;

        /**
         * <p>The headers that can be exposed.</p>
         */
        @NameInMap("ExposeHeaders")
        public java.util.List<String> exposeHeaders;

        /**
         * <p>The maximum cache time of dry runs in the browser. Unit: seconds.</p>
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
         * <p>The content of the response. The content can be up to 1 KB in size, and can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>dssacav</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The content type.</p>
         * <p>Valid values: <strong>text/plain</strong>, <strong>text/css</strong>, <strong>text/html</strong>, <strong>application/javascript</strong>, and <strong>application/json</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>text/plain</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The HTTP status code in responses. Valid values: <strong>2xx</strong>, <strong>4xx</strong>, <strong>5xx</strong>. The value must be a numeric string. <strong>x</strong> must be a digit.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP_200</p>
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
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The timeout period of sessions. Unit: seconds Valid values: 1 to 86400.</p>
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
         * <p>The ID of the server group to which requests are forwarded.</p>
         * 
         * <strong>example:</strong>
         * <p>sg--atstuj3rtoptyui****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The weight of the server group. A larger value specifies a higher weight. A server group with a higher weight receives more requests. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
         * <ul>
         * <li>If the number of destination server groups is 1, the default weight of the server group is <strong>100</strong>, unless you specify a weight.</li>
         * <li>If the number of destination server groups is larger than 1, you must specify a weight.</li>
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
         * <p>The configuration of session persistence.</p>
         */
        @NameInMap("ServerGroupStickySession")
        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession;

        /**
         * <p>The server groups to which requests are forwarded.</p>
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
         * <p>Specifies whether to overwrite the request header values. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: overwrites the request header.</li>
         * <li><strong>false</strong> (default): does not overwrite the request header.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CoverEnabled")
        public Boolean coverEnabled;

        /**
         * <p>The key of the header. The key must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The header keys specified by <strong>InsertHeaderConfig</strong> must be unique.</p>
         * <blockquote>
         * <p>The following header keys are not supported: <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, and <code>authority</code>. The header keys are not case-sensitive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the header.</p>
         * <ul>
         * <li><p>If <strong>ValueType</strong> is set to <strong>SystemDefined</strong>, you can set the Value parameter to one of the following values:</p>
         * <ul>
         * <li><strong>ClientSrcPort</strong>: the client port.</li>
         * <li><strong>ClientSrcIp</strong>: the IP address of the client.</li>
         * <li><strong>Protocol</strong>: the request protocol (HTTP or HTTPS).</li>
         * <li><strong>SLBId</strong>: the ID of the ALB instance.</li>
         * <li><strong>SLBPort</strong>: the listener port of the ALB instance.</li>
         * </ul>
         * </li>
         * <li><p>If <strong>ValueType</strong> is set to <strong>UserDefined</strong>, you can specify a custom value. The value must be 1 to 128 characters in length, and can contain asterisks (\*), question marks (?), and printable characters whose ASCII values are <code>larger than or equal to 32 and smaller than 127</code>. It cannot start or end with a space character.</p>
         * </li>
         * <li><p>If <strong>ValueType</strong> is set to <strong>ReferenceHeader</strong>, you can reference a value from request headers. The value must be 1 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (_).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserDefined</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The type of the header. Valid values:</p>
         * <ul>
         * <li><strong>UserDefined</strong>: a custom header.</li>
         * <li><strong>ReferenceHeader</strong>: a header that references one of the request headers.</li>
         * <li><strong>SystemDefined</strong>: a system-defined header value.</li>
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
         * <p>The hostname to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><p><strong>${host}</strong> (default): If ${host} is returned, no other character is appended.</p>
         * </li>
         * <li><p>If you want to specify a custom value, make sure that the following requirements are met:</p>
         * <ul>
         * <li>The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), periods (.), asterisks (\*), and question marks (?).</li>
         * <li>The hostname must contain at least one period (.) but cannot start or end with a period (.).</li>
         * <li>The rightmost domain label can contain only letters and wildcard characters. It cannot contain digits or hyphens (-).</li>
         * <li>Other domain labels cannot start or end with a hyphen (-).</li>
         * <li>You can use asterisks (\*) and question marks (?) anywhere in a domain label as wildcard characters.</li>
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
         * <p>The forwarding method. Valid values: <strong>301</strong>, <strong>302</strong>, <strong>303</strong>, <strong>307</strong>, and <strong>308</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>301</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        /**
         * <p>The URL to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><p>Default value: <strong>${path}</strong>. \<em>\</em>${host}**, <strong>${protocol}</strong>, and **${port}\<em>\</em> are also supported. Each variable can be specified only once. The preceding variables can be used at the same time or combined with a custom value.</p>
         * </li>
         * <li><p>If you want to specify a custom value, make sure that the following requirements are met:</p>
         * <ul>
         * <li>The URL must be 1 to 128 characters in length,</li>
         * <li>The URL must start with a forward slash (/) and can contain letters, digits, and the following special characters: <code>$ - _ .+ / &amp; ~ @ :</code>. It cannot contain the following special characters: <code>&quot; % # ; ! ( ) [ ]^ , &quot;</code>. You can use asterisks (\*) and question marks (?) as wildcard characters.</li>
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
         * <p>The port to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><strong>${port}</strong> (default): If you set the value to ${port}, you cannot append other characters.</li>
         * <li>Other valid values: <strong>1 to 63335</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The redirect protocol. Valid values:</p>
         * <ul>
         * <li><strong>${protocol}</strong> (default): If you set the value to ${protocol}, you cannot append other characters.</li>
         * <li><strong>HTTP</strong> or <strong>HTTPS</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>HTTPS listeners support only HTTPS redirects.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The query string to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><p>Default value: <strong>${query}</strong>. \<em>\</em>${host}**, <strong>${protocol}</strong>, and **${port}\<em>\</em> are also supported. Each variable can be specified only once. The preceding variables can be used at the same time or combined with a custom value.</p>
         * </li>
         * <li><p>If you want to specify a custom value, make sure that the following requirements are met:</p>
         * <ul>
         * <li>The query string must be 1 to 128 characters in length.</li>
         * <li>The query string can contain printable characters, but cannot contain space characters, the special characters <code># [ ] { } \\ | &lt; &gt; &amp;</code>, or uppercase letters.</li>
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
         * <p>The key of the header to be removed. The header key must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The header keys specified in RemoveHeader must be unique.</p>
         * <ul>
         * <li>If Direction is set to Request, the following request header keys are not supported: <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, and <code>authority</code>. The header keys are not case-sensitive.</li>
         * <li>If Direction is set to Response, the following header keys are not supported: <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, and <code>transfer-encoding</code>. The header keys are not case-sensitive.</li>
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
         * <p>The hostname to which requests are rewritten. Valid values:</p>
         * <ul>
         * <li><p><strong>${host}</strong> (default): If you set the value to ${host}, you cannot append other characters.</p>
         * </li>
         * <li><p>If you want to specify a custom value, make sure that the following requirements are met:</p>
         * <ul>
         * <li>The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), periods (.), asterisks (\*), and question marks (?).</li>
         * <li>The hostname contains at least one period (.) but does not start or end with a period (.).</li>
         * <li>The rightmost domain label can contain only letters and wildcard characters. It cannot contain digits or hyphens (-).</li>
         * <li>Other domain labels cannot start or end with a hyphen (-). You can use asterisks (\*) and question marks (?) anywhere in a domain label as wildcard characters.</li>
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
         * <p>The URL to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><p>Default value: <strong>${path}</strong>. \<em>\</em>${host}**, <strong>${protocol}</strong>, and **${port}\<em>\</em> are also supported. Each variable can be specified only once. The preceding variables can be used at the same time or combined with a custom value.</p>
         * </li>
         * <li><p>If you want to specify a custom value, make sure that the following requirements are met:</p>
         * <ul>
         * <li>The URL must be 1 to 128 characters in length,</li>
         * <li>The URL must start with a forward slash (/) and can contain letters, digits, and the following special characters: <code>$ - _ .+ / &amp; ~ @ :</code>. It cannot contain the following special characters: <code>&quot; % # ; ! ( ) [ ]^ , &quot;</code>. You can use asterisks (\*) and question marks (?) as wildcard characters.</li>
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
         * <p>The query string to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><p>Default value: <strong>${query}</strong>. \<em>\</em>${host}**, <strong>${protocol}</strong>, and **${port}\<em>\</em> are also supported. Each variable can be specified only once. The preceding variables can be used at the same time or combined with a custom value.</p>
         * </li>
         * <li><p>If you want to specify a custom value, make sure that the following requirements are met:</p>
         * <ul>
         * <li>The query string must be 1 to 128 characters in length.</li>
         * <li>The query string can contain printable characters, but cannot contain space characters, the special characters <code># [ ] { } \\ | &lt; &gt; &amp;</code>, or uppercase letters.</li>
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
         * <p>The number of requests per IP address. Value range: <strong>1 to 1000000</strong>.</p>
         * <blockquote>
         * <p>If both the <strong>QPS</strong> and <strong>PerIpQps</strong> parameters are specified, make sure that the value of the <strong>QPS</strong> parameter is smaller than the value of the PerIpQps parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("PerIpQps")
        public Integer perIpQps;

        /**
         * <p>The queries per second (QPS). Value range: <strong>1 to 1000000</strong>.</p>
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
         * <p>The server group to which network traffic is mirrored.</p>
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
         * <p>The server group to which network traffic is mirrored.</p>
         */
        @NameInMap("MirrorGroupConfig")
        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig;

        /**
         * <p>The type of destination to which network traffic is mirrored. Valid values:</p>
         * <ul>
         * <li><strong>ForwardGroupMirror</strong>: a server group</li>
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
         * <p>The CORS configuration.</p>
         */
        @NameInMap("CorsConfig")
        public UpdateRuleAttributeRequestRuleActionsCorsConfig corsConfig;

        /**
         * <p>The configuration of the custom response.</p>
         */
        @NameInMap("FixedResponseConfig")
        public UpdateRuleAttributeRequestRuleActionsFixedResponseConfig fixedResponseConfig;

        /**
         * <p>The configurations of the server groups.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The configuration of the header to be inserted.</p>
         */
        @NameInMap("InsertHeaderConfig")
        public UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig insertHeaderConfig;

        /**
         * <p>The priority of the action. Valid values: <strong>1 to 50000</strong>. A smaller value specifies a higher priority. The actions of a forwarding rule are applied in descending order of priority. This parameter is required. The priority of each action within a forwarding rule must be unique. You can specify at most 20 forwarding rule priorities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The configuration of the redirect action. You can specify at most 20 redirect actions.</p>
         */
        @NameInMap("RedirectConfig")
        public UpdateRuleAttributeRequestRuleActionsRedirectConfig redirectConfig;

        /**
         * <p>The HTTP header to be removed.</p>
         */
        @NameInMap("RemoveHeaderConfig")
        public UpdateRuleAttributeRequestRuleActionsRemoveHeaderConfig removeHeaderConfig;

        /**
         * <p>The configuration of the rewrite action.</p>
         */
        @NameInMap("RewriteConfig")
        public UpdateRuleAttributeRequestRuleActionsRewriteConfig rewriteConfig;

        /**
         * <p>The configuration of the action to throttle traffic.</p>
         */
        @NameInMap("TrafficLimitConfig")
        public UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig trafficLimitConfig;

        /**
         * <p>The configuration of the traffic mirroring action.</p>
         */
        @NameInMap("TrafficMirrorConfig")
        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig trafficMirrorConfig;

        /**
         * <p>The type of the task. You can specify at most 11 types of action. Valid values:</p>
         * <ul>
         * <li><strong>ForwardGroup</strong>: forwards requests to multiple vServer groups.</li>
         * <li><strong>Redirect</strong>: redirects requests.</li>
         * <li><strong>FixedResponse</strong>: returns a fixed response.</li>
         * <li><strong>Rewrite</strong>: rewrites requests.</li>
         * <li><strong>InsertHeader</strong>: inserts a header.</li>
         * <li><strong>RemoveHeader</strong>: removes headers.</li>
         * <li><strong>TrafficLimit</strong>: throttles traffic.</li>
         * <li><strong>trafficMirror</strong>: mirrors network traffic.</li>
         * <li><strong>Cors</strong>: forwards requests based on CORS.</li>
         * </ul>
         * <p>The preceding actions can be classified into two types:</p>
         * <ul>
         * <li><strong>FinalType</strong>: Each forwarding rule can contain only one FinalType action, which is performed at the end. You can specify only one of <strong>ForwardGroup</strong>, <strong>Redirect</strong>, and <strong>FixedResponse</strong>.</li>
         * <li><strong>ExtType</strong>: Each forwarding rule can contain one or more <strong>ExtType</strong> actions, which are performed before the <strong>FinalType</strong> action. If you want to specify an ExtType action, you must also specify a <strong>FinalType</strong> action. You can specify multiple <strong>InsertHeader</strong> actions or one <strong>Rewrite</strong> action.</li>
         * </ul>
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
         * <p>The cookie key. The cookie key must be 1 to 100 characters in length, and can contain lowercase letters, printable ASCII characters, asterisks (\*), and question marks (?). It cannot contain space characters or the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The cookie value. The cookie value must be 1 to 128 characters in length, and can contain lowercase letters, printable ASCII characters, asterisks (\*), and question marks (?). It cannot contain space characters or the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</p>
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
         * <p>The key-value pairs of the cookie.</p>
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
         * <p>The key of the response header. The header key must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). Cookie and Host are not supported.</p>
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
         * <p>The URLs to which requests are forwarded.</p>
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
         * <p>The key of the query string. The key must be 1 to 100 characters in length, and can contain lowercase letters, printable ASCII characters, asterisks (\*), and question marks (?). It cannot contain space characters or the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the query string. The value must be 1 to 128 characters in length, and can contain lowercase letters, printable ASCII characters, asterisks (\*), and question marks (?). It cannot contain space characters or the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</p>
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
         * <p>The query strings. You can specify at most 20 query strings.</p>
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
         * <li>The header key must be 1 to 40 characters in length.</li>
         * <li>The header key can contain lowercase letters, digits, hyphens (-), and underscores (_).</li>
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
         * <p>The response status codes.</p>
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
         * <p>You can add one or more IP addresses, including CIDR blocks.</p>
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
         * <p>The key-value pairs of the cookie.</p>
         */
        @NameInMap("CookieConfig")
        public UpdateRuleAttributeRequestRuleConditionsCookieConfig cookieConfig;

        /**
         * <p>The configuration of the header.</p>
         */
        @NameInMap("HeaderConfig")
        public UpdateRuleAttributeRequestRuleConditionsHeaderConfig headerConfig;

        /**
         * <p>The configurations of the hosts.</p>
         */
        @NameInMap("HostConfig")
        public UpdateRuleAttributeRequestRuleConditionsHostConfig hostConfig;

        /**
         * <p>The configuration of the request method.</p>
         */
        @NameInMap("MethodConfig")
        public UpdateRuleAttributeRequestRuleConditionsMethodConfig methodConfig;

        /**
         * <p>The configurations of the forwarding URL.</p>
         */
        @NameInMap("PathConfig")
        public UpdateRuleAttributeRequestRuleConditionsPathConfig pathConfig;

        /**
         * <p>The configurations of the query strings.</p>
         */
        @NameInMap("QueryStringConfig")
        public UpdateRuleAttributeRequestRuleConditionsQueryStringConfig queryStringConfig;

        /**
         * <p>The configuration of headers.</p>
         */
        @NameInMap("ResponseHeaderConfig")
        public UpdateRuleAttributeRequestRuleConditionsResponseHeaderConfig responseHeaderConfig;

        /**
         * <p>The configurations of the response status codes.</p>
         */
        @NameInMap("ResponseStatusCodeConfig")
        public UpdateRuleAttributeRequestRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig;

        /**
         * <p>Traffic matching based on source IP addresses. You can specify at most five IP addresses, including CIDR blocks.</p>
         */
        @NameInMap("SourceIpConfig")
        public UpdateRuleAttributeRequestRuleConditionsSourceIpConfig sourceIpConfig;

        /**
         * <p>The type of forwarding rule. You can specify at most seven types of forwarding rule. Valid values:</p>
         * <ul>
         * <li><strong>Host</strong>: Requests are forwarded based on hosts.</li>
         * <li><strong>Path</strong>: Requests are forwarded based on paths.</li>
         * <li><strong>Header</strong>: Requests are forwarded based on HTTP headers.</li>
         * <li><strong>QueryString</strong>: Requests are forwarded based on query strings.</li>
         * <li><strong>Method</strong>: Requests are forwarded based on request methods.</li>
         * <li><strong>Cookie</strong>: Requests are forwarded based on cookies.</li>
         * <li><strong>SourceIp</strong>: Responses are forwarded based on source IP addresses.</li>
         * <li><strong>ResponseHeader</strong>: Requests are forwarded based on HTTP response headers.</li>
         * <li><strong>ResponseStatusCode</strong>: Requests are forwarded based on response status codes.</li>
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
