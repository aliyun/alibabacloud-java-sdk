// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoResponseBody extends TeaModel {
    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>adbtest</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The execution duration of the query. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The maximum number of output rows.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxOutputRows")
    public String maxOutputRows;

    /**
     * <p>The query ID.</p>
     * 
     * <strong>example:</strong>
     * <p>71403480878****</p>
     */
    @NameInMap("QueryID")
    public String queryID;

    /**
     * <p>The information about the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;children\&quot;:********\&quot;startTime\&quot;:1660719602199}</p>
     */
    @NameInMap("QueryPlan")
    public String queryPlan;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>425AAA6A-63E0-1929-A1CE-3D9036CBC463</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>select n_live_tup, n_live_tup + n_dead_tup, pg_relation_size(table_name), last_vacuum from pg_stat_user_tables where relid = table_name::regclass</p>
     */
    @NameInMap("SQLStmt")
    public String SQLStmt;

    /**
     * <p>The ID of the session that contains the query.</p>
     * 
     * <strong>example:</strong>
     * <p>658****</p>
     */
    @NameInMap("SessionID")
    public String sessionID;

    /**
     * <p>The sequence of metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;costSort\&quot;:******:\&quot;Seq Scan-9\&quot;,\&quot;value\&quot;:0.0}]}</p>
     */
    @NameInMap("SortedMetrics")
    public String sortedMetrics;

    /**
     * <p>The start time of the query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1660719602199</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The execution state of the query. Valid values:</p>
     * <ul>
     * <li><strong>running</strong></li>
     * <li><strong>finished</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>finished</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The information about the execution plan.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("TextPlan")
    public String textPlan;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>adbpguser</p>
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
