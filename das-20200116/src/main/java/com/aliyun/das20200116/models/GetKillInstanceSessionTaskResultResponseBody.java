// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetKillInstanceSessionTaskResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetKillInstanceSessionTaskResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("Command")
        public String command;

        @NameInMap("Db")
        public String db;

        @NameInMap("Host")
        public String host;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Info")
        public String info;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("State")
        public String state;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Time")
        public Long time;

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
        @NameInMap("IgnoredUserSessionCount")
        public Long ignoredUserSessionCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("KillFailCount")
        public Long killFailCount;

        @NameInMap("KillSuccessCount")
        public Long killSuccessCount;

        @NameInMap("Result")
        public java.util.List<GetKillInstanceSessionTaskResultResponseBodyDataResult> result;

        @NameInMap("Sessions")
        public java.util.List<Long> sessions;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskState")
        public String taskState;

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
