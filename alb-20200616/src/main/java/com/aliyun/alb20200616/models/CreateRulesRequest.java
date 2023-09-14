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
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The direction to which the forwarding rule is applied. You can specify only one direction. Valid values:</p>
     * <br>
     * <p>*   **Request** (default): The forwarding rule is applied to the client requests received by ALB.</p>
     * <p>*   **Response**: The forwarding rule is applied to the responses returned by backend servers.</p>
     * <br>
     * <p>> Basic ALB instances do not support the **Response** value.</p>
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
         * <p>The key of the header.</p>
         * <br>
         * <p>*   The key must be 1 to 40 characters in length.</p>
         * <p>*   It can contain letters, digits, hyphens (-), and underscores (\_).</p>
         * <p>*   You cannot set Cookie or Host.</p>
         */
        @NameInMap("AllowCredentials")
        public String allowCredentials;

        @NameInMap("AllowHeaders")
        public java.util.List<String> allowHeaders;

        @NameInMap("AllowMethods")
        public java.util.List<String> allowMethods;

        @NameInMap("AllowOrigin")
        public java.util.List<String> allowOrigin;

        @NameInMap("ExposeHeaders")
        public java.util.List<String> exposeHeaders;

        /**
         * <p>The value of the header. The header values within a forwarding rule must be unique.</p>
         * <br>
         * <p>*   The value must be 1 to 128 characters in length.</p>
         * <p>*   It can contain printable characters whose ASCII values are `greater than or equal to 32 and lower than 127`. You can use asterisks (\*) and question marks (?) as wildcard characters.</p>
         * <p>*   The value cannot start or end with a space character.</p>
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
         * <p>The weight of the server group. A larger value indicates a higher weight. A server group with a higher weight receives more requests. Valid values: **1 to 100**. Default value: **100**.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Specifies whether to enable session persistence. Valid values:</p>
         * <br>
         * <p>*   **true**: enables session persistence.</p>
         * <p>*   **false** (default): disables session persistence.</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The timeout period of sessions. Unit: seconds. Valid values: **1 to 86400**.</p>
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
         * <p>The type of header. Valid values:</p>
         * <br>
         * <p>*   **UserDefined**: a custom header.</p>
         * <p>*   **ReferenceHeader**: a header that is referenced from one of the request headers.</p>
         * <p>*   **SystemDefined**: a header predefined by the system.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The priority of the action within the forwarding rule. Valid values: **1 to 50000**. A lower value indicates a higher priority. The actions of a forwarding rule are applied in descending order of priority. This parameter is required. The priority of each action within a forwarding rule must be unique. You can specify priorities for at most 20 actions.</p>
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
         * <p>The name of the header to insert. The name must be 1 to 40 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The header names specified by **InsertHeaderConfig** must be unique.</p>
         * <br>
         * <p>>  You cannot set the name of the header to any of the following values (case-insensitive): `slb-id`, `slb-ip`, `x-forwarded-for`, `x-forwarded-proto`, `x-forwarded-eip`, `x-forwarded-port`, `x-forwarded-client-srcport`, `connection`, `upgrade`, `content-length`, `transfer-encoding`, `keep-alive`, `te`, `host`, `cookie`, `remoteip`, and `authority`.</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The value of the header to insert.</p>
         * <br>
         * <p>*   If **ValueType** is set to **SystemDefined**, you can set one of the following header values:</p>
         * <br>
         * <p>    *   **ClientSrcPort**: the client port.</p>
         * <p>    *   **ClientSrcIp**: the client IP address.</p>
         * <p>    *   **Protocol**: the request protocol (HTTP or HTTPS).</p>
         * <p>    *   **SLBId**: the ID of the ALB instance.</p>
         * <p>    *   **SLBPort**: the listening port.</p>
         * <br>
         * <p>*   If **ValueType** is set to **UserDefined**, you can specify a custom header value. The header value must be 1 to 128 characters in length and can contain printable characters whose ASCII character values are `greater than or equal to 32 and lower than 127`. You can use asterisks (\*) and question marks (?) as wildcards. The value cannot start or end with a space character.</p>
         * <br>
         * <p>*   If **ValueType** is set to **ReferenceHeader**, you can reference one of the request headers. The header value must be 1 to 128 characters in length, and can contain lowercase letters, digits, underscores (\_), and hyphens (-).</p>
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
        @NameInMap("ServerGroupStickySession")
        public CreateRulesRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession;

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
         * <p>The hostname to which requests are distributed. Valid values:</p>
         * <br>
         * <p>*   **${host}** (default): If you set the value to ${host}, you cannot append other characters.</p>
         * <br>
         * <p>*   If you want to specify a custom value, make sure that the following requirements are met:</p>
         * <br>
         * <p>    *   The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), and periods (.). You can use asterisks (\*) and question marks (?) as wildcard characters.</p>
         * <p>    *   The hostname must contain at least one period (.) but cannot start or end with a period (.).</p>
         * <p>    *   The rightmost domain label can contain only letters and wildcard characters. It cannot contain digits or hyphens (-).</p>
         * <p>    *   The domain labels cannot start or end with a hyphen (-).</p>
         * <p>    *   You can use asterisks (\*) and question marks (?) as wildcards anywhere in a domain label.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The HTTP status code that indicates the redirect type. Valid values: **301**, **302**, **303**, **307**, and **308**.</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The path to which requests are redirected. Valid values:</p>
         * <br>
         * <p>*   Default value: **${path}**. **${host}**, **${protocol}**, and **${port}** are also supported. Each variable cannot be specified more than once. You can specify one or more of the preceding variables in each request. You can also combine them with the following characters.</p>
         * <br>
         * <p>*   If you want to specify a custom value, make sure that the following requirements are met:</p>
         * <br>
         * <p>    *   The value is 1 to 128 characters in length.</p>
         * <p>    *   It must start with a forward slash (/) and can contain letters, digits, and the following special characters: `$ - _ .+ / & ~ @ :`. It cannot contain the following special characters: `" % # ; ! ( ) [ ]^ , "`. You can use asterisks (\*) and question marks (?) as wildcards.</p>
         * <p>    *   The value is case-sensitive.</p>
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
         * <p>The redirect protocol. Valid values:</p>
         * <br>
         * <p>*   **${protocol}** (default): If you set the value to ${protocol}, you cannot append other characters.</p>
         * <p>*   You can set the protocol to **HTTP** or **HTTPS**.</p>
         * <br>
         * <p>>  HTTPS listeners do not support HTTPS-to-HTTP redirects.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The query string of the URL to which requests are redirected.</p>
         * <br>
         * <p>*   Default value: **${query}**. **${host}**, **${protocol}**, and **${port}** are also supported. Each variable cannot be specified more than once. You can specify one or more of the preceding variables in each request. You can also combine them with the following characters.</p>
         * <br>
         * <p>*   If you want to specify a custom value, make sure that the following requirements are met:</p>
         * <br>
         * <p>    *   The value is 1 to 128 characters in length.</p>
         * <p>    *   It can contain printable characters, except space characters, the special characters `# [ ] { } \ | < > &`, and uppercase letters.</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        /**
         * <p>The hostname to which requests are redirected. Valid values:</p>
         * <br>
         * <p>*   **${host}** (default): If you set the value to ${host}, you cannot append other characters.</p>
         * <br>
         * <p>*   If you want to specify a custom value, make sure that the following requirements are met:</p>
         * <br>
         * <p>    *   The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), and periods (.). You can use asterisks (\*) and question marks (?) as wildcard characters.</p>
         * <p>    *   The hostname must contain at least one period (.) but cannot start or end with a period (.).</p>
         * <p>    *   The rightmost domain label can contain only letters and wildcard characters. It cannot contain digits or hyphens (-).</p>
         * <p>    *   The domain labels cannot start or end with a hyphen (-). You can use an asterisk (\*) and question mark (?) as wildcards anywhere in a domain label.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The path to which requests are redirected. Valid values:</p>
         * <br>
         * <p>*   Default value: **${path}**. **${host}**, **${protocol}**, and **${port}** are also supported. Each variable cannot be specified more than once. You can specify one or more of the preceding variables in each request. You can also combine them with the following characters.</p>
         * <br>
         * <p>*   If you want to specify a custom value, make sure that the following requirements are met:</p>
         * <br>
         * <p>    *   The value is 1 to 128 characters in length.</p>
         * <p>    *   It must start with a forward slash (/) and can contain letters, digits, and the following special characters: `$ - _ .+ / & ~ @ :`. It cannot contain the following special characters: `" % # ; ! ( ) [ ]^ , "`. You can use asterisks (\*) and question marks (?) as wildcards.</p>
         * <p>    *   The value is case-sensitive.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The query string of the URL to which requests are redirected.</p>
         * <br>
         * <p>*   Default value: **${query}**. **${host}**, **${protocol}**, and **${port}** are also supported. Each variable cannot be specified more than once. You can specify one or more of the preceding variables in each request. You can also combine them with the following characters.</p>
         * <br>
         * <p>*   If you want to specify a custom value, make sure that the following requirements are met:</p>
         * <br>
         * <p>    *   The value is 1 to 128 characters in length.</p>
         * <p>    *   It can contain printable characters, except space characters, the special characters `# [ ] { } \ | < > &`, and uppercase letters.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The action type. You can specify at most 11 types of action. Valid values:</p>
         * <br>
         * <p>*   **ForwardGroup**: forwards a request to multiple vServer groups.</p>
         * <p>*   **Redirect**: redirects a request.</p>
         * <p>*   **FixedResponse**: returns a custom response.</p>
         * <p>*   **Rewrite**: rewrites a request.</p>
         * <p>*   **InsertHeader**: inserts a header.</p>
         * <p>*   **RemoveHeaderConfig**: deletes a header.</p>
         * <p>*   **TrafficLimitConfig**: throttles network traffic.</p>
         * <p>*   **TrafficMirrorConfig**: mirrors network traffic.</p>
         * <p>*   **CORS**: enables cross-origin resource sharing (CORS).</p>
         * <br>
         * <p>You can specify the last action and the actions that you want to perform before the last action:</p>
         * <br>
         * <p>*   **FinalType**: the last action to be performed in a forwarding rule. Each forwarding rule can contain only one FinalType action. You can specify a **ForwardGroup**, **Redirect**, or **FixedResponse** action as the FinalType action.</p>
         * <p>*   **ExtType**: the action to be performed before the FinalType action. A forwarding rule can contain one or more ExtType actions. To specify this parameter, you must also specify FinalType. You can specify multiple **InsertHeader** actions or one **Rewrite** action.</p>
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

    public static class CreateRulesRequestRulesRuleActionsRewriteConfig extends TeaModel {
        /**
         * <p>Queries per second (QPS). Valid values: **1 to 100000**.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The QPS of each IP address. Valid values: **1 to 100000**.</p>
         * <br>
         * <p>>  If **QPS** and PerIpQps are configured at the same time, the value of the **PerIpQps** parameter must be smaller than that of the **QPS** parameter.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The type of destination to which network traffic is mirrored. Valid values:</p>
         * <br>
         * <p>*   **ForwardGroupMirror**: a server group.</p>
         * <p>*   **SlsMirror**: Log Service.</p>
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
         * <p>The allowed HTTP methods for CORS requests. Valid values:</p>
         * <br>
         * <p>*   **GET**</p>
         * <p>*   **POST**</p>
         * <p>*   **PUT**</p>
         * <p>*   **DELETE**</p>
         * <p>*   **HEAD**</p>
         * <p>*   **OPTIONS**</p>
         * <p>*   **PATCH**</p>
         */
        @NameInMap("PerIpQps")
        public Integer perIpQps;

        /**
         * <p>The origin site that is allowed to access. You can specify an asterisk (`*`) or one or more values. The value cannot be an asterisk (`*`).</p>
         * <br>
         * <p>*   The value must start with `http://` or `https://` and include a valid domain name or top-level wildcard domain name, such as `*.test.abc.example.com`.</p>
         * <p>*   You can choose to include a port number from **1** to **65535** in each value based on your business requirement.</p>
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
         * <p>The headers that are allowed to expose. You can specify an asterisk (`*`) or one or more values. Separate multiple values with commas (,). The value must be 1 to 32 characters in length, and can contain letters and digits. The value cannot start or end with an underscore (\_) or hyphen (-).</p>
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
        @NameInMap("MirrorGroupConfig")
        public CreateRulesRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig;

        /**
         * <p>The allowed headers for CORS requests. You can specify an asterisk (`*`) or one or more values. Separate multiple values with commas (,). The value must be 1 to 32 characters in length, and can contain letters and digits. The value cannot start or end with an underscore (\_) or hyphen (-).</p>
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
        @NameInMap("CorsConfig")
        public CreateRulesRequestRulesRuleActionsCorsConfig corsConfig;

        @NameInMap("FixedResponseConfig")
        public CreateRulesRequestRulesRuleActionsFixedResponseConfig fixedResponseConfig;

        @NameInMap("ForwardGroupConfig")
        public CreateRulesRequestRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        @NameInMap("InsertHeaderConfig")
        public CreateRulesRequestRulesRuleActionsInsertHeaderConfig insertHeaderConfig;

        /**
         * <p>The port to which requests are redirected.</p>
         * <br>
         * <p>*   **${port}** (default): If you set the value to ${port}, you cannot append other characters.</p>
         * <p>*   You can also enter a port number. Valid values: **1 to 63335**.</p>
         */
        @NameInMap("Order")
        public Integer order;

        @NameInMap("RedirectConfig")
        public CreateRulesRequestRulesRuleActionsRedirectConfig redirectConfig;

        @NameInMap("RewriteConfig")
        public CreateRulesRequestRulesRuleActionsRewriteConfig rewriteConfig;

        @NameInMap("TrafficLimitConfig")
        public CreateRulesRequestRulesRuleActionsTrafficLimitConfig trafficLimitConfig;

        @NameInMap("TrafficMirrorConfig")
        public CreateRulesRequestRulesRuleActionsTrafficMirrorConfig trafficMirrorConfig;

        /**
         * <p>The ID of the vServer group.</p>
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
         * <p>The hostname. A forwarding rule can contain only one unique hostname.</p>
         * <br>
         * <p>*   The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), periods (.), asterisks (\*), and question marks (?).</p>
         * <p>*   The hostname must contain at least one period (.) but cannot start or end with a period (.).</p>
         * <p>*   The rightmost domain label can contain only letters and wildcard characters. It cannot contain digits or hyphens (-).</p>
         * <p>*   The domain labels do not start or end with hyphens (-). You can use an asterisk (\*) and question mark (?) as wildcards anywhere in a domain label.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The request methods. Valid values: **HEAD**, **GET**, **POST**, **OPTIONS**, **PUT**, **PATCH**, and **DELETE**.</p>
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
         * <p>The path to which requests are forwarded. Limits:</p>
         * <br>
         * <p>*   The path must be 1 to 128 characters in length.</p>
         * <p>*   It must start with a forward slash (/) and can contain letters, digits, and the following special characters: `$ - _ .+ / & ~ @ :`. It cannot contain the following special characters: `" % # ; ! ( ) [ ]^ , "`. You can use asterisks (\*) and question marks (?) as wildcards.</p>
         * <p>*   The value is case-sensitive.</p>
         */
        @NameInMap("Key")
        public String key;

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
         * <p>The type of forwarding rule. You can specify at most seven types. Valid values:</p>
         * <br>
         * <p>*   **Host**: Requests are forwarded based on hosts.</p>
         * <p>*   **Path**: Requests are forwarded based on paths.</p>
         * <p>*   **Header**: Requests are forwarded based on HTTP headers.</p>
         * <p>*   **QueryString**: Requests are forwarded based on query strings.</p>
         * <p>*   **Method**: Requests are forwarded based on request methods.</p>
         * <p>*   **Cookie**: Requests are forwarded based on cookies.</p>
         * <p>*   **SourceIp**: Requests are forwarded based on source IP addresses.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The IP addresses or CIDR blocks.</p>
         * <br>
         * <p>You can specify at most five values for **SourceIp**.</p>
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
         * <p>The name of the forwarding rule. You can name at most 20 forwarding rules.</p>
         * <br>
         * <p>*   The name must be 2 to 128 characters in length.</p>
         * <p>*   It can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.</p>
         */
        @NameInMap("Key")
        public String key;

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

    public static class CreateRulesRequestRulesRuleConditionsSourceIpConfig extends TeaModel {
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
        @NameInMap("CookieConfig")
        public CreateRulesRequestRulesRuleConditionsCookieConfig cookieConfig;

        @NameInMap("HeaderConfig")
        public CreateRulesRequestRulesRuleConditionsHeaderConfig headerConfig;

        @NameInMap("HostConfig")
        public CreateRulesRequestRulesRuleConditionsHostConfig hostConfig;

        @NameInMap("MethodConfig")
        public CreateRulesRequestRulesRuleConditionsMethodConfig methodConfig;

        @NameInMap("PathConfig")
        public CreateRulesRequestRulesRuleConditionsPathConfig pathConfig;

        @NameInMap("QueryStringConfig")
        public CreateRulesRequestRulesRuleConditionsQueryStringConfig queryStringConfig;

        @NameInMap("ResponseHeaderConfig")
        public CreateRulesRequestRulesRuleConditionsResponseHeaderConfig responseHeaderConfig;

        @NameInMap("SourceIpConfig")
        public CreateRulesRequestRulesRuleConditionsSourceIpConfig sourceIpConfig;

        /**
         * <p>The ID of the asynchronous task.</p>
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
        @NameInMap("Key")
        public String key;

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
         * <p>The ID of the forwarding rule.</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The server group to which requests are distributed.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RuleActions")
        public java.util.List<CreateRulesRequestRulesRuleActions> ruleActions;

        @NameInMap("RuleConditions")
        public java.util.List<CreateRulesRequestRulesRuleConditions> ruleConditions;

        /**
         * <p>The list of forwarding rules.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

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
