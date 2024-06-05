// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListRulesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, no next page exists.</p>
     * <p>*   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The forwarding rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<ListRulesResponseBodyRules> rules;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRulesResponseBody self = new ListRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRulesResponseBody setRules(java.util.List<ListRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ListRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public ListRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRulesResponseBodyRulesRuleActionsCorsConfig extends TeaModel {
        /**
         * <p>Indicates whether credentials can be carried in CORS requests. Valid values:</p>
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
         * <p>The maximum cache time of dry run requests in the browser. Unit: seconds.</p>
         * <br>
         * <p>Valid values: **-1** to **172800**.</p>
         */
        @NameInMap("MaxAge")
        public Long maxAge;

        public static ListRulesResponseBodyRulesRuleActionsCorsConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActionsCorsConfig self = new ListRulesResponseBodyRulesRuleActionsCorsConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleActionsCorsConfig setAllowCredentials(String allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public String getAllowCredentials() {
            return this.allowCredentials;
        }

        public ListRulesResponseBodyRulesRuleActionsCorsConfig setAllowHeaders(java.util.List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public java.util.List<String> getAllowHeaders() {
            return this.allowHeaders;
        }

        public ListRulesResponseBodyRulesRuleActionsCorsConfig setAllowMethods(java.util.List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public java.util.List<String> getAllowMethods() {
            return this.allowMethods;
        }

        public ListRulesResponseBodyRulesRuleActionsCorsConfig setAllowOrigin(java.util.List<String> allowOrigin) {
            this.allowOrigin = allowOrigin;
            return this;
        }
        public java.util.List<String> getAllowOrigin() {
            return this.allowOrigin;
        }

        public ListRulesResponseBodyRulesRuleActionsCorsConfig setExposeHeaders(java.util.List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public java.util.List<String> getExposeHeaders() {
            return this.exposeHeaders;
        }

        public ListRulesResponseBodyRulesRuleActionsCorsConfig setMaxAge(Long maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Long getMaxAge() {
            return this.maxAge;
        }

    }

    public static class ListRulesResponseBodyRulesRuleActionsFixedResponseConfig extends TeaModel {
        /**
         * <p>The content of the custom response. The content is up to 1 KB in size, and can contain only ASCII characters.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The content type.</p>
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

        public static ListRulesResponseBodyRulesRuleActionsFixedResponseConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActionsFixedResponseConfig self = new ListRulesResponseBodyRulesRuleActionsFixedResponseConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleActionsFixedResponseConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListRulesResponseBodyRulesRuleActionsFixedResponseConfig setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListRulesResponseBodyRulesRuleActionsFixedResponseConfig setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

    }

    public static class ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupStickySession extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Timeout")
        public Integer timeout;

        public static ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupStickySession build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupStickySession self = new ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupStickySession();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupStickySession setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupStickySession setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The server group to which requests are forwarded.</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The weight. Valid values: **0** to **100**.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupTuples self = new ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupTuples setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ListRulesResponseBodyRulesRuleActionsForwardGroupConfig extends TeaModel {
        @NameInMap("ServerGroupStickySession")
        public ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession;

        /**
         * <p>The server groups to which requests are forwarded.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static ListRulesResponseBodyRulesRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActionsForwardGroupConfig self = new ListRulesResponseBodyRulesRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleActionsForwardGroupConfig setServerGroupStickySession(ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession) {
            this.serverGroupStickySession = serverGroupStickySession;
            return this;
        }
        public ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupStickySession getServerGroupStickySession() {
            return this.serverGroupStickySession;
        }

        public ListRulesResponseBodyRulesRuleActionsForwardGroupConfig setServerGroupTuples(java.util.List<ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class ListRulesResponseBodyRulesRuleActionsInsertHeaderConfig extends TeaModel {
        /**
         * <p>The key of the header. The key must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The key specified in `InsertHeader` must be unique.</p>
         * <br>
         * <p>> **Cookie** and **Host** are not supported.</p>
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
         * <p>*   If **ValueType** is set to **UserDefined**, a custom header value is supported. The header value must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and lower than 127`. You can use asterisks (\\*) and question marks (?) as wildcard characters. The header value cannot start or end with a space character.</p>
         * <br>
         * <p>*   If **ValueType** is set to **ReferenceHeader**, one of the request headers is referenced. The header value must be 1 to 128 characters in length, and can contain lowercase letters, digits, underscores (_), and hyphens (-).</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The type of the header. Valid values:</p>
         * <br>
         * <p>*   **UserDefined**: a user-defined header.</p>
         * <p>*   **ReferenceHeader**: a header that is referenced from a request header.</p>
         * <p>*   **SystemDefined**: a system-defined header.</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static ListRulesResponseBodyRulesRuleActionsInsertHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActionsInsertHeaderConfig self = new ListRulesResponseBodyRulesRuleActionsInsertHeaderConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleActionsInsertHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRulesResponseBodyRulesRuleActionsInsertHeaderConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListRulesResponseBodyRulesRuleActionsInsertHeaderConfig setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class ListRulesResponseBodyRulesRuleActionsRedirectConfig extends TeaModel {
        /**
         * <p>The hostname to which requests are redirected. Valid values:</p>
         * <br>
         * <p>*   **${host}** (default): If ${host} is returned, no other character is appended.</p>
         * <br>
         * <p>*   Limits on a custom value:</p>
         * <br>
         * <p>    *   The hostname is 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), and periods (.). Asterisks (\\*) and question marks (?) can be used as wildcard characters.</p>
         * <p>    *   The hostname contains at least one period (.) but does not start or end with a period (.).</p>
         * <p>    *   The rightmost domain label contains only letters and wildcard characters. It does not contain digits or hyphens (-).</p>
         * <p>    *   The domain labels do not start or end with hyphens (-).</p>
         * <p>    *   You can use asterisks (\\*) and question marks (?) anywhere in a domain label as wildcard characters.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The redirect type. Valid values: **301**, **302**, **303**, **307**, and **308**.</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        /**
         * <p>The path to which requests are redirected. Valid values:</p>
         * <br>
         * <p>*   **${path}** (default): You can reference \\*\\*${host}**, **${protocol}**, and**${port}**. The path can consist of **${host}**,**${protocol}**, and **${port}\\*\\*. Each variable can be used only once. The preceding variables can be used at the same time or combined with a custom value.</p>
         * <br>
         * <p>*   Limits on a custom value:</p>
         * <br>
         * <p>    *   The value is 1 to 128 characters in length.</p>
         * <p>    *   It starts with a forward slash (/) and contains letters, digits, and the following special characters: `$ - _ .+ / & ~ @ :`. It does not contain the following special characters: `" % # ; ! ( ) [ ] ^ , "`. You can use asterisks (\\*) and question marks (?) as wildcard characters.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port to which requests are redirected. Valid values:</p>
         * <br>
         * <p>*   **${port}** (default): If ${port} is returned, no other character is appended.</p>
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
         * <p>> HTTPS listeners support only HTTP to HTTPS redirection.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The query string to which requests are redirected. The query string must be 1 to 128 characters in length, and can contain printable characters, excluding uppercase letters and the following special characters: `# [ ] { } \\ | < > &`.</p>
         */
        @NameInMap("Query")
        public String query;

        public static ListRulesResponseBodyRulesRuleActionsRedirectConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActionsRedirectConfig self = new ListRulesResponseBodyRulesRuleActionsRedirectConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleActionsRedirectConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListRulesResponseBodyRulesRuleActionsRedirectConfig setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

        public ListRulesResponseBodyRulesRuleActionsRedirectConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListRulesResponseBodyRulesRuleActionsRedirectConfig setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListRulesResponseBodyRulesRuleActionsRedirectConfig setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListRulesResponseBodyRulesRuleActionsRedirectConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class ListRulesResponseBodyRulesRuleActionsRemoveHeaderConfig extends TeaModel {
        /**
         * <p>The key of the header to be removed. The key must be 1 to 40 characters in length and can contain letters, digits, underscores, and hyphens (-). The header key must be unique.</p>
         * <br>
         * <p>*   You cannot specify the following header keys for an inbound forwarding rule: `slb-id`, `slb-ip`, `x-forwarded-for`, `x-forwarded-proto`, `x-forwarded-eip`, `x-forwarded-port`, `x-forwarded-client-srcport`, `connection`, `upgrade`, `content-length`, `transfer-encoding`, `keep-alive`, `te`, `host`, `cookie`, `remoteip`, and `authority`. The preceding keys are case-insensitive.</p>
         * <p>*   You cannot specify the following header keys for an outbound forwarding rule: `connection`, `upgrade`, `content-length`, and `transfer-encoding`. The preceding keys are case-insensitive.</p>
         */
        @NameInMap("Key")
        public String key;

        public static ListRulesResponseBodyRulesRuleActionsRemoveHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActionsRemoveHeaderConfig self = new ListRulesResponseBodyRulesRuleActionsRemoveHeaderConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleActionsRemoveHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class ListRulesResponseBodyRulesRuleActionsRewriteConfig extends TeaModel {
        /**
         * <p>The hostname to which requests are forwarded. Valid values:</p>
         * <br>
         * <p>*   **${host}** (default): If ${host} is returned, no other character is appended.</p>
         * <br>
         * <p>*   Limits on a custom value:</p>
         * <br>
         * <p>    *   The hostname is 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), and periods (.). Asterisks (\\*) and question marks (?) can be used as wildcard characters.</p>
         * <p>    *   The hostname contains at least one period (.) but does not start or end with a period (.).</p>
         * <p>    *   The rightmost domain label contains only letters and wildcard characters. It does not contain digits or hyphens (-).</p>
         * <p>    *   The domain labels do not start or end with hyphens (-).</p>
         * <p>    *   You can use asterisks (\\*) and question marks (?) anywhere in a domain label as wildcard characters.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The path to which requests are forwarded. The path is 1 to 128 characters in length and starts with a forward slash (/). The path can contain letters, digits, asterisks (\\*), question marks (?), and the following special characters: `$ - _ . + / & ~ @ :`. The path does not contain the following special characters: `" % # ; ! ( ) [ ] ^ , "`.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The query string of the URL to which requests are forwarded. The query string is 1 to 128 characters in length, and can contain printable characters, excluding uppercase letters and the following special characters: `# [ ] { } \\ | < > &`.</p>
         */
        @NameInMap("Query")
        public String query;

        public static ListRulesResponseBodyRulesRuleActionsRewriteConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActionsRewriteConfig self = new ListRulesResponseBodyRulesRuleActionsRewriteConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleActionsRewriteConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListRulesResponseBodyRulesRuleActionsRewriteConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListRulesResponseBodyRulesRuleActionsRewriteConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class ListRulesResponseBodyRulesRuleActionsTrafficLimitConfig extends TeaModel {
        /**
         * <p>The QPS of each IP address. Valid values: **1 to 100000**.</p>
         * <br>
         * <p>> If you specify this parameter and **QPS**, the value of **PerIpQps** must be smaller than the value of **QPS**.</p>
         */
        @NameInMap("PerIpQps")
        public Integer perIpQps;

        /**
         * <p>The number of queries per second (QPS). Valid values: **1** to **100000**.</p>
         */
        @NameInMap("QPS")
        public Integer QPS;

        public static ListRulesResponseBodyRulesRuleActionsTrafficLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActionsTrafficLimitConfig self = new ListRulesResponseBodyRulesRuleActionsTrafficLimitConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleActionsTrafficLimitConfig setPerIpQps(Integer perIpQps) {
            this.perIpQps = perIpQps;
            return this;
        }
        public Integer getPerIpQps() {
            return this.perIpQps;
        }

        public ListRulesResponseBodyRulesRuleActionsTrafficLimitConfig setQPS(Integer QPS) {
            this.QPS = QPS;
            return this;
        }
        public Integer getQPS() {
            return this.QPS;
        }

    }

    public static class ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The server group ID.</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The weight. Valid values: **0** to **100**.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples self = new ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig extends TeaModel {
        /**
         * <p>The server group to which traffic is mirrored.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> serverGroupTuples;

        public static ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig self = new ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig setServerGroupTuples(java.util.List<ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfig extends TeaModel {
        /**
         * <p>The configuration of the server group to which traffic is mirrored.</p>
         */
        @NameInMap("MirrorGroupConfig")
        public ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig;

        @NameInMap("TargetType")
        public String targetType;

        public static ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfig self = new ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfig setMirrorGroupConfig(ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig) {
            this.mirrorGroupConfig = mirrorGroupConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig getMirrorGroupConfig() {
            return this.mirrorGroupConfig;
        }

        public ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfig setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class ListRulesResponseBodyRulesRuleActions extends TeaModel {
        /**
         * <p>The CORS configuration.</p>
         */
        @NameInMap("CorsConfig")
        public ListRulesResponseBodyRulesRuleActionsCorsConfig corsConfig;

        /**
         * <p>The configuration of the custom response.</p>
         */
        @NameInMap("FixedResponseConfig")
        public ListRulesResponseBodyRulesRuleActionsFixedResponseConfig fixedResponseConfig;

        /**
         * <p>The configurations of the server groups.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public ListRulesResponseBodyRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The configuration of the header to be inserted.</p>
         */
        @NameInMap("InsertHeaderConfig")
        public ListRulesResponseBodyRulesRuleActionsInsertHeaderConfig insertHeaderConfig;

        /**
         * <p>The priority of the action. Valid values: **1 to 50000**. A smaller value indicates a higher priority. The actions of a forwarding rule are applied in descending order of priority. This parameter is not empty. The priority of each action within a forwarding rule is unique.</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The configuration of the redirect action.</p>
         */
        @NameInMap("RedirectConfig")
        public ListRulesResponseBodyRulesRuleActionsRedirectConfig redirectConfig;

        /**
         * <p>The configuration of the header to be removed.</p>
         */
        @NameInMap("RemoveHeaderConfig")
        public ListRulesResponseBodyRulesRuleActionsRemoveHeaderConfig removeHeaderConfig;

        /**
         * <p>The configuration of the rewrite action.</p>
         */
        @NameInMap("RewriteConfig")
        public ListRulesResponseBodyRulesRuleActionsRewriteConfig rewriteConfig;

        /**
         * <p>The configuration of the action to throttle traffic.</p>
         */
        @NameInMap("TrafficLimitConfig")
        public ListRulesResponseBodyRulesRuleActionsTrafficLimitConfig trafficLimitConfig;

        /**
         * <p>The configuration of the action to mirror traffic.</p>
         */
        @NameInMap("TrafficMirrorConfig")
        public ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfig trafficMirrorConfig;

        /**
         * <p>The action. Valid values:</p>
         * <br>
         * <p>*   **ForwardGroup**: distributes requests to multiple vServer groups.</p>
         * <p>*   **Redirect**: redirects a request.</p>
         * <p>*   **FixedResponse**: returns a custom response.</p>
         * <p>*   **Rewrite**: rewrites a request.</p>
         * <p>*   **InsertHeader**: inserts a header.</p>
         * <p>*   **RemoveHeaderConfig**: deletes a header.</p>
         * <p>*   **TrafficLimitConfig**: throttles network traffic.</p>
         * <p>*   **TrafficMirrorConfig**: mirrors traffic.</p>
         * <p>*   **CorsConfig**: forwards requests based on CORS.</p>
         * <br>
         * <p>The preceding actions can be classified into two broad types:</p>
         * <br>
         * <p>*   **FinalType**: the last action to be performed in a forwarding rule. Each forwarding rule can contain only one FinalType action. You can specify a **ForwardGroup**, **Redirect**, or **FixedResponse** action as the FinalType action.</p>
         * <p>*   **ExtType**: one or more actions to be performed before the **FinalType** action. A forwarding rule can contain one or more **ExtType** actions. To specify an ExtType action, you must specify a **FinalType** action. You can specify multiple **InsertHeader** actions or one **Rewrite** action.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListRulesResponseBodyRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActions self = new ListRulesResponseBodyRulesRuleActions();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleActions setCorsConfig(ListRulesResponseBodyRulesRuleActionsCorsConfig corsConfig) {
            this.corsConfig = corsConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleActionsCorsConfig getCorsConfig() {
            return this.corsConfig;
        }

        public ListRulesResponseBodyRulesRuleActions setFixedResponseConfig(ListRulesResponseBodyRulesRuleActionsFixedResponseConfig fixedResponseConfig) {
            this.fixedResponseConfig = fixedResponseConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleActionsFixedResponseConfig getFixedResponseConfig() {
            return this.fixedResponseConfig;
        }

        public ListRulesResponseBodyRulesRuleActions setForwardGroupConfig(ListRulesResponseBodyRulesRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public ListRulesResponseBodyRulesRuleActions setInsertHeaderConfig(ListRulesResponseBodyRulesRuleActionsInsertHeaderConfig insertHeaderConfig) {
            this.insertHeaderConfig = insertHeaderConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleActionsInsertHeaderConfig getInsertHeaderConfig() {
            return this.insertHeaderConfig;
        }

        public ListRulesResponseBodyRulesRuleActions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ListRulesResponseBodyRulesRuleActions setRedirectConfig(ListRulesResponseBodyRulesRuleActionsRedirectConfig redirectConfig) {
            this.redirectConfig = redirectConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleActionsRedirectConfig getRedirectConfig() {
            return this.redirectConfig;
        }

        public ListRulesResponseBodyRulesRuleActions setRemoveHeaderConfig(ListRulesResponseBodyRulesRuleActionsRemoveHeaderConfig removeHeaderConfig) {
            this.removeHeaderConfig = removeHeaderConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleActionsRemoveHeaderConfig getRemoveHeaderConfig() {
            return this.removeHeaderConfig;
        }

        public ListRulesResponseBodyRulesRuleActions setRewriteConfig(ListRulesResponseBodyRulesRuleActionsRewriteConfig rewriteConfig) {
            this.rewriteConfig = rewriteConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleActionsRewriteConfig getRewriteConfig() {
            return this.rewriteConfig;
        }

        public ListRulesResponseBodyRulesRuleActions setTrafficLimitConfig(ListRulesResponseBodyRulesRuleActionsTrafficLimitConfig trafficLimitConfig) {
            this.trafficLimitConfig = trafficLimitConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleActionsTrafficLimitConfig getTrafficLimitConfig() {
            return this.trafficLimitConfig;
        }

        public ListRulesResponseBodyRulesRuleActions setTrafficMirrorConfig(ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfig trafficMirrorConfig) {
            this.trafficMirrorConfig = trafficMirrorConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfig getTrafficMirrorConfig() {
            return this.trafficMirrorConfig;
        }

        public ListRulesResponseBodyRulesRuleActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListRulesResponseBodyRulesRuleConditionsCookieConfigValues extends TeaModel {
        /**
         * <p>The key of the cookie. The key is 1 to 100 characters in length, and can contain printable characters such as lowercase letters, asterisks (\\*), and question marks (?). The key cannot contain uppercase letters, space characters, or the following special characters: `# [ ] { } \\ | < > &`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the cookie. The value is 1 to 128 characters in length, and can contain printable characters such as lowercase letters, asterisks (\\*), and question marks (?). Uppercase letters, space characters, and the following special characters are not supported: `# [ ] { } \\ | < > &`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListRulesResponseBodyRulesRuleConditionsCookieConfigValues build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleConditionsCookieConfigValues self = new ListRulesResponseBodyRulesRuleConditionsCookieConfigValues();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleConditionsCookieConfigValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRulesResponseBodyRulesRuleConditionsCookieConfigValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListRulesResponseBodyRulesRuleConditionsCookieConfig extends TeaModel {
        /**
         * <p>The key-value pair of the cookie.</p>
         */
        @NameInMap("Values")
        public java.util.List<ListRulesResponseBodyRulesRuleConditionsCookieConfigValues> values;

        public static ListRulesResponseBodyRulesRuleConditionsCookieConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleConditionsCookieConfig self = new ListRulesResponseBodyRulesRuleConditionsCookieConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleConditionsCookieConfig setValues(java.util.List<ListRulesResponseBodyRulesRuleConditionsCookieConfigValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<ListRulesResponseBodyRulesRuleConditionsCookieConfigValues> getValues() {
            return this.values;
        }

    }

    public static class ListRulesResponseBodyRulesRuleConditionsHeaderConfig extends TeaModel {
        /**
         * <p>The key of the header. The key must be 1 to 40 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (_). Cookie and Host are not supported.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of the header.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListRulesResponseBodyRulesRuleConditionsHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleConditionsHeaderConfig self = new ListRulesResponseBodyRulesRuleConditionsHeaderConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleConditionsHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRulesResponseBodyRulesRuleConditionsHeaderConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListRulesResponseBodyRulesRuleConditionsHostConfig extends TeaModel {
        /**
         * <p>The hostnames.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListRulesResponseBodyRulesRuleConditionsHostConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleConditionsHostConfig self = new ListRulesResponseBodyRulesRuleConditionsHostConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleConditionsHostConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListRulesResponseBodyRulesRuleConditionsMethodConfig extends TeaModel {
        /**
         * <p>The request methods.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListRulesResponseBodyRulesRuleConditionsMethodConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleConditionsMethodConfig self = new ListRulesResponseBodyRulesRuleConditionsMethodConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleConditionsMethodConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListRulesResponseBodyRulesRuleConditionsPathConfig extends TeaModel {
        /**
         * <p>The paths.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListRulesResponseBodyRulesRuleConditionsPathConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleConditionsPathConfig self = new ListRulesResponseBodyRulesRuleConditionsPathConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleConditionsPathConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListRulesResponseBodyRulesRuleConditionsQueryStringConfigValues extends TeaModel {
        /**
         * <p>They key of the query string. The key must be 1 to 100 characters in length, and can contain printable characters such as lowercase letters, asterisks (\\*), and question marks (?). The key cannot contain uppercase letters, space characters, or the following special characters: `# [ ] { } \\ | < > &`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the query string. The value must be 1 to 128 characters in length, and can contain printable characters such as lowercase letters, asterisks (\\*), and question marks (?). However, uppercase letters, space characters, and the following special characters are not supported: `# [ ] { } \\ | < > &`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListRulesResponseBodyRulesRuleConditionsQueryStringConfigValues build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleConditionsQueryStringConfigValues self = new ListRulesResponseBodyRulesRuleConditionsQueryStringConfigValues();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleConditionsQueryStringConfigValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRulesResponseBodyRulesRuleConditionsQueryStringConfigValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListRulesResponseBodyRulesRuleConditionsQueryStringConfig extends TeaModel {
        /**
         * <p>The query string.</p>
         */
        @NameInMap("Values")
        public java.util.List<ListRulesResponseBodyRulesRuleConditionsQueryStringConfigValues> values;

        public static ListRulesResponseBodyRulesRuleConditionsQueryStringConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleConditionsQueryStringConfig self = new ListRulesResponseBodyRulesRuleConditionsQueryStringConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleConditionsQueryStringConfig setValues(java.util.List<ListRulesResponseBodyRulesRuleConditionsQueryStringConfigValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<ListRulesResponseBodyRulesRuleConditionsQueryStringConfigValues> getValues() {
            return this.values;
        }

    }

    public static class ListRulesResponseBodyRulesRuleConditionsResponseHeaderConfig extends TeaModel {
        /**
         * <p>The header key. The key must be 1 to 40 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (_). Cookie and Host are not supported.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The header values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListRulesResponseBodyRulesRuleConditionsResponseHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleConditionsResponseHeaderConfig self = new ListRulesResponseBodyRulesRuleConditionsResponseHeaderConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleConditionsResponseHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRulesResponseBodyRulesRuleConditionsResponseHeaderConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListRulesResponseBodyRulesRuleConditionsResponseStatusCodeConfig extends TeaModel {
        /**
         * <p>The response status codes.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListRulesResponseBodyRulesRuleConditionsResponseStatusCodeConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleConditionsResponseStatusCodeConfig self = new ListRulesResponseBodyRulesRuleConditionsResponseStatusCodeConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleConditionsResponseStatusCodeConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListRulesResponseBodyRulesRuleConditionsSourceIpConfig extends TeaModel {
        /**
         * <p>The source IP addresses.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListRulesResponseBodyRulesRuleConditionsSourceIpConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleConditionsSourceIpConfig self = new ListRulesResponseBodyRulesRuleConditionsSourceIpConfig();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleConditionsSourceIpConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListRulesResponseBodyRulesRuleConditions extends TeaModel {
        /**
         * <p>The configuration of the cookie.</p>
         */
        @NameInMap("CookieConfig")
        public ListRulesResponseBodyRulesRuleConditionsCookieConfig cookieConfig;

        /**
         * <p>The configuration of the header.</p>
         */
        @NameInMap("HeaderConfig")
        public ListRulesResponseBodyRulesRuleConditionsHeaderConfig headerConfig;

        /**
         * <p>The configurations of the hosts.</p>
         */
        @NameInMap("HostConfig")
        public ListRulesResponseBodyRulesRuleConditionsHostConfig hostConfig;

        /**
         * <p>The configurations of the request methods.</p>
         */
        @NameInMap("MethodConfig")
        public ListRulesResponseBodyRulesRuleConditionsMethodConfig methodConfig;

        /**
         * <p>The configurations of the paths.</p>
         */
        @NameInMap("PathConfig")
        public ListRulesResponseBodyRulesRuleConditionsPathConfig pathConfig;

        /**
         * <p>The configurations of the query strings.</p>
         */
        @NameInMap("QueryStringConfig")
        public ListRulesResponseBodyRulesRuleConditionsQueryStringConfig queryStringConfig;

        /**
         * <p>The configuration of the HTTP response header.</p>
         */
        @NameInMap("ResponseHeaderConfig")
        public ListRulesResponseBodyRulesRuleConditionsResponseHeaderConfig responseHeaderConfig;

        /**
         * <p>The configurations of the response status codes.</p>
         */
        @NameInMap("ResponseStatusCodeConfig")
        public ListRulesResponseBodyRulesRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig;

        /**
         * <p>The configuration of the source IP addresses based on which user traffic is matched.</p>
         */
        @NameInMap("SourceIpConfig")
        public ListRulesResponseBodyRulesRuleConditionsSourceIpConfig sourceIpConfig;

        /**
         * <p>The type of forwarding rule. Valid values:</p>
         * <br>
         * <p>*   **Host**: Requests are forwarded based on hosts.</p>
         * <p>*   **Path**: Requests are forwarded based on paths.</p>
         * <p>*   **Header**: Requests are forwarded based on HTTP headers.</p>
         * <p>*   **QueryString**: Requests are forwarded based on query strings.</p>
         * <p>*   **Method**: Requests are forwarded based on request methods.</p>
         * <p>*   **Cookie**: Requests are forwarded based on cookies.</p>
         * <p>*   **SourceIp**: Requests are distributed based on source IP addresses.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListRulesResponseBodyRulesRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleConditions self = new ListRulesResponseBodyRulesRuleConditions();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesRuleConditions setCookieConfig(ListRulesResponseBodyRulesRuleConditionsCookieConfig cookieConfig) {
            this.cookieConfig = cookieConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleConditionsCookieConfig getCookieConfig() {
            return this.cookieConfig;
        }

        public ListRulesResponseBodyRulesRuleConditions setHeaderConfig(ListRulesResponseBodyRulesRuleConditionsHeaderConfig headerConfig) {
            this.headerConfig = headerConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleConditionsHeaderConfig getHeaderConfig() {
            return this.headerConfig;
        }

        public ListRulesResponseBodyRulesRuleConditions setHostConfig(ListRulesResponseBodyRulesRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

        public ListRulesResponseBodyRulesRuleConditions setMethodConfig(ListRulesResponseBodyRulesRuleConditionsMethodConfig methodConfig) {
            this.methodConfig = methodConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleConditionsMethodConfig getMethodConfig() {
            return this.methodConfig;
        }

        public ListRulesResponseBodyRulesRuleConditions setPathConfig(ListRulesResponseBodyRulesRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public ListRulesResponseBodyRulesRuleConditions setQueryStringConfig(ListRulesResponseBodyRulesRuleConditionsQueryStringConfig queryStringConfig) {
            this.queryStringConfig = queryStringConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleConditionsQueryStringConfig getQueryStringConfig() {
            return this.queryStringConfig;
        }

        public ListRulesResponseBodyRulesRuleConditions setResponseHeaderConfig(ListRulesResponseBodyRulesRuleConditionsResponseHeaderConfig responseHeaderConfig) {
            this.responseHeaderConfig = responseHeaderConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleConditionsResponseHeaderConfig getResponseHeaderConfig() {
            return this.responseHeaderConfig;
        }

        public ListRulesResponseBodyRulesRuleConditions setResponseStatusCodeConfig(ListRulesResponseBodyRulesRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig) {
            this.responseStatusCodeConfig = responseStatusCodeConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleConditionsResponseStatusCodeConfig getResponseStatusCodeConfig() {
            return this.responseStatusCodeConfig;
        }

        public ListRulesResponseBodyRulesRuleConditions setSourceIpConfig(ListRulesResponseBodyRulesRuleConditionsSourceIpConfig sourceIpConfig) {
            this.sourceIpConfig = sourceIpConfig;
            return this;
        }
        public ListRulesResponseBodyRulesRuleConditionsSourceIpConfig getSourceIpConfig() {
            return this.sourceIpConfig;
        }

        public ListRulesResponseBodyRulesRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListRulesResponseBodyRulesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListRulesResponseBodyRulesTags build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesTags self = new ListRulesResponseBodyRulesTags();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRulesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRulesResponseBodyRulesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListRulesResponseBodyRules extends TeaModel {
        /**
         * <p>The direction to which the forwarding rule is applied. Valid values:</p>
         * <br>
         * <p>*   Request (default): The rule applies to client requests.</p>
         * <p>*   Response: The rule applies to responses from backend servers.</p>
         * <br>
         * <p>> Response is not supported by basic ALB instances.</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The ID of the listener to which the forwarding rule belongs.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The ID of the ALB instance to which the forwarding rule belongs.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The priority of the forwarding rule. Valid values: **1 to 10000**. A smaller value indicates a higher priority.</p>
         * <br>
         * <p>> The priority of each forwarding rule added to a listener must be unique.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The action of the forwarding rule.</p>
         */
        @NameInMap("RuleActions")
        public java.util.List<ListRulesResponseBodyRulesRuleActions> ruleActions;

        /**
         * <p>The conditions of the forwarding rule.</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<ListRulesResponseBodyRulesRuleConditions> ruleConditions;

        /**
         * <p>The forwarding rule ID.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the forwarding rule. Valid values:</p>
         * <br>
         * <p>*   **Provisioning**</p>
         * <p>*   **Configuring**</p>
         * <p>*   **Available**</p>
         */
        @NameInMap("RuleStatus")
        public String ruleStatus;

        @NameInMap("Tags")
        public java.util.List<ListRulesResponseBodyRulesTags> tags;

        public static ListRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRules self = new ListRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyRules setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public ListRulesResponseBodyRules setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListRulesResponseBodyRules setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public ListRulesResponseBodyRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListRulesResponseBodyRules setRuleActions(java.util.List<ListRulesResponseBodyRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<ListRulesResponseBodyRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

        public ListRulesResponseBodyRules setRuleConditions(java.util.List<ListRulesResponseBodyRulesRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<ListRulesResponseBodyRulesRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        public ListRulesResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListRulesResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListRulesResponseBodyRules setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public ListRulesResponseBodyRules setTags(java.util.List<ListRulesResponseBodyRulesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListRulesResponseBodyRulesTags> getTags() {
            return this.tags;
        }

    }

}
