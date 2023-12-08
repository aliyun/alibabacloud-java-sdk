// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetMongoDBCurrentOpResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The details of the sessions.</p>
     */
    @NameInMap("Data")
    public GetMongoDBCurrentOpResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. Otherwise, an error message such as an error code is returned.</p>
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

    public static GetMongoDBCurrentOpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMongoDBCurrentOpResponseBody self = new GetMongoDBCurrentOpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMongoDBCurrentOpResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetMongoDBCurrentOpResponseBody setData(GetMongoDBCurrentOpResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMongoDBCurrentOpResponseBodyData getData() {
        return this.data;
    }

    public GetMongoDBCurrentOpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMongoDBCurrentOpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMongoDBCurrentOpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMongoDBCurrentOpResponseBodyDataSessionList extends TeaModel {
        /**
         * <p>Indicates whether the operation is active. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The IP address of the client.</p>
         */
        @NameInMap("Client")
        public String client;

        /**
         * <p>The document that contains the complete command object associated with the operation.</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The connection ID.</p>
         */
        @NameInMap("ConnectionId")
        public Long connectionId;

        /**
         * <p>The description of the connection.</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The driver for MongoDB.</p>
         */
        @NameInMap("Driver")
        public String driver;

        /**
         * <p>The host.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>Indicates whether the operation is marked as terminated.</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("KillPending")
        public Boolean killPending;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Ns")
        public String ns;

        /**
         * <p>The type of the operation.</p>
         */
        @NameInMap("Op")
        public String op;

        /**
         * <p>The operation ID.</p>
         */
        @NameInMap("OpId")
        public String opId;

        /**
         * <p>The architecture of the operating system.</p>
         */
        @NameInMap("OsArch")
        public String osArch;

        /**
         * <p>The name of the operating system.</p>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <p>The type of the operating system.</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The description of the execution plan.</p>
         */
        @NameInMap("PlanSummary")
        public String planSummary;

        /**
         * <p>The platform.</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The duration of the operation. Unit: seconds.</p>
         */
        @NameInMap("SecsRunning")
        public Long secsRunning;

        /**
         * <p>The ID of the data shard.</p>
         * <br>
         * <p>>  This parameter is returned for sharded cluster instances.</p>
         */
        @NameInMap("Shard")
        public String shard;

        public static GetMongoDBCurrentOpResponseBodyDataSessionList build(java.util.Map<String, ?> map) throws Exception {
            GetMongoDBCurrentOpResponseBodyDataSessionList self = new GetMongoDBCurrentOpResponseBodyDataSessionList();
            return TeaModel.build(map, self);
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setClient(String client) {
            this.client = client;
            return this;
        }
        public String getClient() {
            return this.client;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setKillPending(Boolean killPending) {
            this.killPending = killPending;
            return this;
        }
        public Boolean getKillPending() {
            return this.killPending;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setNs(String ns) {
            this.ns = ns;
            return this;
        }
        public String getNs() {
            return this.ns;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setOpId(String opId) {
            this.opId = opId;
            return this;
        }
        public String getOpId() {
            return this.opId;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setOsArch(String osArch) {
            this.osArch = osArch;
            return this;
        }
        public String getOsArch() {
            return this.osArch;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setPlanSummary(String planSummary) {
            this.planSummary = planSummary;
            return this;
        }
        public String getPlanSummary() {
            return this.planSummary;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setSecsRunning(Long secsRunning) {
            this.secsRunning = secsRunning;
            return this;
        }
        public Long getSecsRunning() {
            return this.secsRunning;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionList setShard(String shard) {
            this.shard = shard;
            return this;
        }
        public String getShard() {
            return this.shard;
        }

    }

    public static class GetMongoDBCurrentOpResponseBodyDataSessionStat extends TeaModel {
        /**
         * <p>The number of active sessions.</p>
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The statistics on the IP addresses of the clients.</p>
         */
        @NameInMap("ClientStats")
        public java.util.Map<String, DataSessionStatClientStatsValue> clientStats;

        /**
         * <p>The statistics on the namespaces.</p>
         */
        @NameInMap("DbStats")
        public java.util.Map<String, DataSessionStatDbStatsValue> dbStats;

        /**
         * <p>The longest duration of a session. Unit: seconds.</p>
         */
        @NameInMap("LongestSecsRunning")
        public Long longestSecsRunning;

        /**
         * <p>The total number of sessions.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetMongoDBCurrentOpResponseBodyDataSessionStat build(java.util.Map<String, ?> map) throws Exception {
            GetMongoDBCurrentOpResponseBodyDataSessionStat self = new GetMongoDBCurrentOpResponseBodyDataSessionStat();
            return TeaModel.build(map, self);
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionStat setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionStat setClientStats(java.util.Map<String, DataSessionStatClientStatsValue> clientStats) {
            this.clientStats = clientStats;
            return this;
        }
        public java.util.Map<String, DataSessionStatClientStatsValue> getClientStats() {
            return this.clientStats;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionStat setDbStats(java.util.Map<String, DataSessionStatDbStatsValue> dbStats) {
            this.dbStats = dbStats;
            return this;
        }
        public java.util.Map<String, DataSessionStatDbStatsValue> getDbStats() {
            return this.dbStats;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionStat setLongestSecsRunning(Long longestSecsRunning) {
            this.longestSecsRunning = longestSecsRunning;
            return this;
        }
        public Long getLongestSecsRunning() {
            return this.longestSecsRunning;
        }

        public GetMongoDBCurrentOpResponseBodyDataSessionStat setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetMongoDBCurrentOpResponseBodyData extends TeaModel {
        /**
         * <p>The sessions.</p>
         */
        @NameInMap("SessionList")
        public java.util.List<GetMongoDBCurrentOpResponseBodyDataSessionList> sessionList;

        /**
         * <p>The statistics on the sessions.</p>
         */
        @NameInMap("SessionStat")
        public GetMongoDBCurrentOpResponseBodyDataSessionStat sessionStat;

        /**
         * <p>The time when the database sessions were returned. The value is in the UNIX timestamp format. Unit: milliseconds.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetMongoDBCurrentOpResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMongoDBCurrentOpResponseBodyData self = new GetMongoDBCurrentOpResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMongoDBCurrentOpResponseBodyData setSessionList(java.util.List<GetMongoDBCurrentOpResponseBodyDataSessionList> sessionList) {
            this.sessionList = sessionList;
            return this;
        }
        public java.util.List<GetMongoDBCurrentOpResponseBodyDataSessionList> getSessionList() {
            return this.sessionList;
        }

        public GetMongoDBCurrentOpResponseBodyData setSessionStat(GetMongoDBCurrentOpResponseBodyDataSessionStat sessionStat) {
            this.sessionStat = sessionStat;
            return this;
        }
        public GetMongoDBCurrentOpResponseBodyDataSessionStat getSessionStat() {
            return this.sessionStat;
        }

        public GetMongoDBCurrentOpResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
