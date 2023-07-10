// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoResponseBody extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The execution duration of the query. Unit: seconds.</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The maximum number of output rows.</p>
     */
    @NameInMap("MaxOutputRows")
    public String maxOutputRows;

    /**
     * <p>The ID of the query.</p>
     */
    @NameInMap("QueryID")
    public String queryID;

    /**
     * <p>The information of the operator.</p>
     */
    @NameInMap("QueryPlan")
    public String queryPlan;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SQL statement.</p>
     */
    @NameInMap("SQLStmt")
    public String SQLStmt;

    /**
     * <p>The ID of the session that contains the query.</p>
     */
    @NameInMap("SessionID")
    public String sessionID;

    /**
     * <p>The sequence of metrics.</p>
     */
    @NameInMap("SortedMetrics")
    public String sortedMetrics;

    /**
     * <p>The start time of the query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The execution state of the query. Valid values:</p>
     * <br>
     * <p>*   **running**: The query is being executed.</p>
     * <p>*   **finished**: The query execution is complete.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The information of the execution plan.</p>
     */
    @NameInMap("TextPlan")
    public String textPlan;

    /**
     * <p>The name of the database account.</p>
     */
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
