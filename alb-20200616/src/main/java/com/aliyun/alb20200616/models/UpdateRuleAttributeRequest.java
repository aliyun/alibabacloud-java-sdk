// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateRuleAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("RuleActions")
    public java.util.List<UpdateRuleAttributeRequestRuleActions> ruleActions;

    @NameInMap("RuleConditions")
    public java.util.List<UpdateRuleAttributeRequestRuleConditions> ruleConditions;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    public static UpdateRuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleAttributeRequest self = new UpdateRuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRuleAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRuleAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateRuleAttributeRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateRuleAttributeRequest setRuleActions(java.util.List<UpdateRuleAttributeRequestRuleActions> ruleActions) {
        this.ruleActions = ruleActions;
        return this;
    }
    public java.util.List<UpdateRuleAttributeRequestRuleActions> getRuleActions() {
        return this.ruleActions;
    }

    public UpdateRuleAttributeRequest setRuleConditions(java.util.List<UpdateRuleAttributeRequestRuleConditions> ruleConditions) {
        this.ruleConditions = ruleConditions;
        return this;
    }
    public java.util.List<UpdateRuleAttributeRequestRuleConditions> getRuleConditions() {
        return this.ruleConditions;
    }

    public UpdateRuleAttributeRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateRuleAttributeRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public static class UpdateRuleAttributeRequestRuleActionsFixedResponseConfig extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("HttpCode")
        public String httpCode;

        public static UpdateRuleAttributeRequestRuleActionsFixedResponseConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsFixedResponseConfig self = new UpdateRuleAttributeRequestRuleActionsFixedResponseConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsFixedResponseConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateRuleAttributeRequestRuleActionsFixedResponseConfig setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public UpdateRuleAttributeRequestRuleActionsFixedResponseConfig setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Timeout")
        public Integer timeout;

        public static UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession self = new UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        @NameInMap("Weight")
        public Integer weight;

        public static UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples self = new UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsForwardGroupConfig extends TeaModel {
        @NameInMap("ServerGroupStickySession")
        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession;

        @NameInMap("ServerGroupTuples")
        public java.util.List<UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static UpdateRuleAttributeRequestRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsForwardGroupConfig self = new UpdateRuleAttributeRequestRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfig setServerGroupStickySession(UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession) {
            this.serverGroupStickySession = serverGroupStickySession;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupStickySession getServerGroupStickySession() {
            return this.serverGroupStickySession;
        }

        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfig setServerGroupTuples(java.util.List<UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<UpdateRuleAttributeRequestRuleActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueType")
        public String valueType;

        public static UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig self = new UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsRedirectConfig extends TeaModel {
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

        public static UpdateRuleAttributeRequestRuleActionsRedirectConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsRedirectConfig self = new UpdateRuleAttributeRequestRuleActionsRedirectConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsRedirectConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateRuleAttributeRequestRuleActionsRedirectConfig setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

        public UpdateRuleAttributeRequestRuleActionsRedirectConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateRuleAttributeRequestRuleActionsRedirectConfig setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public UpdateRuleAttributeRequestRuleActionsRedirectConfig setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateRuleAttributeRequestRuleActionsRedirectConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsRewriteConfig extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Path")
        public String path;

        @NameInMap("Query")
        public String query;

        public static UpdateRuleAttributeRequestRuleActionsRewriteConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsRewriteConfig self = new UpdateRuleAttributeRequestRuleActionsRewriteConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsRewriteConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateRuleAttributeRequestRuleActionsRewriteConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateRuleAttributeRequestRuleActionsRewriteConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig extends TeaModel {
        @NameInMap("PerIpQps")
        public Integer perIpQps;

        @NameInMap("QPS")
        public Integer QPS;

        public static UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig self = new UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig setPerIpQps(Integer perIpQps) {
            this.perIpQps = perIpQps;
            return this;
        }
        public Integer getPerIpQps() {
            return this.perIpQps;
        }

        public UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig setQPS(Integer QPS) {
            this.QPS = QPS;
            return this;
        }
        public Integer getQPS() {
            return this.QPS;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples extends TeaModel {
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples self = new UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig extends TeaModel {
        @NameInMap("ServerGroupTuples")
        public java.util.List<UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> serverGroupTuples;

        public static UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig self = new UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig setServerGroupTuples(java.util.List<UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig extends TeaModel {
        @NameInMap("MirrorGroupConfig")
        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig;

        @NameInMap("TargetType")
        public String targetType;

        public static UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig self = new UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig setMirrorGroupConfig(UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig) {
            this.mirrorGroupConfig = mirrorGroupConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig getMirrorGroupConfig() {
            return this.mirrorGroupConfig;
        }

        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class UpdateRuleAttributeRequestRuleActions extends TeaModel {
        @NameInMap("FixedResponseConfig")
        public UpdateRuleAttributeRequestRuleActionsFixedResponseConfig fixedResponseConfig;

        @NameInMap("ForwardGroupConfig")
        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfig forwardGroupConfig;

        @NameInMap("InsertHeaderConfig")
        public UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig insertHeaderConfig;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("RedirectConfig")
        public UpdateRuleAttributeRequestRuleActionsRedirectConfig redirectConfig;

        @NameInMap("RewriteConfig")
        public UpdateRuleAttributeRequestRuleActionsRewriteConfig rewriteConfig;

        @NameInMap("TrafficLimitConfig")
        public UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig trafficLimitConfig;

        @NameInMap("TrafficMirrorConfig")
        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig trafficMirrorConfig;

        @NameInMap("Type")
        public String type;

        public static UpdateRuleAttributeRequestRuleActions build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleActions self = new UpdateRuleAttributeRequestRuleActions();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleActions setFixedResponseConfig(UpdateRuleAttributeRequestRuleActionsFixedResponseConfig fixedResponseConfig) {
            this.fixedResponseConfig = fixedResponseConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsFixedResponseConfig getFixedResponseConfig() {
            return this.fixedResponseConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setForwardGroupConfig(UpdateRuleAttributeRequestRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setInsertHeaderConfig(UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig insertHeaderConfig) {
            this.insertHeaderConfig = insertHeaderConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsInsertHeaderConfig getInsertHeaderConfig() {
            return this.insertHeaderConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public UpdateRuleAttributeRequestRuleActions setRedirectConfig(UpdateRuleAttributeRequestRuleActionsRedirectConfig redirectConfig) {
            this.redirectConfig = redirectConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsRedirectConfig getRedirectConfig() {
            return this.redirectConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setRewriteConfig(UpdateRuleAttributeRequestRuleActionsRewriteConfig rewriteConfig) {
            this.rewriteConfig = rewriteConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsRewriteConfig getRewriteConfig() {
            return this.rewriteConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setTrafficLimitConfig(UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig trafficLimitConfig) {
            this.trafficLimitConfig = trafficLimitConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsTrafficLimitConfig getTrafficLimitConfig() {
            return this.trafficLimitConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setTrafficMirrorConfig(UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig trafficMirrorConfig) {
            this.trafficMirrorConfig = trafficMirrorConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleActionsTrafficMirrorConfig getTrafficMirrorConfig() {
            return this.trafficMirrorConfig;
        }

        public UpdateRuleAttributeRequestRuleActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsCookieConfigValues extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateRuleAttributeRequestRuleConditionsCookieConfigValues build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsCookieConfigValues self = new UpdateRuleAttributeRequestRuleConditionsCookieConfigValues();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsCookieConfigValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRuleAttributeRequestRuleConditionsCookieConfigValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsCookieConfig extends TeaModel {
        @NameInMap("Values")
        public java.util.List<UpdateRuleAttributeRequestRuleConditionsCookieConfigValues> values;

        public static UpdateRuleAttributeRequestRuleConditionsCookieConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsCookieConfig self = new UpdateRuleAttributeRequestRuleConditionsCookieConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsCookieConfig setValues(java.util.List<UpdateRuleAttributeRequestRuleConditionsCookieConfigValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<UpdateRuleAttributeRequestRuleConditionsCookieConfigValues> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsHeaderConfig extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRuleAttributeRequestRuleConditionsHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsHeaderConfig self = new UpdateRuleAttributeRequestRuleConditionsHeaderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRuleAttributeRequestRuleConditionsHeaderConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsHostConfig extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRuleAttributeRequestRuleConditionsHostConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsHostConfig self = new UpdateRuleAttributeRequestRuleConditionsHostConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsHostConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsMethodConfig extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRuleAttributeRequestRuleConditionsMethodConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsMethodConfig self = new UpdateRuleAttributeRequestRuleConditionsMethodConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsMethodConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsPathConfig extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRuleAttributeRequestRuleConditionsPathConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsPathConfig self = new UpdateRuleAttributeRequestRuleConditionsPathConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsPathConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues self = new UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsQueryStringConfig extends TeaModel {
        @NameInMap("Values")
        public java.util.List<UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues> values;

        public static UpdateRuleAttributeRequestRuleConditionsQueryStringConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsQueryStringConfig self = new UpdateRuleAttributeRequestRuleConditionsQueryStringConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsQueryStringConfig setValues(java.util.List<UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<UpdateRuleAttributeRequestRuleConditionsQueryStringConfigValues> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditionsSourceIpConfig extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRuleAttributeRequestRuleConditionsSourceIpConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditionsSourceIpConfig self = new UpdateRuleAttributeRequestRuleConditionsSourceIpConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditionsSourceIpConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRuleAttributeRequestRuleConditions extends TeaModel {
        @NameInMap("CookieConfig")
        public UpdateRuleAttributeRequestRuleConditionsCookieConfig cookieConfig;

        @NameInMap("HeaderConfig")
        public UpdateRuleAttributeRequestRuleConditionsHeaderConfig headerConfig;

        @NameInMap("HostConfig")
        public UpdateRuleAttributeRequestRuleConditionsHostConfig hostConfig;

        @NameInMap("MethodConfig")
        public UpdateRuleAttributeRequestRuleConditionsMethodConfig methodConfig;

        @NameInMap("PathConfig")
        public UpdateRuleAttributeRequestRuleConditionsPathConfig pathConfig;

        @NameInMap("QueryStringConfig")
        public UpdateRuleAttributeRequestRuleConditionsQueryStringConfig queryStringConfig;

        @NameInMap("SourceIpConfig")
        public UpdateRuleAttributeRequestRuleConditionsSourceIpConfig sourceIpConfig;

        @NameInMap("Type")
        public String type;

        public static UpdateRuleAttributeRequestRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleAttributeRequestRuleConditions self = new UpdateRuleAttributeRequestRuleConditions();
            return TeaModel.build(map, self);
        }

        public UpdateRuleAttributeRequestRuleConditions setCookieConfig(UpdateRuleAttributeRequestRuleConditionsCookieConfig cookieConfig) {
            this.cookieConfig = cookieConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsCookieConfig getCookieConfig() {
            return this.cookieConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setHeaderConfig(UpdateRuleAttributeRequestRuleConditionsHeaderConfig headerConfig) {
            this.headerConfig = headerConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsHeaderConfig getHeaderConfig() {
            return this.headerConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setHostConfig(UpdateRuleAttributeRequestRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setMethodConfig(UpdateRuleAttributeRequestRuleConditionsMethodConfig methodConfig) {
            this.methodConfig = methodConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsMethodConfig getMethodConfig() {
            return this.methodConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setPathConfig(UpdateRuleAttributeRequestRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setQueryStringConfig(UpdateRuleAttributeRequestRuleConditionsQueryStringConfig queryStringConfig) {
            this.queryStringConfig = queryStringConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsQueryStringConfig getQueryStringConfig() {
            return this.queryStringConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setSourceIpConfig(UpdateRuleAttributeRequestRuleConditionsSourceIpConfig sourceIpConfig) {
            this.sourceIpConfig = sourceIpConfig;
            return this;
        }
        public UpdateRuleAttributeRequestRuleConditionsSourceIpConfig getSourceIpConfig() {
            return this.sourceIpConfig;
        }

        public UpdateRuleAttributeRequestRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
