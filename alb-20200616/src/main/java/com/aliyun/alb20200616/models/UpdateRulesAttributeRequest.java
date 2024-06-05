// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateRulesAttributeRequest extends TeaModel {
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
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a `2xx HTTP` status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The forwarding rules. You can specify up to 10 forwarding rules in each request.</p>
     * <br>
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
         * <br>
         * <p>*   **on**</p>
         * <p>*   **off**</p>
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
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The format of the response.</p>
         * <br>
         * <p>Valid values: **text/plain**, **text/css**, **text/html**, **application/javascript**, and **application/json**.</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The HTTP status code in the response. Valid values: **HTTP_2xx**, **HTTP_4xx**, and **HTTP_5xx**. **x** must be a digit.</p>
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
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The timeout period of sessions. Unit: seconds. Valid values: **1** to **86400**.</p>
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
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("CoverEnabled")
        public Boolean coverEnabled;

        /**
         * <p>The key of the header to be inserted. The key must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The key specified in `InsertHeader` must be unique.</p>
         * <br>
         * <p>> You cannot use the following header keys (case-insensitive): `slb-id`, `slb-ip`, `x-forwarded-for`, `x-forwarded-proto`, `x-forwarded-eip`, `x-forwarded-port`, `x-forwarded-client-srcport`, `connection`, `upgrade`, `content-length`, `transfer-encoding`, `keep-alive`, `te, host`, `cookie`, `remoteip`, and `authority`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the header to be inserted.</p>
         * <br>
         * <p>*   If **ValueType** is set to **SystemDefined**, you can specify one of the following header values:</p>
         * <br>
         * <p>    *   **ClientSrcPort**: the client port.</p>
         * <p>    *   **ClientSrcIp**: the client IP address.</p>
         * <p>    *   **Protocol**: the request protocol (HTTP or HTTPS).</p>
         * <p>    *   **SLBId**: the ALB instance ID.</p>
         * <p>    *   **SLBPort**: the listener port.</p>
         * <br>
         * <p>*   If **ValueType** is set to **UserDefined**, you can specify a custom header value. The header value must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and lower than 127`. You can use asterisks (\\*) and question marks (?) as wildcards. The value cannot start or end with a space character.</p>
         * <br>
         * <p>*   If **ValueType** is set to **ReferenceHeader**, you can reference one of the request headers. The header value must be 1 to 128 characters in length, and can contain lowercase letters, digits, underscores (_), and hyphens (-).</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The type of the header. Valid values:</p>
         * <br>
         * <p>*   **UserDefined**: a user-defined header</p>
         * <p>*   **ReferenceHeader**: a header that is referenced from a request header.</p>
         * <p>*   **SystemDefined**: a system-defined header.</p>
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
         * <br>
         * <p>Take note of the following rules when you specify a hostname:</p>
         * <br>
         * <p>*   The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, and the following special characters: - . \\* = ~ _ + \\ ^ ! $ & | ( ) [ ] ?.</p>
         * <p>*   The hostname must contain at least one period (.) but cannot start or end with a period (.).</p>
         * <p>*   The rightmost domain label can contain only letters, asterisks (*), and question marks (?), and cannot contain digits or hyphens (-). The leftmost `domain label` can contain asterisks (*).</p>
         * <p>*   The domain labels cannot start or end with a hyphen (-). You can specify asterisks (∗) and question marks (?) anywhere in a domain label.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The redirect type. Valid values: **301**, **302**, **303**, **307**, and **308**.</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        /**
         * <p>The path to which requests are redirected.</p>
         * <br>
         * <p>*   **${path}** (default): You can reference \\*\\*${host}**, **${protocol}** and **${port}\\*\\*. Each variable can be used only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.</p>
         * <br>
         * <p>*   A custom value that meets the following requirements:</p>
         * <br>
         * <p>    *   The custom value must be 1 to 128 characters in length. You can use asterisks (\\*) and question marks (?) as wildcards.</p>
         * <p>    *   The custom value can contain letters, digits, and the following special characters: `$ - _ . + / & ~ @ : \\" * ?`. The custom value must start with a forward slash (/) and cannot contain the following characters: `" % # ; ! ( ) [ ] ^ , "`.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port to which requests are forwarded.</p>
         * <br>
         * <p>Valid values: **1** to **63335**.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The redirect protocol.</p>
         * <br>
         * <p>Valid values: **HTTP** and **HTTPS**.</p>
         * <br>
         * <p>> HTTPS listeners support only HTTP to HTTPS redirection.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The query string to which requests are forwarded.</p>
         * <br>
         * <p>The query string must be 1 to 128 characters in length, and can contain printable characters, excluding uppercase letters and the following special characters: `# [ ] { } \\ | < > &`.</p>
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
         * <br>
         * <p>*   The key must be 1 to 40 characters in length.</p>
         * <p>*   It can contain letters, digits, hyphens (-), and underscores (_).</p>
         * <p>*   Cookie and Host are not supported.</p>
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
         * <br>
         * <p>Take note of the following rules when you specify a hostname:</p>
         * <br>
         * <p>*   The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, and the following special characters: - . \\* = ~ _ + \\ ^ ! $ & | ( ) [ ] ?.</p>
         * <p>*   The hostname must contain at least one period (.) but cannot start or end with a period (.).</p>
         * <p>*   The rightmost domain label can contain only letters, asterisks (*), and question marks (?), and cannot contain digits or hyphens (-). The leftmost `domain label` can contain asterisks (*).</p>
         * <p>*   The domain labels cannot start or end with a hyphen (-). You can specify asterisks (∗) and question marks (?) anywhere in a domain label.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The path to which requests are forwarded.</p>
         * <br>
         * <p>*   **${path}** (default): You can reference \\*\\*${host}**, **${protocol}** and **${port}\\*\\*. Each variable can be used only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.</p>
         * <br>
         * <p>*   A custom value that meets the following requirements:</p>
         * <br>
         * <p>    *   The custom value must be 1 to 128 characters in length. You can use asterisks (\\*) and question marks (?) as wildcards.</p>
         * <p>    *   The custom value can contain letters, digits, and the following special characters: `$ - _ . + / & ~ @ : \\" * ?`. The custom value must start with a forward slash (/) and cannot contain the following characters: `" % # ; ! ( ) [ ] ^ , "`.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The query string to which requests are forwarded.</p>
         * <br>
         * <p>The query string must be 1 to 128 characters in length, and can contain printable characters, excluding uppercase letters and the following special characters: `# [ ] { } \\ | < > &`.</p>
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
         * <p>The QPS per IP address. Valid values: **1** to **100000**.</p>
         * <br>
         * <p>> If you specify this parameter and QPS, the value of PerIpQps must be smaller than the value of QPS.</p>
         */
        @NameInMap("PerIpQps")
        public Integer perIpQps;

        /**
         * <p>The number of queries per second (QPS). Valid values: **1** to **100000**.</p>
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
         * <br>
         * <p>*   **ForwardGroupMirror**: a server group</p>
         * <p>*   **SlsMirror**: Log Service</p>
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
         * <p>The priority of the action. Valid values: **1** to **50000**. A lower value specifies a higher priority. The actions of a forwarding rule are applied in descending order of priority. This parameter cannot be left empty. The priority of each action within a forwarding rule must be unique. You can specify priorities for up to 20 actions.</p>
         * <br>
         * <p>This parameter is required.</p>
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
         * <br>
         * <p>*   **Host**: Requests are distributed based on hosts.</p>
         * <p>*   **Path**: Requests are distributed based on paths.</p>
         * <p>*   **Header**: Requests are distributed based on HTTP headers.</p>
         * <p>*   **QueryString**: Requests are distributed based on query strings.</p>
         * <p>*   **Method**: Requests are distributed based on request methods.</p>
         * <p>*   **Cookie**: Requests are distributed based on cookies.</p>
         * <p>*   **SourceIp**: Requests are distributed based on source IP addresses.</p>
         * <br>
         * <p>This parameter is required.</p>
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
         * <p>The key of the cookie. The key must be 1 to 100 characters in length, and can contain printable characters such as lowercase letters, asterisks (\\*), and question marks (?). However, the key cannot contain uppercase letters, space characters, or the following special characters: `# [ ] { } \\ | < > &`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the cookie. The value must be 1 to 128 characters in length, and can contain printable characters such as lowercase letters, asterisks (\\*), and question marks (?). However, the value cannot contain uppercase letters, space characters, or the following special characters: `# [ ] { } \\ | < > &`.</p>
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
         * <br>
         * <p>The key must be 1 to 100 characters in length, and can contain printable characters such as lowercase letters, asterisks (\\*), and question marks (?). The key cannot contain uppercase letters, space characters, or the following special characters: `# [ ] { } \\ | < > &`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the query string.</p>
         * <br>
         * <p>The value must be 1 to 128 characters in length, and can contain printable characters such as lowercase letters, asterisks (\\*), and question marks (?). However, uppercase letters, space characters, and the following special characters are not supported: `# [ ] { } \\ | < > &`.</p>
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
         * <br>
         * <p>*   The key must be 1 to 40 characters in length.</p>
         * <p>*   It can contain letters, digits, hyphens (-), and underscores (_).</p>
         * <p>*   Cookie and Host are not supported.</p>
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
         * <p>The match conditions for HTTP request methods. Valid values of N: **1** to **20**.</p>
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
         * <p>The match conditions for response status codes. This parameter is required and takes effect when **Type** is set to **ResponseStatusCode**. You can specify up to 20 match conditions.</p>
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
         * <br>
         * <p>*   **ForwardGroup**: forwards a request to multiple vServer groups.</p>
         * <p>*   **Redirect**: redirects a request.</p>
         * <p>*   **FixedResponse**: returns a custom response.</p>
         * <p>*   **Rewrite**: rewrites a request.</p>
         * <p>*   **InsertHeader**: inserts a header.</p>
         * <p>*   **RemoveHeaderConfig**: deletes a header.</p>
         * <p>*   **TrafficLimitConfig**: throttles network traffic.</p>
         * <p>*   **TrafficMirrorConfig**: mirrors traffic.</p>
         * <p>*   **CorsConfig**: forwards requests based on CORS.</p>
         * <br>
         * <p>The following action types are supported:</p>
         * <br>
         * <p>*   **FinalType**: the last action to be performed in a forwarding rule. Each forwarding rule can contain only one FinalType action. You can specify a **ForwardGroup**, **Redirect**, or **FixedResponse** action as the FinalType action.</p>
         * <p>*   **ExtType**: the action or the actions to be performed before the **FinalType** action. A forwarding rule can contain one or more **ExtType** actions. To specify an ExtType action, you must specify a **FinalType** action. You can specify multiple **InsertHeader** actions or one **Rewrite** action.</p>
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
         * <p>The priority of the forwarding rule. Valid values: **1 to 10000**. A lower value specifies a higher priority. You can specify priorities for up to 20 forwarding rules.</p>
         * <br>
         * <p>> The priority of each forwarding rule added to a listener must be unique.</p>
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
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter. You can specify names for up to 20 forwarding rules.</p>
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
