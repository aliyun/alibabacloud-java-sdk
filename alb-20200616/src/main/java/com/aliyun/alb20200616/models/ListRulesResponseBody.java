// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListRulesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<ListRulesResponseBodyRules> rules;

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
        @NameInMap("Content")
        public String content;

        @NameInMap("ContentType")
        public String contentType;

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

    public static class ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        @NameInMap("ServerGroupId")
        public String serverGroupId;

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
        @NameInMap("ServerGroupTuples")
        public java.util.List<ListRulesResponseBodyRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static ListRulesResponseBodyRulesRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRulesRuleActionsForwardGroupConfig self = new ListRulesResponseBodyRulesRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
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
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

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
        @NameInMap("Host")
        public String host;

        @NameInMap("HttpCode")
        public String httpCode;

        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Protocol")
        public String protocol;

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

    public static class ListRulesResponseBodyRulesRuleActionsRewriteConfig extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Path")
        public String path;

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
        @NameInMap("PerIpQps")
        public Integer perIpQps;

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
        @NameInMap("ServerGroupId")
        public String serverGroupId;

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
        @NameInMap("MirrorGroupConfig")
        public ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig;

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

    }

    public static class ListRulesResponseBodyRulesRuleActions extends TeaModel {
        @NameInMap("CorsConfig")
        public ListRulesResponseBodyRulesRuleActionsCorsConfig corsConfig;

        @NameInMap("FixedResponseConfig")
        public ListRulesResponseBodyRulesRuleActionsFixedResponseConfig fixedResponseConfig;

        @NameInMap("ForwardGroupConfig")
        public ListRulesResponseBodyRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        @NameInMap("InsertHeaderConfig")
        public ListRulesResponseBodyRulesRuleActionsInsertHeaderConfig insertHeaderConfig;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("RedirectConfig")
        public ListRulesResponseBodyRulesRuleActionsRedirectConfig redirectConfig;

        @NameInMap("RewriteConfig")
        public ListRulesResponseBodyRulesRuleActionsRewriteConfig rewriteConfig;

        @NameInMap("TrafficLimitConfig")
        public ListRulesResponseBodyRulesRuleActionsTrafficLimitConfig trafficLimitConfig;

        @NameInMap("TrafficMirrorConfig")
        public ListRulesResponseBodyRulesRuleActionsTrafficMirrorConfig trafficMirrorConfig;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("Key")
        public String key;

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

    public static class ListRulesResponseBodyRulesRuleConditionsSourceIpConfig extends TeaModel {
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
        @NameInMap("CookieConfig")
        public ListRulesResponseBodyRulesRuleConditionsCookieConfig cookieConfig;

        @NameInMap("HeaderConfig")
        public ListRulesResponseBodyRulesRuleConditionsHeaderConfig headerConfig;

        @NameInMap("HostConfig")
        public ListRulesResponseBodyRulesRuleConditionsHostConfig hostConfig;

        @NameInMap("MethodConfig")
        public ListRulesResponseBodyRulesRuleConditionsMethodConfig methodConfig;

        @NameInMap("PathConfig")
        public ListRulesResponseBodyRulesRuleConditionsPathConfig pathConfig;

        @NameInMap("QueryStringConfig")
        public ListRulesResponseBodyRulesRuleConditionsQueryStringConfig queryStringConfig;

        @NameInMap("SourceIpConfig")
        public ListRulesResponseBodyRulesRuleConditionsSourceIpConfig sourceIpConfig;

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

    public static class ListRulesResponseBodyRules extends TeaModel {
        @NameInMap("ListenerId")
        public String listenerId;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RuleActions")
        public java.util.List<ListRulesResponseBodyRulesRuleActions> ruleActions;

        @NameInMap("RuleConditions")
        public java.util.List<ListRulesResponseBodyRulesRuleConditions> ruleConditions;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleStatus")
        public String ruleStatus;

        public static ListRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyRules self = new ListRulesResponseBodyRules();
            return TeaModel.build(map, self);
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

    }

}
