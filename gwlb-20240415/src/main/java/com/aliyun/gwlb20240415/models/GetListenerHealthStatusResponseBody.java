// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class GetListenerHealthStatusResponseBody extends TeaModel {
    @NameInMap("ListenerHealthStatus")
    public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatus> listenerHealthStatus;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>U12WEI6Ro2ol3wA54rBNSwdC5+lYy6q5SjIQEvc1wz5mjZxV+YjsHRdXV8XauY1BpOQIvwX63E0en54H3D****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0ED4F222-36A0-5470-8A9A-AAB4E96BAC1A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>31</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public GetListenerHealthStatusResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
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

    public GetListenerHealthStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServersReason extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONNECT_TIMEOUT</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServersReason build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServersReason self = new GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServersReason();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServersReason setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6081</p>
         */
        @NameInMap("Port")
        public Integer port;

        @NameInMap("Reason")
        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServersReason reason;

        /**
         * <strong>example:</strong>
         * <p>i-2ze4rnh8yj9kif3z****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <strong>example:</strong>
         * <p>192.168.0.XXX</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <strong>example:</strong>
         * <p>Healthy</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServers build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServers self = new GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServers();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServers setReason(GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServersReason reason) {
            this.reason = reason;
            return this;
        }
        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServersReason getReason() {
            return this.reason;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServers setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <strong>example:</strong>
         * <p>sgp-0vdsbyszro3nr6****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        @NameInMap("Servers")
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServers> servers;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos self = new GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos setServers(java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServers> servers) {
            this.servers = servers;
            return this;
        }
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosServers> getServers() {
            return this.servers;
        }

    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatus extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>lsn-sg8aha6pzjavvo****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

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

        public GetListenerHealthStatusResponseBodyListenerHealthStatus setServerGroupInfos(java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos> serverGroupInfos) {
            this.serverGroupInfos = serverGroupInfos;
            return this;
        }
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos> getServerGroupInfos() {
            return this.serverGroupInfos;
        }

    }

}
