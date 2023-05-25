// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasSQLLogHotDataRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ChildDBInstanceIDs")
    public String childDBInstanceIDs;

    @NameInMap("DBName")
    public String DBName;

    @NameInMap("End")
    public Long end;

    @NameInMap("Fail")
    public String fail;

    @NameInMap("HostAddress")
    public String hostAddress;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LogicalOperator")
    public String logicalOperator;

    @NameInMap("MaxLatancy")
    public Long maxLatancy;

    @NameInMap("MaxRecordsPerPage")
    public Long maxRecordsPerPage;

    @NameInMap("MaxRows")
    public Long maxRows;

    @NameInMap("MaxScanRows")
    public Long maxScanRows;

    @NameInMap("MaxSpillCnt")
    public Long maxSpillCnt;

    @NameInMap("MinLatancy")
    public Long minLatancy;

    @NameInMap("MinRows")
    public Long minRows;

    @NameInMap("MinScanRows")
    public Long minScanRows;

    @NameInMap("MinSpillCnt")
    public Long minSpillCnt;

    @NameInMap("PageNumbers")
    public Long pageNumbers;

    @NameInMap("QueryKeyword")
    public String queryKeyword;

    @NameInMap("Role")
    public String role;

    @NameInMap("SortKey")
    public String sortKey;

    @NameInMap("SortMethod")
    public String sortMethod;

    @NameInMap("SqlType")
    public String sqlType;

    @NameInMap("Start")
    public Long start;

    @NameInMap("State")
    public String state;

    @NameInMap("ThreadID")
    public String threadID;

    @NameInMap("TraceId")
    public String traceId;

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
