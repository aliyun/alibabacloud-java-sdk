// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateRulesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not set this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run and does not create the forwarding rules. The system checks whether the required parameters are set, the request format is valid, and the service limits are met. If the request fails the dry run, the corresponding error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. If the request passes the check, the system returns an HTTP 2xx status code and creates the forwarding rules.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the listener for the Application Load Balancing instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-l16uo9y******</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The list of forwarding rules.</p>
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
         * <p>Specifies whether to allow credentials. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Yes.</li>
         * <li><strong>off</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AllowCredentials")
        public String allowCredentials;

        /**
         * <p>The list of allowed headers for cross-origin requests.</p>
         */
        @NameInMap("AllowHeaders")
        public java.util.List<String> allowHeaders;

        /**
         * <p>The allowed HTTP methods for cross-origin requests.</p>
         */
        @NameInMap("AllowMethods")
        public java.util.List<String> allowMethods;

        /**
         * <p>The allowed origins.</p>
         */
        @NameInMap("AllowOrigin")
        public java.util.List<String> allowOrigin;

        /**
         * <p>The list of exposed headers.</p>
         */
        @NameInMap("ExposeHeaders")
        public java.util.List<String> exposeHeaders;

        /**
         * <p>The maximum cache duration of preflight requests in the browser. Unit: seconds.</p>
         * <p>Valid values: <strong>-1</strong> to <strong>172800</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
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
         * <p>The fixed content to be returned. The maximum size is 1 KB. Only ASCII characters are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The format of the fixed content to be returned. Valid values: <strong>text/plain</strong>, <strong>text/css</strong>, <strong>text/html</strong>, <strong>application/javascript</strong>, and <strong>application/json</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>text/plain</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The HTTP status code to be returned. Only numeric strings in the format of <strong>2xx</strong>, <strong>4xx</strong>, or <strong>5xx</strong> are supported, where <strong>x</strong> represents any digit.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
         * <li><strong>true</strong>: enables session persistence.</li>
         * <li><strong>false</strong>: disables session persistence. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The timeout period. Unit: seconds. Valid values: <strong>1</strong> to <strong>86400</strong>. Default value: <strong>1000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-ffm94ovy7lqw******</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The weight. A larger value indicates a higher weight, which means that more requests are forwarded to the server group. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
         * <ul>
         * <li><p>If only one destination server group is specified and the weight is not specified, the default value is <strong>100</strong>.</p>
         * </li>
         * <li><p>If more than one destination server group is specified, you must specify the weight for each server group.</p>
         * </li>
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
         * <p>The session persistence across server groups.</p>
         */
        @NameInMap("ServerGroupStickySession")
        public CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession;

        /**
         * <p>The list of destination server groups to which requests are forwarded.</p>
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
         * <p>The name of the header to be inserted. The name must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). Header names in <strong>InsertHeaderConfig</strong> must be unique.</p>
         * <blockquote>
         * <p>You cannot set the header name to any of the following fields (case-insensitive): <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, <code>authority</code>, and <code>x-forwarded-host</code>.</p>
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
         * <li>If <strong>ValueType</strong> is set to <strong>SystemDefined</strong>, valid values are:<ul>
         * <li><strong>ClientSrcPort</strong>: the client port.</li>
         * <li><strong>ClientSrcIp</strong>: the client IP address.</li>
         * <li><strong>Protocol</strong>: the protocol of the client request (HTTP or HTTPS).</li>
         * <li><strong>SLBId</strong>: the Application Load Balancing (ALB) instance ID.</li>
         * <li><strong>SLBPort</strong>: the listening port of the ALB instance.</li>
         * </ul>
         * </li>
         * <li>If <strong>ValueType</strong> is set to <strong>UserDefined</strong>, you can customize the header value. The value must be 1 to 128 characters in length, and can contain asterisks (*), question marks (?), and printable characters with ASCII values from 32 to 127 (<code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>). Double quotation marks (&quot;) are not supported. The value cannot start or end with a space, and cannot end with a backslash ().</li>
         * <li>If <strong>ValueType</strong> is set to <strong>ReferenceHeader</strong>, you can reference a field in the request header. The value must be 1 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (_).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The content type of the header field. Valid values:</p>
         * <ul>
         * <li><p><strong>UserDefined</strong>: a custom header value.</p>
         * </li>
         * <li><p><strong>ReferenceHeader</strong>: a referenced field from the request header.</p>
         * </li>
         * <li><p><strong>SystemDefined</strong>: a system-defined header value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SystemDefined</p>
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
         * <p>The host to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><strong>${host}</strong>: the default value. If you use this value, you cannot concatenate it with other characters.</li>
         * <li>Other values: The character set and format requirements are as follows:<ul>
         * <li>The hostname must be 3 to 256 characters in length, and can contain lowercase letters, digits, hyphens (-), periods (.), asterisks (*), equal signs (=), tildes (~), underscores (_), plus signs (+), backslashes (), carets (^), exclamation marks (!), dollar signs ($), ampersands (&amp;), vertical bars (|), parentheses (()), square brackets ([]), and question marks (?).</li>
         * <li>The hostname must contain at least one period (.), and the period cannot be at the beginning or end of the hostname.</li>
         * <li>The rightmost domain label can contain only letters and wildcards, and cannot contain digits or hyphens (-). The leftmost <code>domainlabel</code> can be an asterisk (*).</li>
         * <li>A hyphen (-) cannot be at the beginning or end of any other domain label.</li>
         * <li>Asterisks (*) and question marks (?) can appear anywhere in a domain label.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>${host}</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The HTTP status code for the redirect. Valid values: <strong>301</strong>, <strong>302</strong>, <strong>303</strong>, <strong>307</strong>, and <strong>308</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>301</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        /**
         * <p>The path to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><strong>${path}</strong>: The default value. You can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. You can use these variables together or concatenate them with strings within the allowed character set.</li>
         * <li>Other values: The character set and format requirements are as follows:<ul>
         * <li>The path must be 1 to 256 characters in length and is case-sensitive. Asterisks (*) and question marks (?) are supported as wildcards.</li>
         * <li>The path must start with a forward slash (/). It can contain letters, digits, and the following special characters: <code>$-_.+/&amp;~@:\&quot;*?</code>. The following characters are not supported: <code>&quot;%#;!()[]^,&quot;\&quot;</code>. Asterisks (*) and question marks (?) are also supported.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><strong>${port}</strong>: the default value. You cannot concatenate this value with other characters.</li>
         * <li>Other values: <strong>1</strong> to <strong>63335</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The protocol to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><strong>${protocol}</strong>: the default value. If you use this value, it must be used independently and cannot be modified or concatenated with other characters.</li>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong><blockquote>
         * <ul>
         * <li>HTTPS listeners support redirection only to the HTTPS protocol.</li>
         * <li>HTTP listeners support redirection to both HTTP and HTTPS protocols.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The query string to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><strong>${query}</strong>: the default value. You can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. You can use these variables together or concatenate them with strings within the allowed character set.</li>
         * <li>Other values: The character set and format requirements are as follows:<ul>
         * <li>The query string must be 1 to 128 characters in length.</li>
         * <li>Visible characters are supported. Spaces and <code>#[]{}\|&lt;&gt;&quot;</code> are not supported. Letters must be lowercase.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>${query}</p>
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
         * <p>The name of the header to remove. The name must be 1 to 40 characters in length and can contain letters, digits, underscores (_), and hyphens (-). Header names cannot be duplicated in RemoveHeader.</p>
         * <ul>
         * <li>Request direction (when Direction is set to Request): The header name cannot be set to any of the following fields (case-insensitive): <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, <code>authority</code>, or <code>x-forwarded-host</code>.</li>
         * <li>Response direction (when Direction is set to Response): The header name cannot be set to any of the following fields (case-insensitive): <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, or <code>transfer-encoding</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>key</p>
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
         * <p>The destination host for the internal rewrite. Valid values:</p>
         * <ul>
         * <li><p><strong>${host}</strong>: the default value. You cannot concatenate this value with other characters.</p>
         * </li>
         * <li><p>Other values: The character set and format requirements are as follows:</p>
         * <ul>
         * <li><p>The hostname must be 3 to 256 characters in length, and can contain lowercase letters, digits, hyphens (-), periods (.), asterisks (*), equal signs (=), tildes (~), underscores (_), plus signs (+), backslashes (), carets (^), exclamation marks (!), dollar signs ($), ampersands (&amp;), vertical bars (|), parentheses (()), square brackets ([]), and question marks (?).</p>
         * </li>
         * <li><p>The hostname must contain at least one period (.), and the period cannot be at the beginning or end of the hostname.</p>
         * </li>
         * <li><p>The rightmost domain label can contain only letters and wildcards, and cannot contain digits or hyphens (-). The leftmost <code>domainlabel</code> can be an asterisk (*).</p>
         * </li>
         * <li><p>A hyphen (-) cannot be at the beginning or end of any other domain label. Asterisks (*) and question marks (?) can appear anywhere in a domain label.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.rewrite.alb">www.rewrite.alb</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The path to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><strong>${path}</strong>: The default value. You can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. You can use these variables together or concatenate them with strings within the allowed character set.</li>
         * <li>Other values: The character set and format requirements are as follows:<ul>
         * <li>The path must be 1 to 256 characters in length and is case-sensitive. Asterisks (*) and question marks (?) are supported as wildcards.</li>
         * <li>The path must start with a forward slash (/). It can contain letters, digits, and the following special characters: <code>$-_.+/&amp;~@:\&quot;*?</code>. The following characters are not supported: <code>&quot;%#;!()[]^,&quot;\&quot;</code>. Asterisks (*) and question marks (?) are also supported.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/tea</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The query string for the internal rewrite. Valid values:</p>
         * <ul>
         * <li><strong>${query}</strong>: the default value. You can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. You can use these variables together or concatenate them with strings within the allowed character set.</li>
         * <li>Other values: The character set and format requirements are as follows:<ul>
         * <li>The query string must be 1 to 128 characters in length.</li>
         * <li>Visible characters are supported. Spaces and <code>#[]{}\|&lt;&gt;&quot;</code> are not supported. Letters must be lowercase.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>${query}</p>
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
         * <p>The number of queries per second from a single IP address. Valid values: <strong>1</strong> to <strong>1000000</strong>.</p>
         * <blockquote>
         * <p>If the <strong>QPS</strong> parameter is also configured, the value of <strong>PerIpQps</strong> must be less than the value of <strong>QPS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PerIpQps")
        public Integer perIpQps;

        /**
         * <p>The number of queries per second (QPS). Valid values: <strong>1</strong> to <strong>1000000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
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
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-u9cmf16iu69******</p>
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
         * <p>The configuration for mirroring traffic to a server group.</p>
         */
        @NameInMap("MirrorGroupConfig")
        public CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig;

        /**
         * <p>The target type for traffic mirroring. Valid values:</p>
         * <ul>
         * <li><strong>ForwardGroupMirror</strong>: mirrors traffic to a server group.</li>
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
         * <p>The configuration of the fixed response action.</p>
         */
        @NameInMap("FixedResponseConfig")
        public CreateRulesRequestRulesRuleActionsFixedResponseConfig fixedResponseConfig;

        /**
         * <p>The configuration of the forward group action.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public CreateRulesRequestRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The configuration of the insert header action.</p>
         */
        @NameInMap("InsertHeaderConfig")
        public CreateRulesRequestRulesRuleActionsInsertHeaderConfig insertHeaderConfig;

        /**
         * <p>The execution order of the forwarding rule action. Valid values: <strong>1</strong> to <strong>50000</strong>. Actions are executed in ascending order of their values. The value cannot be empty and must be unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The redirect configuration.</p>
         * <blockquote>
         * <p>For the parameters in <strong>RedirectConfig</strong>, you cannot use the default values for all parameters except <strong>HttpCode</strong>.</p>
         * </blockquote>
         */
        @NameInMap("RedirectConfig")
        public CreateRulesRequestRulesRuleActionsRedirectConfig redirectConfig;

        /**
         * <p>The configuration for removing an HTTP header.</p>
         */
        @NameInMap("RemoveHeaderConfig")
        public CreateRulesRequestRulesRuleActionsRemoveHeaderConfig removeHeaderConfig;

        /**
         * <p>The rewrite configuration.</p>
         * <blockquote>
         * <p>If multiple actions are configured for the same forwarding rule, the <strong>RewriteConfig</strong> action must be used together with the <strong>ForwardGroup</strong> action type.</p>
         * </blockquote>
         */
        @NameInMap("RewriteConfig")
        public CreateRulesRequestRulesRuleActionsRewriteConfig rewriteConfig;

        /**
         * <p>The traffic throttling configuration.</p>
         */
        @NameInMap("TrafficLimitConfig")
        public CreateRulesRequestRulesRuleActionsTrafficLimitConfig trafficLimitConfig;

        /**
         * <p>The traffic mirroring configuration.</p>
         */
        @NameInMap("TrafficMirrorConfig")
        public CreateRulesRequestRulesRuleActionsTrafficMirrorConfig trafficMirrorConfig;

        /**
         * <p>The action type. Valid values:</p>
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
         * <li><p><strong>TrafficLimit</strong>: limits traffic.</p>
         * </li>
         * <li><p><strong>TrafficMirror</strong>: mirrors traffic.</p>
         * </li>
         * <li><p><strong>Cors</strong>: configures cross-origin resource sharing (CORS).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>A forwarding rule must contain at least one <strong>ForwardGroup</strong>, <strong>Redirect</strong>, or <strong>FixedResponse</strong> action. If other action types are configured, the <strong>ForwardGroup</strong>, <strong>Redirect</strong>, or <strong>FixedResponse</strong> action must be executed last.</p>
         * </blockquote>
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
         * <p>The cookie condition key.</p>
         * <ul>
         * <li><p>The key must be 1 to 100 characters in length.</p>
         * </li>
         * <li><p>The key can contain printable characters, asterisks (*), and question marks (?). Letters must be lowercase.</p>
         * </li>
         * <li><p>The key cannot contain spaces or the following characters: <code>;#[]{}\|&lt;&gt;&amp;&quot;</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The cookie condition value.</p>
         * <ul>
         * <li><p>The value must be 1 to 100 characters in length.</p>
         * </li>
         * <li><p>The value can contain printable characters, asterisks (*), and question marks (?). Letters must be lowercase.</p>
         * </li>
         * <li><p>The value cannot contain spaces or the following characters: <code>;#[]{}\|&lt;&gt;&amp;&quot;</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>value</p>
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
         * <p>The list of cookie key-value pairs.</p>
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
         * <p>The HTTP header key.</p>
         * <ul>
         * <li><p>The key must be 1 to 40 characters in length.</p>
         * </li>
         * <li><p>The key can contain letters, digits, hyphens (-), and underscores (_).</p>
         * </li>
         * <li><p>The key cannot be Cookie or Host.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The list of HTTP header values.</p>
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
         * <p>The list of hostnames.</p>
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
         * <p>The list of HTTP request methods.</p>
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
         * <p>The list of path conditions.</p>
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
         * <p>The query string condition key.</p>
         * <ul>
         * <li>The key must be 1 to 100 characters in length.</li>
         * <li>The key can contain printable characters, asterisks (*), and question marks (?). Letters must be lowercase. Spaces and the following characters are not supported: <code>#[]{}\|&lt;&gt;&amp;&quot;</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The query string condition value.</p>
         * <ul>
         * <li>The value must be 1 to 128 characters in length.</li>
         * <li>The value can contain lowercase letters, printable characters, asterisks (*), and question marks (?). Spaces and the following characters are not supported: <code>#[]{}\|&lt;&gt;&amp;&quot;</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>value</p>
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
         * <p>The list of query string condition key-value pairs.</p>
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
         * <p>The response HTTP header key.</p>
         * <ul>
         * <li>The key must be 1 to 40 characters in length.</li>
         * <li>The key can contain letters, digits, hyphens (-), and underscores (_).</li>
         * <li>The key cannot be Cookie or Host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The list of response HTTP header values.</p>
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
         * <p>The list of response status codes.</p>
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
         * <p>The source IP addresses used to match service traffic.</p>
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
         * <p>The cookie condition configuration.</p>
         */
        @NameInMap("CookieConfig")
        public CreateRulesRequestRulesRuleConditionsCookieConfig cookieConfig;

        /**
         * <p>The HTTP header condition configuration.</p>
         */
        @NameInMap("HeaderConfig")
        public CreateRulesRequestRulesRuleConditionsHeaderConfig headerConfig;

        /**
         * <p>The hostname condition configuration.</p>
         */
        @NameInMap("HostConfig")
        public CreateRulesRequestRulesRuleConditionsHostConfig hostConfig;

        /**
         * <p>The HTTP request method condition configuration.</p>
         */
        @NameInMap("MethodConfig")
        public CreateRulesRequestRulesRuleConditionsMethodConfig methodConfig;

        /**
         * <p>The path condition configuration.</p>
         */
        @NameInMap("PathConfig")
        public CreateRulesRequestRulesRuleConditionsPathConfig pathConfig;

        /**
         * <p>The query string condition configuration.</p>
         */
        @NameInMap("QueryStringConfig")
        public CreateRulesRequestRulesRuleConditionsQueryStringConfig queryStringConfig;

        /**
         * <p>The response HTTP header configuration.</p>
         */
        @NameInMap("ResponseHeaderConfig")
        public CreateRulesRequestRulesRuleConditionsResponseHeaderConfig responseHeaderConfig;

        /**
         * <p>The response status code configuration.</p>
         */
        @NameInMap("ResponseStatusCodeConfig")
        public CreateRulesRequestRulesRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig;

        /**
         * <p>The configuration for matching service traffic based on source IP addresses.</p>
         */
        @NameInMap("SourceIpConfig")
        public CreateRulesRequestRulesRuleConditionsSourceIpConfig sourceIpConfig;

        /**
         * <p>The forwarding condition type. Valid values:</p>
         * <ul>
         * <li><p>Host: Hostname.</p>
         * </li>
         * <li><p>Path: Path.</p>
         * </li>
         * <li><p>Header: HTTP header fields.</p>
         * </li>
         * <li><p>QueryString: Query character string.</p>
         * </li>
         * <li><p>Method: Request method.</p>
         * </li>
         * <li><p>Cookie: Cookie.</p>
         * </li>
         * <li><p>SourceIp: Source IP address.</p>
         * </li>
         * <li><p>ResponseHeader: Response HTTP header fields.</p>
         * </li>
         * <li><p>ResponseStatusCode: Response status code.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SourceIp</p>
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
         * <p>The tag key. It can be up to 128 characters in length, cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>test_tag_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. It can be up to 128 characters in length, cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>test_tag_value</p>
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
         * <p>The direction of the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Request</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The priority of the forwarding rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The list of forwarding rule actions.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleActions")
        public java.util.List<CreateRulesRequestRulesRuleActions> ruleActions;

        /**
         * <p>The list of forwarding rule conditions.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<CreateRulesRequestRulesRuleConditions> ruleConditions;

        /**
         * <p>The name of the forwarding rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-443-64</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The list of tags.</p>
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
