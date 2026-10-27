// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasSQLLogHotDataRequest extends TeaModel {
    /**
     * <p>The database account.</p>
     * <blockquote>
     * <p>You can use multiple database accounts for a combined query. Separate multiple database accounts with spaces. Example: <code>user1 user2 user3</code>.</p>
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
     * <p>For a PolarDB for MySQL instance, you must specify the node ID.</p>
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
     * <p>You can use multiple database names for a combined query. Separate multiple database names with spaces. Example: <code>DB1 DB2 DB3</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testDB</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The end time of the query. The time is in the UNIX timestamp format. Unit: milliseconds.</p>
     * <blockquote>
     * <p>The end time must be later than the start time, and the interval between the start time and the end time cannot exceed 1 day.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684820697000</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>The error code returned when the SQL statement is executed. You can call the <a href="https://help.aliyun.com/document_detail/409804.html">GetAsyncErrorRequestStatByCode</a> operation to obtain the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1064</p>
     */
    @NameInMap("Fail")
    public String fail;

    /**
     * <p>The IP address of the client.</p>
     * <blockquote>
     * <p>You can use multiple client IP addresses for a combined query. Separate multiple client IP addresses with spaces. Example: <code>IP1 IP2 IP3</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX</p>
     */
    @NameInMap("HostAddress")
    public String hostAddress;

    /**
     * <p>The database instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The logical relationship between multiple keywords. Valid values:</p>
     * <ul>
     * <li><strong>or</strong>: OR.</li>
     * <li><strong>and</strong>: AND.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("LogicalOperator")
    public String logicalOperator;

    /**
     * <p>The maximum execution duration. Unit: microseconds. This parameter is used to query SQL statements whose execution duration is less than the specified value.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxLatancy")
    public Long maxLatancy;

    /**
     * <p>The maximum number of records per page for the paging query. Valid values: 5 to 100.</p>
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
     * <p>The maximum number of scanned rows. This parameter is used to query SQL statements whose number of scanned rows is less than the specified value.</p>
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
     * <p>The minimum execution duration. Unit: microseconds. This parameter is used to query SQL statements whose execution duration is greater than or equal to the specified value.</p>
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
     * <p>The minimum number of scanned rows. This parameter is used to query SQL statements whose number of scanned rows is greater than or equal to the specified value.</p>
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
     * <p>The page number for the paging query. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumbers")
    public Long pageNumbers;

    /**
     * <p>The keyword.</p>
     * <blockquote>
     * <p>Fuzzy match is supported. You can use a maximum of 10 keywords for a combined query. Separate multiple keywords with spaces. Example: a1 b2 c3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1 b2</p>
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
     * <p>The sort key. Valid values:</p>
     * <ul>
     * <li><strong>ScanRows</strong>: the number of scanned rows.</li>
     * <li><strong>UpdateRows</strong>: the number of updated rows.</li>
     * <li><strong>Consume</strong>: the execution duration.</li>
     * <li><strong>OriginTime</strong>: the execution time.</li>
     * <li><strong>ReturnRows</strong>: the number of returned rows.</li>
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
     * <li><strong>ASC</strong>: ascending order.</li>
     * <li><strong>DESC</strong>: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("SortMethod")
    public String sortMethod;

    /**
     * <p>The type of the SQL statement. Valid values:</p>
     * <ul>
     * <li><strong>select</strong></li>
     * <li><strong>update</strong></li>
     * <li><strong>delete</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>select</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The start time of the query. The time is in the UNIX timestamp format. Unit: milliseconds.</p>
     * <blockquote>
     * <p>You can only query data generated after DAS Enterprise Edition is enabled. The start time cannot be more than 7 days earlier than the current time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684734297000</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>The execution result. If you enter <strong>0</strong>, the system queries SQL statements that are successfully executed. You can also enter a specific error code to query the corresponding SQL statements.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The thread ID.</p>
     * <blockquote>
     * <p>You can use multiple thread IDs for a combined query. Separate multiple thread IDs with spaces. Example: <code>ThreadID1 ThreadID2 ThreadID3</code>.</p>
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
