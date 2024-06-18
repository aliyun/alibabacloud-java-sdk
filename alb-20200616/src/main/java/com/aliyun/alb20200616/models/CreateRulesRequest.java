// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateRulesRequest extends TeaModel {
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
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, a <code>2xx HTTP</code> status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the Application Load Balancer (ALB) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The forwarding rules. You can specify at most 10 forwarding rules in each request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public java.util.List<CreateRulesRequestRules> rules;

    public static CreateRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRulesRequest self = new CreateRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRulesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateRulesRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateRulesRequest setRules(java.util.List<CreateRulesRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<CreateRulesRequestRules> getRules() {
        return this.rules;
    }

    public static class CreateRulesRequestRulesRuleActionsCorsConfig extends TeaModel {
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
         * <p>The trusted origins of CORS requests. One or more values are supported. Asterisks (<code>*</code>) can be used as wildcard characters.</p>
         * <ul>
         * <li>Each value must start with <code>http://</code> or <code>https://</code>, which must be followed by a valid domain name, including top-level domain names. Example: <code>http://*.test.abc.example.com</code>.</li>
         * <li>You can specify a port in each value or leave the port empty. Valid values: <strong>1</strong> to <strong>65535</strong>.</li>
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
         * <p>The maximum cache time of dry run requests in the browser. Unit: seconds.</p>
         * <p>Valid values: <strong>-1</strong> to <strong>172800</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxAge")
        public Long maxAge;

        public static CreateRulesRequestRulesRuleActionsCorsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleActionsCorsConfig self = new CreateRulesRequestRulesRuleActionsCorsConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleActionsCorsConfig setAllowCredentials(String allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public String getAllowCredentials() {
            return this.allowCredentials;
        }

        public CreateRulesRequestRulesRuleActionsCorsConfig setAllowHeaders(java.util.List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public java.util.List<String> getAllowHeaders() {
            return this.allowHeaders;
        }

        public CreateRulesRequestRulesRuleActionsCorsConfig setAllowMethods(java.util.List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public java.util.List<String> getAllowMethods() {
            return this.allowMethods;
        }

        public CreateRulesRequestRulesRuleActionsCorsConfig setAllowOrigin(java.util.List<String> allowOrigin) {
            this.allowOrigin = allowOrigin;
            return this;
        }
        public java.util.List<String> getAllowOrigin() {
            return this.allowOrigin;
        }

        public CreateRulesRequestRulesRuleActionsCorsConfig setExposeHeaders(java.util.List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public java.util.List<String> getExposeHeaders() {
            return this.exposeHeaders;
        }

        public CreateRulesRequestRulesRuleActionsCorsConfig setMaxAge(Long maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Long getMaxAge() {
            return this.maxAge;
        }

    }

    public static class CreateRulesRequestRulesRuleActionsFixedResponseConfig extends TeaModel {
        /**
         * <p>The content of the custom response. The content cannot exceed 1 KB in size, and can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>dssacav</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The format of the content. Valid values:</p>
         * <ul>
         * <li><strong>text/plain</strong></li>
         * <li><strong>text/css</strong></li>
         * <li><strong>text/html</strong></li>
         * <li><strong>application/javascript</strong></li>
         * <li><strong>application/json</strong></li>
         * </ul>
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

        public static CreateRulesRequestRulesRuleActionsFixedResponseConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleActionsFixedResponseConfig self = new CreateRulesRequestRulesRuleActionsFixedResponseConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleActionsFixedResponseConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateRulesRequestRulesRuleActionsFixedResponseConfig setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateRulesRequestRulesRuleActionsFixedResponseConfig setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

    }

    public static class CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession extends TeaModel {
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
         * <p>The timeout period of sessions. Unit: seconds. Valid values: <strong>1 to 86400</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession self = new CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The server group to which requests are distributed.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-k86c1ov501id6p****</p>
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
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupTuples self = new CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupTuples setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateRulesRequestRulesRuleActionsForwardGroupConfig extends TeaModel {
        /**
         * <p>The configuration of session persistence for the server groups.</p>
         */
        @NameInMap("ServerGroupStickySession")
        public CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession;

        /**
         * <p>The server groups to which requests are forwarded.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static CreateRulesRequestRulesRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleActionsForwardGroupConfig self = new CreateRulesRequestRulesRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleActionsForwardGroupConfig setServerGroupStickySession(CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession) {
            this.serverGroupStickySession = serverGroupStickySession;
            return this;
        }
        public CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession getServerGroupStickySession() {
            return this.serverGroupStickySession;
        }

        public CreateRulesRequestRulesRuleActionsForwardGroupConfig setServerGroupTuples(java.util.List<CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class CreateRulesRequestRulesRuleActionsInsertHeaderConfig extends TeaModel {
        /**
         * <p>The key of the header. The header key must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The header keys specified by <strong>InsertHeaderConfig</strong> must be unique.</p>
         * <blockquote>
         * <p> The following header keys are not supported: <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, and <code>authority</code>. The header keys are not case-sensitive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the header to be inserted.</p>
         * <ul>
         * <li><p>If <strong>ValueType</strong> is set to <strong>SystemDefined</strong>, you can set the Value parameter to one of the following values:</p>
         * <ul>
         * <li><strong>ClientSrcPort</strong>: the client port.</li>
         * <li><strong>ClientSrcIp</strong>: the IP address of the client.</li>
         * <li><strong>Protocol</strong>: the request protocol (HTTP or HTTPS).</li>
         * <li><strong>SLBId</strong>: the ID of the ALB instance.</li>
         * <li><strong>SLBPort</strong>: the listener port.</li>
         * </ul>
         * </li>
         * <li><p>If <strong>ValueType</strong> is set to <strong>UserDefined</strong>, you can specify a custom header value. The header value must be 1 to 128 characters in length, and can contain wildcard characters, such as asterisks (\*) and question marks (?), and printable characters whose ASCII values are <code>larger than or equal to 32 and smaller than 127</code>. The header value cannot start or end with a space character.</p>
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
         * <li><strong>UserDefined</strong>: a custom header</li>
         * <li><strong>ReferenceHeader</strong>: a header that references one of the request headers</li>
         * <li><strong>SystemDefined</strong>: a system-defined header</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserDefined</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static CreateRulesRequestRulesRuleActionsInsertHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleActionsInsertHeaderConfig self = new CreateRulesRequestRulesRuleActionsInsertHeaderConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleActionsInsertHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRulesRequestRulesRuleActionsInsertHeaderConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateRulesRequestRulesRuleActionsInsertHeaderConfig setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class CreateRulesRequestRulesRuleActionsRedirectConfig extends TeaModel {
        /**
         * <p>The hostname to which requests are forwarded. Valid values:</p>
         * <ul>
         * <li><p><strong>${host}</strong> (default): If ${host} is returned, no other character is appended.</p>
         * </li>
         * <li><p>The hostname must meet the following requirements:</p>
         * <ul>
         * <li>The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), periods (.), asterisks (\*), and question marks (?).</li>
         * <li>The hostname must contain at least one period (.) but cannot start or end with a period (.).</li>
         * <li>The rightmost domain label can contain only letters and wildcard characters. It does not contain digits or hyphens (-).</li>
         * <li>The domain labels cannot start or end with a hyphen (-).</li>
         * <li>You can place an asterisk (\*) or a question mark (?) anywhere in a domain label as wildcard characters.</li>
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
         * <p>The URL to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><p>Default value: <strong>${path}</strong>. <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong> are also supported. Each variable can be specified only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.</p>
         * </li>
         * <li><p>The path must meet the following requirements:</p>
         * <ul>
         * <li>The URL must be 1 to 128 characters in length.</li>
         * <li>The URL must start with a forward slash (/) and can contain letters, digits, and the following special characters: <code>$ - _ .+ / &amp; ~ @ :</code>. It cannot contain the following special characters: <code>&quot; % # ; ! ( ) [ ]^ , &quot;</code>. You can use asterisks (\*) and question marks (?) as wildcard characters.</li>
         * <li>The URL is case-sensitive.</li>
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
         * <p>The port to which requests are distributed.</p>
         * <ul>
         * <li><strong>${port}</strong> (default): If you set the value to ${port}, you cannot add other characters to the value.</li>
         * <li>You can also enter a port number. Valid values: <strong>1 to 63335</strong>.</li>
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
         * <li><strong>${protocol}</strong> (default): If ${protocol} is returned, no other character is appended.</li>
         * <li><strong>HTTP</strong> or <strong>HTTPS</strong></li>
         * </ul>
         * <blockquote>
         * <p> HTTPS listeners supports only HTTPS redirects.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The query string of the URL to which requests are redirected.</p>
         * <ul>
         * <li><p>Default value: <strong>${query}</strong>. <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong> are also supported. Each variable can be specified only once. The preceding variables can be used at the same time or combined with a custom value.</p>
         * </li>
         * <li><p>The query string must meet the following requirements:</p>
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

        public static CreateRulesRequestRulesRuleActionsRedirectConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleActionsRedirectConfig self = new CreateRulesRequestRulesRuleActionsRedirectConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleActionsRedirectConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateRulesRequestRulesRuleActionsRedirectConfig setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

        public CreateRulesRequestRulesRuleActionsRedirectConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateRulesRequestRulesRuleActionsRedirectConfig setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public CreateRulesRequestRulesRuleActionsRedirectConfig setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateRulesRequestRulesRuleActionsRedirectConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class CreateRulesRequestRulesRuleActionsRemoveHeaderConfig extends TeaModel {
        /**
         * <p>The key of the header to be removed. The header key must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The header keys specified in RemoveHeader must be unique.</p>
         * <ul>
         * <li>If Direction is set to Request, the following header keys are not supported: <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, and <code>authority</code>. The header keys are not case-sensitive.</li>
         * <li>If Direction is set to Response, the following header keys are not supported: <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, and <code>transfer-encoding</code>. The header keys are not case-sensitive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        public static CreateRulesRequestRulesRuleActionsRemoveHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleActionsRemoveHeaderConfig self = new CreateRulesRequestRulesRuleActionsRemoveHeaderConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleActionsRemoveHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class CreateRulesRequestRulesRuleActionsRewriteConfig extends TeaModel {
        /**
         * <p>The hostname to which requests are rewritten. Valid values:</p>
         * <ul>
         * <li><p><strong>${host}</strong> (default): If you set the value to ${host}, you cannot append other characters.</p>
         * </li>
         * <li><p>The hostname must meet the following requirements:</p>
         * <ul>
         * <li>The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), periods (.), asterisks (\*), and question marks (?).</li>
         * <li>The hostname must contain at least one period (.) but cannot start or end with a period (.).</li>
         * <li>The rightmost domain label can contain only letters and wildcard characters. It does not contain digits or hyphens (-).</li>
         * <li>The domain labels cannot start or end with hyphens (-). You can use asterisks (\*) and question marks (?) anywhere in a domain label as wildcard characters.</li>
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
         * <li><p>Default value: <strong>${path}</strong>. <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong> are also supported. Each variable can be specified only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.</p>
         * </li>
         * <li><p>The URL must meet the following requirements:</p>
         * <ul>
         * <li>The value must be 1 to 128 characters in length,</li>
         * <li>The URL must start with a forward slash (/) and can contain letters, digits, and the following special characters: <code>$ - _ .+ / &amp; ~ @ :</code>. It cannot contain the following special characters: <code>&quot; % # ; ! ( ) [ ]^ , &quot;</code>. You can use asterisks (\*) and question marks (?) as wildcard characters.</li>
         * <li>The URL is case-sensitive.</li>
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
         * <p>The query string of the URL to which requests are rewritten.</p>
         * <ul>
         * <li><p>Default value: <strong>${query}</strong>. <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong> are also supported. Each variable can be specified only once. The preceding variables can be used at the same time or combined with a custom value.</p>
         * </li>
         * <li><p>The query string must meet the following requirements:</p>
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

        public static CreateRulesRequestRulesRuleActionsRewriteConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleActionsRewriteConfig self = new CreateRulesRequestRulesRuleActionsRewriteConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleActionsRewriteConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateRulesRequestRulesRuleActionsRewriteConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateRulesRequestRulesRuleActionsRewriteConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class CreateRulesRequestRulesRuleActionsTrafficLimitConfig extends TeaModel {
        /**
         * <p>The number of requests per IP address. Value range: <strong>1 to 1000000</strong>.</p>
         * <blockquote>
         * <p> If both the <strong>QPS</strong> and <strong>PerIpQps</strong> parameters are specified, the value of the <strong>QPS</strong> parameter is smaller than the value of the PerIpQps parameter.</p>
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

        public static CreateRulesRequestRulesRuleActionsTrafficLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleActionsTrafficLimitConfig self = new CreateRulesRequestRulesRuleActionsTrafficLimitConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleActionsTrafficLimitConfig setPerIpQps(Integer perIpQps) {
            this.perIpQps = perIpQps;
            return this;
        }
        public Integer getPerIpQps() {
            return this.perIpQps;
        }

        public CreateRulesRequestRulesRuleActionsTrafficLimitConfig setQPS(Integer QPS) {
            this.QPS = QPS;
            return this;
        }
        public Integer getQPS() {
            return this.QPS;
        }

    }

    public static class CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The server group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>srg-00mkgijak0w4qgz9****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples self = new CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

    public static class CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig extends TeaModel {
        /**
         * <p>The server group to which traffic is mirrored.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> serverGroupTuples;

        public static CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig self = new CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig setServerGroupTuples(java.util.List<CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class CreateRulesRequestRulesRuleActionsTrafficMirrorConfig extends TeaModel {
        /**
         * <p>The configuration of the server group to which traffic is mirrored.</p>
         */
        @NameInMap("MirrorGroupConfig")
        public CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig;

        /**
         * <p>The type of target to which network traffic is mirrored. Valid values:</p>
         * <ul>
         * <li><strong>ForwardGroupMirror</strong>: a server group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroupMirror</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static CreateRulesRequestRulesRuleActionsTrafficMirrorConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleActionsTrafficMirrorConfig self = new CreateRulesRequestRulesRuleActionsTrafficMirrorConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleActionsTrafficMirrorConfig setMirrorGroupConfig(CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig) {
            this.mirrorGroupConfig = mirrorGroupConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig getMirrorGroupConfig() {
            return this.mirrorGroupConfig;
        }

        public CreateRulesRequestRulesRuleActionsTrafficMirrorConfig setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class CreateRulesRequestRulesRuleActions extends TeaModel {
        /**
         * <p>The CORS configuration.</p>
         */
        @NameInMap("CorsConfig")
        public CreateRulesRequestRulesRuleActionsCorsConfig corsConfig;

        /**
         * <p>The configuration of the custom response. You can specify at most 20 custom responses.</p>
         */
        @NameInMap("FixedResponseConfig")
        public CreateRulesRequestRulesRuleActionsFixedResponseConfig fixedResponseConfig;

        /**
         * <p>The configuration of the server group. You can specify at most 20 server groups.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public CreateRulesRequestRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The key of the header to be inserted. You can specify at most 20 headers.</p>
         */
        @NameInMap("InsertHeaderConfig")
        public CreateRulesRequestRulesRuleActionsInsertHeaderConfig insertHeaderConfig;

        /**
         * <p>The priority of the action. Valid values: <strong>1 to 50000</strong>. A lower value indicates a higher priority. The actions of a forwarding rule are applied in descending order of priority. This parameter cannot empty. The priority of each action within a forwarding rule must be unique. You can specify at most 20 action priorities.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The redirect configuration. You can specify at most 20 redirects.</p>
         */
        @NameInMap("RedirectConfig")
        public CreateRulesRequestRulesRuleActionsRedirectConfig redirectConfig;

        /**
         * <p>The HTTP header to be removed.</p>
         */
        @NameInMap("RemoveHeaderConfig")
        public CreateRulesRequestRulesRuleActionsRemoveHeaderConfig removeHeaderConfig;

        /**
         * <p>The rewrite configuration. You can specify at most 20 rewrites.</p>
         */
        @NameInMap("RewriteConfig")
        public CreateRulesRequestRulesRuleActionsRewriteConfig rewriteConfig;

        /**
         * <p>The configuration of traffic throttling. You can specify at most 20 traffic throttling rules.</p>
         */
        @NameInMap("TrafficLimitConfig")
        public CreateRulesRequestRulesRuleActionsTrafficLimitConfig trafficLimitConfig;

        /**
         * <p>The configuration of traffic mirroring. You can specify at most 20 traffic mirroring rules.</p>
         */
        @NameInMap("TrafficMirrorConfig")
        public CreateRulesRequestRulesRuleActionsTrafficMirrorConfig trafficMirrorConfig;

        /**
         * <p>The action type. You can specify at most 11 types of action. Valid values:</p>
         * <ul>
         * <li><strong>ForwardGroup</strong>: distributes requests to multiple vServer groups.</li>
         * <li><strong>Redirect</strong>: redirects requests.</li>
         * <li><strong>FixedResponse</strong>: returns a custom response.</li>
         * <li><strong>Rewrite</strong>: rewrites requests.</li>
         * <li><strong>InsertHeader</strong>: inserts headers.</li>
         * <li><strong>RemoveHeaderConfig</strong>: deletes a header.</li>
         * <li><strong>TrafficLimit</strong>: throttles traffic.</li>
         * <li><strong>TrafficMirror</strong>: mirrors network traffic.</li>
         * <li><strong>Cors</strong>: enables cross-origin resource sharing (CORS).</li>
         * </ul>
         * <p>You can specify the last action and the actions that you want to perform before the last action:</p>
         * <ul>
         * <li><strong>FinalType</strong>: Each forwarding rule can contain only one FinalType action, which is performed at the end. You can specify only one of <strong>ForwardGroup</strong>, <strong>Redirect</strong>, and <strong>FixedResponse</strong>.</li>
         * <li><strong>ExtType</strong>: Each forwarding rule can contain one or more <strong>ExtType</strong> actions, which are performed before the <strong>FinalType</strong> action. If you want to specify an ExtType action, you must also specify a <strong>FinalType</strong> action. You can specify multiple <strong>InsertHeader</strong> actions or one <strong>Rewrite</strong> action.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroup</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateRulesRequestRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleActions self = new CreateRulesRequestRulesRuleActions();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleActions setCorsConfig(CreateRulesRequestRulesRuleActionsCorsConfig corsConfig) {
            this.corsConfig = corsConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleActionsCorsConfig getCorsConfig() {
            return this.corsConfig;
        }

        public CreateRulesRequestRulesRuleActions setFixedResponseConfig(CreateRulesRequestRulesRuleActionsFixedResponseConfig fixedResponseConfig) {
            this.fixedResponseConfig = fixedResponseConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleActionsFixedResponseConfig getFixedResponseConfig() {
            return this.fixedResponseConfig;
        }

        public CreateRulesRequestRulesRuleActions setForwardGroupConfig(CreateRulesRequestRulesRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public CreateRulesRequestRulesRuleActions setInsertHeaderConfig(CreateRulesRequestRulesRuleActionsInsertHeaderConfig insertHeaderConfig) {
            this.insertHeaderConfig = insertHeaderConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleActionsInsertHeaderConfig getInsertHeaderConfig() {
            return this.insertHeaderConfig;
        }

        public CreateRulesRequestRulesRuleActions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public CreateRulesRequestRulesRuleActions setRedirectConfig(CreateRulesRequestRulesRuleActionsRedirectConfig redirectConfig) {
            this.redirectConfig = redirectConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleActionsRedirectConfig getRedirectConfig() {
            return this.redirectConfig;
        }

        public CreateRulesRequestRulesRuleActions setRemoveHeaderConfig(CreateRulesRequestRulesRuleActionsRemoveHeaderConfig removeHeaderConfig) {
            this.removeHeaderConfig = removeHeaderConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleActionsRemoveHeaderConfig getRemoveHeaderConfig() {
            return this.removeHeaderConfig;
        }

        public CreateRulesRequestRulesRuleActions setRewriteConfig(CreateRulesRequestRulesRuleActionsRewriteConfig rewriteConfig) {
            this.rewriteConfig = rewriteConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleActionsRewriteConfig getRewriteConfig() {
            return this.rewriteConfig;
        }

        public CreateRulesRequestRulesRuleActions setTrafficLimitConfig(CreateRulesRequestRulesRuleActionsTrafficLimitConfig trafficLimitConfig) {
            this.trafficLimitConfig = trafficLimitConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleActionsTrafficLimitConfig getTrafficLimitConfig() {
            return this.trafficLimitConfig;
        }

        public CreateRulesRequestRulesRuleActions setTrafficMirrorConfig(CreateRulesRequestRulesRuleActionsTrafficMirrorConfig trafficMirrorConfig) {
            this.trafficMirrorConfig = trafficMirrorConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleActionsTrafficMirrorConfig getTrafficMirrorConfig() {
            return this.trafficMirrorConfig;
        }

        public CreateRulesRequestRulesRuleActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateRulesRequestRulesRuleConditionsCookieConfigValues extends TeaModel {
        /**
         * <p>The cookie key.</p>
         * <ul>
         * <li>The cookie key must be 1 to 100 characters in length.</li>
         * <li>You can use asterisks (\*) and question marks (?) as wildcard characters.</li>
         * <li>It can contain printable characters, except uppercase letters, space characters, and the following special characters: <code>; # [ ] { } \\ | &lt; &gt; &amp;</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The cookie value.</p>
         * <ul>
         * <li>The cookie value must be 1 to 100 characters in length.</li>
         * <li>You can use asterisks (\*) and question marks (?) as wildcard characters.</li>
         * <li>It can contain printable characters, except uppercase letters, space characters, and the following special characters: <code>; # [ ] { } \\ | &lt; &gt; &amp;</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRulesRequestRulesRuleConditionsCookieConfigValues build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleConditionsCookieConfigValues self = new CreateRulesRequestRulesRuleConditionsCookieConfigValues();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleConditionsCookieConfigValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRulesRequestRulesRuleConditionsCookieConfigValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRulesRequestRulesRuleConditionsCookieConfig extends TeaModel {
        /**
         * <p>The cookie value.</p>
         */
        @NameInMap("Values")
        public java.util.List<CreateRulesRequestRulesRuleConditionsCookieConfigValues> values;

        public static CreateRulesRequestRulesRuleConditionsCookieConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleConditionsCookieConfig self = new CreateRulesRequestRulesRuleConditionsCookieConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleConditionsCookieConfig setValues(java.util.List<CreateRulesRequestRulesRuleConditionsCookieConfigValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<CreateRulesRequestRulesRuleConditionsCookieConfigValues> getValues() {
            return this.values;
        }

    }

    public static class CreateRulesRequestRulesRuleConditionsHeaderConfig extends TeaModel {
        /**
         * <p>The key of the header.</p>
         * <ul>
         * <li>The header key must be 1 to 40 characters in length,</li>
         * <li>The header key can contain letters, digits, hyphens (-), and underscores (_).</li>
         * <li>Cookie and Host are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Port</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the header.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRulesRequestRulesRuleConditionsHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleConditionsHeaderConfig self = new CreateRulesRequestRulesRuleConditionsHeaderConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleConditionsHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRulesRequestRulesRuleConditionsHeaderConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRulesRequestRulesRuleConditionsHostConfig extends TeaModel {
        /**
         * <p>The hostname.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRulesRequestRulesRuleConditionsHostConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleConditionsHostConfig self = new CreateRulesRequestRulesRuleConditionsHostConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleConditionsHostConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRulesRequestRulesRuleConditionsMethodConfig extends TeaModel {
        /**
         * <p>The request methods.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRulesRequestRulesRuleConditionsMethodConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleConditionsMethodConfig self = new CreateRulesRequestRulesRuleConditionsMethodConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleConditionsMethodConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRulesRequestRulesRuleConditionsPathConfig extends TeaModel {
        /**
         * <p>The URLs to which requests are forwarded.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRulesRequestRulesRuleConditionsPathConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleConditionsPathConfig self = new CreateRulesRequestRulesRuleConditionsPathConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleConditionsPathConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRulesRequestRulesRuleConditionsQueryStringConfigValues extends TeaModel {
        /**
         * <p>They key of the query string.</p>
         * <ul>
         * <li>The key must be 1 to 100 characters in length.</li>
         * <li>You can use asterisks (\*) and question marks (?) as wildcards. The key can contain printable characters, excluding uppercase letters, space characters, and the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the query string.</p>
         * <ul>
         * <li>The value must be 1 to 128 characters in length,</li>
         * <li>The value can contain printable characters, excluding uppercase letters, space characters, and the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>. You can use asterisks (\*) and question marks (?) as wildcard characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRulesRequestRulesRuleConditionsQueryStringConfigValues build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleConditionsQueryStringConfigValues self = new CreateRulesRequestRulesRuleConditionsQueryStringConfigValues();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleConditionsQueryStringConfigValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRulesRequestRulesRuleConditionsQueryStringConfigValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRulesRequestRulesRuleConditionsQueryStringConfig extends TeaModel {
        /**
         * <p>The configurations of the query string.</p>
         */
        @NameInMap("Values")
        public java.util.List<CreateRulesRequestRulesRuleConditionsQueryStringConfigValues> values;

        public static CreateRulesRequestRulesRuleConditionsQueryStringConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleConditionsQueryStringConfig self = new CreateRulesRequestRulesRuleConditionsQueryStringConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleConditionsQueryStringConfig setValues(java.util.List<CreateRulesRequestRulesRuleConditionsQueryStringConfigValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<CreateRulesRequestRulesRuleConditionsQueryStringConfigValues> getValues() {
            return this.values;
        }

    }

    public static class CreateRulesRequestRulesRuleConditionsResponseHeaderConfig extends TeaModel {
        /**
         * <p>The key of the header.</p>
         * <ul>
         * <li>The header key must be 1 to 40 characters in length.</li>
         * <li>It can contain letters, digits, hyphens (-), and underscores (_).</li>
         * <li>Cookie and Host are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Port</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the header.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRulesRequestRulesRuleConditionsResponseHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleConditionsResponseHeaderConfig self = new CreateRulesRequestRulesRuleConditionsResponseHeaderConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleConditionsResponseHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRulesRequestRulesRuleConditionsResponseHeaderConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRulesRequestRulesRuleConditionsResponseStatusCodeConfig extends TeaModel {
        /**
         * <p>The response status codes.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRulesRequestRulesRuleConditionsResponseStatusCodeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleConditionsResponseStatusCodeConfig self = new CreateRulesRequestRulesRuleConditionsResponseStatusCodeConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleConditionsResponseStatusCodeConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRulesRequestRulesRuleConditionsSourceIpConfig extends TeaModel {
        /**
         * <p>Traffic matching based on source IP addresses.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRulesRequestRulesRuleConditionsSourceIpConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleConditionsSourceIpConfig self = new CreateRulesRequestRulesRuleConditionsSourceIpConfig();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleConditionsSourceIpConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRulesRequestRulesRuleConditions extends TeaModel {
        /**
         * <p>The key-value pairs of the cookie. You can specify at most 20 cookies.</p>
         */
        @NameInMap("CookieConfig")
        public CreateRulesRequestRulesRuleConditionsCookieConfig cookieConfig;

        /**
         * <p>The configuration of the header. You can specify at most 20 headers.</p>
         */
        @NameInMap("HeaderConfig")
        public CreateRulesRequestRulesRuleConditionsHeaderConfig headerConfig;

        /**
         * <p>The configuration of the hosts. You can specify at most 20 hosts.</p>
         */
        @NameInMap("HostConfig")
        public CreateRulesRequestRulesRuleConditionsHostConfig hostConfig;

        /**
         * <p>The configurations of the request methods. You can specify at most 20 request methods.</p>
         */
        @NameInMap("MethodConfig")
        public CreateRulesRequestRulesRuleConditionsMethodConfig methodConfig;

        /**
         * <p>The configurations of the forwarding URLs. You can specify at most 20 forwarding URLs.</p>
         */
        @NameInMap("PathConfig")
        public CreateRulesRequestRulesRuleConditionsPathConfig pathConfig;

        /**
         * <p>The configuration of the query conditions. You can specify at most 20 query conditions.</p>
         */
        @NameInMap("QueryStringConfig")
        public CreateRulesRequestRulesRuleConditionsQueryStringConfig queryStringConfig;

        /**
         * <p>The configuration of the header. You can specify at most 20 headers.</p>
         */
        @NameInMap("ResponseHeaderConfig")
        public CreateRulesRequestRulesRuleConditionsResponseHeaderConfig responseHeaderConfig;

        /**
         * <p>The configurations of the response status codes.</p>
         */
        @NameInMap("ResponseStatusCodeConfig")
        public CreateRulesRequestRulesRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig;

        /**
         * <p>Traffic matching based on source IP addresses. This parameter is required and valid when <strong>Type</strong> is set to <strong>SourceIP</strong>. You can specify up to five IP addresses or CIDR blocks in the <strong>SourceIpConfig</strong> parameter.</p>
         */
        @NameInMap("SourceIpConfig")
        public CreateRulesRequestRulesRuleConditionsSourceIpConfig sourceIpConfig;

        /**
         * <p>The type of forwarding rule. You can specify at most seven types of forwarding rules. Valid values:</p>
         * <ul>
         * <li><strong>Host</strong>: Requests are forwarded based on hosts.</li>
         * <li><strong>Path</strong>: Requests are forwarded based on URLs.</li>
         * <li><strong>Header</strong>: Requests are forwarded based on HTTP headers.</li>
         * <li><strong>QueryString</strong>: Requests are forwarded based on query strings.</li>
         * <li><strong>Method</strong>: Requests are forwarded based on request methods.</li>
         * <li><strong>Cookie</strong>: Requests are forwarded based on cookies.</li>
         * <li><strong>SourceIp</strong>: Requests are forwarded based on source IP addresses.</li>
         * <li><strong>ResponseHeader</strong>: Requests are forwarded based on HTTP response headers.</li>
         * <li><strong>ResponseStatusCode</strong>: Requests are forwarded based on response status codes.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateRulesRequestRulesRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesRuleConditions self = new CreateRulesRequestRulesRuleConditions();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesRuleConditions setCookieConfig(CreateRulesRequestRulesRuleConditionsCookieConfig cookieConfig) {
            this.cookieConfig = cookieConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleConditionsCookieConfig getCookieConfig() {
            return this.cookieConfig;
        }

        public CreateRulesRequestRulesRuleConditions setHeaderConfig(CreateRulesRequestRulesRuleConditionsHeaderConfig headerConfig) {
            this.headerConfig = headerConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleConditionsHeaderConfig getHeaderConfig() {
            return this.headerConfig;
        }

        public CreateRulesRequestRulesRuleConditions setHostConfig(CreateRulesRequestRulesRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

        public CreateRulesRequestRulesRuleConditions setMethodConfig(CreateRulesRequestRulesRuleConditionsMethodConfig methodConfig) {
            this.methodConfig = methodConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleConditionsMethodConfig getMethodConfig() {
            return this.methodConfig;
        }

        public CreateRulesRequestRulesRuleConditions setPathConfig(CreateRulesRequestRulesRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public CreateRulesRequestRulesRuleConditions setQueryStringConfig(CreateRulesRequestRulesRuleConditionsQueryStringConfig queryStringConfig) {
            this.queryStringConfig = queryStringConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleConditionsQueryStringConfig getQueryStringConfig() {
            return this.queryStringConfig;
        }

        public CreateRulesRequestRulesRuleConditions setResponseHeaderConfig(CreateRulesRequestRulesRuleConditionsResponseHeaderConfig responseHeaderConfig) {
            this.responseHeaderConfig = responseHeaderConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleConditionsResponseHeaderConfig getResponseHeaderConfig() {
            return this.responseHeaderConfig;
        }

        public CreateRulesRequestRulesRuleConditions setResponseStatusCodeConfig(CreateRulesRequestRulesRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig) {
            this.responseStatusCodeConfig = responseStatusCodeConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleConditionsResponseStatusCodeConfig getResponseStatusCodeConfig() {
            return this.responseStatusCodeConfig;
        }

        public CreateRulesRequestRulesRuleConditions setSourceIpConfig(CreateRulesRequestRulesRuleConditionsSourceIpConfig sourceIpConfig) {
            this.sourceIpConfig = sourceIpConfig;
            return this;
        }
        public CreateRulesRequestRulesRuleConditionsSourceIpConfig getSourceIpConfig() {
            return this.sourceIpConfig;
        }

        public CreateRulesRequestRulesRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateRulesRequestRulesTag extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRulesRequestRulesTag build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRulesTag self = new CreateRulesRequestRulesTag();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRulesTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRulesRequestRulesTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRulesRequestRules extends TeaModel {
        /**
         * <p>The direction to which the forwarding rule is applied. You can specify only one direction. Valid values:</p>
         * <ul>
         * <li><strong>Request</strong> (default): The forwarding rule applies to requests. Requests sent from clients to ALB are matches against the match conditions and processed based on the rule actions.</li>
         * <li><strong>Response</strong>: The forwarding rule applies to responses. Responses from backend servers to ALB are matches against the match conditions and processed based on the rule actions.</li>
         * </ul>
         * <blockquote>
         * <p> Basic ALB instances do not support forwarding rules applied to the <strong>Response</strong> direction.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Request</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The priority of the forwarding rule. Valid values: <strong>1</strong> to <strong>10000</strong>. A lower value specifies a higher priority. You can specify at most 10 priorities.</p>
         * <blockquote>
         * <p> The priorities of forwarding rules for the same listener must be unique.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The actions of the forwarding rule.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleActions")
        public java.util.List<CreateRulesRequestRulesRuleActions> ruleActions;

        /**
         * <p>The conditions of the forwarding rule.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<CreateRulesRequestRulesRuleConditions> ruleConditions;

        /**
         * <p>The name of the forwarding rule. You can specify at most 20 rule names.</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length.</li>
         * <li>The name can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The tag that you want to add.</p>
         */
        @NameInMap("Tag")
        public java.util.List<CreateRulesRequestRulesTag> tag;

        public static CreateRulesRequestRules build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestRules self = new CreateRulesRequestRules();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestRules setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public CreateRulesRequestRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateRulesRequestRules setRuleActions(java.util.List<CreateRulesRequestRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<CreateRulesRequestRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

        public CreateRulesRequestRules setRuleConditions(java.util.List<CreateRulesRequestRulesRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<CreateRulesRequestRulesRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        public CreateRulesRequestRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateRulesRequestRules setTag(java.util.List<CreateRulesRequestRulesTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<CreateRulesRequestRulesTag> getTag() {
            return this.tag;
        }

    }

}
