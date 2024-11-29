// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasSQLLogHotDataRequest extends TeaModel {
    /**
     * <p>The account of the database.</p>
     * <blockquote>
     * <p> You can specify multiple database accounts that are separated by spaces. Example: <code>user1 user2 user3</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testuser</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p> This parameter must be specified if the database instance is a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-bp179lg03445l****</p>
     */
    @NameInMap("ChildDBInstanceIDs")
    public String childDBInstanceIDs;

    /**
     * <p>The name of the database.</p>
     * <blockquote>
     * <p> You can specify multiple database names that are separated by spaces. Example: <code>DB1 DB2 DB3</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testDB</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time. The interval between the start time and the end time cannot exceed 24 hours.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684820697000</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>The error code of SQL execution. You can call the <a href="https://help.aliyun.com/document_detail/409804.html">GetAsyncErrorRequestStatByCode</a> operation to query MySQL error codes in SQL Explorer data.</p>
     * 
     * <strong>example:</strong>
     * <p>1064</p>
     */
    @NameInMap("Fail")
    public String fail;

    /**
     * <p>The IP address of the client.</p>
     * <blockquote>
     * <p> You can specify multiple IP addresses that are separated by spaces. Example: <code>IP1 IP2 IP3</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX</p>
     */
    @NameInMap("HostAddress")
    public String hostAddress;

    /**
     * <p>The ID of the database instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The logical relationship among multiple keywords.</p>
     * <ul>
     * <li><strong>or</strong></li>
     * <li><strong>and</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("LogicalOperator")
    public String logicalOperator;

    /**
     * <p>The maximum execution duration. Unit: microseconds. You can specify this parameter to query the SQL statements whose execution duration is smaller than the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxLatancy")
    public Long maxLatancy;

    /**
     * <p>The maximum number of entries per page. Valid values: 5 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxRecordsPerPage")
    public Long maxRecordsPerPage;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MaxRows")
    public Long maxRows;

    /**
     * <p>The maximum number of scanned rows. You can specify this parameter to query the SQL statements that scan a smaller number of rows than the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MaxScanRows")
    public Long maxScanRows;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MaxSpillCnt")
    public Long maxSpillCnt;

    /**
     * <p>The minimum execution duration. Unit: microseconds. You can specify this parameter to query the SQL statements whose execution duration is greater than or equal to the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinLatancy")
    public Long minLatancy;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MinRows")
    public Long minRows;

    /**
     * <p>The minimum number of scanned rows. You can specify this parameter to query the SQL statements that scan a larger or an equal number of rows than the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinScanRows")
    public Long minScanRows;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MinSpillCnt")
    public Long minSpillCnt;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumbers")
    public Long pageNumbers;

    /**
     * <p>The keyword that is used for the query.</p>
     * <blockquote>
     * <p> Fuzzy search is not supported. You can query data by using multiple keywords. Separate keywords with spaces.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("QueryKeyword")
    public String queryKeyword;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The basis on which you want to sort the query results.</p>
     * <ul>
     * <li><strong>SCAN_ROWS</strong>: the number of scanned rows.</li>
     * <li><strong>UPDATE_ROWS</strong>: the number of updated rows.</li>
     * <li><strong>CONSUME</strong>: the time consumed.</li>
     * <li><strong>ORIGIN_TIME</strong>: the execution duration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SCAN_ROWS</p>
     */
    @NameInMap("SortKey")
    public String sortKey;

    /**
     * <p>The order in which you want to sort the query results.</p>
     * <ul>
     * <li><strong>ase</strong>: ascending order.</li>
     * <li><strong>desc</strong>: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ase</p>
     */
    @NameInMap("SortMethod")
    public String sortMethod;

    /**
     * <p>The type of the SQL statement. Valid values:</p>
     * <ul>
     * <li><strong>SELECT</strong></li>
     * <li><strong>UPDATE</strong></li>
     * <li><strong>DELETE</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The beginning of the time range to query. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p> The beginning of the time range to query must be later than the time when DAS Enterprise Edition is enabled, and can be up to seven days earlier than the current time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684734297000</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>The execution results. You can specify <strong>0</strong> to query the SQL statements that are successfully executed. You can also specify an error code to query the corresponding SQL statements that fail to be executed.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The thread ID.</p>
     * <blockquote>
     * <p> You can specify multiple thread IDs that are separated by spaces. Example: <code>Thread ID1 Thread ID2 Thread ID3</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>657</p>
     */
    @NameInMap("ThreadID")
    public String threadID;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    /**
     * <p>The transaction ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TransactionId")
    public String transactionId;

    public static GetDasSQLLogHotDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDasSQLLogHotDataRequest self = new GetDasSQLLogHotDataRequest();
        return TeaModel.build(map, self);
    }

    public GetDasSQLLogHotDataRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetDasSQLLogHotDataRequest setChildDBInstanceIDs(String childDBInstanceIDs) {
        this.childDBInstanceIDs = childDBInstanceIDs;
        return this;
    }
    public String getChildDBInstanceIDs() {
        return this.childDBInstanceIDs;
    }

    public GetDasSQLLogHotDataRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public GetDasSQLLogHotDataRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetDasSQLLogHotDataRequest setFail(String fail) {
        this.fail = fail;
        return this;
    }
    public String getFail() {
        return this.fail;
    }

    public GetDasSQLLogHotDataRequest setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
        return this;
    }
    public String getHostAddress() {
        return this.hostAddress;
    }

    public GetDasSQLLogHotDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDasSQLLogHotDataRequest setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    public GetDasSQLLogHotDataRequest setMaxLatancy(Long maxLatancy) {
        this.maxLatancy = maxLatancy;
        return this;
    }
    public Long getMaxLatancy() {
        return this.maxLatancy;
    }

    public GetDasSQLLogHotDataRequest setMaxRecordsPerPage(Long maxRecordsPerPage) {
        this.maxRecordsPerPage = maxRecordsPerPage;
        return this;
    }
    public Long getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    public GetDasSQLLogHotDataRequest setMaxRows(Long maxRows) {
        this.maxRows = maxRows;
        return this;
    }
    public Long getMaxRows() {
        return this.maxRows;
    }

    public GetDasSQLLogHotDataRequest setMaxScanRows(Long maxScanRows) {
        this.maxScanRows = maxScanRows;
        return this;
    }
    public Long getMaxScanRows() {
        return this.maxScanRows;
    }

    public GetDasSQLLogHotDataRequest setMaxSpillCnt(Long maxSpillCnt) {
        this.maxSpillCnt = maxSpillCnt;
        return this;
    }
    public Long getMaxSpillCnt() {
        return this.maxSpillCnt;
    }

    public GetDasSQLLogHotDataRequest setMinLatancy(Long minLatancy) {
        this.minLatancy = minLatancy;
        return this;
    }
    public Long getMinLatancy() {
        return this.minLatancy;
    }

    public GetDasSQLLogHotDataRequest setMinRows(Long minRows) {
        this.minRows = minRows;
        return this;
    }
    public Long getMinRows() {
        return this.minRows;
    }

    public GetDasSQLLogHotDataRequest setMinScanRows(Long minScanRows) {
        this.minScanRows = minScanRows;
        return this;
    }
    public Long getMinScanRows() {
        return this.minScanRows;
    }

    public GetDasSQLLogHotDataRequest setMinSpillCnt(Long minSpillCnt) {
        this.minSpillCnt = minSpillCnt;
        return this;
    }
    public Long getMinSpillCnt() {
        return this.minSpillCnt;
    }

    public GetDasSQLLogHotDataRequest setPageNumbers(Long pageNumbers) {
        this.pageNumbers = pageNumbers;
        return this;
    }
    public Long getPageNumbers() {
        return this.pageNumbers;
    }

    public GetDasSQLLogHotDataRequest setQueryKeyword(String queryKeyword) {
        this.queryKeyword = queryKeyword;
        return this;
    }
    public String getQueryKeyword() {
        return this.queryKeyword;
    }

    public GetDasSQLLogHotDataRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public GetDasSQLLogHotDataRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }
    public String getSortKey() {
        return this.sortKey;
    }

    public GetDasSQLLogHotDataRequest setSortMethod(String sortMethod) {
        this.sortMethod = sortMethod;
        return this;
    }
    public String getSortMethod() {
        return this.sortMethod;
    }

    public GetDasSQLLogHotDataRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public GetDasSQLLogHotDataRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public GetDasSQLLogHotDataRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetDasSQLLogHotDataRequest setThreadID(String threadID) {
        this.threadID = threadID;
        return this;
    }
    public String getThreadID() {
        return this.threadID;
    }

    public GetDasSQLLogHotDataRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public GetDasSQLLogHotDataRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
