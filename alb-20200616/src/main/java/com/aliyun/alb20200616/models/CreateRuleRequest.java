// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
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
     * <p>The direction to which the forwarding rule is applied. Valid values:</p>
     * <ul>
     * <li><strong>Request</strong> (default): The forwarding rule is applied to the requests received by ALB.</li>
     * <li><strong>Response</strong>: The forwarding rule is applied to the responses returned by backend servers.</li>
     * </ul>
     * <blockquote>
     * <p>Basic ALB instances do not support the <strong>Response</strong> value.</p>
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
     * <p>The listener ID of the ALB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The priority of the forwarding rule. Valid values: <strong>1 to 10000</strong>. A smaller value indicates a higher priority.</p>
     * <blockquote>
     * <p>The priorities of the forwarding rules created for the same listener must be unique.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The maximum cache time of dry run requests in the browser. Unit: seconds.</p>
     * <p>Valid values: <strong>-1</strong> to <strong>172800</strong>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleActions")
    public java.util.List<CreateRuleRequestRuleActions> ruleActions;

    /**
     * <p>The configuration of the source IP-based forwarding rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleConditions")
    public java.util.List<CreateRuleRequestRuleConditions> ruleConditions;

    /**
     * <p>The name of the forwarding rule.</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>It can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-doc</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

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
         * <p>Specifies whether credentials can be carried in CORS requests. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
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
         * <p>The maximum cache time of dry run requests in the browser. Unit: seconds.</p>
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
         * <p>The content of the custom response. The content can be up to 1 KB in size and can contain only ASCII characters.</p>
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
         * <p>HTTP_200</p>
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
         * <p>The timeout period of sessions. Unit: seconds. Valid values: <strong>1</strong> to <strong>86400</strong>. Default value: <strong>1000</strong>.</p>
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
         * <li>If only one destination server group exists and you do not specify a weight, the default value <strong>100</strong> is used.</li>
         * <li>If more than one destination server group exists, you must specify weights.</li>
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
         * <p>The configuration of session persistence for server groups.</p>
         */
        @NameInMap("ServerGroupStickySession")
        public CreateRuleRequestRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession;

        /**
         * <p>The server groups to which requests are distributed. Each forwarding rule supports at most five server groups.</p>
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
         * <p>The key of the header. The key must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The header key specified by <strong>InsertHeaderConfig</strong> must be unique.</p>
         * <blockquote>
         * <p>You cannot specify the following header keys (case-insensitive): <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, and <code>authority</code>.</p>
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
         * <li><p>If <strong>ValueType</strong> is set to <strong>SystemDefined</strong>, you can specify one of the following header values:</p>
         * <ul>
         * <li><strong>ClientSrcPort</strong>: the client port.</li>
         * <li><strong>ClientSrcIp</strong>: the client IP address.</li>
         * <li><strong>Protocol</strong>: the request protocol (HTTP or HTTPS).</li>
         * <li><strong>SLBId</strong>: the ID of the ALB instance.</li>
         * <li><strong>SLBPort</strong>: the listening port.</li>
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
         * <p>The type of header. Valid values:</p>
         * <ul>
         * <li><strong>UserDefined</strong>: a custom header</li>
         * <li><strong>ReferenceHeader</strong>: a header that references one of the request headers</li>
         * <li><strong>SystemDefined</strong>: a header predefined by the system</li>
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
         * <p>The hostname to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><p><strong>${host}</strong> (default): If you set the value to ${host}, you cannot append other characters.</p>
         * </li>
         * <li><p>A custom value. Make sure that the custom value meets the following requirements:</p>
         * <ul>
         * <li>The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, and the following special characters: - . \* = ~ _ + \ ^ ! $ &amp; | ( ) [ ] ?.</li>
         * <li>The hostname must contain at least one period (.) but cannot start or end with a period (.).</li>
         * <li>The rightmost domain label can contain only letters and wildcards, and cannot contain digits or hyphens (-). The leftmost <code>domain label</code> can be an asterisk (\*).</li>
         * <li>The domain labels cannot start or end with a hyphen (-).</li>
         * <li>You can use asterisks (\*) and question marks (?) anywhere in a domain label as wildcard characters.</li>
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
         * <li><p>Default value: <strong>${path}</strong>. \<em>\</em>${host}**, <strong>${protocol}</strong>, and **${port}\<em>\</em> are also supported. Each variable can be specified only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.</p>
         * </li>
         * <li><p>A custom value. You must make sure that the custom value meets the following requirements:</p>
         * <ul>
         * <li>The value must be 1 to 128 characters in length, and can contain asterisks (\*) and question marks (?) as wildcards. The value is case-sensitive.</li>
         * <li>It must start with a forward slash (/) and can contain letters, digits, and the following special characters: <code>$ - _ .+ / &amp; ~ @ :</code>. It cannot contain the following special characters: <code>&quot; % # ; ! ( ) [ ] ^ , &quot;</code>. You can use asterisks (\*) and question marks (?) as wildcard characters.</li>
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
         * <li><strong>${protocol}</strong> (default): If you set the value to ${protocol}, you cannot add other characters to the value.</li>
         * <li><strong>HTTP</strong> or <strong>HTTPS</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>HTTPS listeners support only HTTPS to HTTPS redirects.</p>
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
         * <li><p>Default value: <strong>${query}</strong>. \<em>\</em>${host}**, <strong>${protocol}</strong>, and **${port}\<em>\</em> are also supported. Each variable can be specified only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.</p>
         * </li>
         * <li><p>A custom value. You must make sure that the custom value meets the following requirements:</p>
         * <ul>
         * <li>The value must be 1 to 128 characters in length.</li>
         * <li>It can contain printable characters, except space characters, the special characters <code># [ ] { } \\ | &lt; &gt; &amp;</code>, and uppercase letters.</li>
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
         * <p>The hostname to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><p><strong>${host}</strong> (default): If you set the value to ${host}, you cannot append other characters.</p>
         * </li>
         * <li><p>If you want to specify a custom value, make sure that the following requirements are met:</p>
         * <ul>
         * <li>The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, and the following special characters: - . \* = ~ _ + \ ^ ! $ &amp; | ( ) [ ] ?.</li>
         * <li>The hostname must contain at least one period (.) but cannot start or end with a period (.).</li>
         * <li>The rightmost domain label can contain only letters and wildcards, and cannot contain digits or hyphens (-). The leftmost <code>domain label</code> can be an asterisk (\*).</li>
         * <li>The domain labels cannot start or end with a hyphen (-). You can use asterisks (\*) and question marks (?) anywhere in a domain label as wildcard characters.</li>
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
         * <li><p>Default value: <strong>${path}</strong>. \<em>\</em>${host}**, <strong>${protocol}</strong>, and **${port}\<em>\</em> are also supported. Each variable can be specified only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.</p>
         * </li>
         * <li><p>A custom value. You must make sure that the custom value meets the following requirements:</p>
         * <ul>
         * <li>The value must be 1 to 128 characters in length, and can contain asterisks (\*) and question marks (?) as wildcards. The value is case-sensitive.</li>
         * <li>It must start with a forward slash (/) and can contain letters, digits, and the following special characters: <code>$ - _ .+ / &amp; ~ @ :</code>. It cannot contain the following special characters: <code>&quot; % # ; ! ( ) [ ] ^ , &quot;</code>. You can use asterisks (\*) and question marks (?) as wildcard characters.</li>
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
         * <p>The query string of the URL to which requests are redirected.</p>
         * <ul>
         * <li><p>Default value: <strong>${query}</strong>. \<em>\</em>${host}**, <strong>${protocol}</strong>, and **${port}\<em>\</em> are also supported. Each variable can be specified only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.</p>
         * </li>
         * <li><p>A custom value. You must make sure that the custom value meets the following requirements:</p>
         * <ul>
         * <li>The value must be 1 to 128 characters in length.</li>
         * <li>It can contain printable characters, except space characters, the special characters <code># [ ] { } \\ | &lt; &gt; &amp;</code>, and uppercase letters.</li>
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
         * <p>The QPS of each IP address. Valid values: <strong>1 to 100000</strong>.</p>
         * <blockquote>
         * <p>If both the <strong>QPS</strong> and <strong>PerIpQps</strong> properties are specified, make sure that the value of the <strong>QPS</strong> property is smaller than the value of the PerIpQps property.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("PerIpQps")
        public Integer perIpQps;

        /**
         * <p>The queries per second (QPS). Valid values: <strong>1 to 100000</strong>.</p>
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
         * <p>The ID of the server group.</p>
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
         * <p>The configuration of the server group to which traffic is mirrored.</p>
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
         * <p>The configuration of the server group to which traffic is mirrored.</p>
         */
        @NameInMap("MirrorGroupConfig")
        public CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig;

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
         * <p>The origins allowed.</p>
         */
        @NameInMap("CorsConfig")
        public CreateRuleRequestRuleActionsCorsConfig corsConfig;

        /**
         * <p>The configuration of the custom response.</p>
         */
        @NameInMap("FixedResponseConfig")
        public CreateRuleRequestRuleActionsFixedResponseConfig fixedResponseConfig;

        /**
         * <p>The server groups to which requests are distributed. Each forwarding rule supports at most five server groups.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public CreateRuleRequestRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The configuration of the header to be inserted.</p>
         */
        @NameInMap("InsertHeaderConfig")
        public CreateRuleRequestRuleActionsInsertHeaderConfig insertHeaderConfig;

        /**
         * <p>The priority of the action. Valid values: <strong>1 to 50000</strong>. A smaller value indicates a higher priority. The actions of a forwarding rule are applied in descending order of priority. This parameter is required. The priority of each action within a forwarding rule must be unique.</p>
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
         * <p>When you configure the <strong>RedirectConfig</strong> action, you can use the default value only for the <strong>httpCode</strong> parameter. Do not use the default values for the other parameters.</p>
         * </blockquote>
         */
        @NameInMap("RedirectConfig")
        public CreateRuleRequestRuleActionsRedirectConfig redirectConfig;

        @NameInMap("RemoveHeaderConfig")
        public CreateRuleRequestRuleActionsRemoveHeaderConfig removeHeaderConfig;

        /**
         * <p>The rewrite configuration.</p>
         * <blockquote>
         * <p>If multiple actions are configured within a forwarding rule, you must set <strong>RewriteConfig</strong> to the value of <strong>ForwardGroup</strong>.</p>
         * </blockquote>
         */
        @NameInMap("RewriteConfig")
        public CreateRuleRequestRuleActionsRewriteConfig rewriteConfig;

        /**
         * <p>The action to throttle traffic.</p>
         */
        @NameInMap("TrafficLimitConfig")
        public CreateRuleRequestRuleActionsTrafficLimitConfig trafficLimitConfig;

        /**
         * <p>The action to mirror traffic.</p>
         */
        @NameInMap("TrafficMirrorConfig")
        public CreateRuleRequestRuleActionsTrafficMirrorConfig trafficMirrorConfig;

        /**
         * <p>The action type. Valid values:</p>
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
         * <li><strong>FinalType</strong>: the last action to be performed in a forwarding rule. Each forwarding rule can contain only one FinalType action. You can specify the <strong>ForwardGroup</strong>, <strong>Redirect</strong>, or <strong>FixedResponse</strong> action as the FinalType action.</li>
         * <li><strong>ExtType</strong>: the action or the actions to be performed before the <strong>FinalType</strong> action. A forwarding rule can contain one or more <strong>ExtType</strong> actions. To specify this parameter, you must also specify <strong>FinalType</strong>. You can specify multiple <strong>InsertHeader</strong> actions or one <strong>Rewrite</strong> action.</li>
         * </ul>
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
         * <p>The key of the cookie.</p>
         * <ul>
         * <li>The key must be 1 to 100 characters in length.</li>
         * <li>You can use asterisks (\*) and question marks (?) as wildcard characters.</li>
         * <li>The key can contain printable characters, except uppercase letters, space characters, and the following special characters: <code>; # [ ] { } \\ | &lt; &gt; &amp;</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the cookie.</p>
         * <ul>
         * <li>The value must be 1 to 100 characters in length.</li>
         * <li>You can use asterisks (\*) and question marks (?) as wildcard characters.</li>
         * <li>The value can contain printable characters, except uppercase letters, space characters, and the following special characters: <code>; # [ ] { } \\ | &lt; &gt; &amp;</code>.</li>
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
         * <p>The cookie values.</p>
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
         * <p>The key of the header.</p>
         * <ul>
         * <li>The key must be 1 to 40 characters in length.</li>
         * <li>It can contain lowercase letters, digits, hyphens (-), and underscores (_).</li>
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
         * <p>The hostname.</p>
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
         * <p>The request methods.</p>
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
         * <p>The path.</p>
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
         * <p>The key of the query string.</p>
         * <ul>
         * <li>The key must be 1 to 100 characters in length.</li>
         * <li>You can use asterisks (\*) and question marks (?) as wildcards. The key can contain printable characters, except uppercase letters, space characters, and the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>.</li>
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
         * <li>The value must be 1 to 128 characters in length.</li>
         * <li>It can contain printable characters, except uppercase letters, space characters, and the following special characters: <code># [ ] { } \\ | &lt; &gt; &amp;</code>. You can use asterisks (\*) and question marks (?) as wildcard characters.</li>
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
         * <p>The query strings.</p>
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
        @NameInMap("Key")
        public String key;

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
         * <p>The configuration of the source IP-based forwarding rule.</p>
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
         * <p>The configurations of the cookies.</p>
         */
        @NameInMap("CookieConfig")
        public CreateRuleRequestRuleConditionsCookieConfig cookieConfig;

        /**
         * <p>The configuration of the header.</p>
         */
        @NameInMap("HeaderConfig")
        public CreateRuleRequestRuleConditionsHeaderConfig headerConfig;

        /**
         * <p>The configurations of the host.</p>
         */
        @NameInMap("HostConfig")
        public CreateRuleRequestRuleConditionsHostConfig hostConfig;

        /**
         * <p>The configurations of the request methods.</p>
         */
        @NameInMap("MethodConfig")
        public CreateRuleRequestRuleConditionsMethodConfig methodConfig;

        /**
         * <p>The configurations of the URLs.</p>
         */
        @NameInMap("PathConfig")
        public CreateRuleRequestRuleConditionsPathConfig pathConfig;

        /**
         * <p>The configurations of the query strings.</p>
         */
        @NameInMap("QueryStringConfig")
        public CreateRuleRequestRuleConditionsQueryStringConfig queryStringConfig;

        @NameInMap("ResponseHeaderConfig")
        public CreateRuleRequestRuleConditionsResponseHeaderConfig responseHeaderConfig;

        @NameInMap("ResponseStatusCodeConfig")
        public CreateRuleRequestRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig;

        /**
         * <p>The configuration of the source IP-based forwarding rule. This parameter is required and takes effect only when <strong>Type</strong> is set to <strong>SourceIP</strong>.</p>
         */
        @NameInMap("SourceIpConfig")
        public CreateRuleRequestRuleConditionsSourceIpConfig sourceIpConfig;

        /**
         * <p>The type of forwarding rule. Valid values:</p>
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
        @NameInMap("Key")
        public String key;

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
