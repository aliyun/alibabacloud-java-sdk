// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTerminalSessionsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the sessions.</p>
     */
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
        /**
         * <p>The reason why the connection was closed. This parameter is returned only when the `Status` value is `Disconnected`, `Terminated`, or `Failed`. Valid values:</p>
         * <br>
         * <p>*   InstanceNotExists: The specified instance did not exist or was released.</p>
         * <p>*   InstanceNotRunning: The specified instance was not running.</p>
         * <p>*   DeliveryTimeout: The connection timed out.</p>
         * <p>*   AgentNeedUpgrade: Cloud Assistant Agent required an upgrade.</p>
         * <p>*   AgentNotOnline: Cloud Assistant Agent was not connected to the Cloud Assistant server.</p>
         * <p>*   MessageFormatInvalid: The message format was invalid.</p>
         * <p>*   AgentSocketClosed: The connection was closed as expected.</p>
         * <p>*   ClientClosed: Session Manager Client closed the connection.</p>
         */
        @NameInMap("ClosedReason")
        public String closedReason;

        /**
         * <p>The time when the connection was closed.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the connection started to be established.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the session. Valid values:</p>
         * <br>
         * <p>*   Connecting: The connection is being established.</p>
         * <p>*   Connected: The connection is established.</p>
         * <p>*   Disconnected: The connection is disconnected.</p>
         * <p>*   Terminating: The session is being terminated.</p>
         * <p>*   Terminated: The session is terminated.</p>
         * <p>*   Failed: The connection failed.</p>
         */
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
        /**
         * <p>The IP address of the client used to establish connections.</p>
         */
        @NameInMap("ClientIP")
        public String clientIP;

        /**
         * <p>The information of the connections.</p>
         */
        @NameInMap("Connections")
        public DescribeTerminalSessionsResponseBodySessionsSessionConnections connections;

        /**
         * <p>The time when the session was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The principal type. Valid values:</p>
         * <br>
         * <p>*   Account: an Alibaba Cloud account</p>
         * <p>*   RAMUser: a RAM user</p>
         * <p>*   AssumedRoleUser: a RAM role</p>
         */
        @NameInMap("IdentityType")
        public String identityType;

        /**
         * <p>The port number of the instance, which is used for data forwarding. If no port number was specified for data forwarding when the session was created, this parameter is empty.</p>
         */
        @NameInMap("PortNumber")
        public Integer portNumber;

        /**
         * <p>The ID of the principal. Valid values based on the `IdentityType` value:</p>
         * <br>
         * <p>*   If the requester uses an Alibaba Cloud account to call the operation, the ID of the Alibaba Cloud account is returned.</p>
         * <p>*   If the requester uses a Resource Access Management (RAM) user to call the operation, the ID of the RAM user is returned.</p>
         * <p>*   If the requester uses a RAM role to call the operation, the ID of the principal that actually calls the operation is returned.</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The session ID.</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The address of the service that was accessed in a virtual private cloud (VPC) from the instance.</p>
         */
        @NameInMap("TargetServer")
        public String targetServer;

        /**
         * <p>The username used to establish connections.</p>
         */
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
