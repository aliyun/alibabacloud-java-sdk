// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTerminalSessionsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sessions")
    public DescribeTerminalSessionsResponseBodySessions sessions;

    public static DescribeTerminalSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTerminalSessionsResponseBody self = new DescribeTerminalSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTerminalSessionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTerminalSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTerminalSessionsResponseBody setSessions(DescribeTerminalSessionsResponseBodySessions sessions) {
        this.sessions = sessions;
        return this;
    }
    public DescribeTerminalSessionsResponseBodySessions getSessions() {
        return this.sessions;
    }

    public static class DescribeTerminalSessionsResponseBodySessionsSessionConnectionsConnection extends TeaModel {
        @NameInMap("ClosedReason")
        public String closedReason;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FailedDetail")
        public String failedDetail;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        public static DescribeTerminalSessionsResponseBodySessionsSessionConnectionsConnection build(java.util.Map<String, ?> map) throws Exception {
            DescribeTerminalSessionsResponseBodySessionsSessionConnectionsConnection self = new DescribeTerminalSessionsResponseBodySessionsSessionConnectionsConnection();
            return TeaModel.build(map, self);
        }

        public DescribeTerminalSessionsResponseBodySessionsSessionConnectionsConnection setClosedReason(String closedReason) {
            this.closedReason = closedReason;
            return this;
        }
        public String getClosedReason() {
            return this.closedReason;
        }

        public DescribeTerminalSessionsResponseBodySessionsSessionConnectionsConnection setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeTerminalSessionsResponseBodySessionsSessionConnectionsConnection setFailedDetail(String failedDetail) {
            this.failedDetail = failedDetail;
            return this;
        }
        public String getFailedDetail() {
            return this.failedDetail;
        }

        public DescribeTerminalSessionsResponseBodySessionsSessionConnectionsConnection setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeTerminalSessionsResponseBodySessionsSessionConnectionsConnection setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeTerminalSessionsResponseBodySessionsSessionConnectionsConnection setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeTerminalSessionsResponseBodySessionsSessionConnections extends TeaModel {
        @NameInMap("Connection")
        public java.util.List<DescribeTerminalSessionsResponseBodySessionsSessionConnectionsConnection> connection;

        public static DescribeTerminalSessionsResponseBodySessionsSessionConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeTerminalSessionsResponseBodySessionsSessionConnections self = new DescribeTerminalSessionsResponseBodySessionsSessionConnections();
            return TeaModel.build(map, self);
        }

        public DescribeTerminalSessionsResponseBodySessionsSessionConnections setConnection(java.util.List<DescribeTerminalSessionsResponseBodySessionsSessionConnectionsConnection> connection) {
            this.connection = connection;
            return this;
        }
        public java.util.List<DescribeTerminalSessionsResponseBodySessionsSessionConnectionsConnection> getConnection() {
            return this.connection;
        }

    }

    public static class DescribeTerminalSessionsResponseBodySessionsSession extends TeaModel {
        @NameInMap("ClientIP")
        public String clientIP;

        @NameInMap("Connections")
        public DescribeTerminalSessionsResponseBodySessionsSessionConnections connections;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("IdentityType")
        public String identityType;

        @NameInMap("PortNumber")
        public Integer portNumber;

        @NameInMap("PrincipalId")
        public String principalId;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("TargetServer")
        public String targetServer;

        @NameInMap("Username")
        public String username;

        public static DescribeTerminalSessionsResponseBodySessionsSession build(java.util.Map<String, ?> map) throws Exception {
            DescribeTerminalSessionsResponseBodySessionsSession self = new DescribeTerminalSessionsResponseBodySessionsSession();
            return TeaModel.build(map, self);
        }

        public DescribeTerminalSessionsResponseBodySessionsSession setClientIP(String clientIP) {
            this.clientIP = clientIP;
            return this;
        }
        public String getClientIP() {
            return this.clientIP;
        }

        public DescribeTerminalSessionsResponseBodySessionsSession setConnections(DescribeTerminalSessionsResponseBodySessionsSessionConnections connections) {
            this.connections = connections;
            return this;
        }
        public DescribeTerminalSessionsResponseBodySessionsSessionConnections getConnections() {
            return this.connections;
        }

        public DescribeTerminalSessionsResponseBodySessionsSession setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeTerminalSessionsResponseBodySessionsSession setIdentityType(String identityType) {
            this.identityType = identityType;
            return this;
        }
        public String getIdentityType() {
            return this.identityType;
        }

        public DescribeTerminalSessionsResponseBodySessionsSession setPortNumber(Integer portNumber) {
            this.portNumber = portNumber;
            return this;
        }
        public Integer getPortNumber() {
            return this.portNumber;
        }

        public DescribeTerminalSessionsResponseBodySessionsSession setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public DescribeTerminalSessionsResponseBodySessionsSession setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribeTerminalSessionsResponseBodySessionsSession setTargetServer(String targetServer) {
            this.targetServer = targetServer;
            return this;
        }
        public String getTargetServer() {
            return this.targetServer;
        }

        public DescribeTerminalSessionsResponseBodySessionsSession setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeTerminalSessionsResponseBodySessions extends TeaModel {
        @NameInMap("Session")
        public java.util.List<DescribeTerminalSessionsResponseBodySessionsSession> session;

        public static DescribeTerminalSessionsResponseBodySessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeTerminalSessionsResponseBodySessions self = new DescribeTerminalSessionsResponseBodySessions();
            return TeaModel.build(map, self);
        }

        public DescribeTerminalSessionsResponseBodySessions setSession(java.util.List<DescribeTerminalSessionsResponseBodySessionsSession> session) {
            this.session = session;
            return this;
        }
        public java.util.List<DescribeTerminalSessionsResponseBodySessionsSession> getSession() {
            return this.session;
        }

    }

}
