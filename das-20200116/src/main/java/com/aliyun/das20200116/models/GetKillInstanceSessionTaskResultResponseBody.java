// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetKillInstanceSessionTaskResultResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
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
     * <br>
     * <p>>  If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
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
         * <br>
         * <p>> If the type of the command is Query or Execute and the session in the transaction is not terminated, the session is active.</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The type of the command executed in the session.</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("Db")
        public String db;

        /**
         * <p>The IP address and port number of the host that initiated the session.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The session ID.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The SQL statement executed in the session.</p>
         */
        @NameInMap("Info")
        public String info;

        /**
         * <p>The description of the session when the session was terminated.</p>
         * <br>
         * <p>*   **SESSION_KILLED**: The session is terminated.</p>
         * <p>*   **SESSION_EXPIRED**: The session has expired.</p>
         * <p>*   **SESSION_NO_PERMISSION**: The account used to terminate the session has insufficient permissions.</p>
         * <p>*   **SESSION_ACCOUNT_ERROR**: The account or password used to terminate the session is invalid.</p>
         * <p>*   **SESSION_IGNORED_USER**: The session of the account does not need to be terminated.</p>
         * <p>*   **SESSION_INTERNAL_USER_OR_COMMAND**: The session is a session initiated by or a command run by an Alibaba Cloud O\\&M account.</p>
         * <p>*   **SESSION_KILL_TASK_TIMEOUT**: Timeout occurs when the session is terminated.</p>
         * <p>*   **SESSION_OTHER_ERROR**: Other errors occurred.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The status of the session.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The ID of the subtask that terminates the session.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The execution duration. Unit: seconds.</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The account of the database.</p>
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
         * <p>The number of ignored sessions, including sessions of the accounts that are specified by IgnoredUsers, sessions of internal O\\&M accounts of Alibaba Cloud, and **Binlog Dump** sessions.</p>
         */
        @NameInMap("IgnoredUserSessionCount")
        public Long ignoredUserSessionCount;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of sessions that failed to be terminated.</p>
         */
        @NameInMap("KillFailCount")
        public Long killFailCount;

        /**
         * <p>The number of sessions that were terminated.</p>
         */
        @NameInMap("KillSuccessCount")
        public Long killSuccessCount;

        /**
         * <p>The node ID.</p>
         * <br>
         * <p>>  This parameter is returned only if the instance is a PolarDB for MySQL cluster.</p>
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
         * <br>
         * <p>>  If all sessions are terminated, the IDs of all sessions on the instance or node are returned.</p>
         */
        @NameInMap("Sessions")
        public java.util.List<Long> sessions;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The state of the task that terminates sessions.</p>
         * <br>
         * <p>*   **RUNNING**: The task is in progress.</p>
         * <p>*   **SUCCESS**: The task is successful.</p>
         * <p>*   **FAILURE**: The task failed.</p>
         * <p>*   **ERROR**: Other errors occur.</p>
         */
        @NameInMap("TaskState")
        public String taskState;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
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
