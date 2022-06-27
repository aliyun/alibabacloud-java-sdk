// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoResponseBody extends TeaModel {
    @NameInMap("Database")
    public String database;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("MaxOutputRows")
    public String maxOutputRows;

    @NameInMap("QueryID")
    public String queryID;

    @NameInMap("QueryPlan")
    public String queryPlan;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SQLStmt")
    public String SQLStmt;

    @NameInMap("SessionID")
    public String sessionID;

    @NameInMap("SortedMetrics")
    public String sortedMetrics;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("TextPlan")
    public String textPlan;

    @NameInMap("User")
    public String user;

    public static DescribeDiagnosisSQLInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisSQLInfoResponseBody self = new DescribeDiagnosisSQLInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisSQLInfoResponseBody setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeDiagnosisSQLInfoResponseBody setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public DescribeDiagnosisSQLInfoResponseBody setMaxOutputRows(String maxOutputRows) {
        this.maxOutputRows = maxOutputRows;
        return this;
    }
    public String getMaxOutputRows() {
        return this.maxOutputRows;
    }

    public DescribeDiagnosisSQLInfoResponseBody setQueryID(String queryID) {
        this.queryID = queryID;
        return this;
    }
    public String getQueryID() {
        return this.queryID;
    }

    public DescribeDiagnosisSQLInfoResponseBody setQueryPlan(String queryPlan) {
        this.queryPlan = queryPlan;
        return this;
    }
    public String getQueryPlan() {
        return this.queryPlan;
    }

    public DescribeDiagnosisSQLInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnosisSQLInfoResponseBody setSQLStmt(String SQLStmt) {
        this.SQLStmt = SQLStmt;
        return this;
    }
    public String getSQLStmt() {
        return this.SQLStmt;
    }

    public DescribeDiagnosisSQLInfoResponseBody setSessionID(String sessionID) {
        this.sessionID = sessionID;
        return this;
    }
    public String getSessionID() {
        return this.sessionID;
    }

    public DescribeDiagnosisSQLInfoResponseBody setSortedMetrics(String sortedMetrics) {
        this.sortedMetrics = sortedMetrics;
        return this;
    }
    public String getSortedMetrics() {
        return this.sortedMetrics;
    }

    public DescribeDiagnosisSQLInfoResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDiagnosisSQLInfoResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDiagnosisSQLInfoResponseBody setTextPlan(String textPlan) {
        this.textPlan = textPlan;
        return this;
    }
    public String getTextPlan() {
        return this.textPlan;
    }

    public DescribeDiagnosisSQLInfoResponseBody setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
