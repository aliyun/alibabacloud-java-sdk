// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> value as the <strong>ClientToken</strong> value. The <strong>RequestId</strong> value is different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The direction of the forwarding rule. Valid values:</p>
     * <ul>
     * <li><p><strong>Request</strong> (default): The rule matches requests sent from clients to ALB and performs the corresponding actions.</p>
     * </li>
     * <li><p><strong>Response</strong>: The rule matches responses returned from backend server groups to ALB and performs the corresponding actions.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>ALB instances of Basic Edition do not support the <strong>Response</strong> type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Request</p>
     */
    @NameInMap("Direction")
    public String direction;

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
     * <p>The ID of the Application Load Balancing (ALB) instance listener.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-l16uo9y******</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The priority of the forwarding rule. Valid values: <strong>1 to 10000</strong>. A smaller value indicates a higher priority.</p>
     * <blockquote>
     * <p>The priority of each rule within a listener must be unique.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The list of forwarding rule actions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleActions")
    public java.util.List<CreateRuleRequestRuleActions> ruleActions;

    /**
     * <p>The list of forwarding rule conditions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleConditions")
    public java.util.List<CreateRuleRequestRuleConditions> ruleConditions;

    /**
     * <p>The name of the forwarding rule. </p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>The name must start with a letter, Chinese character, or digit. It can contain digits, periods (.), underscores (_), hyphens (-), and spaces.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-doc</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateRuleRequestTag> tag;

    public static CreateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleRequest self = new CreateRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRuleRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public CreateRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateRuleRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateRuleRequest setRuleActions(java.util.List<CreateRuleRequestRuleActions> ruleActions) {
        this.ruleActions = ruleActions;
        return this;
    }
    public java.util.List<CreateRuleRequestRuleActions> getRuleActions() {
        return this.ruleActions;
    }

    public CreateRuleRequest setRuleConditions(java.util.List<CreateRuleRequestRuleConditions> ruleConditions) {
        this.ruleConditions = ruleConditions;
        return this;
    }
    public java.util.List<CreateRuleRequestRuleConditions> getRuleConditions() {
        return this.ruleConditions;
    }

    public CreateRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateRuleRequest setTag(java.util.List<CreateRuleRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateRuleRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateRuleRequestRuleActionsCorsConfig extends TeaModel {
        /**
         * <p>Specifies whether credentials are allowed. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: allowed.</li>
         * <li><strong>off</strong>: not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AllowCredentials")
        public String allowCredentials;

        /**
         * <p>The list of headers allowed for CORS requests.</p>
         */
        @NameInMap("AllowHeaders")
        public java.util.List<String> allowHeaders;

        /**
         * <p>The HTTP methods allowed for CORS requests.</p>
         */
        @NameInMap("AllowMethods")
        public java.util.List<String> allowMethods;

        /**
         * <p>The list of allowed origins. You can configure a single element <code>*</code>, or configure one or more values.</p>
         * <ul>
         * <li>Each value must start with <code>http://</code> or <code>https://</code>, followed by a valid domain name or a first-level wildcard domain name (for example, <code>http://*.test.abc.example.com</code>).</li>
         * <li>Each value can optionally include a port. The port range is <strong>1</strong> to <strong>65535</strong>.</li>
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

        public static CreateRuleRequestRuleActionsCorsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActionsCorsConfig self = new CreateRuleRequestRuleActionsCorsConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleActionsCorsConfig setAllowCredentials(String allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public String getAllowCredentials() {
            return this.allowCredentials;
        }

        public CreateRuleRequestRuleActionsCorsConfig setAllowHeaders(java.util.List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public java.util.List<String> getAllowHeaders() {
            return this.allowHeaders;
        }

        public CreateRuleRequestRuleActionsCorsConfig setAllowMethods(java.util.List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public java.util.List<String> getAllowMethods() {
            return this.allowMethods;
        }

        public CreateRuleRequestRuleActionsCorsConfig setAllowOrigin(java.util.List<String> allowOrigin) {
            this.allowOrigin = allowOrigin;
            return this;
        }
        public java.util.List<String> getAllowOrigin() {
            return this.allowOrigin;
        }

        public CreateRuleRequestRuleActionsCorsConfig setExposeHeaders(java.util.List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public java.util.List<String> getExposeHeaders() {
            return this.exposeHeaders;
        }

        public CreateRuleRequestRuleActionsCorsConfig setMaxAge(Long maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Long getMaxAge() {
            return this.maxAge;
        }

    }

    public static class CreateRuleRequestRuleActionsFixedResponseConfig extends TeaModel {
        /**
         * <p>The fixed content to return. The content can be up to 1 KB in size and can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>dssacav</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The format of the fixed content.</p>
         * <p>Valid values: <strong>text/plain</strong>, <strong>text/css</strong>, <strong>text/html</strong>, <strong>application/javascript</strong>, and <strong>application/json</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>text/plain</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The HTTP response code to return. Only <strong>2xx</strong>, <strong>4xx</strong>, and <strong>5xx</strong> numeric strings are supported, where <strong>x</strong> is any digit.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        public static CreateRuleRequestRuleActionsFixedResponseConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActionsFixedResponseConfig self = new CreateRuleRequestRuleActionsFixedResponseConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleActionsFixedResponseConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateRuleRequestRuleActionsFixedResponseConfig setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateRuleRequestRuleActionsFixedResponseConfig setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

    }

    public static class CreateRuleRequestRuleActionsForwardGroupConfigServerGroupStickySession extends TeaModel {
        /**
         * <p>Specifies whether to enable session persistence. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong> (default): disabled.</li>
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
         * <p>100</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static CreateRuleRequestRuleActionsForwardGroupConfigServerGroupStickySession build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActionsForwardGroupConfigServerGroupStickySession self = new CreateRuleRequestRuleActionsForwardGroupConfigServerGroupStickySession();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleActionsForwardGroupConfigServerGroupStickySession setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateRuleRequestRuleActionsForwardGroupConfigServerGroupStickySession setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class CreateRuleRequestRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The destination server group to which requests are forwarded.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-k86c1ov501id6p****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The weight. A larger value indicates a higher weight, which means more requests are forwarded to the server group. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
         * <ul>
         * <li><p>If only one destination server group is specified and no weight is specified, the default value is <strong>100</strong>.</p>
         * </li>
         * <li><p>If more than one destination server group is specified, you must specify the weight value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateRuleRequestRuleActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActionsForwardGroupConfigServerGroupTuples self = new CreateRuleRequestRuleActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleActionsForwardGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public CreateRuleRequestRuleActionsForwardGroupConfigServerGroupTuples setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateRuleRequestRuleActionsForwardGroupConfig extends TeaModel {
        /**
         * <p>The session persistence configuration between server groups.</p>
         */
        @NameInMap("ServerGroupStickySession")
        public CreateRuleRequestRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession;

        /**
         * <p>The list of destination server groups to which requests are forwarded. A maximum of 5 destination server groups can be added to a forwarding rule.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<CreateRuleRequestRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static CreateRuleRequestRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActionsForwardGroupConfig self = new CreateRuleRequestRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleActionsForwardGroupConfig setServerGroupStickySession(CreateRuleRequestRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession) {
            this.serverGroupStickySession = serverGroupStickySession;
            return this;
        }
        public CreateRuleRequestRuleActionsForwardGroupConfigServerGroupStickySession getServerGroupStickySession() {
            return this.serverGroupStickySession;
        }

        public CreateRuleRequestRuleActionsForwardGroupConfig setServerGroupTuples(java.util.List<CreateRuleRequestRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<CreateRuleRequestRuleActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class CreateRuleRequestRuleActionsInsertHeaderConfig extends TeaModel {
        /**
         * <p>The name of the header field to insert. The name must be 1 to 40 characters in length and can contain lowercase and uppercase letters a to z, digits, underscores (_), and hyphens (-). The header field name specified in <strong>InsertHeaderConfig</strong> must be unique.</p>
         * <blockquote>
         * <p>You cannot set the header name to the following fields (case-insensitive): <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, <code>authority</code>, <code>x-forwarded-host</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the header field to insert.</p>
         * <ul>
         * <li>If <strong>ValueType</strong> is set to <strong>SystemDefined</strong>, valid values are:<ul>
         * <li><strong>ClientSrcPort</strong>: the client port.</li>
         * <li><strong>ClientSrcIp</strong>: the client IP address.</li>
         * <li><strong>Protocol</strong>: the protocol used by the client request (HTTP or HTTPS).</li>
         * <li><strong>SLBId</strong>: the Application Load Balancing instance ID.</li>
         * <li><strong>SLBPort</strong>: the Application Load Balancing instance listener port.</li>
         * </ul>
         * </li>
         * <li>If <strong>ValueType</strong> is set to <strong>UserDefined</strong>: you can specify a custom header value. The value must be 1 to 128 characters in length and can contain wildcards asterisks (\*), question marks (?), and printable characters in the ASCII range <code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. The value cannot contain <code>&quot;</code>. The value cannot start or end with a space. The value cannot end with <code>\\</code>.</li>
         * <li>If <strong>ValueType</strong> is set to <strong>ReferenceHeader</strong>: you can reference a field in the request header. The value must be 1 to 128 characters in length and can contain lowercase letters a to z, digits, hyphens (-), and underscores (_).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserDefined</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The content type of the header field value. Valid values:</p>
         * <ul>
         * <li><p><strong>UserDefined</strong>: a custom value.</p>
         * </li>
         * <li><p><strong>ReferenceHeader</strong>: references a field in the request header.</p>
         * </li>
         * <li><p><strong>SystemDefined</strong>: a system-defined value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserDefined</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static CreateRuleRequestRuleActionsInsertHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActionsInsertHeaderConfig self = new CreateRuleRequestRuleActionsInsertHeaderConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleActionsInsertHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRuleRequestRuleActionsInsertHeaderConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateRuleRequestRuleActionsInsertHeaderConfig setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class CreateRuleRequestRuleActionsRedirectConfig extends TeaModel {
        /**
         * <p>The host to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><strong>${host}</strong> (default): This value cannot be concatenated with other characters.</li>
         * <li>Other values. Character set and format restrictions are as follows:<ul>
         * <li>The hostname must be 3 to 256 characters in length and can contain lowercase letters a to z, digits, hyphens (-), periods (.), and wildcards asterisks (\*), equals signs (=), tildes (~), underscores (_), plus signs (+), backslashes (\), carets (^), exclamation marks (!), dollar signs ($), ampersands (&amp;), vertical bars (|), parentheses (()), brackets ([\]), and question marks (?).</li>
         * <li>The hostname must contain at least one period (.) and cannot start or end with a period (.).</li>
         * <li>The rightmost domain label can contain only letters and wildcards, and cannot contain digits or hyphens (-). The leftmost <code>domainlable</code> can be an asterisk (\*).</li>
         * <li>Hyphens (-) cannot appear at the beginning or end of other domain labels.</li>
         * <li>Wildcards asterisks (\*) and question marks (?) can appear at any position in a domain label.</li>
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
         * <p>The redirect type. Valid values: <strong>301</strong>, <strong>302</strong>, <strong>303</strong>, <strong>307</strong>, and <strong>308</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>301</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        /**
         * <p>The path to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><strong>${path}</strong> (default): You can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. These variables can be used together or concatenated with characters within the allowed character set described below.</li>
         * <li>Other values. Character set and format restrictions are as follows:<ul>
         * <li>The value must be 1 to 256 characters in length, is case-sensitive, and supports wildcards asterisks (\*) and question marks (?) as wildcards.</li>
         * <li>The value must start with a forward slash (/), and can contain uppercase and lowercase letters, digits, and special characters <code>$-_.+/&amp;~@:\\&quot;*?</code>. The value cannot contain <code>&quot;%#;!()[]^,&quot;\\&quot;</code>. Wildcards asterisks (\*) and question marks (?) are supported.</li>
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
         * <p>The port to which requests are redirected.</p>
         * <ul>
         * <li><strong>${port}</strong> (default): This value cannot be used together with other characters.</li>
         * <li>Other values: <strong>1 to 63335</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The protocol to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><strong>${protocol}</strong> (default): This value can only be used alone and cannot be modified or concatenated with other characters.</li>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong><blockquote>
         * <ul>
         * <li>HTTPS listeners support redirection to HTTPS only.</li>
         * <li>HTTP listeners support redirection to both HTTP and HTTPS.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The query string to which requests are redirected.</p>
         * <ul>
         * <li><strong>${query}</strong> (default): You can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. These variables can be used together or concatenated with characters within the allowed character set described below.</li>
         * <li>Other values. Character set and format restrictions are as follows:<ul>
         * <li>The value must be 1 to 128 characters in length.</li>
         * <li>The value can contain printable characters but cannot contain spaces or <code>#[]{}\\|&lt;&gt;&quot;</code>. Letters must be lowercase.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>${query}</p>
         */
        @NameInMap("Query")
        public String query;

        public static CreateRuleRequestRuleActionsRedirectConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActionsRedirectConfig self = new CreateRuleRequestRuleActionsRedirectConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleActionsRedirectConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateRuleRequestRuleActionsRedirectConfig setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

        public CreateRuleRequestRuleActionsRedirectConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateRuleRequestRuleActionsRedirectConfig setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public CreateRuleRequestRuleActionsRedirectConfig setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateRuleRequestRuleActionsRedirectConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class CreateRuleRequestRuleActionsRemoveHeaderConfig extends TeaModel {
        /**
         * <p>The name of the header field to remove. The name must be 1 to 40 characters in length and can contain uppercase and lowercase letters a to z, digits, underscores (_), and hyphens (-). The header field name cannot be duplicated in RemoveHeader.</p>
         * <ul>
         * <li>Request direction (Direction is set to Request): You cannot set the header name to the following fields (case-insensitive): <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, <code>authority</code>, <code>x-forwarded-host</code>.</li>
         * <li>Response direction (Direction is set to Response): You cannot set the header name to the following fields (case-insensitive): <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        public static CreateRuleRequestRuleActionsRemoveHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActionsRemoveHeaderConfig self = new CreateRuleRequestRuleActionsRemoveHeaderConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleActionsRemoveHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class CreateRuleRequestRuleActionsRewriteConfig extends TeaModel {
        /**
         * <p>The destination hostname for internal redirection. Valid values:</p>
         * <ul>
         * <li><p><strong>${host}</strong> (default): This value cannot be concatenated with other characters.</p>
         * </li>
         * <li><p>Other values. Character set and format restrictions are as follows:</p>
         * <ul>
         * <li><p>The hostname must be 3 to 256 characters in length and can contain lowercase letters a to z, digits, hyphens (-), periods (.), and wildcards asterisks (\*), equals signs (=), tildes (~), underscores (_), plus signs (+), backslashes (\), carets (^), exclamation marks (!), dollar signs ($), ampersands (&amp;), vertical bars (|), parentheses (()), brackets ([\]), and question marks (?).</p>
         * </li>
         * <li><p>The hostname must contain at least one period (.) and cannot start or end with a period (.).</p>
         * </li>
         * <li><p>The rightmost domain label can contain only letters and wildcards, and cannot contain digits or hyphens (-). The leftmost <code>domainlable</code> can be an asterisk (\*).</p>
         * </li>
         * <li><p>Hyphens (-) cannot appear at the beginning or end of other domain labels. Wildcards asterisks (\*) and question marks (?) can appear at any position in a domain label.</p>
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
         * <p>The path to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><strong>${path}</strong> (default): You can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. These variables can be used together or concatenated with characters within the allowed character set described below.</li>
         * <li>Other values. Character set and format restrictions are as follows:<ul>
         * <li>The value must be 1 to 256 characters in length, is case-sensitive, and supports wildcards asterisks (\*) and question marks (?) as wildcards.</li>
         * <li>The value must start with a forward slash (/), and can contain uppercase and lowercase letters, digits, and special characters <code>$-_.+/&amp;~@:\\&quot;*?</code>. The value cannot contain <code>&quot;%#;!()[]^,&quot;\\&quot;</code>. Wildcards asterisks (\*) and question marks (?) are supported.</li>
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
         * <p>The query string for internal redirection.</p>
         * <ul>
         * <li><strong>${query}</strong> (default): You can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. These variables can be used together or concatenated with characters within the allowed character set described below.</li>
         * <li>Other values. Character set and format restrictions are as follows:<ul>
         * <li>The value must be 1 to 128 characters in length.</li>
         * <li>The value can contain printable characters but cannot contain spaces or <code>#[]{}\\|&lt;&gt;&quot;</code>. Letters must be lowercase.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>${query}</p>
         */
        @NameInMap("Query")
        public String query;

        public static CreateRuleRequestRuleActionsRewriteConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActionsRewriteConfig self = new CreateRuleRequestRuleActionsRewriteConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleActionsRewriteConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateRuleRequestRuleActionsRewriteConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateRuleRequestRuleActionsRewriteConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class CreateRuleRequestRuleActionsTrafficLimitConfig extends TeaModel {
        /**
         * <p>The number of requests per second per IP address. Valid values: <strong>1 to 1000000</strong>.</p>
         * <blockquote>
         * <p>If you configure both the <strong>QPS</strong> and <strong>PerIpQps</strong> parameters, the value of <strong>PerIpQps</strong> must be smaller than the value of <strong>QPS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("PerIpQps")
        public Integer perIpQps;

        /**
         * <p>The number of requests per second. Valid values: <strong>1 to 1000000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("QPS")
        public Integer QPS;

        public static CreateRuleRequestRuleActionsTrafficLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActionsTrafficLimitConfig self = new CreateRuleRequestRuleActionsTrafficLimitConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleActionsTrafficLimitConfig setPerIpQps(Integer perIpQps) {
            this.perIpQps = perIpQps;
            return this;
        }
        public Integer getPerIpQps() {
            return this.perIpQps;
        }

        public CreateRuleRequestRuleActionsTrafficLimitConfig setQPS(Integer QPS) {
            this.QPS = QPS;
            return this;
        }
        public Integer getQPS() {
            return this.QPS;
        }

    }

    public static class CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The server group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-00mkgijak0w4qgz9****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples self = new CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

    public static class CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig extends TeaModel {
        /**
         * <p>The configuration for mirroring traffic to a server group.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> serverGroupTuples;

        public static CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig self = new CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig setServerGroupTuples(java.util.List<CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class CreateRuleRequestRuleActionsTrafficMirrorConfig extends TeaModel {
        /**
         * <p>The configuration for mirroring traffic to a server group.</p>
         */
        @NameInMap("MirrorGroupConfig")
        public CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig;

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

        public static CreateRuleRequestRuleActionsTrafficMirrorConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActionsTrafficMirrorConfig self = new CreateRuleRequestRuleActionsTrafficMirrorConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleActionsTrafficMirrorConfig setMirrorGroupConfig(CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig) {
            this.mirrorGroupConfig = mirrorGroupConfig;
            return this;
        }
        public CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig getMirrorGroupConfig() {
            return this.mirrorGroupConfig;
        }

        public CreateRuleRequestRuleActionsTrafficMirrorConfig setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class CreateRuleRequestRuleActions extends TeaModel {
        /**
         * <p>The CORS configuration.</p>
         */
        @NameInMap("CorsConfig")
        public CreateRuleRequestRuleActionsCorsConfig corsConfig;

        /**
         * <p>The configuration of the fixed response.</p>
         */
        @NameInMap("FixedResponseConfig")
        public CreateRuleRequestRuleActionsFixedResponseConfig fixedResponseConfig;

        /**
         * <p>The list of destination server groups to which requests are forwarded. A maximum of 5 destination server groups can be added to a forwarding rule.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public CreateRuleRequestRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The configuration for inserting a header field.</p>
         */
        @NameInMap("InsertHeaderConfig")
        public CreateRuleRequestRuleActionsInsertHeaderConfig insertHeaderConfig;

        /**
         * <p>The order in which the forwarding rule action is executed. Valid values: <strong>1 to 50000</strong>. Actions are executed in ascending order of values. This parameter cannot be left empty and the value cannot be duplicated.</p>
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
         * <p>For the parameters in <strong>RedirectConfig</strong>, parameters other than <strong>httpCode</strong> cannot all use default values.</p>
         * </blockquote>
         */
        @NameInMap("RedirectConfig")
        public CreateRuleRequestRuleActionsRedirectConfig redirectConfig;

        /**
         * <p>The configuration for removing an HTTP header field.</p>
         */
        @NameInMap("RemoveHeaderConfig")
        public CreateRuleRequestRuleActionsRemoveHeaderConfig removeHeaderConfig;

        /**
         * <p>The rewrite configuration.</p>
         * <blockquote>
         * <p>When you configure multiple actions for a forwarding rule, the <strong>RewriteConfig</strong> action must be used together with the <strong>ForwardGroup</strong> action type.</p>
         * </blockquote>
         */
        @NameInMap("RewriteConfig")
        public CreateRuleRequestRuleActionsRewriteConfig rewriteConfig;

        /**
         * <p>The traffic throttling configuration.</p>
         */
        @NameInMap("TrafficLimitConfig")
        public CreateRuleRequestRuleActionsTrafficLimitConfig trafficLimitConfig;

        /**
         * <p>The traffic mirroring configuration.</p>
         */
        @NameInMap("TrafficMirrorConfig")
        public CreateRuleRequestRuleActionsTrafficMirrorConfig trafficMirrorConfig;

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
         * <li><p><strong>InsertHeader</strong>: inserts a header field.</p>
         * </li>
         * <li><p><strong>RemoveHeader</strong>: deletes a header field.</p>
         * </li>
         * <li><p><strong>TrafficLimit</strong>: throttles traffic.</p>
         * </li>
         * <li><p><strong>TrafficMirror</strong>: mirrors traffic.</p>
         * </li>
         * <li><p><strong>Cors</strong>: enables cross-origin resource sharing (CORS).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>A forwarding rule must contain one <strong>ForwardGroup</strong> (forward to), <strong>Redirect</strong> (redirect), or <strong>FixedResponse</strong> (return a fixed response) action. When this action coexists with other action types, it must be executed last.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroup</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateRuleRequestRuleActions build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActions self = new CreateRuleRequestRuleActions();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleActions setCorsConfig(CreateRuleRequestRuleActionsCorsConfig corsConfig) {
            this.corsConfig = corsConfig;
            return this;
        }
        public CreateRuleRequestRuleActionsCorsConfig getCorsConfig() {
            return this.corsConfig;
        }

        public CreateRuleRequestRuleActions setFixedResponseConfig(CreateRuleRequestRuleActionsFixedResponseConfig fixedResponseConfig) {
            this.fixedResponseConfig = fixedResponseConfig;
            return this;
        }
        public CreateRuleRequestRuleActionsFixedResponseConfig getFixedResponseConfig() {
            return this.fixedResponseConfig;
        }

        public CreateRuleRequestRuleActions setForwardGroupConfig(CreateRuleRequestRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public CreateRuleRequestRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public CreateRuleRequestRuleActions setInsertHeaderConfig(CreateRuleRequestRuleActionsInsertHeaderConfig insertHeaderConfig) {
            this.insertHeaderConfig = insertHeaderConfig;
            return this;
        }
        public CreateRuleRequestRuleActionsInsertHeaderConfig getInsertHeaderConfig() {
            return this.insertHeaderConfig;
        }

        public CreateRuleRequestRuleActions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public CreateRuleRequestRuleActions setRedirectConfig(CreateRuleRequestRuleActionsRedirectConfig redirectConfig) {
            this.redirectConfig = redirectConfig;
            return this;
        }
        public CreateRuleRequestRuleActionsRedirectConfig getRedirectConfig() {
            return this.redirectConfig;
        }

        public CreateRuleRequestRuleActions setRemoveHeaderConfig(CreateRuleRequestRuleActionsRemoveHeaderConfig removeHeaderConfig) {
            this.removeHeaderConfig = removeHeaderConfig;
            return this;
        }
        public CreateRuleRequestRuleActionsRemoveHeaderConfig getRemoveHeaderConfig() {
            return this.removeHeaderConfig;
        }

        public CreateRuleRequestRuleActions setRewriteConfig(CreateRuleRequestRuleActionsRewriteConfig rewriteConfig) {
            this.rewriteConfig = rewriteConfig;
            return this;
        }
        public CreateRuleRequestRuleActionsRewriteConfig getRewriteConfig() {
            return this.rewriteConfig;
        }

        public CreateRuleRequestRuleActions setTrafficLimitConfig(CreateRuleRequestRuleActionsTrafficLimitConfig trafficLimitConfig) {
            this.trafficLimitConfig = trafficLimitConfig;
            return this;
        }
        public CreateRuleRequestRuleActionsTrafficLimitConfig getTrafficLimitConfig() {
            return this.trafficLimitConfig;
        }

        public CreateRuleRequestRuleActions setTrafficMirrorConfig(CreateRuleRequestRuleActionsTrafficMirrorConfig trafficMirrorConfig) {
            this.trafficMirrorConfig = trafficMirrorConfig;
            return this;
        }
        public CreateRuleRequestRuleActionsTrafficMirrorConfig getTrafficMirrorConfig() {
            return this.trafficMirrorConfig;
        }

        public CreateRuleRequestRuleActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateRuleRequestRuleConditionsCookieConfigValues extends TeaModel {
        /**
         * <p>The cookie key.</p>
         * <ul>
         * <li>The value must be 1 to 100 characters in length.</li>
         * <li>The value can contain printable characters, wildcards asterisks (\*), and question marks (?). Letters must be lowercase.</li>
         * <li>The value cannot contain spaces or <code>;#[]{}\\|&lt;&gt;&amp;&quot;</code>.</li>
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
         * <li>The value must be 1 to 100 characters in length.</li>
         * <li>The value can contain printable characters, wildcards asterisks (\*), and question marks (?). Letters must be lowercase.</li>
         * <li>The value cannot contain spaces or <code>;#[]{}\\|&lt;&gt;&amp;&quot;</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRuleRequestRuleConditionsCookieConfigValues build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleConditionsCookieConfigValues self = new CreateRuleRequestRuleConditionsCookieConfigValues();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleConditionsCookieConfigValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRuleRequestRuleConditionsCookieConfigValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRuleRequestRuleConditionsCookieConfig extends TeaModel {
        /**
         * <p>The list of cookie values.</p>
         */
        @NameInMap("Values")
        public java.util.List<CreateRuleRequestRuleConditionsCookieConfigValues> values;

        public static CreateRuleRequestRuleConditionsCookieConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleConditionsCookieConfig self = new CreateRuleRequestRuleConditionsCookieConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleConditionsCookieConfig setValues(java.util.List<CreateRuleRequestRuleConditionsCookieConfigValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<CreateRuleRequestRuleConditionsCookieConfigValues> getValues() {
            return this.values;
        }

    }

    public static class CreateRuleRequestRuleConditionsHeaderConfig extends TeaModel {
        /**
         * <p>The header field key.</p>
         * <ul>
         * <li>The value must be 1 to 40 characters in length.</li>
         * <li>The value can contain letters a to z, digits, hyphens (-), and underscores (_).</li>
         * <li>Cookie and Host are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Port</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The list of header field values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRuleRequestRuleConditionsHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleConditionsHeaderConfig self = new CreateRuleRequestRuleConditionsHeaderConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleConditionsHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRuleRequestRuleConditionsHeaderConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRuleRequestRuleConditionsHostConfig extends TeaModel {
        /**
         * <p>The list of hostnames.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRuleRequestRuleConditionsHostConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleConditionsHostConfig self = new CreateRuleRequestRuleConditionsHostConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleConditionsHostConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRuleRequestRuleConditionsMethodConfig extends TeaModel {
        /**
         * <p>The list of request methods.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRuleRequestRuleConditionsMethodConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleConditionsMethodConfig self = new CreateRuleRequestRuleConditionsMethodConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleConditionsMethodConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRuleRequestRuleConditionsPathConfig extends TeaModel {
        /**
         * <p>The list of forwarding paths.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRuleRequestRuleConditionsPathConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleConditionsPathConfig self = new CreateRuleRequestRuleConditionsPathConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleConditionsPathConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRuleRequestRuleConditionsQueryStringConfigValues extends TeaModel {
        /**
         * <p>The query string key.</p>
         * <ul>
         * <li>The value must be 1 to 100 characters in length.</li>
         * <li>The value can contain printable characters, wildcards asterisks (\*), and question marks (?). Letters must be lowercase. The value cannot contain spaces or <code>#[]{}\\|&lt;&gt;&amp;&quot;</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The query string value.</p>
         * <ul>
         * <li>The value must be 1 to 128 characters in length.</li>
         * <li>The value can contain lowercase letters, printable characters, wildcards asterisks (\*), and question marks (?). The value cannot contain spaces or <code>#[]{}\\|&lt;&gt;&amp;&quot;</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRuleRequestRuleConditionsQueryStringConfigValues build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleConditionsQueryStringConfigValues self = new CreateRuleRequestRuleConditionsQueryStringConfigValues();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleConditionsQueryStringConfigValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRuleRequestRuleConditionsQueryStringConfigValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRuleRequestRuleConditionsQueryStringConfig extends TeaModel {
        /**
         * <p>The list of query strings.</p>
         */
        @NameInMap("Values")
        public java.util.List<CreateRuleRequestRuleConditionsQueryStringConfigValues> values;

        public static CreateRuleRequestRuleConditionsQueryStringConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleConditionsQueryStringConfig self = new CreateRuleRequestRuleConditionsQueryStringConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleConditionsQueryStringConfig setValues(java.util.List<CreateRuleRequestRuleConditionsQueryStringConfigValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<CreateRuleRequestRuleConditionsQueryStringConfigValues> getValues() {
            return this.values;
        }

    }

    public static class CreateRuleRequestRuleConditionsResponseHeaderConfig extends TeaModel {
        /**
         * <p>The header field key.</p>
         * <ul>
         * <li>The key must be 1 to 40 characters in length.</li>
         * <li>The key can contain lowercase letters, digits, hyphens (-), and underscores (_).</li>
         * <li>Cookie and Host are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The list of header field values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRuleRequestRuleConditionsResponseHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleConditionsResponseHeaderConfig self = new CreateRuleRequestRuleConditionsResponseHeaderConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleConditionsResponseHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRuleRequestRuleConditionsResponseHeaderConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRuleRequestRuleConditionsResponseStatusCodeConfig extends TeaModel {
        /**
         * <p>The list of response status codes.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRuleRequestRuleConditionsResponseStatusCodeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleConditionsResponseStatusCodeConfig self = new CreateRuleRequestRuleConditionsResponseStatusCodeConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleConditionsResponseStatusCodeConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRuleRequestRuleConditionsSourceIpConfig extends TeaModel {
        /**
         * <p>The list of source IP addresses for service traffic matching.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRuleRequestRuleConditionsSourceIpConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleConditionsSourceIpConfig self = new CreateRuleRequestRuleConditionsSourceIpConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleConditionsSourceIpConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRuleRequestRuleConditions extends TeaModel {
        /**
         * <p>The cookie configuration.</p>
         */
        @NameInMap("CookieConfig")
        public CreateRuleRequestRuleConditionsCookieConfig cookieConfig;

        /**
         * <p>The header field configuration.</p>
         */
        @NameInMap("HeaderConfig")
        public CreateRuleRequestRuleConditionsHeaderConfig headerConfig;

        /**
         * <p>The hostname configuration.</p>
         */
        @NameInMap("HostConfig")
        public CreateRuleRequestRuleConditionsHostConfig hostConfig;

        /**
         * <p>The request method configuration.</p>
         */
        @NameInMap("MethodConfig")
        public CreateRuleRequestRuleConditionsMethodConfig methodConfig;

        /**
         * <p>The forwarding path configuration.</p>
         */
        @NameInMap("PathConfig")
        public CreateRuleRequestRuleConditionsPathConfig pathConfig;

        /**
         * <p>The query string configuration.</p>
         */
        @NameInMap("QueryStringConfig")
        public CreateRuleRequestRuleConditionsQueryStringConfig queryStringConfig;

        /**
         * <p>The response header configuration.</p>
         */
        @NameInMap("ResponseHeaderConfig")
        public CreateRuleRequestRuleConditionsResponseHeaderConfig responseHeaderConfig;

        /**
         * <p>The response status code configuration.
         * [_single.params.RuleConditions.items.ResponseStatusCodeConfig.Values.</p>
         */
        @NameInMap("ResponseStatusCodeConfig")
        public CreateRuleRequestRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig;

        /**
         * <p>The configuration for source IP-based service traffic matching. This parameter is required and takes effect only when <strong>Type</strong> is set to <strong>SourceIP</strong>.</p>
         */
        @NameInMap("SourceIpConfig")
        public CreateRuleRequestRuleConditionsSourceIpConfig sourceIpConfig;

        /**
         * <p>The type of the forwarding rule. Valid values:</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateRuleRequestRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleConditions self = new CreateRuleRequestRuleConditions();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestRuleConditions setCookieConfig(CreateRuleRequestRuleConditionsCookieConfig cookieConfig) {
            this.cookieConfig = cookieConfig;
            return this;
        }
        public CreateRuleRequestRuleConditionsCookieConfig getCookieConfig() {
            return this.cookieConfig;
        }

        public CreateRuleRequestRuleConditions setHeaderConfig(CreateRuleRequestRuleConditionsHeaderConfig headerConfig) {
            this.headerConfig = headerConfig;
            return this;
        }
        public CreateRuleRequestRuleConditionsHeaderConfig getHeaderConfig() {
            return this.headerConfig;
        }

        public CreateRuleRequestRuleConditions setHostConfig(CreateRuleRequestRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public CreateRuleRequestRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

        public CreateRuleRequestRuleConditions setMethodConfig(CreateRuleRequestRuleConditionsMethodConfig methodConfig) {
            this.methodConfig = methodConfig;
            return this;
        }
        public CreateRuleRequestRuleConditionsMethodConfig getMethodConfig() {
            return this.methodConfig;
        }

        public CreateRuleRequestRuleConditions setPathConfig(CreateRuleRequestRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public CreateRuleRequestRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public CreateRuleRequestRuleConditions setQueryStringConfig(CreateRuleRequestRuleConditionsQueryStringConfig queryStringConfig) {
            this.queryStringConfig = queryStringConfig;
            return this;
        }
        public CreateRuleRequestRuleConditionsQueryStringConfig getQueryStringConfig() {
            return this.queryStringConfig;
        }

        public CreateRuleRequestRuleConditions setResponseHeaderConfig(CreateRuleRequestRuleConditionsResponseHeaderConfig responseHeaderConfig) {
            this.responseHeaderConfig = responseHeaderConfig;
            return this;
        }
        public CreateRuleRequestRuleConditionsResponseHeaderConfig getResponseHeaderConfig() {
            return this.responseHeaderConfig;
        }

        public CreateRuleRequestRuleConditions setResponseStatusCodeConfig(CreateRuleRequestRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig) {
            this.responseStatusCodeConfig = responseStatusCodeConfig;
            return this;
        }
        public CreateRuleRequestRuleConditionsResponseStatusCodeConfig getResponseStatusCodeConfig() {
            return this.responseStatusCodeConfig;
        }

        public CreateRuleRequestRuleConditions setSourceIpConfig(CreateRuleRequestRuleConditionsSourceIpConfig sourceIpConfig) {
            this.sourceIpConfig = sourceIpConfig;
            return this;
        }
        public CreateRuleRequestRuleConditionsSourceIpConfig getSourceIpConfig() {
            return this.sourceIpConfig;
        }

        public CreateRuleRequestRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateRuleRequestTag extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRuleRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestTag self = new CreateRuleRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRuleRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
