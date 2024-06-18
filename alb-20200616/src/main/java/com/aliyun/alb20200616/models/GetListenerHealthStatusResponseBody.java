// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetListenerHealthStatusResponseBody extends TeaModel {
    /**
     * <p>The health check status of the server groups that are associated with the listener.</p>
     */
    @NameInMap("ListenerHealthStatus")
    public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatus> listenerHealthStatus;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
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
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The health check status of the forwarding rules.</p>
     */
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
        /**
         * <p>The HTTP status code returned from the server, for example, <strong>302</strong>.</p>
         * <blockquote>
         * <p>A value is returned only if <code>ReasonCode</code> is set to <strong>RESPONSE_MISMATCH</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>302</p>
         */
        @NameInMap("ActualResponse")
        public String actualResponse;

        /**
         * <p>The HTTP status code returned after backend servers pass health checks.</p>
         * <p>Valid values: <strong>HTTP_2xx</strong>, <strong>HTTP_3xx</strong>, <strong>HTTP_4xx</strong>, and <strong>HTTP_5xx</strong>. Multiple status codes are separated by commas (,).</p>
         * <blockquote>
         * <p>This value is returned only if <strong>ReasonCode</strong> is set to <strong>RESPONSE_MISMATCH</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP_2xx</p>
         */
        @NameInMap("ExpectedResponse")
        public String expectedResponse;

        /**
         * <p>The reason why the value of <strong>Status</strong> is Unhealthy. Only HTTP and HTTPS listeners support this parameter.</p>
         * <ul>
         * <li><strong>CONNECT_TIMEOUT</strong>: ALB failed to connect to the backend server within the specified period of time.</li>
         * <li><strong>CONNECT_FAILED</strong>: ALB failed to connect to the backend server.</li>
         * <li><strong>RECV_RESPONSE_FAILED</strong>: ALB failed to receive a response from the backend server.</li>
         * <li><strong>RECV_RESPONSE_TIMEOUT</strong>: ALB failed to receive a response from the backend server within the specified period of time.</li>
         * <li><strong>SEND_REQUEST_FAILED</strong>: ALB failed to send a request to the backend server.</li>
         * <li><strong>SEND_REQUEST_TIMEOUT</strong>: ALB failed to send a request to the backend server within the specified period of time.</li>
         * <li><strong>RESPONSE_FORMAT_ERROR</strong>: The format of the response from the backend server is invalid.</li>
         * <li><strong>RESPONSE_FORMAT_ERROR</strong>: The HTTP status code returned from the backend server is not the expected one.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RESPONSE_MISMATCH</p>
         */
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
        /**
         * <p>The backend port.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The cause of the abnormal state.</p>
         */
        @NameInMap("Reason")
        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason reason;

        /**
         * <p>The ID of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp1bfa08ex*****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.8.10</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The status of the health check. Valid values: Valid values:</p>
         * <ul>
         * <li><strong>Initial</strong>: indicates that health checks are configured for the NLB instance, but no data was found.</li>
         * <li><strong>Unhealthy</strong>: indicates that the backend server consecutively fails health checks.</li>
         * <li><strong>Unused</strong>: indicates that the weight of the backend server is 0.</li>
         * <li><strong>Unavailable</strong>: indicates that health checks are disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Initial</p>
         */
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
        /**
         * <p>The action specified for the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>TrafficMirror</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>Indicates whether health checks are enabled. If <strong>on</strong> is returned, it indicates that health checks are enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HealthCheckEnabled")
        public String healthCheckEnabled;

        /**
         * <p>A list of unhealthy backend servers.</p>
         */
        @NameInMap("NonNormalServers")
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers> nonNormalServers;

        /**
         * <p>The ID of the server group that is associated with the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>vsp-bp1qjwo61pqz3ahltv****</p>
         */
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
        /**
         * <p>The listener ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The listener port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        /**
         * <p>The listener protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        /**
         * <p>The information about the server groups.</p>
         */
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
        /**
         * <p>The HTTP status code returned from the server, for example, <strong>302</strong>.</p>
         * <blockquote>
         * <p>A value is returned only if <strong>ReasonCode</strong> is set to <strong>RESPONSE_MISMATCH</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>302</p>
         */
        @NameInMap("ActualResponse")
        public String actualResponse;

        /**
         * <p>The HTTP status code returned after backend servers pass health checks.</p>
         * <p>Valid values: <strong>HTTP_2xx</strong>, <strong>HTTP_3xx</strong>, <strong>HTTP_4xx</strong>, and <strong>HTTP_5xx</strong>. Multiple status codes are separated by commas (,).</p>
         * <blockquote>
         * <p>A value is returned only if <strong>ReasonCode</strong> is set to <strong>RESPONSE_MISMATCH</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP_2xx</p>
         */
        @NameInMap("ExpectedResponse")
        public String expectedResponse;

        /**
         * <p>The reason why the value of <strong>Status</strong> is Unhealthy. Only HTTP and HTTPS listeners support this parameter.</p>
         * <ul>
         * <li><strong>CONNECT_TIMEOUT</strong>: ALB failed to connect to the backend server within the specified period of time.</li>
         * <li><strong>CONNECT_FAILED</strong>: ALB failed to connect to the backend server.</li>
         * <li><strong>RECV_RESPONSE_FAILED</strong>: ALB failed to receive a response from the backend server.</li>
         * <li><strong>RECV_RESPONSE_TIMEOUT</strong>: ALB failed to receive a response from the backend server within the specified period of time.</li>
         * <li><strong>SEND_REQUEST_FAILED</strong>: ALB failed to send a request to the backend server.</li>
         * <li><strong>SEND_REQUEST_TIMEOUT</strong>: ALB failed to send a request to the backend server within the specified period of time.</li>
         * <li><strong>RESPONSE_FORMAT_ERROR</strong>: The format of the response from the backend server is invalid.</li>
         * <li><strong>RESPONSE_FORMAT_ERROR</strong>: The HTTP status code returned from the backend server is not the expected one.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RESPONSE_MISMATCH</p>
         */
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
        /**
         * <p>The backend port.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The cause of the abnormal state.</p>
         */
        @NameInMap("Reason")
        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServersReason reason;

        /**
         * <p>The ID of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp1bfa08ex****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.2.11</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The status of the health check. Valid values: Valid values:</p>
         * <ul>
         * <li><strong>Initial</strong>: indicates that health checks are configured for the NLB instance, but no data was found.</li>
         * <li><strong>Unhealthy</strong>: indicates that the backend server consecutively fails health checks.</li>
         * <li><strong>Unused</strong>: indicates that the weight of the backend server is 0.</li>
         * <li><strong>Unavailable</strong>: indicates that health checks are disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Initial</p>
         */
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
        /**
         * <p>The action specified for the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>TrafficMirror</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>Indicates whether health checks are enabled. If <strong>on</strong> is returned, it indicates that health checks are enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HealthCheckEnabled")
        public String healthCheckEnabled;

        /**
         * <p>A list of unhealthy backend servers.</p>
         */
        @NameInMap("NonNormalServers")
        public java.util.List<GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServers> nonNormalServers;

        /**
         * <p>The ID of the server group that is associated with the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>vsp-bp1qjwo61pqz3ahlt****</p>
         */
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
        /**
         * <p>The ID of the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-hp34s2h0xx1ht4nwo****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The server groups.</p>
         */
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
