// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetMySQLAllSessionAsyncResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetMySQLAllSessionAsyncResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
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

    public static GetMySQLAllSessionAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMySQLAllSessionAsyncResponseBody self = new GetMySQLAllSessionAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMySQLAllSessionAsyncResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetMySQLAllSessionAsyncResponseBody setData(GetMySQLAllSessionAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMySQLAllSessionAsyncResponseBodyData getData() {
        return this.data;
    }

    public GetMySQLAllSessionAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMySQLAllSessionAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMySQLAllSessionAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMySQLAllSessionAsyncResponseBodyDataSessionDataClientStats extends TeaModel {
        /**
         * <p>The number of active sessions that belong to the client IP address.</p>
         * <br>
         * <p>> If the type of the command executed in the session is Query or Execute and the session in the transaction is not terminated, the session is active.</p>
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The IP address of the client.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The IDs of the sessions that belong to the client IP address.</p>
         */
        @NameInMap("ThreadIdList")
        public java.util.List<Long> threadIdList;

        /**
         * <p>The total number of sessions that belong to the client IP address.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The database accounts to which the sessions belong.</p>
         */
        @NameInMap("UserList")
        public java.util.List<String> userList;

        public static GetMySQLAllSessionAsyncResponseBodyDataSessionDataClientStats build(java.util.Map<String, ?> map) throws Exception {
            GetMySQLAllSessionAsyncResponseBodyDataSessionDataClientStats self = new GetMySQLAllSessionAsyncResponseBodyDataSessionDataClientStats();
            return TeaModel.build(map, self);
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataClientStats setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataClientStats setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataClientStats setThreadIdList(java.util.List<Long> threadIdList) {
            this.threadIdList = threadIdList;
            return this;
        }
        public java.util.List<Long> getThreadIdList() {
            return this.threadIdList;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataClientStats setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataClientStats setUserList(java.util.List<String> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<String> getUserList() {
            return this.userList;
        }

    }

    public static class GetMySQLAllSessionAsyncResponseBodyDataSessionDataDbStats extends TeaModel {
        /**
         * <p>The number of active sessions of the database.</p>
         * <br>
         * <p>> If the type of the command executed in the session is Query or Execute and the session in the transaction is not terminated, the session is active.</p>
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The IDs of the sessions of the database.</p>
         */
        @NameInMap("ThreadIdList")
        public java.util.List<Long> threadIdList;

        /**
         * <p>The total number of sessions of the database.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The database accounts to which the sessions belong.</p>
         */
        @NameInMap("UserList")
        public java.util.List<String> userList;

        public static GetMySQLAllSessionAsyncResponseBodyDataSessionDataDbStats build(java.util.Map<String, ?> map) throws Exception {
            GetMySQLAllSessionAsyncResponseBodyDataSessionDataDbStats self = new GetMySQLAllSessionAsyncResponseBodyDataSessionDataDbStats();
            return TeaModel.build(map, self);
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataDbStats setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataDbStats setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataDbStats setThreadIdList(java.util.List<Long> threadIdList) {
            this.threadIdList = threadIdList;
            return this;
        }
        public java.util.List<Long> getThreadIdList() {
            return this.threadIdList;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataDbStats setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataDbStats setUserList(java.util.List<String> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<String> getUserList() {
            return this.userList;
        }

    }

    public static class GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList extends TeaModel {
        /**
         * <p>The IP address of the client.</p>
         */
        @NameInMap("Client")
        public String client;

        /**
         * <p>The type of the command executed in the session.</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The session ID.</p>
         */
        @NameInMap("SessionId")
        public Long sessionId;

        @NameInMap("SqlTemplateId")
        public String sqlTemplateId;

        /**
         * <p>The SQL statement executed in the session.</p>
         */
        @NameInMap("SqlText")
        public String sqlText;

        /**
         * <p>The status of the session.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The execution duration of the session. Unit: seconds.</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The duration of the transaction. Unit: seconds.</p>
         */
        @NameInMap("TrxDuration")
        public Long trxDuration;

        /**
         * <p>The ID of the transaction to which the session belongs.</p>
         */
        @NameInMap("TrxId")
        public String trxId;

        /**
         * <p>The username of the database.</p>
         */
        @NameInMap("User")
        public String user;

        /**
         * <p>The alias of the IP address of the client.</p>
         */
        @NameInMap("UserClientAlias")
        public String userClientAlias;

        public static GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList build(java.util.Map<String, ?> map) throws Exception {
            GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList self = new GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList();
            return TeaModel.build(map, self);
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList setClient(String client) {
            this.client = client;
            return this;
        }
        public String getClient() {
            return this.client;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList setSessionId(Long sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public Long getSessionId() {
            return this.sessionId;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList setSqlTemplateId(String sqlTemplateId) {
            this.sqlTemplateId = sqlTemplateId;
            return this;
        }
        public String getSqlTemplateId() {
            return this.sqlTemplateId;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList setTrxDuration(Long trxDuration) {
            this.trxDuration = trxDuration;
            return this;
        }
        public Long getTrxDuration() {
            return this.trxDuration;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList setTrxId(String trxId) {
            this.trxId = trxId;
            return this;
        }
        public String getTrxId() {
            return this.trxId;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList setUserClientAlias(String userClientAlias) {
            this.userClientAlias = userClientAlias;
            return this;
        }
        public String getUserClientAlias() {
            return this.userClientAlias;
        }

    }

    public static class GetMySQLAllSessionAsyncResponseBodyDataSessionDataUserStats extends TeaModel {
        /**
         * <p>The number of active sessions within the account.</p>
         * <br>
         * <p> > If the type of the command executed in the session is Query or Execute and the session in the transaction is not terminated, the session is active.</p>
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The account of the database.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The IDs of the sessions within the account.</p>
         */
        @NameInMap("ThreadIdList")
        public java.util.List<Long> threadIdList;

        /**
         * <p>The total number of sessions within the account.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The database accounts to which the sessions belong.</p>
         */
        @NameInMap("UserList")
        public java.util.List<String> userList;

        public static GetMySQLAllSessionAsyncResponseBodyDataSessionDataUserStats build(java.util.Map<String, ?> map) throws Exception {
            GetMySQLAllSessionAsyncResponseBodyDataSessionDataUserStats self = new GetMySQLAllSessionAsyncResponseBodyDataSessionDataUserStats();
            return TeaModel.build(map, self);
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataUserStats setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataUserStats setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataUserStats setThreadIdList(java.util.List<Long> threadIdList) {
            this.threadIdList = threadIdList;
            return this;
        }
        public java.util.List<Long> getThreadIdList() {
            return this.threadIdList;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataUserStats setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionDataUserStats setUserList(java.util.List<String> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<String> getUserList() {
            return this.userList;
        }

    }

    public static class GetMySQLAllSessionAsyncResponseBodyDataSessionData extends TeaModel {
        /**
         * <p>The total number of active sessions.</p>
         */
        @NameInMap("ActiveSessionCount")
        public Long activeSessionCount;

        /**
         * <p>The sessions that are counted by client IP address.</p>
         */
        @NameInMap("ClientStats")
        public java.util.List<GetMySQLAllSessionAsyncResponseBodyDataSessionDataClientStats> clientStats;

        /**
         * <p>The sessions that are counted by database.</p>
         */
        @NameInMap("DbStats")
        public java.util.List<GetMySQLAllSessionAsyncResponseBodyDataSessionDataDbStats> dbStats;

        /**
         * <p>The maximum execution duration of an active session. Unit: seconds.</p>
         */
        @NameInMap("MaxActiveTime")
        public Long maxActiveTime;

        /**
         * <p>The list of sessions.</p>
         */
        @NameInMap("SessionList")
        public java.util.List<GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList> sessionList;

        /**
         * <p>The time when the session was queried. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("TimeStamp")
        public Long timeStamp;

        /**
         * <p>The total number of sessions.</p>
         */
        @NameInMap("TotalSessionCount")
        public Long totalSessionCount;

        /**
         * <p>The sessions that are counted by database account.</p>
         */
        @NameInMap("UserStats")
        public java.util.List<GetMySQLAllSessionAsyncResponseBodyDataSessionDataUserStats> userStats;

        public static GetMySQLAllSessionAsyncResponseBodyDataSessionData build(java.util.Map<String, ?> map) throws Exception {
            GetMySQLAllSessionAsyncResponseBodyDataSessionData self = new GetMySQLAllSessionAsyncResponseBodyDataSessionData();
            return TeaModel.build(map, self);
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionData setActiveSessionCount(Long activeSessionCount) {
            this.activeSessionCount = activeSessionCount;
            return this;
        }
        public Long getActiveSessionCount() {
            return this.activeSessionCount;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionData setClientStats(java.util.List<GetMySQLAllSessionAsyncResponseBodyDataSessionDataClientStats> clientStats) {
            this.clientStats = clientStats;
            return this;
        }
        public java.util.List<GetMySQLAllSessionAsyncResponseBodyDataSessionDataClientStats> getClientStats() {
            return this.clientStats;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionData setDbStats(java.util.List<GetMySQLAllSessionAsyncResponseBodyDataSessionDataDbStats> dbStats) {
            this.dbStats = dbStats;
            return this;
        }
        public java.util.List<GetMySQLAllSessionAsyncResponseBodyDataSessionDataDbStats> getDbStats() {
            return this.dbStats;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionData setMaxActiveTime(Long maxActiveTime) {
            this.maxActiveTime = maxActiveTime;
            return this;
        }
        public Long getMaxActiveTime() {
            return this.maxActiveTime;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionData setSessionList(java.util.List<GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList> sessionList) {
            this.sessionList = sessionList;
            return this;
        }
        public java.util.List<GetMySQLAllSessionAsyncResponseBodyDataSessionDataSessionList> getSessionList() {
            return this.sessionList;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionData setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionData setTotalSessionCount(Long totalSessionCount) {
            this.totalSessionCount = totalSessionCount;
            return this;
        }
        public Long getTotalSessionCount() {
            return this.totalSessionCount;
        }

        public GetMySQLAllSessionAsyncResponseBodyDataSessionData setUserStats(java.util.List<GetMySQLAllSessionAsyncResponseBodyDataSessionDataUserStats> userStats) {
            this.userStats = userStats;
            return this;
        }
        public java.util.List<GetMySQLAllSessionAsyncResponseBodyDataSessionDataUserStats> getUserStats() {
            return this.userStats;
        }

    }

    public static class GetMySQLAllSessionAsyncResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the asynchronous request was complete. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Complete")
        public Boolean complete;

        /**
         * <p>Indicates whether the asynchronous request failed. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Fail")
        public Boolean fail;

        /**
         * <p>Indicates whether the asynchronous request was complete. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsFinish")
        public Boolean isFinish;

        /**
         * <p>The ID of the asynchronous request.</p>
         */
        @NameInMap("ResultId")
        public String resultId;

        /**
         * <p>The session data.</p>
         */
        @NameInMap("SessionData")
        public GetMySQLAllSessionAsyncResponseBodyDataSessionData sessionData;

        /**
         * <p>The state of the asynchronous request. Valid values:</p>
         * <br>
         * <p>*   **RUNNING**</p>
         * <p>*   **SUCCESS**</p>
         * <p>*   **FAIL**</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the asynchronous request was made. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetMySQLAllSessionAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMySQLAllSessionAsyncResponseBodyData self = new GetMySQLAllSessionAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMySQLAllSessionAsyncResponseBodyData setComplete(Boolean complete) {
            this.complete = complete;
            return this;
        }
        public Boolean getComplete() {
            return this.complete;
        }

        public GetMySQLAllSessionAsyncResponseBodyData setFail(Boolean fail) {
            this.fail = fail;
            return this;
        }
        public Boolean getFail() {
            return this.fail;
        }

        public GetMySQLAllSessionAsyncResponseBodyData setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public GetMySQLAllSessionAsyncResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public GetMySQLAllSessionAsyncResponseBodyData setSessionData(GetMySQLAllSessionAsyncResponseBodyDataSessionData sessionData) {
            this.sessionData = sessionData;
            return this;
        }
        public GetMySQLAllSessionAsyncResponseBodyDataSessionData getSessionData() {
            return this.sessionData;
        }

        public GetMySQLAllSessionAsyncResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetMySQLAllSessionAsyncResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
