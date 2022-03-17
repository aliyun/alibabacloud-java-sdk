// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    // 幂等标识
    @NameInMap("ClientToken")
    public String clientToken;

    // 是否只预检此次请求
    @NameInMap("DryRun")
    public Boolean dryRun;

    // 监听标识
    @NameInMap("ListenerId")
    public String listenerId;

    // 转发规则优先级
    @NameInMap("Priority")
    public Integer priority;

    // 转发规则动作
    @NameInMap("RuleActions")
    public java.util.List<CreateRuleRequestRuleActions> ruleActions;

    // 转发规则条件
    @NameInMap("RuleConditions")
    public java.util.List<CreateRuleRequestRuleConditions> ruleConditions;

    // 转发规则名称
    @NameInMap("RuleName")
    public String ruleName;

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

    public static class CreateRuleRequestRuleActionsFixedResponseConfig extends TeaModel {
        // 内容
        @NameInMap("Content")
        public String content;

        // 内容类型
        @NameInMap("ContentType")
        public String contentType;

        // HTTP响应码
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
        // 是否开启会话保持
        @NameInMap("Enabled")
        public Boolean enabled;

        // 超时时间
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
        // 服务器组标识
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        // 权重
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
        // 服务器组之间会话保持
        @NameInMap("ServerGroupStickySession")
        public CreateRuleRequestRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession;

        // 转发到的目的服务器组列表
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
        // HTTP标头
        @NameInMap("Key")
        public String key;

        // HTTP标头内容
        @NameInMap("Value")
        public String value;

        // 取值类型
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
        // 要跳转的主机地址
        @NameInMap("Host")
        public String host;

        // 跳转方式
        @NameInMap("HttpCode")
        public String httpCode;

        // 要跳转的路径
        @NameInMap("Path")
        public String path;

        // 要跳转的端口
        @NameInMap("Port")
        public String port;

        // 要跳转的协议
        @NameInMap("Protocol")
        public String protocol;

        // 要跳转的查询字符串
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

    public static class CreateRuleRequestRuleActionsRewriteConfig extends TeaModel {
        // 主机名
        @NameInMap("Host")
        public String host;

        // 路径
        @NameInMap("Path")
        public String path;

        // 查询
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
        @NameInMap("QPS")
        public Integer QPS;

        public static CreateRuleRequestRuleActionsTrafficLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActionsTrafficLimitConfig self = new CreateRuleRequestRuleActionsTrafficLimitConfig();
            return TeaModel.build(map, self);
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
        // 镜像至服务器组
        @NameInMap("MirrorGroupConfig")
        public CreateRuleRequestRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig;

        // 镜像目标类型
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
        // 返回固定内容动作配置
        @NameInMap("FixedResponseConfig")
        public CreateRuleRequestRuleActionsFixedResponseConfig fixedResponseConfig;

        // 转发组动作配置
        @NameInMap("ForwardGroupConfig")
        public CreateRuleRequestRuleActionsForwardGroupConfig forwardGroupConfig;

        // 插入头部动作配置
        @NameInMap("InsertHeaderConfig")
        public CreateRuleRequestRuleActionsInsertHeaderConfig insertHeaderConfig;

        // 优先级
        @NameInMap("Order")
        public Integer order;

        // 重定向动作配置
        @NameInMap("RedirectConfig")
        public CreateRuleRequestRuleActionsRedirectConfig redirectConfig;

        // 内部重定向动作配置
        @NameInMap("RewriteConfig")
        public CreateRuleRequestRuleActionsRewriteConfig rewriteConfig;

        // 流量限速
        @NameInMap("TrafficLimitConfig")
        public CreateRuleRequestRuleActionsTrafficLimitConfig trafficLimitConfig;

        // 流量镜像
        @NameInMap("TrafficMirrorConfig")
        public CreateRuleRequestRuleActionsTrafficMirrorConfig trafficMirrorConfig;

        // 转发规则动作类型
        @NameInMap("Type")
        public String type;

        public static CreateRuleRequestRuleActions build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestRuleActions self = new CreateRuleRequestRuleActions();
            return TeaModel.build(map, self);
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
        // Cookie条件键
        @NameInMap("Key")
        public String key;

        // Cookie条件值
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
        // Cookie键值对列表
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
        // HTTP标头键
        @NameInMap("Key")
        public String key;

        // HTTP标头值列表
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
        // 主机名列表
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
        // HTTP请求方法列表
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
        // 路径条件列表
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
        // 查询字符串条件键
        @NameInMap("Key")
        public String key;

        // 查询字符串条件值
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
        // 查询字符串条件键值对列表
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

    public static class CreateRuleRequestRuleConditionsSourceIpConfig extends TeaModel {
        // 基于源IP业务流量匹配
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
        // Cookie条件配置
        @NameInMap("CookieConfig")
        public CreateRuleRequestRuleConditionsCookieConfig cookieConfig;

        // HTTP标头条件配置
        @NameInMap("HeaderConfig")
        public CreateRuleRequestRuleConditionsHeaderConfig headerConfig;

        // 主机名条件配置
        @NameInMap("HostConfig")
        public CreateRuleRequestRuleConditionsHostConfig hostConfig;

        // HTTP请求方法条件配置
        @NameInMap("MethodConfig")
        public CreateRuleRequestRuleConditionsMethodConfig methodConfig;

        // 路径条件配置
        @NameInMap("PathConfig")
        public CreateRuleRequestRuleConditionsPathConfig pathConfig;

        // 查询字符串条件配置
        @NameInMap("QueryStringConfig")
        public CreateRuleRequestRuleConditionsQueryStringConfig queryStringConfig;

        // 基于源IP业务流量匹配
        @NameInMap("SourceIpConfig")
        public CreateRuleRequestRuleConditionsSourceIpConfig sourceIpConfig;

        // 条件类型
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

}
