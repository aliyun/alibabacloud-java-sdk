// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListRulesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Valid values:</p>
     * <ul>
     * <li><p>If <strong>NextToken</strong> is empty, no more results are returned.</p>
     * </li>
     * <li><p>If <strong>NextToken</strong> has a value, it is the token for the next query.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of forwarding rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<ListRulesResponseBodyRules> rules;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
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
         * <p>Specifies whether the browser can send credentials. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong></p>
         * </li>
         * <li><p><strong>off</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AllowCredentials")
        public String allowCredentials;

        /**
         * <p>The allowed headers for cross-origin requests.</p>
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
         * <p>The headers that can be exposed to the browser.</p>
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
         * <p>The fixed response. The response can be up to 1 KB in length and can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>dssacav</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The format of the fixed response.</p>
         * <p>Valid values: <strong>text/plain</strong>, <strong>text/css</strong>, <strong>text/html</strong>, <strong>application/javascript</strong>, and <strong>application/json</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>text/plain</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The HTTP status code of the response. Only <strong>HTTP_2xx</strong>, <strong>HTTP_4xx</strong>, and <strong>HTTP_5xx</strong> are supported. <strong>x</strong> is a digit.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP_2xx</p>
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
        /**
         * <p>Specifies whether to enable session persistence among server groups. This parameter is available when multiple server groups are specified in \<code>ServerGroupTuples\\</code>.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The timeout period for session persistence. This parameter is available when \<code>Enabled\\</code> is set to \<code>true\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
         * <p>The ID of the destination server group.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-atstuj3rtoptyui****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The weight. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
        /**
         * <p>The session persistence settings for the server groups.</p>
         */
        @NameInMap("ServerGroupStickySession")
        public ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession;

        /**
         * <p>The destination server groups.</p>
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
         * <p>The key of the header to be inserted. The key must be 1 to 40 characters in length. It can contain letters, digits, underscores (_), and hyphens (-). The header key in <code>InsertHeader</code> cannot be the same as the key of a header that has been inserted.</p>
         * <blockquote>
         * <p>You cannot set the key to <strong>Cookie</strong> or <strong>Host</strong>.</p>
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
         * <li><p><strong>ValueType</strong> is set to <strong>SystemDefined</strong>, you can set the value to:</p>
         * <ul>
         * <li><p><strong>ClientSrcPort</strong>: the client port.</p>
         * </li>
         * <li><p><strong>ClientSrcIp</strong>: the client IP address.</p>
         * </li>
         * <li><p><strong>Protocol</strong>: the protocol of the client request (HTTP or HTTPS).</p>
         * </li>
         * <li><p><strong>SLBId</strong>: the ID of the Application Load Balancer instance.</p>
         * </li>
         * <li><p><strong>SLBPort</strong>: the listening port of the Application Load Balancer instance.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>ValueType</strong> is set to <strong>UserDefined</strong>: you can specify a custom header value. The value must be 1 to 128 characters in length. It can contain printable characters with ASCII values from <code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. It can also contain wildcard characters, including asterisks (\*) and question marks (?). The value cannot start or end with a space.</p>
         * </li>
         * <li><p>If <strong>ValueType</strong> is set to <strong>ReferenceHeader</strong>: you can reference a field in the request header. The value must be 1 to 128 characters in length. It can contain lowercase letters, digits, hyphens (-), and underscores (_).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ClientSrcPort</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The type of the header value. Valid values:</p>
         * <ul>
         * <li><p><strong>UserDefined</strong>: a user-defined value.</p>
         * </li>
         * <li><p><strong>ReferenceHeader</strong>: a value that is referenced from a field in the request header.</p>
         * </li>
         * <li><p><strong>SystemDefined</strong>: a system-defined value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SystemDefined</p>
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
         * <p>The destination host to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><p><strong>${host}</strong> (default): If you set the value to ${host}, you cannot add other characters to the value.</p>
         * </li>
         * <li><p>A value that meets the following requirements:</p>
         * <ul>
         * <li><p>The host must be 3 to 128 characters in length. It can contain lowercase letters, digits, hyphens (-), periods (.), asterisks (\*), and question marks (?).</p>
         * </li>
         * <li><p>The host must contain at least one period (.). A period (.) cannot be the first or last character.</p>
         * </li>
         * <li><p>The rightmost domain label can contain only letters and wildcard characters. It cannot contain digits or hyphens (-).</p>
         * </li>
         * <li><p>The domain labels cannot start or end with a hyphen (-).</p>
         * </li>
         * <li><p>You can use asterisks (\*) and question marks (?) anywhere in a domain label.</p>
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
         * <p>The redirection method. Valid values: <strong>301</strong>, <strong>302</strong>, <strong>303</strong>, <strong>307</strong>, and <strong>308</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>301</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        /**
         * <p>The destination path to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><p><strong>${path}</strong> (default): You can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can be used at most once. You can use these variables together or combine them with a string.</p>
         * </li>
         * <li><p>A value that meets the following requirements:</p>
         * <ul>
         * <li><p>The value must be 1 to 128 characters in length.</p>
         * </li>
         * <li><p>It must start with a forward slash (/). It can contain letters, digits, and the following special characters: <code>$-_.+/&amp;~@:</code>. It cannot contain the following special characters: <code>“%#;!()[]^,” </code>. It can contain asterisks (\*) and question marks (?).</p>
         * </li>
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
         * <p>The destination port to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><p><strong>${port}</strong> (default): If you set the value to ${port}, you cannot add other characters to the value.</p>
         * </li>
         * <li><p>1 to <strong>63335</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The destination protocol to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><p><strong>${protocol}</strong> (default): If you set the value to ${protocol}, you cannot add other characters to the value.</p>
         * </li>
         * <li><p><strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>HTTPS listeners support only HTTPS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The query string of the destination to which requests are redirected. The query string must be 1 to 128 characters in length. It can contain lowercase letters and printable characters. It cannot contain <code>#[]{}\\|&lt;&gt;&amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>quert</p>
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
         * <p>The key of the header to be removed. The key must be 1 to 40 characters in length. It can contain letters, digits, underscores (_), and hyphens (-). The header key in RemoveHeader cannot be the same as the key of a header that has been removed.</p>
         * <ul>
         * <li><p>If Direction is set to Request, you cannot remove the following headers (case-insensitive): <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, and <code>authority</code>.</p>
         * </li>
         * <li><p>If Direction is set to Response, you cannot remove the following headers (case-insensitive): <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, and <code>transfer-encoding</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>key</p>
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
         * <p>The destination host to which requests are redirected. Valid values:</p>
         * <ul>
         * <li><p><strong>${host}</strong> (default): If you set the value to ${host}, you cannot add other characters to the value.</p>
         * </li>
         * <li><p>A value that meets the following requirements:</p>
         * <ul>
         * <li><p>The host must be 3 to 128 characters in length. It can contain lowercase letters, digits, hyphens (-), periods (.), asterisks (\*), and question marks (?).</p>
         * </li>
         * <li><p>The host must contain at least one period (.). A period (.) cannot be the first or last character.</p>
         * </li>
         * <li><p>The rightmost domain label can contain only letters and wildcard characters. It cannot contain digits or hyphens (-).</p>
         * </li>
         * <li><p>The domain labels cannot start or end with a hyphen (-).</p>
         * </li>
         * <li><p>You can use asterisks (\*) and question marks (?) anywhere in a domain label.</p>
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
         * <p>The destination path to which requests are redirected. The path must be 1 to 128 characters in length. It must start with a forward slash (/). It can contain letters, digits, asterisks (\*), question marks (?), and the following special characters: <code>$-_.+/&amp;~@:</code>. It cannot contain <code>“%#;!()[]^,” </code>.</p>
         * 
         * <strong>example:</strong>
         * <p>/tsdf</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The query string of the destination to which requests are redirected. The query string must be 1 to 128 characters in length. It can contain lowercase letters and printable characters. It cannot contain <code>#[]{}\\|&lt;&gt;&amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>quedsa</p>
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
         * <p>The QPS of a single IP address. Valid values: 1 to <strong>100000</strong>.</p>
         * <blockquote>
         * <p>If you set both QPS and <strong>PerIpQps</strong>, the value of <strong>PerIpQps</strong> must be smaller than the value of <strong>QPS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("PerIpQps")
        public Integer perIpQps;

        /**
         * <p>The queries per second (QPS). Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
         * 
         * <strong>example:</strong>
         * <p>sgp-00mkgijak0w4qgz9****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The weight. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>The server groups to which traffic is mirrored.</p>
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
         * <p>The server group to which traffic is mirrored.</p>
         */
        @NameInMap("MirrorGroupConfig")
        public ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig;

        /**
         * <p>The destination of traffic mirroring. The value can be \<code>ForwardGroupMirror\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroupMirror</p>
         */
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
         * <p>The configuration of the fixed response.</p>
         */
        @NameInMap("FixedResponseConfig")
        public ListRulesResponseBodyRulesRuleActionsFixedResponseConfig fixedResponseConfig;

        /**
         * <p>The configuration of the forwarding group.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public ListRulesResponseBodyRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The configuration of the header to be inserted.</p>
         */
        @NameInMap("InsertHeaderConfig")
        public ListRulesResponseBodyRulesRuleActionsInsertHeaderConfig insertHeaderConfig;

        /**
         * <p>The order of the action. Valid values: 1 to 50000. A smaller value indicates a higher priority. The value of this parameter cannot be the same as the value of <strong>Order</strong> for other actions of the same rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The configuration of the redirection.</p>
         */
        @NameInMap("RedirectConfig")
        public ListRulesResponseBodyRulesRuleActionsRedirectConfig redirectConfig;

        /**
         * <p>The configuration for removing a header.</p>
         */
        @NameInMap("RemoveHeaderConfig")
        public ListRulesResponseBodyRulesRuleActionsRemoveHeaderConfig removeHeaderConfig;

        /**
         * <p>The configuration of the rewrite.</p>
         */
        @NameInMap("RewriteConfig")
        public ListRulesResponseBodyRulesRuleActionsRewriteConfig rewriteConfig;

        /**
         * <p>The configuration of throttling.</p>
         */
        @NameInMap("TrafficLimitConfig")
        public ListRulesResponseBodyRulesRuleActionsTrafficLimitConfig trafficLimitConfig;

        /**
         * <p>The configuration of traffic mirroring.</p>
         */
        @NameInMap("TrafficMirrorConfig")
        public ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfig trafficMirrorConfig;

        /**
         * <p>The type of the action. Valid values:</p>
         * <ul>
         * <li><p><strong>ForwardGroup</strong>: forwards requests to multiple vServer groups.</p>
         * </li>
         * <li><p><strong>Redirect</strong>: redirects requests.</p>
         * </li>
         * <li><p><strong>FixedResponse</strong>: returns a fixed response.</p>
         * </li>
         * <li><p><strong>Rewrite</strong>: rewrites a request.</p>
         * </li>
         * <li><p><strong>InsertHeader</strong>: inserts a header.</p>
         * </li>
         * <li><p><strong>RemoveHeaderConfig</strong>: removes a header.</p>
         * </li>
         * <li><p><strong>TrafficLimitConfig</strong>: throttles traffic.</p>
         * </li>
         * <li><p><strong>TrafficMirrorConfig</strong>: mirrors traffic.</p>
         * </li>
         * <li><p><strong>CorsConfig</strong>: enables cross-origin resource sharing (CORS).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroup</p>
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
         * <p>The key of the cookie. The key must be 1 to 100 characters in length. It can contain lowercase letters, printable characters, asterisks (\*), and question marks (?). It cannot contain spaces or the following special characters: <code>#[]{}\\|&lt;&gt;&amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the cookie. The value must be 1 to 128 characters in length. It can contain lowercase letters, printable characters, asterisks (\*), and question marks (?). It cannot contain spaces or the following special characters: <code>#[]{}\\|&lt;&gt;&amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>The cookie values.</p>
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
         * <p>The key of the header. The key must be 1 to 40 characters in length. It can contain letters, digits, hyphens (-), and underscores (_). You cannot set the key to Cookie or Host.</p>
         * 
         * <strong>example:</strong>
         * <p>Port</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The header values.</p>
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
         * <p>The key of the query string. The key must be 1 to 100 characters in length. It can contain lowercase letters, printable characters, asterisks (\*), and question marks (?). It cannot contain spaces or the following special characters: <code>#[]{}\\|&lt;&gt;&amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the query string. The value must be 1 to 128 characters in length. It can contain lowercase letters, printable characters, asterisks (\*), and question marks (?). It cannot contain spaces or the following special characters: <code>#[]{}\\|&lt;&gt;&amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>The query strings.</p>
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
         * <p>The key of the response HTTP header. The key must be 1 to 40 characters in length. It can contain letters, digits, hyphens (-), and underscores (_). You cannot set the key to Cookie or Host.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of the response HTTP header.</p>
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
         * <p>The source IP addresses to match.</p>
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
         * <p>The configuration of the host.</p>
         */
        @NameInMap("HostConfig")
        public ListRulesResponseBodyRulesRuleConditionsHostConfig hostConfig;

        /**
         * <p>The configuration of the request method.</p>
         */
        @NameInMap("MethodConfig")
        public ListRulesResponseBodyRulesRuleConditionsMethodConfig methodConfig;

        /**
         * <p>The configuration of the path.</p>
         */
        @NameInMap("PathConfig")
        public ListRulesResponseBodyRulesRuleConditionsPathConfig pathConfig;

        /**
         * <p>The configuration of the query string.</p>
         */
        @NameInMap("QueryStringConfig")
        public ListRulesResponseBodyRulesRuleConditionsQueryStringConfig queryStringConfig;

        /**
         * <p>The configuration of the response HTTP header.</p>
         */
        @NameInMap("ResponseHeaderConfig")
        public ListRulesResponseBodyRulesRuleConditionsResponseHeaderConfig responseHeaderConfig;

        /**
         * <p>The configuration of the response status code.</p>
         */
        @NameInMap("ResponseStatusCodeConfig")
        public ListRulesResponseBodyRulesRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig;

        /**
         * <p>The configuration of the source IP address.</p>
         */
        @NameInMap("SourceIpConfig")
        public ListRulesResponseBodyRulesRuleConditionsSourceIpConfig sourceIpConfig;

        /**
         * <p>The type of the forwarding rule. Valid values:</p>
         * <ul>
         * <li><p><strong>Host</strong>: a host.</p>
         * </li>
         * <li><p><strong>Path</strong>: a path.</p>
         * </li>
         * <li><p><strong>Header</strong>: an HTTP header.</p>
         * </li>
         * <li><p><strong>QueryString</strong>: a query string.</p>
         * </li>
         * <li><p><strong>Method</strong>: a request method.</p>
         * </li>
         * <li><p><strong>Cookie</strong>: a cookie.</p>
         * </li>
         * <li><p><strong>SourceIp</strong>: a source IP address.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Host</p>
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
        /**
         * <p>The tag key. The tag key can be up to 128 characters in length. It cannot start with \<code>aliyun\\</code> or \<code>acs:\\</code>, and cannot contain \<code>http\\://\\</code> or \<code>https\\://\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length. It cannot start with \<code>aliyun\\</code> or \<code>acs:\\</code>, and cannot contain \<code>http\\://\\</code> or \<code>https\\://\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
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
         * <p>The direction of the forwarding rule. Valid values:</p>
         * <ul>
         * <li><p>Request (default): The forwarding rule is applied to requests. ALB matches conditions in the requests sent from clients and performs the specified actions.</p>
         * </li>
         * <li><p>Response: The forwarding rule is applied to responses. ALB matches conditions in the responses sent from backend servers and performs the specified actions.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Basic ALB instances do not support the Response type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Request</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The ID of the listener to which the forwarding rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-i35udpz3pxsmnf****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The ID of the SLB instance to which the forwarding rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-x30o38azsuj0sx****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The priority of the rule. A smaller value indicates a higher priority. Valid values: 1 to <strong>10000</strong>.</p>
         * <blockquote>
         * <p>The priority of each rule must be unique within a listener.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The actions of the forwarding rule.</p>
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
         * 
         * <strong>example:</strong>
         * <p>rule-bpn0kn908w4nbw****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the forwarding rule. The name must be 2 to 128 characters in length, start with a letter or a Chinese character, and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>rule-instance-test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the forwarding rule. Valid values:</p>
         * <ul>
         * <li><p><strong>Provisioning</strong>: The rule is being created.</p>
         * </li>
         * <li><p><strong>Configuring</strong>: The rule is being modified.</p>
         * </li>
         * <li><p><strong>Available</strong>: The rule is running.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("RuleStatus")
        public String ruleStatus;

        /**
         * <p>The tags.</p>
         */
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
