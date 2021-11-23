// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSlowSQLLogsRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Database")
    public String database;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ExecuteState")
    public String executeState;

    @NameInMap("MaxExecuteCost")
    public String maxExecuteCost;

    @NameInMap("MinExecuteCost")
    public String minExecuteCost;

    @NameInMap("OperationClass")
    public String operationClass;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryKeywords")
    public String queryKeywords;

    @NameInMap("SourceIP")
    public String sourceIP;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("User")
    public String user;

    public static DescribeSlowSQLLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowSQLLogsRequest self = new DescribeSlowSQLLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlowSQLLogsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSlowSQLLogsRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeSlowSQLLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSlowSQLLogsRequest setExecuteState(String executeState) {
        this.executeState = executeState;
        return this;
    }
    public String getExecuteState() {
        return this.executeState;
    }

    public DescribeSlowSQLLogsRequest setMaxExecuteCost(String maxExecuteCost) {
        this.maxExecuteCost = maxExecuteCost;
        return this;
    }
    public String getMaxExecuteCost() {
        return this.maxExecuteCost;
    }

    public DescribeSlowSQLLogsRequest setMinExecuteCost(String minExecuteCost) {
        this.minExecuteCost = minExecuteCost;
        return this;
    }
    public String getMinExecuteCost() {
        return this.minExecuteCost;
    }

    public DescribeSlowSQLLogsRequest setOperationClass(String operationClass) {
        this.operationClass = operationClass;
        return this;
    }
    public String getOperationClass() {
        return this.operationClass;
    }

    public DescribeSlowSQLLogsRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public DescribeSlowSQLLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowSQLLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSlowSQLLogsRequest setQueryKeywords(String queryKeywords) {
        this.queryKeywords = queryKeywords;
        return this;
    }
    public String getQueryKeywords() {
        return this.queryKeywords;
    }

    public DescribeSlowSQLLogsRequest setSourceIP(String sourceIP) {
        this.sourceIP = sourceIP;
        return this;
    }
    public String getSourceIP() {
        return this.sourceIP;
    }

    public DescribeSlowSQLLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSlowSQLLogsRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
