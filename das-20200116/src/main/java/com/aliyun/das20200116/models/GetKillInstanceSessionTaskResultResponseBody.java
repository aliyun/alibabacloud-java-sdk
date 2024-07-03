// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetKillInstanceSessionTaskResultResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetKillInstanceSessionTaskResultResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetKillInstanceSessionTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKillInstanceSessionTaskResultResponseBody self = new GetKillInstanceSessionTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKillInstanceSessionTaskResultResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetKillInstanceSessionTaskResultResponseBody setData(GetKillInstanceSessionTaskResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKillInstanceSessionTaskResultResponseBodyData getData() {
        return this.data;
    }

    public GetKillInstanceSessionTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKillInstanceSessionTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKillInstanceSessionTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKillInstanceSessionTaskResultResponseBodyDataResult extends TeaModel {
        /**
         * <p>Indicates whether the session is active.</p>
         * <blockquote>
         * <p>If the type of the command is Query or Execute and the session in the transaction is not terminated, the session is active.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The type of the command executed in the session.</p>
         * 
         * <strong>example:</strong>
         * <p>Sleep</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>dbTest</p>
         */
        @NameInMap("Db")
        public String db;

        /**
         * <p>The IP address and port number of the host that initiated the session.</p>
         * 
         * <strong>example:</strong>
         * <p>100.104.XX.XX:23428</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8357518</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The SQL statement executed in the session.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT sleep(60)</p>
         */
        @NameInMap("Info")
        public String info;

        /**
         * <p>The description of the session when the session was terminated.</p>
         * <ul>
         * <li><strong>SESSION_KILLED</strong>: The session is terminated.</li>
         * <li><strong>SESSION_EXPIRED</strong>: The session has expired.</li>
         * <li><strong>SESSION_NO_PERMISSION</strong>: The account used to terminate the session has insufficient permissions.</li>
         * <li><strong>SESSION_ACCOUNT_ERROR</strong>: The account or password used to terminate the session is invalid.</li>
         * <li><strong>SESSION_IGNORED_USER</strong>: The session of the account does not need to be terminated.</li>
         * <li><strong>SESSION_INTERNAL_USER_OR_COMMAND</strong>: The session is a session initiated by or a command run by an Alibaba Cloud O\&amp;M account.</li>
         * <li><strong>SESSION_KILL_TASK_TIMEOUT</strong>: Timeout occurs when the session is terminated.</li>
         * <li><strong>SESSION_OTHER_ERROR</strong>: Other errors occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SESSION_KILLED</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The status of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>Sending data</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The ID of the subtask that terminates the session.</p>
         * 
         * <strong>example:</strong>
         * <p>task_d9e94107-6116-4ac3-b874-81466aff****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The execution duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The account of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>testUser</p>
         */
        @NameInMap("User")
        public String user;

        public static GetKillInstanceSessionTaskResultResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetKillInstanceSessionTaskResultResponseBodyDataResult self = new GetKillInstanceSessionTaskResultResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetKillInstanceSessionTaskResultResponseBodyDataResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public GetKillInstanceSessionTaskResultResponseBodyDataResult setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public GetKillInstanceSessionTaskResultResponseBodyDataResult setDb(String db) {
            this.db = db;
            return this;
        }
        public String getDb() {
            return this.db;
        }

        public GetKillInstanceSessionTaskResultResponseBodyDataResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetKillInstanceSessionTaskResultResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetKillInstanceSessionTaskResultResponseBodyDataResult setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public GetKillInstanceSessionTaskResultResponseBodyDataResult setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetKillInstanceSessionTaskResultResponseBodyDataResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetKillInstanceSessionTaskResultResponseBodyDataResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetKillInstanceSessionTaskResultResponseBodyDataResult setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public GetKillInstanceSessionTaskResultResponseBodyDataResult setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class GetKillInstanceSessionTaskResultResponseBodyData extends TeaModel {
        /**
         * <p>The number of ignored sessions, including sessions of the accounts that are specified by IgnoredUsers, sessions of internal O\&amp;M accounts of Alibaba Cloud, and <strong>Binlog Dump</strong> sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("IgnoredUserSessionCount")
        public Long ignoredUserSessionCount;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of sessions that failed to be terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KillFailCount")
        public Long killFailCount;

        /**
         * <p>The number of sessions that were terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("KillSuccessCount")
        public Long killSuccessCount;

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> This parameter is returned only if the instance is a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-bp1h12rv501cv****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The details of the task that terminated sessions.</p>
         */
        @NameInMap("Result")
        public java.util.List<GetKillInstanceSessionTaskResultResponseBodyDataResult> result;

        /**
         * <p>The session IDs.</p>
         * <blockquote>
         * <p> If all sessions are terminated, the IDs of all sessions on the instance or node are returned.</p>
         * </blockquote>
         */
        @NameInMap("Sessions")
        public java.util.List<Long> sessions;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f77d535b45405bd462b21caa3ee8****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The state of the task that terminates sessions.</p>
         * <ul>
         * <li><strong>RUNNING</strong>: The task is in progress.</li>
         * <li><strong>SUCCESS</strong>: The task is successful.</li>
         * <li><strong>FAILURE</strong>: The task failed.</li>
         * <li><strong>ERROR</strong>: Other errors occur.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("TaskState")
        public String taskState;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>164882191396****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetKillInstanceSessionTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKillInstanceSessionTaskResultResponseBodyData self = new GetKillInstanceSessionTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKillInstanceSessionTaskResultResponseBodyData setIgnoredUserSessionCount(Long ignoredUserSessionCount) {
            this.ignoredUserSessionCount = ignoredUserSessionCount;
            return this;
        }
        public Long getIgnoredUserSessionCount() {
            return this.ignoredUserSessionCount;
        }

        public GetKillInstanceSessionTaskResultResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetKillInstanceSessionTaskResultResponseBodyData setKillFailCount(Long killFailCount) {
            this.killFailCount = killFailCount;
            return this;
        }
        public Long getKillFailCount() {
            return this.killFailCount;
        }

        public GetKillInstanceSessionTaskResultResponseBodyData setKillSuccessCount(Long killSuccessCount) {
            this.killSuccessCount = killSuccessCount;
            return this;
        }
        public Long getKillSuccessCount() {
            return this.killSuccessCount;
        }

        public GetKillInstanceSessionTaskResultResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetKillInstanceSessionTaskResultResponseBodyData setResult(java.util.List<GetKillInstanceSessionTaskResultResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetKillInstanceSessionTaskResultResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GetKillInstanceSessionTaskResultResponseBodyData setSessions(java.util.List<Long> sessions) {
            this.sessions = sessions;
            return this;
        }
        public java.util.List<Long> getSessions() {
            return this.sessions;
        }

        public GetKillInstanceSessionTaskResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetKillInstanceSessionTaskResultResponseBodyData setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

        public GetKillInstanceSessionTaskResultResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
