// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateRulesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and sends the request. If the request passes the dry run, a `2xx HTTP` status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The listener ID of the ALB instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The forwarding rules. You can specify at most 10 forwarding rules in each call.</p>
     * <br>
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
         * <br>
         * <p>*   **on**: allows credentials to be carried in CORS requests.</p>
         * <p>*   **off**: does not allow credentials to be carried in CORS requests.</p>
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
         * <br>
         * <p>Valid values: **-1** to **172800**.</p>
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
         * <p>The content of the custom response. The content can be up to 1 KB in size and can contain only ASCII characters.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The format of the content. Valid values:</p>
         * <br>
         * <p>*   **text/plain**</p>
         * <p>*   **text/css**</p>
         * <p>*   **text/html**</p>
         * <p>*   **application/javascript**</p>
         * <p>*   **application/json**</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The HTTP status code in the response. Valid values: **HTTP_2xx**, **HTTP_4xx**, and **HTTP_5xx**. **x** must be a digit.</p>
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
         * <br>
         * <p>*   **true**: enables session persistence.</p>
         * <p>*   **false** (default): disables session persistence.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The timeout period of sessions. Unit: seconds. Valid values: **1 to 86400**.</p>
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
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The weight of the server group. A larger value specifies a higher weight. A server group with a higher weight receives more requests. Valid values: **0** to **100**.</p>
         * <br>
         * <p>*   If only one destination server group exists and you do not specify a weight, the default value **100** is used.</p>
         * <p>*   If more than one destination server group exists, you must specify weights.</p>
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
         * <p>The configuration of session persistence for server groups.</p>
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
         * <p>The key of the header. The key must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The header key specified by **InsertHeaderConfig** must be unique.</p>
         * <br>
         * <p>>  You cannot specify the following header keys: `slb-id`, `slb-ip`, `x-forwarded-for`, `x-forwarded-proto`, `x-forwarded-eip`, `x-forwarded-port`, `x-forwarded-client-srcport`, `connection`, `upgrade`, `content-length`, `transfer-encoding`, `keep-alive`, `te`, `host`, `cookie`, `remoteip`, and `authority`. The header keys are case-insensitive.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the header.</p>
         * <br>
         * <p>*   If **ValueType** is set to **SystemDefined**, one of the following values is supported:</p>
         * <br>
         * <p>    *   **ClientSrcPort**: the client port.</p>
         * <p>    *   **ClientSrcIp**: the client IP address.</p>
         * <p>    *   **Protocol**: the request protocol (HTTP or HTTPS).</p>
         * <p>    *   **SLBId**: the ID of the ALB instance.</p>
         * <p>    *   **SLBPort**: the listener port.</p>
         * <br>
         * <p>*   If **ValueType** is set to **UserDefined**, a custom header value is supported. The header value must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and smaller than 127`. You can use asterisks (\\*) and question marks (?) as wildcard characters. The header value cannot start or end with a space character.</p>
         * <br>
         * <p>*   If **ValueType** is set to **ReferenceHeader**, you can reference one of the request headers. The header value must be 1 to 128 characters in length, and can contain lowercase letters, digits, underscores (_), and hyphens (-).</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The type of the header. Valid values:</p>
         * <br>
         * <p>*   **UserDefined**: a custom header</p>
         * <p>*   **ReferenceHeader**: a header that references one of the request headers</p>
         * <p>*   **SystemDefined**: a system-defined header</p>
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
         * <p>The hostname to which requests are redirected. Valid values:</p>
         * <br>
         * <p>*   **${host}** (default): If ${host} is returned, no other character is appended.</p>
         * <br>
         * <p>*   Limits on the value:</p>
         * <br>
         * <p>    *   The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), and periods (.). Asterisks (\\*) and question marks (?) can be used as wildcards.</p>
         * <p>    *   The hostname contains at least one period (.) but does not start or end with a period (.).</p>
         * <p>    *   The rightmost domain label can contain only letters and wildcard characters. It does not contain digits or hyphens (-).</p>
         * <p>    *   The domain labels do not start or end with hyphens (-).</p>
         * <p>    *   You can use asterisks (\\*) and question marks (?) as wildcards anywhere in a domain label.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The HTTP status code that indicates the redirect type. Valid values: **301**, **302**, **303**, **307**, and **308**.</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        /**
         * <p>The path to which requests are redirected. Valid values:</p>
         * <br>
         * <p>*   Default value: **${path}**. **${host}**, **${protocol}**, and **${port}** are also supported. Each variable can be specified only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.</p>
         * <br>
         * <p>*   Limits on the value:</p>
         * <br>
         * <p>    *   The path must be 1 to 128 characters in length.</p>
         * <p>    *   It must start with a forward slash (/) and can contain letters, digits, and the following special characters: `$ - _ .+ / & ~ @ :`. It cannot contain the following special characters: `" % # ; ! ( ) [ ]^ , "`. You can use asterisks (\\*) and question marks (?) as wildcard characters.</p>
         * <p>    *   The path is case-sensitive.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port to which requests are distributed.</p>
         * <br>
         * <p>*   **${port}** (default): If you set the value to ${port}, you cannot add other characters to the value.</p>
         * <p>*   Other valid values: **1 to 63335**.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The redirect protocol. Valid values:</p>
         * <br>
         * <p>*   **${protocol}** (default): If ${protocol} is returned, no other character is appended.</p>
         * <p>*   **HTTP** or **HTTPS**.</p>
         * <br>
         * <p>>  HTTPS listeners support only HTTPS to HTTPS redirects.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The query string of the URL to which requests are redirected.</p>
         * <br>
         * <p>*   Default value: **${query}**. **${host}**, **${protocol}**, and **${port}** are also supported. Each variable can be specified only once. The preceding variables can be used at the same time or combined with a custom value.</p>
         * <br>
         * <p>*   Limits on the value:</p>
         * <br>
         * <p>    *   The query string must be 1 to 128 characters in length.</p>
         * <p>    *   It can contain printable characters, except space characters, the special characters `# [ ] { } \\ | < > &`, and uppercase letters.</p>
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
         * <p>The key of the header to be removed. The key must be 1 to 40 characters in length and can contain letters, digits, underscores, and hyphens (-). The header key must be unique.</p>
         * <br>
         * <p>*   You cannot specify the following header keys for an inbound forwarding rule: `slb-id`, `slb-ip`, `x-forwarded-for`, `x-forwarded-proto`, `x-forwarded-eip`, `x-forwarded-port`, `x-forwarded-client-srcport`, `connection`, `upgrade`, `content-length`, `transfer-encoding`, `keep-alive`, `te`, `host`, `cookie`, `remoteip`, and `authority`. The preceding keys are case-insensitive.</p>
         * <p>*   You cannot specify the following header keys for an outbound forwarding rule: `connection`, `upgrade`, `content-length`, and `transfer-encoding`. The preceding keys are case-insensitive.</p>
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
         * <p>The hostname to which requests are redirected. Valid values:</p>
         * <br>
         * <p>*   **${host}** (default): If you set the value to ${host}, you cannot append other characters.</p>
         * <br>
         * <p>*   A custom value that meets the following requirements:</p>
         * <br>
         * <p>    *   The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), and periods (.). You can use asterisks (\\*) and question marks (?) as wildcard characters.</p>
         * <p>    *   The hostname contains at least one period (.) but does not start or end with a period (.).</p>
         * <p>    *   The rightmost domain label can contain only letters and wildcard characters. It does not contain digits or hyphens (-).</p>
         * <p>    *   The domain labels do not start or end with hyphens (-). You can use asterisks (\\*) and question marks (?) anywhere in a domain label as wildcard characters.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The path to which requests are redirected. Valid values:</p>
         * <br>
         * <p>*   Default value: **${path}**. **${host}**, **${protocol}**, and **${port}** are also supported. Each variable can be specified only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.</p>
         * <br>
         * <p>*   Limits on the value:</p>
         * <br>
         * <p>    *   The path must be 1 to 128 characters in length.</p>
         * <p>    *   It must start with a forward slash (/) and can contain letters, digits, and the following special characters: `$ - _ .+ / & ~ @ :`. It cannot contain the following special characters: `" % # ; ! ( ) [ ]^ , "`. You can use asterisks (\\*) and question marks (?) as wildcard characters.</p>
         * <p>    *   The path is case-sensitive.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The query string of the URL to which requests are redirected.</p>
         * <br>
         * <p>*   Default value: **${query}**. **${host}**, **${protocol}**, and **${port}** are also supported. Each variable can be specified only once. The preceding variables can be used at the same time or combined with a custom value.</p>
         * <br>
         * <p>*   Limits on the value:</p>
         * <br>
         * <p>    *   The query string must be 1 to 128 characters in length.</p>
         * <p>    *   It can contain printable characters, except space characters, the special characters `# [ ] { } \\ | < > &`, and uppercase letters.</p>
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
         * <p>The QPS of each IP address. Value range: **1 to 1000000**.</p>
         * <br>
         * <p>>  If **QPS** and PerIpQps are specified, the value of **PerIpQps** must be smaller than the value of **QPS**.</p>
         */
        @NameInMap("PerIpQps")
        public Integer perIpQps;

        /**
         * <p>The queries per second (QPS). Value range: **1 to 1000000**.</p>
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
         * <p>The type of destination to which network traffic is mirrored. Valid values:</p>
         * <br>
         * <p>*   **ForwardGroupMirror**: a server group.</p>
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
         * <p>The configuration of the custom response. You can specify at most 20 responses.</p>
         */
        @NameInMap("FixedResponseConfig")
        public CreateRulesRequestRulesRuleActionsFixedResponseConfig fixedResponseConfig;

        /**
         * <p>The configuration of the server group. You can add at most 20 server groups.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public CreateRulesRequestRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The configuration of the header to be inserted. You can specify at most 20 headers.</p>
         */
        @NameInMap("InsertHeaderConfig")
        public CreateRulesRequestRulesRuleActionsInsertHeaderConfig insertHeaderConfig;

        /**
         * <p>The priority of the action. Valid values: **1 to 50000**. A lower value indicates a higher priority. The actions of a forwarding rule are applied in descending order of priority. This parameter is required. The priority of each action within a forwarding rule must be unique. You can specify priorities for at most 20 actions.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The redirect configuration. You can specify at most 20 redirects.</p>
         */
        @NameInMap("RedirectConfig")
        public CreateRulesRequestRulesRuleActionsRedirectConfig redirectConfig;

        /**
         * <p>The configuration of the header to be removed.</p>
         */
        @NameInMap("RemoveHeaderConfig")
        public CreateRulesRequestRulesRuleActionsRemoveHeaderConfig removeHeaderConfig;

        /**
         * <p>The rewrite configuration. You can specify at most 20 rewrites.</p>
         */
        @NameInMap("RewriteConfig")
        public CreateRulesRequestRulesRuleActionsRewriteConfig rewriteConfig;

        /**
         * <p>The configuration of traffic throttling. You can add at most 20 configuration records.</p>
         */
        @NameInMap("TrafficLimitConfig")
        public CreateRulesRequestRulesRuleActionsTrafficLimitConfig trafficLimitConfig;

        /**
         * <p>The configuration of traffic mirroring. You can add at most 20 traffic mirrors.</p>
         */
        @NameInMap("TrafficMirrorConfig")
        public CreateRulesRequestRulesRuleActionsTrafficMirrorConfig trafficMirrorConfig;

        /**
         * <p>The action type. You can specify at most 11 types of actions. Valid values:</p>
         * <br>
         * <p>*   **ForwardGroup**: distributes requests to multiple vServer groups.</p>
         * <p>*   **Redirect**: redirects a request.</p>
         * <p>*   **FixedResponse**: returns a custom response.</p>
         * <p>*   **Rewrite**: rewrites a request.</p>
         * <p>*   **InsertHeader**: inserts a header.</p>
         * <p>*   **RemoveHeaderConfig:** deletes the header of a request.</p>
         * <p>*   **TrafficLimit**: throttles traffic.</p>
         * <p>*   **trafficMirror**: mirrors network traffic.</p>
         * <p>*   **Cors**: enables cross-origin resource sharing (CORS).</p>
         * <br>
         * <p>The following action types are supported:</p>
         * <br>
         * <p>*   **FinalType**: the last action to be performed in a forwarding rule. Each forwarding rule can contain only one FinalType action. You can specify a **ForwardGroup**, **Redirect**, or **FixedResponse** action as the FinalType action.</p>
         * <p>*   **ExtType**: one or more actions to be performed before the **FinalType** action. A forwarding rule can contain one or more **ExtType** actions. To specify an ExtType action, you must specify a **FinalType** action. You can specify multiple **InsertHeader** actions or one **Rewrite** action.</p>
         * <br>
         * <p>This parameter is required.</p>
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
         * <p>The key of the cookie.</p>
         * <br>
         * <p>*   The key must be 1 to 100 characters in length.</p>
         * <p>*   You can use asterisks (\\*) and question marks (?) as wildcard characters.</p>
         * <p>*   It can contain printable characters, except uppercase letters, space characters, and the following special characters: `; # [ ] { } \\ | < > &`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the cookie.</p>
         * <br>
         * <p>*   The value must be 1 to 100 characters in length.</p>
         * <p>*   You can use asterisks (\\*) and question marks (?) as wildcard characters.</p>
         * <p>*   It can contain printable characters, except uppercase letters, space characters, and the following special characters: `; # [ ] { } \\ | < > &`.</p>
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
         * <p>The key-value pairs of cookies.</p>
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
         * <br>
         * <p>*   The key must be 1 to 40 characters in length.</p>
         * <p>*   It can contain lowercase letters, digits, hyphens (-), and underscores (_).</p>
         * <p>*   You cannot specify Cookie or Host.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of the header.</p>
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
         * <p>The hostnames.</p>
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
         * <p>The paths.</p>
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
         * <br>
         * <p>*   It must be 1 to 100 characters in length.</p>
         * <p>*   You can use asterisks (\\*) and question marks (?) as wildcards. The key can contain printable characters, excluding uppercase letters, space characters, and the following special characters: `# [ ] { } \\ | < > &`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the query string.</p>
         * <br>
         * <p>*   The value must be 1 to 128 characters in length.</p>
         * <p>*   It can contain printable characters, excluding uppercase letters, space characters, and the following special characters: `# [ ] { } \\ | < > &`. You can use asterisks (\\*) and question marks (?) as wildcards.</p>
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
         * <br>
         * <p>*   The key must be 1 to 40 characters in length.</p>
         * <p>*   It can contain lowercase letters, digits, hyphens (-), and underscores (_).</p>
         * <p>*   You cannot specify Cookie or Host.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of the header.</p>
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
         * <p>The configuration of the source IP addresses based on which user traffic is matched.</p>
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
         * <p>The configurations of the cookies. You can add at most 20 cookies.</p>
         */
        @NameInMap("CookieConfig")
        public CreateRulesRequestRulesRuleConditionsCookieConfig cookieConfig;

        /**
         * <p>The configuration of the header. You can add at most 20 headers.</p>
         */
        @NameInMap("HeaderConfig")
        public CreateRulesRequestRulesRuleConditionsHeaderConfig headerConfig;

        /**
         * <p>The configurations of the hosts. You can specify up to 20 resources.</p>
         */
        @NameInMap("HostConfig")
        public CreateRulesRequestRulesRuleConditionsHostConfig hostConfig;

        /**
         * <p>The configurations of the request methods. You can specify at most 20 request methods.</p>
         */
        @NameInMap("MethodConfig")
        public CreateRulesRequestRulesRuleConditionsMethodConfig methodConfig;

        /**
         * <p>The configurations of the paths. You can specify at most 20 paths.</p>
         */
        @NameInMap("PathConfig")
        public CreateRulesRequestRulesRuleConditionsPathConfig pathConfig;

        /**
         * <p>The configuration of the query conditions. You can specify at most 20 query conditions.</p>
         */
        @NameInMap("QueryStringConfig")
        public CreateRulesRequestRulesRuleConditionsQueryStringConfig queryStringConfig;

        /**
         * <p>The configuration of the header. You can add at most 20 headers.</p>
         */
        @NameInMap("ResponseHeaderConfig")
        public CreateRulesRequestRulesRuleConditionsResponseHeaderConfig responseHeaderConfig;

        /**
         * <p>The configurations of the response status codes.</p>
         */
        @NameInMap("ResponseStatusCodeConfig")
        public CreateRulesRequestRulesRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig;

        /**
         * <p>The configuration of the source IP addresses based on which user traffic is matched. This parameter is required and takes effect only when **Type** is set to **SourceIP**. You can specify at most five values for **SourceIp**.</p>
         */
        @NameInMap("SourceIpConfig")
        public CreateRulesRequestRulesRuleConditionsSourceIpConfig sourceIpConfig;

        /**
         * <p>The type of forwarding rule. You can specify at most seven types. Valid values:</p>
         * <br>
         * <p>*   **Host**: Responses are forwarded based on hosts.</p>
         * <p>*   **Path**: Responses are forwarded based on paths.</p>
         * <p>*   **Header**: Responses are forwarded based on HTTP headers.</p>
         * <p>*   **QueryString**: Responses are forwarded based on query strings.</p>
         * <p>*   **Method**: Responses are forwarded based on request methods.</p>
         * <p>*   **Cookie**: Responses are forwarded based on cookies.</p>
         * <p>*   **SourceIp:**: Responses are forwarded based on source IP addresses.</p>
         * <p>*   **ResponseHeader**: Responses are forwarded based on HTTP response headers.</p>
         * <p>*   **ResponseStatusCode**: Responses are forwarded based on response status codes.</p>
         * <br>
         * <p>This parameter is required.</p>
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
         * <p>The key of the tag. The tag key can be up to 128 characters in length, and cannot start with acs: or aliyun. It cannot contain http:// or https://.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The tag value can be up to 128 characters in length, and cannot start with acs: or aliyun. It cannot contain http:// or https://.</p>
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
         * <br>
         * <p>*   **Request** (default): The forwarding rule is applied to the client requests received by ALB.</p>
         * <p>*   **Response**: The forwarding rule is applied to the responses returned by backend servers.</p>
         * <br>
         * <p>>  Basic ALB instances do not support forwarding rules of the **Response** type.</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The priority of the forwarding rule. Valid values: **1** to **10000**. A lower value specifies a higher priority. You can specify priorities for at most 10 forwarding rules.</p>
         * <br>
         * <p>>  The priority of each forwarding rule added to a listener must be unique.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The actions of the forwarding rule.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleActions")
        public java.util.List<CreateRulesRequestRulesRuleActions> ruleActions;

        /**
         * <p>The conditions of the forwarding rule.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<CreateRulesRequestRulesRuleConditions> ruleConditions;

        /**
         * <p>The name of the forwarding rule. You can name at most 20 forwarding rules.</p>
         * <br>
         * <p>*   The name must be 2 to 128 characters in length.</p>
         * <p>*   It can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * <br>
         * <p>This parameter is required.</p>
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
