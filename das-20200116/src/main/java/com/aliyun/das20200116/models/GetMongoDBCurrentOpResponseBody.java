// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetMongoDBCurrentOpResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetMongoDBCurrentOpResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("Client")
        public String client;

        @NameInMap("Command")
        public String command;

        @NameInMap("ConnectionId")
        public Long connectionId;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Driver")
        public String driver;

        @NameInMap("Host")
        public String host;

        @NameInMap("KillPending")
        public Boolean killPending;

        @NameInMap("Ns")
        public String ns;

        @NameInMap("Op")
        public String op;

        @NameInMap("OpId")
        public String opId;

        @NameInMap("OsArch")
        public String osArch;

        @NameInMap("OsName")
        public String osName;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("PlanSummary")
        public String planSummary;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("SecsRunning")
        public Long secsRunning;

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
        @NameInMap("ActiveCount")
        public Long activeCount;

        @NameInMap("ClientStats")
        public java.util.Map<String, DataSessionStatClientStatsValue> clientStats;

        @NameInMap("DbStats")
        public java.util.Map<String, DataSessionStatDbStatsValue> dbStats;

        @NameInMap("LongestSecsRunning")
        public Long longestSecsRunning;

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
        @NameInMap("SessionList")
        public java.util.List<GetMongoDBCurrentOpResponseBodyDataSessionList> sessionList;

        @NameInMap("SessionStat")
        public GetMongoDBCurrentOpResponseBodyDataSessionStat sessionStat;

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
