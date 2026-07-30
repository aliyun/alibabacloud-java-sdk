// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasSQLLogHotDataRequest extends TeaModel {
    /**
     * <p>The database account.</p>
     * <blockquote>
     * <p>You can specify multiple database accounts. Separate multiple accounts with a space. For example: <code>user1 user2 user3</code>.</p>
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
     * <p>This parameter is required if the database instance is a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-bp179lg03445l****</p>
     */
    @NameInMap("ChildDBInstanceIDs")
    public String childDBInstanceIDs;

    /**
     * <p>The database name.</p>
     * <blockquote>
     * <p>You can specify multiple database names. Separate multiple names with a space. For example: <code>DB1 DB2 DB3</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testDB</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The end of the time range to query. This value must be a Unix timestamp in milliseconds.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The time range cannot exceed one day.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684820697000</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>The SQL execution error code. You can call the <a href="https://help.aliyun.com/document_detail/409804.html">GetAsyncErrorRequestStatByCode</a> operation to obtain the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1064</p>
     */
    @NameInMap("Fail")
    public String fail;

    /**
     * <p>The client IP address.</p>
     * <blockquote>
     * <p>You can specify multiple client IP addresses. Separate multiple IP addresses with a space. For example: <code>IP1 IP2 IP3</code>.</p>
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
     * <p>The logical operator to use with multiple keywords. Valid values:</p>
     * <ul>
     * <li><p><strong>or</strong></p>
     * </li>
     * <li><p><strong>and</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("LogicalOperator")
    public String logicalOperator;

    /**
     * <p>The maximum execution time in microseconds. Returns SQL statements that have an execution time less than this value.</p>
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
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MaxRows")
    public Long maxRows;

    /**
     * <p>The maximum number of scanned rows. Returns SQL statements that scanned fewer than this number of rows.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MaxScanRows")
    public Long maxScanRows;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MaxSpillCnt")
    public Long maxSpillCnt;

    /**
     * <p>The minimum execution time in microseconds. Returns SQL statements with an execution time greater than or equal to this value.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinLatancy")
    public Long minLatancy;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MinRows")
    public Long minRows;

    /**
     * <p>The minimum number of scanned rows. Returns SQL statements that scanned at least this number of rows.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinScanRows")
    public Long minScanRows;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MinSpillCnt")
    public Long minSpillCnt;

    /**
     * <p>The page number to return. Pages start from 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumbers")
    public Long pageNumbers;

    /**
     * <p>The query keyword.</p>
     * <blockquote>
     * <p>Fuzzy search is supported. You can specify up to 10 keywords. Separate multiple keywords with a space. For example: a1 b2 c3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1 b2</p>
     */
    @NameInMap("QueryKeyword")
    public String queryKeyword;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The sort key. Valid values:</p>
     * <ul>
     * <li><p><strong>ScanRows</strong>: scanned rows.</p>
     * </li>
     * <li><p><strong>UpdateRows</strong>: updated rows.</p>
     * </li>
     * <li><p><strong>Consume</strong>: execution time.</p>
     * </li>
     * <li><p><strong>OriginTime</strong>: The execution start time.</p>
     * </li>
     * <li><p><strong>ReturnRows</strong>: returned rows.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ScanRows</p>
     */
    @NameInMap("SortKey")
    public String sortKey;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><strong>ASC</strong>: ascending</p>
     * </li>
     * <li><p><strong>DESC</strong>: descending</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("SortMethod")
    public String sortMethod;

    /**
     * <p>The SQL type.</p>
     * 
     * <strong>example:</strong>
     * <p>select</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The start of the time range to query. This value must be a Unix timestamp in milliseconds.</p>
     * <blockquote>
     * <p>You can query only data that is generated after you enable DAS Enterprise Edition. The start time cannot be earlier than seven days before the current time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684734297000</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>The execution state. Set this parameter to <strong>0</strong> to query for successfully executed SQL statements. You can also specify an error code to query for the corresponding SQL statements.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The thread ID.</p>
     * <blockquote>
     * <p>You can specify multiple thread IDs. Separate multiple IDs with a space. For example: <code>657 658 659</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>657</p>
     */
    @NameInMap("ThreadID")
    public String threadID;

    /**
     * <p>A reserved parameter.</p>
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
