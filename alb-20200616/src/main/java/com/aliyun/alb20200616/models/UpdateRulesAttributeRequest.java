// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateRulesAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a <code>2xx HTTP</code> status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The forwarding rules. You can specify up to 10 forwarding rules in each request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public java.util.List<UpdateRulesAttributeRequestRules> rules;

    public static UpdateRulesAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRulesAttributeRequest self = new UpdateRulesAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRulesAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRulesAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateRulesAttributeRequest setRules(java.util.List<UpdateRulesAttributeRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<UpdateRulesAttributeRequestRules> getRules() {
        return this.rules;
    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsCorsConfig extends TeaModel {
        /**
         * <p>Specifies whether credentials can be carried in CORS requests. Valid values:</p>
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
         * <p>The allowed headers for CORS requests.</p>
         */
        @NameInMap("AllowHeaders")
        public java.util.List<String> allowHeaders;

        /**
         * <p>The allowed HTTP methods for CORS requests.</p>
         */
        @NameInMap("AllowMethods")
        public java.util.List<String> allowMethods;

        /**
         * <p>The allowed origins of CORS requests.</p>
         */
        @NameInMap("AllowOrigin")
        public java.util.List<String> allowOrigin;

        /**
         * <p>The headers that can be exposed.</p>
         */
        @NameInMap("ExposeHeaders")
        public java.util.List<String> exposeHeaders;

        /**
         * <p>The maximum cache time of preflight requests in the browser. Unit: seconds.</p>
         * <p>Valid values: <strong>-1</strong> to <strong>172800</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxAge")
        public Long maxAge;

        public static UpdateRulesAttributeRequestRulesRuleActionsCorsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsCorsConfig self = new UpdateRulesAttributeRequestRulesRuleActionsCorsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig setAllowCredentials(String allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public String getAllowCredentials() {
            return this.allowCredentials;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig setAllowHeaders(java.util.List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public java.util.List<String> getAllowHeaders() {
            return this.allowHeaders;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig setAllowMethods(java.util.List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public java.util.List<String> getAllowMethods() {
            return this.allowMethods;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig setAllowOrigin(java.util.List<String> allowOrigin) {
            this.allowOrigin = allowOrigin;
            return this;
        }
        public java.util.List<String> getAllowOrigin() {
            return this.allowOrigin;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig setExposeHeaders(java.util.List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public java.util.List<String> getExposeHeaders() {
            return this.exposeHeaders;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig setMaxAge(Long maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Long getMaxAge() {
            return this.maxAge;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig extends TeaModel {
        /**
         * <p>The content of the custom response. The content can be up to 1 KB in size, and can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>dssacav</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The format of the response.</p>
         * <p>Valid values: <strong>text/plain</strong>, <strong>text/css</strong>, <strong>text/html</strong>, <strong>application/javascript</strong>, and <strong>application/json</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>text/plain</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The HTTP status code in the response. Valid values: <strong>HTTP_2xx</strong>, <strong>HTTP_4xx</strong>, and <strong>HTTP_5xx</strong>. <strong>x</strong> must be a digit.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        public static UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig self = new UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession extends TeaModel {
        /**
         * <p>Specifies whether to enable session persistence. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The timeout period of sessions. Unit: seconds. Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession self = new UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The server group to which requests are forwarded.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-atstuj3rtoptyui****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The weight of the server group. A larger value specifies a higher weight. A server group with a higher weight receives more requests. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
         * <ul>
         * <li>If only one destination server group exists and you do not specify a weight, the default value <strong>100</strong> is used.</li>
         * <li>If more than one destination server group exists, you must specify weights.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples self = new UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig extends TeaModel {
        /**
         * <p>The configuration of session persistence for server groups.</p>
         */
        @NameInMap("ServerGroupStickySession")
        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession;

        /**
         * <p>The server groups to which requests are forwarded.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig self = new UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig setServerGroupStickySession(UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession) {
            this.serverGroupStickySession = serverGroupStickySession;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession getServerGroupStickySession() {
            return this.serverGroupStickySession;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig setServerGroupTuples(java.util.List<UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig extends TeaModel {
        /**
         * <p>Specifies whether to overwrite the request header. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CoverEnabled")
        public Boolean coverEnabled;

        /**
         * <p>The key of the header to be inserted. The key must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The key specified in <code>InsertHeader</code> must be unique.</p>
         * <blockquote>
         * <p>You cannot use the following header keys (case-insensitive): <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te, host</code>, <code>cookie</code>, <code>remoteip</code>, and <code>authority</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the header to be inserted.</p>
         * <ul>
         * <li><p>If <strong>ValueType</strong> is set to <strong>SystemDefined</strong>, you can specify one of the following header values:</p>
         * <ul>
         * <li><strong>ClientSrcPort</strong>: the client port.</li>
         * <li><strong>ClientSrcIp</strong>: the client IP address.</li>
         * <li><strong>Protocol</strong>: the request protocol (HTTP or HTTPS).</li>
         * <li><strong>SLBId</strong>: the ALB instance ID.</li>
         * <li><strong>SLBPort</strong>: the listener port.</li>
         * </ul>
         * </li>
         * <li><p>If <strong>ValueType</strong> is set to <strong>UserDefined</strong>, you can specify a custom header value. The header value must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are <code>greater than or equal to 32 and lower than 127</code>. You can use asterisks (\*) and question marks (?) as wildcards. The value cannot start or end with a space character.</p>
         * </li>
         * <li><p>If <strong>ValueType</strong> is set to <strong>ReferenceHeader</strong>, you can reference one of the request headers. The header value must be 1 to 128 characters in length, and can contain lowercase letters, digits, underscores (_), and hyphens (-).</p>
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
         * <li><strong>UserDefined</strong>: a user-defined header</li>
         * <li><strong>ReferenceHeader</strong>: a header that is referenced from a request header.</li>
         * <li><strong>SystemDefined</strong>: a system-defined header.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserDefined</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig self = new UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig setCoverEnabled(Boolean coverEnabled) {
            this.coverEnabled = coverEnabled;
            return this;
        }
        public Boolean getCoverEnabled() {
            return this.coverEnabled;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig extends TeaModel {
        /**
         * <p>The hostname to which requests are forwarded.</p>
         * <p>Take note of the following rules when you specify a hostname:</p>
         * <ul>
         * <li>The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, and the following special characters: - . \* = ~ _ + \ ^ ! $ &amp; | ( ) [ ] ?.</li>
         * <li>The hostname must contain at least one period (.) but cannot start or end with a period (.).</li>
         * <li>The rightmost domain label can contain only letters, asterisks (<em>), and question marks (?), and cannot contain digits or hyphens (-). The leftmost <code>domain label</code> can contain asterisks (</em>).</li>
         * <li>The domain labels cannot start or end with a hyphen (-). You can specify asterisks (∗) and question marks (?) anywhere in a domain label.</li>
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
         * <p>The path to which requests are redirected.</p>
         * <ul>
         * <li><p><strong>${path}</strong> (default): You can reference \<em>\</em>${host}**, <strong>${protocol}</strong> and **${port}\<em>\</em>. Each variable can be used only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.</p>
         * </li>
         * <li><p>A custom value that meets the following requirements:</p>
         * <ul>
         * <li>The custom value must be 1 to 128 characters in length. You can use asterisks (\*) and question marks (?) as wildcards.</li>
         * <li>The custom value can contain letters, digits, and the following special characters: <code>$ - _ . + / &amp; ~ @ : \\&quot; * ?</code>. The custom value must start with a forward slash (/) and cannot contain the following characters: <code>&quot; % # ; ! ( ) [ ] ^ , &quot;</code>.</li>
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
         * <p>The port to which requests are forwarded.</p>
         * <p>Valid values: <strong>1</strong> to <strong>63335</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The redirect protocol.</p>
         * <p>Valid values: <strong>HTTP</strong> and <strong>HTTPS</strong>.</p>
         * <blockquote>
         * <p>HTTPS listeners support only HTTP to HTTPS redirection.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The query string to which requests are forwarded.</p>
         * <p>The query string must be 1 to 128 characters in length, and can contain printable characters, excluding uppercase letters and the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>quert</p>
         */
        @NameInMap("Query")
        public String query;

        public static UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig self = new UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig extends TeaModel {
        /**
         * <p>The key of the header.</p>
         * <ul>
         * <li>The key must be 1 to 40 characters in length.</li>
         * <li>It can contain letters, digits, hyphens (-), and underscores (_).</li>
         * <li>Cookie and Host are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Port</p>
         */
        @NameInMap("Key")
        public String key;

        public static UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig self = new UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig extends TeaModel {
        /**
         * <p>The hostname to which requests are forwarded.</p>
         * <p>Take note of the following rules when you specify a hostname:</p>
         * <ul>
         * <li>The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, and the following special characters: - . \* = ~ _ + \ ^ ! $ &amp; | ( ) [ ] ?.</li>
         * <li>The hostname must contain at least one period (.) but cannot start or end with a period (.).</li>
         * <li>The rightmost domain label can contain only letters, asterisks (<em>), and question marks (?), and cannot contain digits or hyphens (-). The leftmost <code>domain label</code> can contain asterisks (</em>).</li>
         * <li>The domain labels cannot start or end with a hyphen (-). You can specify asterisks (∗) and question marks (?) anywhere in a domain label.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The path to which requests are forwarded.</p>
         * <ul>
         * <li><p><strong>${path}</strong> (default): You can reference \<em>\</em>${host}**, <strong>${protocol}</strong> and **${port}\<em>\</em>. Each variable can be used only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.</p>
         * </li>
         * <li><p>A custom value that meets the following requirements:</p>
         * <ul>
         * <li>The custom value must be 1 to 128 characters in length. You can use asterisks (\*) and question marks (?) as wildcards.</li>
         * <li>The custom value can contain letters, digits, and the following special characters: <code>$ - _ . + / &amp; ~ @ : \\&quot; * ?</code>. The custom value must start with a forward slash (/) and cannot contain the following characters: <code>&quot; % # ; ! ( ) [ ] ^ , &quot;</code>.</li>
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
         * <p>The query string to which requests are forwarded.</p>
         * <p>The query string must be 1 to 128 characters in length, and can contain printable characters, excluding uppercase letters and the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>quedsa</p>
         */
        @NameInMap("Query")
        public String query;

        public static UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig self = new UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig extends TeaModel {
        /**
         * <p>The QPS per IP address. Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
         * <blockquote>
         * <p>If you specify this parameter and QPS, the value of PerIpQps must be smaller than the value of QPS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("PerIpQps")
        public Integer perIpQps;

        /**
         * <p>The number of queries per second (QPS). Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("QPS")
        public Integer QPS;

        public static UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig self = new UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig setPerIpQps(Integer perIpQps) {
            this.perIpQps = perIpQps;
            return this;
        }
        public Integer getPerIpQps() {
            return this.perIpQps;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig setQPS(Integer QPS) {
            this.QPS = QPS;
            return this;
        }
        public Integer getQPS() {
            return this.QPS;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The server group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>srg-00mkgijak0w4qgz9****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples self = new UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig extends TeaModel {
        /**
         * <p>The server groups to which traffic is mirrored.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> serverGroupTuples;

        public static UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig self = new UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig setServerGroupTuples(java.util.List<UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig extends TeaModel {
        /**
         * <p>The configuration of the server group to which traffic is mirrored.</p>
         */
        @NameInMap("MirrorGroupConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig;

        /**
         * <p>The type of destination to which network traffic is mirrored. Valid values:</p>
         * <ul>
         * <li><strong>ForwardGroupMirror</strong>: a server group</li>
         * <li><strong>SlsMirror</strong>: Log Service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroupMirror</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig self = new UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig setMirrorGroupConfig(UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig) {
            this.mirrorGroupConfig = mirrorGroupConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig getMirrorGroupConfig() {
            return this.mirrorGroupConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActions extends TeaModel {
        /**
         * <p>The CORS configuration.</p>
         */
        @NameInMap("CorsConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig corsConfig;

        /**
         * <p>The configuration of the action to return a custom response. You can specify the configurations of up to 20 actions to return a custom response.</p>
         */
        @NameInMap("FixedResponseConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig fixedResponseConfig;

        /**
         * <p>The configuration of the action to forward requests to server groups. You can specify the configurations of up to 20 actions to forward requests to server groups.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The configuration of the action to insert a header. You can specify the configurations of up to 20 actions to insert a header.</p>
         */
        @NameInMap("InsertHeaderConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig insertHeaderConfig;

        /**
         * <p>The priority of the action. Valid values: <strong>1</strong> to <strong>50000</strong>. A lower value specifies a higher priority. The actions of a forwarding rule are applied in descending order of priority. This parameter cannot be left empty. The priority of each action within a forwarding rule must be unique. You can specify priorities for up to 20 actions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The configuration of the redirect action. You can specify the configurations of up to 20 redirect actions.</p>
         */
        @NameInMap("RedirectConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig redirectConfig;

        /**
         * <p>The action to remove an HTTP header. You can specify the configurations of up to 20 actions to remove an HTTP header.</p>
         */
        @NameInMap("RemoveHeaderConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig removeHeaderConfig;

        /**
         * <p>The configuration of the rewrite action. You can specify the configurations of up to 20 rewrite actions.</p>
         */
        @NameInMap("RewriteConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig rewriteConfig;

        /**
         * <p>The configuration of traffic throttling. You can add up to 20 configuration records.</p>
         */
        @NameInMap("TrafficLimitConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig trafficLimitConfig;

        /**
         * <p>The configuration of traffic mirroring. You can add up to 20 configuration records.</p>
         */
        @NameInMap("TrafficMirrorConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig trafficMirrorConfig;

        /**
         * <p>The type of the forwarding rule. You can specify up to seven types. Valid values:</p>
         * <ul>
         * <li><strong>Host</strong>: Requests are distributed based on hosts.</li>
         * <li><strong>Path</strong>: Requests are distributed based on paths.</li>
         * <li><strong>Header</strong>: Requests are distributed based on HTTP headers.</li>
         * <li><strong>QueryString</strong>: Requests are distributed based on query strings.</li>
         * <li><strong>Method</strong>: Requests are distributed based on request methods.</li>
         * <li><strong>Cookie</strong>: Requests are distributed based on cookies.</li>
         * <li><strong>SourceIp</strong>: Requests are distributed based on source IP addresses.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateRulesAttributeRequestRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActions self = new UpdateRulesAttributeRequestRulesRuleActions();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActions setCorsConfig(UpdateRulesAttributeRequestRulesRuleActionsCorsConfig corsConfig) {
            this.corsConfig = corsConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig getCorsConfig() {
            return this.corsConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setFixedResponseConfig(UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig fixedResponseConfig) {
            this.fixedResponseConfig = fixedResponseConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig getFixedResponseConfig() {
            return this.fixedResponseConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setForwardGroupConfig(UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setInsertHeaderConfig(UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig insertHeaderConfig) {
            this.insertHeaderConfig = insertHeaderConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig getInsertHeaderConfig() {
            return this.insertHeaderConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setRedirectConfig(UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig redirectConfig) {
            this.redirectConfig = redirectConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig getRedirectConfig() {
            return this.redirectConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setRemoveHeaderConfig(UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig removeHeaderConfig) {
            this.removeHeaderConfig = removeHeaderConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig getRemoveHeaderConfig() {
            return this.removeHeaderConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setRewriteConfig(UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig rewriteConfig) {
            this.rewriteConfig = rewriteConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig getRewriteConfig() {
            return this.rewriteConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setTrafficLimitConfig(UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig trafficLimitConfig) {
            this.trafficLimitConfig = trafficLimitConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig getTrafficLimitConfig() {
            return this.trafficLimitConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setTrafficMirrorConfig(UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig trafficMirrorConfig) {
            this.trafficMirrorConfig = trafficMirrorConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig getTrafficMirrorConfig() {
            return this.trafficMirrorConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues extends TeaModel {
        /**
         * <p>The key of the cookie. The key must be 1 to 100 characters in length, and can contain printable characters such as lowercase letters, asterisks (\*), and question marks (?). However, the key cannot contain uppercase letters, space characters, or the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the cookie. The value must be 1 to 128 characters in length, and can contain printable characters such as lowercase letters, asterisks (\*), and question marks (?). However, the value cannot contain uppercase letters, space characters, or the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues self = new UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig extends TeaModel {
        /**
         * <p>The cookies.</p>
         */
        @NameInMap("Values")
        public java.util.List<UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig setValues(java.util.List<UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig extends TeaModel {
        /**
         * <p>The key of the header. The key must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). Cookie and Host are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Port</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of the header.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsHostConfig extends TeaModel {
        /**
         * <p>The hostnames.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsHostConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsHostConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsHostConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsHostConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig extends TeaModel {
        /**
         * <p>The HTTP request methods.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsPathConfig extends TeaModel {
        /**
         * <p>The paths.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsPathConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsPathConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsPathConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsPathConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues extends TeaModel {
        /**
         * <p>They key of the query string.</p>
         * <p>The key must be 1 to 100 characters in length, and can contain printable characters such as lowercase letters, asterisks (\*), and question marks (?). The key cannot contain uppercase letters, space characters, or the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the query string.</p>
         * <p>The value must be 1 to 128 characters in length, and can contain printable characters such as lowercase letters, asterisks (\*), and question marks (?). However, uppercase letters, space characters, and the following special characters are not supported: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues self = new UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig extends TeaModel {
        /**
         * <p>The key-value pairs of the query strings.</p>
         */
        @NameInMap("Values")
        public java.util.List<UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig setValues(java.util.List<UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig extends TeaModel {
        /**
         * <p>The key of the header.</p>
         * <ul>
         * <li>The key must be 1 to 40 characters in length.</li>
         * <li>It can contain letters, digits, hyphens (-), and underscores (_).</li>
         * <li>Cookie and Host are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of the header.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig extends TeaModel {
        /**
         * <p>The match conditions.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig extends TeaModel {
        /**
         * <p>The source IP addresses based on which user traffic is matched.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditions extends TeaModel {
        /**
         * <p>The match conditions for cookies. You can add up to 20 match conditions.</p>
         */
        @NameInMap("CookieConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig cookieConfig;

        /**
         * <p>The match conditions for HTTP headers. You can specify up to 20 match conditions.</p>
         */
        @NameInMap("HeaderConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig headerConfig;

        /**
         * <p>The match conditions for hostnames. You can specify up to 20 match conditions.</p>
         */
        @NameInMap("HostConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsHostConfig hostConfig;

        /**
         * <p>The match conditions for HTTP request methods. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
         */
        @NameInMap("MethodConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig methodConfig;

        /**
         * <p>The match conditions for query strings. You can specify up to 20 match conditions.</p>
         */
        @NameInMap("PathConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsPathConfig pathConfig;

        /**
         * <p>The match conditions for query strings. You can specify up to 20 match conditions.</p>
         */
        @NameInMap("QueryStringConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig queryStringConfig;

        /**
         * <p>The configuration of the HTTP response header. You can specify the configurations of up to 20 HTTP response header.</p>
         */
        @NameInMap("ResponseHeaderConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig responseHeaderConfig;

        /**
         * <p>The match conditions for response status codes. This parameter is required and takes effect when <strong>Type</strong> is set to <strong>ResponseStatusCode</strong>. You can specify up to 20 match conditions.</p>
         */
        @NameInMap("ResponseStatusCodeConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig;

        /**
         * <p>The configuration of the source IP addresses based on which user traffic is matched. You can specify up to 20 configuration records.</p>
         */
        @NameInMap("SourceIpConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig sourceIpConfig;

        /**
         * <p>The type of action specified in the forwarding rule. You can specify up to 11 types of actions. Valid values:</p>
         * <ul>
         * <li><strong>ForwardGroup</strong>: forwards a request to multiple vServer groups.</li>
         * <li><strong>Redirect</strong>: redirects a request.</li>
         * <li><strong>FixedResponse</strong>: returns a custom response.</li>
         * <li><strong>Rewrite</strong>: rewrites a request.</li>
         * <li><strong>InsertHeader</strong>: inserts a header.</li>
         * <li><strong>RemoveHeaderConfig</strong>: deletes a header.</li>
         * <li><strong>TrafficLimitConfig</strong>: throttles network traffic.</li>
         * <li><strong>TrafficMirrorConfig</strong>: mirrors traffic.</li>
         * <li><strong>CorsConfig</strong>: forwards requests based on CORS.</li>
         * </ul>
         * <p>The following action types are supported:</p>
         * <ul>
         * <li><strong>FinalType</strong>: the last action to be performed in a forwarding rule. Each forwarding rule can contain only one FinalType action. You can specify a <strong>ForwardGroup</strong>, <strong>Redirect</strong>, or <strong>FixedResponse</strong> action as the FinalType action.</li>
         * <li><strong>ExtType</strong>: the action or the actions to be performed before the <strong>FinalType</strong> action. A forwarding rule can contain one or more <strong>ExtType</strong> actions. To specify an ExtType action, you must specify a <strong>FinalType</strong> action. You can specify multiple <strong>InsertHeader</strong> actions or one <strong>Rewrite</strong> action.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroup</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateRulesAttributeRequestRulesRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditions self = new UpdateRulesAttributeRequestRulesRuleConditions();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setCookieConfig(UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig cookieConfig) {
            this.cookieConfig = cookieConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig getCookieConfig() {
            return this.cookieConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setHeaderConfig(UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig headerConfig) {
            this.headerConfig = headerConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig getHeaderConfig() {
            return this.headerConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setHostConfig(UpdateRulesAttributeRequestRulesRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setMethodConfig(UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig methodConfig) {
            this.methodConfig = methodConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig getMethodConfig() {
            return this.methodConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setPathConfig(UpdateRulesAttributeRequestRulesRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setQueryStringConfig(UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig queryStringConfig) {
            this.queryStringConfig = queryStringConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig getQueryStringConfig() {
            return this.queryStringConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setResponseHeaderConfig(UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig responseHeaderConfig) {
            this.responseHeaderConfig = responseHeaderConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig getResponseHeaderConfig() {
            return this.responseHeaderConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setResponseStatusCodeConfig(UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig) {
            this.responseStatusCodeConfig = responseStatusCodeConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig getResponseStatusCodeConfig() {
            return this.responseStatusCodeConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setSourceIpConfig(UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig sourceIpConfig) {
            this.sourceIpConfig = sourceIpConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig getSourceIpConfig() {
            return this.sourceIpConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateRulesAttributeRequestRules extends TeaModel {
        /**
         * <p>The priority of the forwarding rule. Valid values: <strong>1 to 10000</strong>. A lower value specifies a higher priority. You can specify priorities for up to 20 forwarding rules.</p>
         * <blockquote>
         * <p>The priority of each forwarding rule added to a listener must be unique.</p>
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
        public java.util.List<UpdateRulesAttributeRequestRulesRuleActions> ruleActions;

        /**
         * <p>The match conditions of the forwarding rule.</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<UpdateRulesAttributeRequestRulesRuleConditions> ruleConditions;

        /**
         * <p>The forwarding rule ID. You can specify up to 20 IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-cxjh7vazn2jpnl****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter. You can specify names for up to 20 forwarding rules.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-instance-test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static UpdateRulesAttributeRequestRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRules self = new UpdateRulesAttributeRequestRules();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateRulesAttributeRequestRules setRuleActions(java.util.List<UpdateRulesAttributeRequestRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<UpdateRulesAttributeRequestRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

        public UpdateRulesAttributeRequestRules setRuleConditions(java.util.List<UpdateRulesAttributeRequestRulesRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<UpdateRulesAttributeRequestRulesRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        public UpdateRulesAttributeRequestRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public UpdateRulesAttributeRequestRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
