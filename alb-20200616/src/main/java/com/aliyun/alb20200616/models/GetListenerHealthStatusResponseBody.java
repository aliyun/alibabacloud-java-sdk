// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetListenerHealthStatusResponseBody extends TeaModel {
    /**
     * <p>The health check status list of server groups associated with the listener.</p>
     */
    @NameInMap("ListenerHealthStatus")
    public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatus> listenerHealthStatus;

    /**
     * <p>Indicates whether a next query token exists. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
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
     * <p>The health status list of forwarding rules.</p>
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
         * <p>The actual response code returned by the backend server, such as <strong>302</strong>.</p>
         * <blockquote>
         * <p>This value is returned only when <strong>ReasonCode</strong> is <strong>RESPONSE_MISMATCH</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>302</p>
         */
        @NameInMap("ActualResponse")
        public String actualResponse;

        /**
         * <p>The expected response code from the backend server.</p>
         * <p>Valid values: <strong>HTTP_2xx</strong>, <strong>HTTP_3xx</strong>, <strong>HTTP_4xx</strong>, and <strong>HTTP_5xx</strong>. Multiple response codes are separated by commas (,).</p>
         * <blockquote>
         * <p>This value is returned only when <strong>ReasonCode</strong> is <strong>RESPONSE_MISMATCH</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP_2xx</p>
         */
        @NameInMap("ExpectedResponse")
        public String expectedResponse;

        /**
         * <p>The detailed reason when <strong>Status</strong> is abnormal.
         * Currently, only HTTP and HTTPS listeners and forwarding rules support viewing abnormal status reasons:</p>
         * <ul>
         * <li><p><strong>CONNECT_TIMEOUT</strong>: The Server Load Balancer (SLB) health check timed out when establishing a connection to the backend server.</p>
         * </li>
         * <li><p><strong>CONNECT_FAILED</strong>: The SLB health check failed to establish a connection to the backend server.</p>
         * </li>
         * <li><p><strong>RECV_RESPONSE_FAILED</strong>: The SLB health check failed to receive a response from the backend server.</p>
         * </li>
         * <li><p><strong>RECV_RESPONSE_TIMEOUT</strong>: The SLB health check timed out when receiving a response from the backend server.</p>
         * </li>
         * <li><p><strong>SEND_REQUEST_FAILED</strong>: The SLB health check failed to send a request to the backend server.</p>
         * </li>
         * <li><p><strong>SEND_REQUEST_TIMEOUT</strong>: The SLB health check timed out when sending a request to the backend server.</p>
         * </li>
         * <li><p><strong>RESPONSE_FORMAT_ERROR</strong>: The SLB health check received a response in an incorrect format from the backend server.</p>
         * </li>
         * <li><p><strong>RESPONSE_MISMATCH</strong>: The response code received from the backend server during the SLB health check did not match the expected response code.</p>
         * </li>
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
         * <p>The backend server port.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The reason for the abnormal state.</p>
         */
        @NameInMap("Reason")
        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason reason;

        /**
         * <p>The backend server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf62h8v******</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The backend server IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.8.10</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The health check status. Valid values:</p>
         * <ul>
         * <li><p><strong>Initial</strong>: Initializing. The SLB instance has health check configured, but no data is available.</p>
         * </li>
         * <li><p><strong>Unhealthy</strong>: Unhealthy. The backend server has continuously reported an unhealthy state.</p>
         * </li>
         * <li><p><strong>Unused</strong>: Not in use. The weight of the backend server is 0, or cross-zone load balancing is disabled and the backend server is not in the same zone as the Application Load Balancer (ALB) instance.</p>
         * </li>
         * <li><p><strong>Unavailable</strong>: Not enabled. Health check is not enabled.</p>
         * </li>
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
         * <p>The server group usage type. Valid values:</p>
         * <ul>
         * <li><strong>ForwardGroup</strong>: Forward to the server group.</li>
         * <li><strong>TrafficMirror</strong>: Mirror traffic to the server group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TrafficMirror</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The health check status. Valid values: <strong>on</strong>: Health check is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HealthCheckEnabled")
        public String healthCheckEnabled;

        /**
         * <p>The list of backend servers in abnormal state.</p>
         */
        @NameInMap("NonNormalServers")
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers> nonNormalServers;

        /**
         * <p>The number of servers in the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServerCount")
        public Integer serverCount;

        /**
         * <p>The associated server group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-8ilqs4axp6******</p>
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

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos setServerCount(Integer serverCount) {
            this.serverCount = serverCount;
            return this;
        }
        public Integer getServerCount() {
            return this.serverCount;
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
         * <p>The listener ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-o4u54y73wq7b******</p>
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
         * <p>The server group information.</p>
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
         * <p>The actual response code returned by the backend server, such as <strong>302</strong>.</p>
         * <blockquote>
         * <p>This value is returned only when <strong>ReasonCode</strong> is <strong>RESPONSE_MISMATCH</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>302</p>
         */
        @NameInMap("ActualResponse")
        public String actualResponse;

        /**
         * <p>The expected response code from the backend server.</p>
         * <p>Valid values: <strong>HTTP_2xx</strong>, <strong>HTTP_3xx</strong>, <strong>HTTP_4xx</strong>, and <strong>HTTP_5xx</strong>. Multiple response codes are separated by commas (,).</p>
         * <blockquote>
         * <p>This value is returned only when <strong>ReasonCode</strong> is <strong>RESPONSE_MISMATCH</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP_2xx</p>
         */
        @NameInMap("ExpectedResponse")
        public String expectedResponse;

        /**
         * <p>The detailed reason when <strong>Status</strong> is abnormal.
         * Currently, only HTTP and HTTPS listeners and forwarding rules support viewing abnormal status reasons:</p>
         * <ul>
         * <li><p><strong>CONNECT_TIMEOUT</strong>: The Server Load Balancer (SLB) health check timed out when establishing a connection to the backend server.</p>
         * </li>
         * <li><p><strong>CONNECT_FAILED</strong>: The SLB health check failed to establish a connection to the backend server.</p>
         * </li>
         * <li><p><strong>RECV_RESPONSE_FAILED</strong>: The SLB health check failed to receive a response from the backend server.</p>
         * </li>
         * <li><p><strong>RECV_RESPONSE_TIMEOUT</strong>: The SLB health check timed out when receiving a response from the backend server.</p>
         * </li>
         * <li><p><strong>SEND_REQUEST_FAILED</strong>: The SLB health check failed to send a request to the backend server.</p>
         * </li>
         * <li><p><strong>SEND_REQUEST_TIMEOUT</strong>: The SLB health check timed out when sending a request to the backend server.</p>
         * </li>
         * <li><p><strong>RESPONSE_FORMAT_ERROR</strong>: The SLB health check received a response in an incorrect format from the backend server.</p>
         * </li>
         * <li><p><strong>RESPONSE_MISMATCH</strong>: The response code received from the backend server during the SLB health check did not match the expected response code.</p>
         * </li>
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
         * <p>The backend server port.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The reason for the abnormal state.</p>
         */
        @NameInMap("Reason")
        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServersReason reason;

        /**
         * <p>The backend server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf62h8v******</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The backend server group IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.2.11</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The health check status. Valid values:</p>
         * <ul>
         * <li><p><strong>Initial</strong>: Initializing. The SLB instance has health check configured, but no data is available.</p>
         * </li>
         * <li><p><strong>Unhealthy</strong>: Unhealthy. The backend server has continuously reported an unhealthy state.</p>
         * </li>
         * <li><p><strong>Unused</strong>: Not in use. The weight of the backend server is 0, or cross-zone load balancing is disabled and the backend server is not in the same zone as the ALB instance.</p>
         * </li>
         * <li><p><strong>Unavailable</strong>: Not enabled. Health check is not enabled.</p>
         * </li>
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
         * <p>The server group usage type.</p>
         * 
         * <strong>example:</strong>
         * <p>TrafficMirror</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The health check status. Valid values: <strong>on</strong>: Health check is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HealthCheckEnabled")
        public String healthCheckEnabled;

        /**
         * <p>The list of backend servers in abnormal state.</p>
         */
        @NameInMap("NonNormalServers")
        public java.util.List<GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfosNonNormalServers> nonNormalServers;

        /**
         * <p>The number of servers in the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServerCount")
        public Long serverCount;

        /**
         * <p>The associated server group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-8ilqs4axp6******</p>
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

        public GetListenerHealthStatusResponseBodyRuleHealthStatusServerGroupInfos setServerCount(Long serverCount) {
            this.serverCount = serverCount;
            return this;
        }
        public Long getServerCount() {
            return this.serverCount;
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
         * <p>The forwarding rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-hp34s2h0xx1ht4nwo****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The list of server groups.</p>
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
