// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateRulesAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
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
     * <p>The forwarding rules. You can specify at most 10 forwarding rules in each call.</p>
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
         * <p>Specifies whether to allow credentials to be carried in CORS requests. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: allows credentials to be carried in CORS requests.</li>
         * <li><strong>off</strong>: does not allow credentials to be carried in CORS requests.</li>
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
         * <p>The content of the response. The content can be up to 1 KB in size, and can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>dssacav</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The content format of the response.</p>
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
         * <p>The timeout period of sessions. Unit: seconds Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
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
         * <li>If the number of destination server groups is 1, the default weight of the server group is <strong>100</strong>, unless you specify a weight.</li>
         * <li>If the number of destination server groups is larger than 1, you must specify a weight.</li>
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
         * <p>Specifies whether to overwrite the header in the request. Valid values:</p>
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
         * <p>The key of the header. The header key must be 1 to 40 characters in length, and can contain lowercase letters, digits, underscores (_), and hyphens (-). The key specified in <code>InsertHeader</code> must be unique.</p>
         * <blockquote>
         * <p>The following header keys are not supported: <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te, host</code>, <code>cookie</code>, <code>remoteip</code>, and <code>authority</code>. Header keys are not case-sensitive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>The type of header. Valid values:</p>
         * <ul>
         * <li><strong>UserDefined</strong>: a user-defined header.</li>
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
         * <p>The hostname to which requests are redirected.</p>
         * <p>The hostname must meet the following requirements:</p>
         * <ul>
         * <li>The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, and the following special characters: - . \* = ~ _ + \ ^ ! $ &amp; | ( ) [ ] ?.</li>
         * <li>The hostname must contain at least one period (.) but cannot start or end with a period (.).</li>
         * <li>The rightmost domain label can contain only letters, asterisks (<em>), and question marks (?), and cannot contain digits or hyphens (-). The leftmost <code>domain label</code> can contain asterisks (</em>).</li>
         * <li>The domain labels cannot start or end with hyphens (-). You can specify asterisks (∗) and question marks (?) anywhere in a domain label.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The HTTP status code that indicates the redirect type. Valid values: <strong>301</strong>, <strong>302</strong>, <strong>303</strong>, <strong>307</strong>, and <strong>308</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>301</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        /**
         * <p>The path of the destination to which requests are forwarded. Valid values:</p>
         * <ul>
         * <li><p><strong>${path}</strong> (default): You can reference \<em>\</em>${host}**, <strong>${protocol}</strong> and **${port}\<em>\</em>. Each variable can be used only once. The preceding variables can be used at the same time or combined with a custom value.</p>
         * </li>
         * <li><p>A custom value. You must ensure that the custom value meets the following requirements:</p>
         * <ul>
         * <li>The path must be 1 to 128 characters in length. You can use asterisks (\*) and question marks (?) as wildcard characters.</li>
         * <li>The path can contain letters, digits, and the following special characters: <code>$ - _ . + / &amp; ~ @ : \\&quot; * ?</code>. It must start with a forward slash (/) and cannot contain the following characters: <code>&quot; % # ; ! ( ) [ ] ^ , &quot;</code>.</li>
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
         * <p>The protocol of the destination to which requests are forwarded. Valid values:</p>
         * <p>Valid values for HTTP listeners: <strong>HTTP</strong> and <strong>HTTPS</strong>.</p>
         * <p>Valid values for HTTPS listeners: <strong>HTTPS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The query string to which requests are redirected.</p>
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
         * <p>The key of the response header.</p>
         * <ul>
         * <li>The header key must be 1 to 40 characters in length.</li>
         * <li>The header key can contain lowercase letters, digits, hyphens (-), and underscores (_).</li>
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
         * <p>The hostname of the destination to which requests are forwarded.</p>
         * <p>The hostname must meet the following requirements:</p>
         * <ul>
         * <li>The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, and the following special characters: - . \* = ~ _ + \ ^ ! $ &amp; | ( ) [ ] ?.</li>
         * <li>The hostname must contain at least one period (.) but cannot start or end with a period (.).</li>
         * <li>The rightmost domain label can contain only letters, asterisks (<em>), and question marks (?), and cannot contain digits or hyphens (-). The leftmost <code>domain label</code> can contain asterisks (</em>).</li>
         * <li>The domain labels cannot start or end with hyphens (-). You can specify asterisks (∗) and question marks (?) anywhere in a domain label.</li>
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
         * <li><p><strong>${path}</strong> (default): You can reference \<em>\</em>${host}**, <strong>${protocol}</strong> and **${port}\<em>\</em>. Each variable can be used only once. The preceding variables can be used at the same time or combined with a custom value.</p>
         * </li>
         * <li><p>A custom value. You must ensure that the custom value meets the following requirements:</p>
         * <ul>
         * <li>The path must be 1 to 128 characters in length. You can use asterisks (\*) and question marks (?) as wildcard characters.</li>
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
         * <p>The query string of the URL to which requests are forwarded.</p>
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
         * <p>The number of requests per IP address. Valid values: <strong>1</strong> to <strong>1000000</strong>.</p>
         * <blockquote>
         * <p>If both the QPS and PerIpQps properties are specified, make sure that the value of the QPS property is smaller than the value of the PerIpQps property.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("PerIpQps")
        public Integer perIpQps;

        /**
         * <p>The number of queries per second (QPS). Valid values: <strong>1</strong> to <strong>1000000</strong>.</p>
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
         * <p>The server group to which traffic is mirrored.</p>
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
         * <p>The type of target to which network traffic is mirrored. Valid values:</p>
         * <ul>
         * <li><strong>ForwardGroupMirror</strong>: a server group</li>
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
         * <p>The configuration of the action to return a custom response. You can specify at most 20 custom responses.</p>
         */
        @NameInMap("FixedResponseConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig fixedResponseConfig;

        /**
         * <p>The configuration of the action to forward requests to server groups. You can specify at most 20 actions.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The configuration of the action to insert a header. You can specify at most 20 actions.</p>
         */
        @NameInMap("InsertHeaderConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig insertHeaderConfig;

        /**
         * <p>The priority of the action. Valid values: <strong>1</strong> to <strong>50000</strong>. A lower value indicates a higher priority. The actions of a forwarding rule are applied in descending order of priority. This parameter cannot be left empty. The priority of each action within a forwarding rule must be unique. You can specify at most 20 forwarding rule priorities.</p>
         * <p>This parameter is required.</p>
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
        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig redirectConfig;

        /**
         * <p>The configuration of the HTTP header to be removed. You can remove at most 20 HTTP headers.</p>
         */
        @NameInMap("RemoveHeaderConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig removeHeaderConfig;

        /**
         * <p>The configuration of the rewrite action. You can specify at most 20 actions.</p>
         */
        @NameInMap("RewriteConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig rewriteConfig;

        /**
         * <p>The configuration of traffic throttling. You can specify at most 20 throttling actions.</p>
         */
        @NameInMap("TrafficLimitConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig trafficLimitConfig;

        /**
         * <p>The configuration of traffic mirroring. You can specify at most 20 traffic mirroring configurations.</p>
         */
        @NameInMap("TrafficMirrorConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig trafficMirrorConfig;

        /**
         * <p>The type of action. You can specify at most 11 types of action. Valid values:</p>
         * <ul>
         * <li><strong>ForwardGroup</strong>: forwards a request to multiple vServer groups.</li>
         * <li><strong>Redirect</strong>: redirects requests.</li>
         * <li><strong>FixedResponse</strong>: returns a fixed response.</li>
         * <li><strong>Rewrite</strong>: rewrites requests.</li>
         * <li><strong>InsertHeader</strong>: inserts a header.</li>
         * <li><strong>RemoveHeaderConfig</strong>: deletes a header.</li>
         * <li><strong>TrafficLimit</strong>: throttles traffic.</li>
         * <li><strong>TrafficMirror</strong>: mirrors network traffic.</li>
         * <li><strong>Cors</strong>: enables cross-origin resource sharing (CORS).</li>
         * </ul>
         * <p>The preceding actions can be classified into two types:</p>
         * <ul>
         * <li><strong>FinalType</strong>: Each forwarding rule can contain only one FinalType action, which is performed at the end. You can specify only one of <strong>ForwardGroup</strong>, <strong>Redirect</strong>, and <strong>FixedResponse</strong>.</li>
         * <li><strong>ExtType</strong>: Each forwarding rule can contain one or more <strong>ExtType</strong> actions, which are performed before the <strong>FinalType</strong> action. If you want to specify an ExtType action, you must also specify a <strong>FinalType</strong> action. You can specify multiple <strong>InsertHeader</strong> actions or one <strong>Rewrite</strong> action.</li>
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
         * <p>The cookie key, which must be 1 to 100 characters in length, and can contain lowercase letters, asterisks (\*), question marks (?), and printable characters. It cannot contain space characters or the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The cookie value, which must be 1 to 128 characters in length, and can contain lowercase letters, asterisks (\*), question marks (?), and printable characters. It cannot contain space characters or the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</p>
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
         * <p>The key-value pairs of cookies.</p>
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
         * <p>The key of the header. The key must be 1 to 40 characters in length. The header key can contain lowercase letters, digits, hyphens (-), and underscores (_). Cookie and Host are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Port</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The HTTP header values.</p>
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
         * <p>The paths to which requests are forwarded.</p>
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
         * <p>The key of the query string.</p>
         * <p>The key must be 1 to 100 characters in length, and can contain lowercase letters, printable ASCII characters, asterisks (\*), and question marks (?). It cannot contain space characters or the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the query string.</p>
         * <p>The value must be 1 to 128 characters in length, and can contain lowercase letters, printable ASCII characters, asterisks (\*), and question marks (?). It cannot contain space characters or the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</p>
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
         * <p>The key-value pairs of query strings.</p>
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
         * <p>The key of the response header.</p>
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
         * <p>The value of the response header.</p>
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
         * <p>Traffic matching based on source IP addresses.</p>
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
         * <p>The configuration of the cookie. You can specify at most 20 conditions.</p>
         */
        @NameInMap("CookieConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig cookieConfig;

        /**
         * <p>The configuration of the HTTP header. You can specify at most 20 HTTP headers.</p>
         */
        @NameInMap("HeaderConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig headerConfig;

        /**
         * <p>The match conditions for hostnames. You can specify at most 20 conditions.</p>
         */
        @NameInMap("HostConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsHostConfig hostConfig;

        /**
         * <p>The configuration of the HTTP request method. You can configure at most 20 HTTP request methods.</p>
         */
        @NameInMap("MethodConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig methodConfig;

        /**
         * <p>The match conditions for query strings. You can specify at most 20 conditions.</p>
         */
        @NameInMap("PathConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsPathConfig pathConfig;

        /**
         * <p>The match conditions for query strings. You can specify at most 20 conditions.</p>
         */
        @NameInMap("QueryStringConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig queryStringConfig;

        /**
         * <p>The HTTP response headers. You can specify at most 20 HTTP response headers.</p>
         */
        @NameInMap("ResponseHeaderConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig responseHeaderConfig;

        /**
         * <p>The match conditions for response status codes. This parameter is required and valid when <strong>Type</strong> is set to <strong>ResponseStatusCode</strong>. You can specify at most 20 conditions.</p>
         */
        @NameInMap("ResponseStatusCodeConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig;

        /**
         * <p>Traffic matching based on source IP addresses. You can specify at most 20 match conditions based on IP addresses.</p>
         */
        @NameInMap("SourceIpConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig sourceIpConfig;

        /**
         * <p>The condition type of the forwarding rule is invalid.</p>
         * <p>You can specify at most seven condition types for inbound forwarding rules. Valid values:</p>
         * <ul>
         * <li><strong>Host</strong>: Requests are forwarded based on hosts.</li>
         * <li><strong>Path</strong>: Requests are forwarded based on paths.</li>
         * <li><strong>Header</strong>: Requests are forwarded based on HTTP headers.</li>
         * <li><strong>QueryString</strong>: Requests are forwarded based on query strings.</li>
         * <li><strong>Method</strong>: Requests are forwarded based on request methods.</li>
         * <li><strong>Cookie</strong>: Requests are forwarded based on cookies.</li>
         * <li><strong>SourceIp</strong>: Requests are forwarded based on source IP addresses.</li>
         * </ul>
         * <p>You can specify at most two condition types for outbound forwarding rules. Valid values:</p>
         * <ul>
         * <li><strong>ResponseHeader</strong>: Responses are forwarded based on HTTP response headers.</li>
         * <li><strong>ResponseStatusCode</strong>: Response are forwarded based on response status codes.</li>
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
         * <p>The priority of the forwarding rule. Valid values: <strong>1 to 10000</strong>. A smaller value specifies a higher priority. You can specify at most 20 rule priorities.</p>
         * <blockquote>
         * <p>The priority of each forwarding rule within a listener must be unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The action of the forwarding rule.</p>
         */
        @NameInMap("RuleActions")
        public java.util.List<UpdateRulesAttributeRequestRulesRuleActions> ruleActions;

        /**
         * <p>The match conditions of the forwarding rule.</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<UpdateRulesAttributeRequestRulesRuleConditions> ruleConditions;

        /**
         * <p>The IDs of the forwarding rules. You can specify at most 20 rule IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-cxjh7vazn2jpnl****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the forwarding rule. The name must be 2 to 128 letters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter. You can specify at most 20 rule names.</p>
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
