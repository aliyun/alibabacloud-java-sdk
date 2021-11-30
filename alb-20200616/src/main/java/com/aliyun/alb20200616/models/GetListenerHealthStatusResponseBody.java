// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetListenerHealthStatusResponseBody extends TeaModel {
    // 监听健康检查结果
    @NameInMap("ListenerHealthStatus")
    public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatus> listenerHealthStatus;

    // 下一页标识
    @NameInMap("NextToken")
    public String nextToken;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 转发规则健康检查结果
    @NameInMap("RuleHealthStatus")
    public java.util.List<GetListenerHealthStatusResponseBodyRuleHealthStatus> ruleHealthStatus;

    public static GetListenerHealthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetListenerHealthStatusResponseBody self = new GetListenerHealthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetListenerHealthStatusResponseBody setListenerHealthStatus(java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatus> listenerHealthStatus) {
        this.listenerHealthStatus = listenerHealthStatus;
        return this;
    }
    public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatus> getListenerHealthStatus() {
        return this.listenerHealthStatus;
    }

    public GetListenerHealthStatusResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetListenerHealthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetListenerHealthStatusResponseBody setRuleHealthStatus(java.util.List<GetListenerHealthStatusResponseBodyRuleHealthStatus> ruleHealthStatus) {
        this.ruleHealthStatus = ruleHealthStatus;
        return this;
    }
    public java.util.List<GetListenerHealthStatusResponseBodyRuleHealthStatus> getRuleHealthStatus() {
        return this.ruleHealthStatus;
    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason extends TeaModel {
        // 后端实际的返回码信息
        @NameInMap("ActualResponse")
        public String actualResponse;

        // 用户预期的后端返回码信息
        @NameInMap("ExpectedResponse")
        public String expectedResponse;

        // 失败reasonCode
        @NameInMap("ReasonCode")
        public String reasonCode;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason self = new GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason setActualResponse(String actualResponse) {
            this.actualResponse = actualResponse;
            return this;
        }
        public String getActualResponse() {
            return this.actualResponse;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason setExpectedResponse(String expectedResponse) {
            this.expectedResponse = expectedResponse;
            return this;
        }
        public String getExpectedResponse() {
            return this.expectedResponse;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers extends TeaModel {
        // 后端服务器端口
        @NameInMap("Port")
        public Integer port;

        // status为非正常状态时的详细异常原因
        @NameInMap("Reason")
        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason reason;

        // 后端服务器id
        @NameInMap("ServerId")
        public String serverId;

        // 后端服务器Ip
        @NameInMap("ServerIp")
        public String serverIp;

        // 健康检查状态
        @NameInMap("Status")
        public String status;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers self = new GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers setReason(GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason reason) {
            this.reason = reason;
            return this;
        }
        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason getReason() {
            return this.reason;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos extends TeaModel {
        // 服务器组使用类型
        @NameInMap("ActionType")
        public String actionType;

        // 健康检查开启/关闭
        @NameInMap("HealthCheckEnabled")
        public String healthCheckEnabled;

        // 处于非正常状态的后端服务器
        @NameInMap("NonNormalServers")
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers> nonNormalServers;

        // 服务器组ID
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos self = new GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos setHealthCheckEnabled(String healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public String getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos setNonNormalServers(java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers> nonNormalServers) {
            this.nonNormalServers = nonNormalServers;
            return this;
        }
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers> getNonNormalServers() {
            return this.nonNormalServers;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatus extends TeaModel {
        // 监听Id
        @NameInMap("ListenerId")
        public String listenerId;

        // 监听的端口号
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        // 监听的协议
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        // 服务器组健康检查结果
        @NameInMap("ServerGroupInfos")
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos> serverGroupInfos;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatus build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatus self = new GetListenerHealthStatusResponseBodyListenerHealthStatus();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatus setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatus setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatus setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatus setServerGroupInfos(java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos> serverGroupInfos) {
            this.serverGroupInfos = serverGroupInfos;
            return this;
        }
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos> getServerGroupInfos() {
            return this.serverGroupInfos;
        }

    }

    public static class GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServersReason extends TeaModel {
        // 后端实际的返回码信息
        @NameInMap("ActualResponse")
        public String actualResponse;

        // 用户预期的后端返回码信息
        @NameInMap("ExpectedResponse")
        public String expectedResponse;

        // 失败reasonCode
        @NameInMap("ReasonCode")
        public String reasonCode;

        public static GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServersReason build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServersReason self = new GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServersReason();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServersReason setActualResponse(String actualResponse) {
            this.actualResponse = actualResponse;
            return this;
        }
        public String getActualResponse() {
            return this.actualResponse;
        }

        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServersReason setExpectedResponse(String expectedResponse) {
            this.expectedResponse = expectedResponse;
            return this;
        }
        public String getExpectedResponse() {
            return this.expectedResponse;
        }

        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServersReason setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

    }

    public static class GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServers extends TeaModel {
        // 后端服务器端口
        @NameInMap("Port")
        public Integer port;

        // status为非正常状态时的详细异常原因
        @NameInMap("Reason")
        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServersReason reason;

        // 后端服务器Id
        @NameInMap("ServerId")
        public String serverId;

        // 后端服务器ID
        @NameInMap("ServerIp")
        public String serverIp;

        // 健康检查状态
        @NameInMap("Status")
        public String status;

        public static GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServers build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServers self = new GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServers();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServers setReason(GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServersReason reason) {
            this.reason = reason;
            return this;
        }
        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServersReason getReason() {
            return this.reason;
        }

        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServers setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfos extends TeaModel {
        // 服务器组使用类型
        @NameInMap("ActionType")
        public String actionType;

        // 健康检查开启/关闭
        @NameInMap("HealthCheckEnabled")
        public String healthCheckEnabled;

        // 处于非正常状态的后端服务器
        @NameInMap("NonNormalServers")
        public java.util.List<GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServers> nonNormalServers;

        // 服务器组ID
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfos build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfos self = new GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfos();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfos setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfos setHealthCheckEnabled(String healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public String getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfos setNonNormalServers(java.util.List<GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServers> nonNormalServers) {
            this.nonNormalServers = nonNormalServers;
            return this;
        }
        public java.util.List<GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServers> getNonNormalServers() {
            return this.nonNormalServers;
        }

        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfos setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

    public static class GetListenerHealthStatusResponseBodyRuleHealthStatus extends TeaModel {
        // 转发规则ID
        @NameInMap("RuleId")
        public String ruleId;

        // 服务器组健康检查结果
        @NameInMap("ServerGroupInfos")
        public java.util.List<GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfos> serverGroupInfos;

        public static GetListenerHealthStatusResponseBodyRuleHealthStatus build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyRuleHealthStatus self = new GetListenerHealthStatusResponseBodyRuleHealthStatus();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyRuleHealthStatus setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetListenerHealthStatusResponseBodyRuleHealthStatus setServerGroupInfos(java.util.List<GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfos> serverGroupInfos) {
            this.serverGroupInfos = serverGroupInfos;
            return this;
        }
        public java.util.List<GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfos> getServerGroupInfos() {
            return this.serverGroupInfos;
        }

    }

}
