// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogsV2Request extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Database")
    public String database;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ExecuteCost")
    public String executeCost;

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
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("QueryKeywords")
    public String queryKeywords;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SourceIP")
    public String sourceIP;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("User")
    public String user;

    public static DescribeSQLLogsV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogsV2Request self = new DescribeSQLLogsV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogsV2Request setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSQLLogsV2Request setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeSQLLogsV2Request setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLLogsV2Request setExecuteCost(String executeCost) {
        this.executeCost = executeCost;
        return this;
    }
    public String getExecuteCost() {
        return this.executeCost;
    }

    public DescribeSQLLogsV2Request setExecuteState(String executeState) {
        this.executeState = executeState;
        return this;
    }
    public String getExecuteState() {
        return this.executeState;
    }

    public DescribeSQLLogsV2Request setMaxExecuteCost(String maxExecuteCost) {
        this.maxExecuteCost = maxExecuteCost;
        return this;
    }
    public String getMaxExecuteCost() {
        return this.maxExecuteCost;
    }

    public DescribeSQLLogsV2Request setMinExecuteCost(String minExecuteCost) {
        this.minExecuteCost = minExecuteCost;
        return this;
    }
    public String getMinExecuteCost() {
        return this.minExecuteCost;
    }

    public DescribeSQLLogsV2Request setOperationClass(String operationClass) {
        this.operationClass = operationClass;
        return this;
    }
    public String getOperationClass() {
        return this.operationClass;
    }

    public DescribeSQLLogsV2Request setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public DescribeSQLLogsV2Request setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogsV2Request setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSQLLogsV2Request setQueryKeywords(String queryKeywords) {
        this.queryKeywords = queryKeywords;
        return this;
    }
    public String getQueryKeywords() {
        return this.queryKeywords;
    }

    public DescribeSQLLogsV2Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSQLLogsV2Request setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSQLLogsV2Request setSourceIP(String sourceIP) {
        this.sourceIP = sourceIP;
        return this;
    }
    public String getSourceIP() {
        return this.sourceIP;
    }

    public DescribeSQLLogsV2Request setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSQLLogsV2Request setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
