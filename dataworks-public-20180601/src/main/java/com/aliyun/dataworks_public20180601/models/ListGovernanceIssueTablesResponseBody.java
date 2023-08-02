// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListGovernanceIssueTablesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListGovernanceIssueTablesResponseBodyData data;

    @NameInMap("DynamicErrorCode")
    public String dynamicErrorCode;

    @NameInMap("DynamicErrorMessage")
    public String dynamicErrorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListGovernanceIssueTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGovernanceIssueTablesResponseBody self = new ListGovernanceIssueTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGovernanceIssueTablesResponseBody setData(ListGovernanceIssueTablesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGovernanceIssueTablesResponseBodyData getData() {
        return this.data;
    }

    public ListGovernanceIssueTablesResponseBody setDynamicErrorCode(String dynamicErrorCode) {
        this.dynamicErrorCode = dynamicErrorCode;
        return this;
    }
    public String getDynamicErrorCode() {
        return this.dynamicErrorCode;
    }

    public ListGovernanceIssueTablesResponseBody setDynamicErrorMessage(String dynamicErrorMessage) {
        this.dynamicErrorMessage = dynamicErrorMessage;
        return this;
    }
    public String getDynamicErrorMessage() {
        return this.dynamicErrorMessage;
    }

    public ListGovernanceIssueTablesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListGovernanceIssueTablesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListGovernanceIssueTablesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGovernanceIssueTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGovernanceIssueTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs extends TeaModel {
        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("DatasourceType")
        public String datasourceType;

        @NameInMap("DownstreamDependencyCount")
        public Integer downstreamDependencyCount;

        @NameInMap("LastAccessTime")
        public Long lastAccessTime;

        @NameInMap("LifeCycle")
        public Integer lifeCycle;

        @NameInMap("McProjectName")
        public String mcProjectName;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("RuleCategory")
        public String ruleCategory;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Schema")
        public String schema;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TableSize")
        public Long tableSize;

        public static ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs build(java.util.Map<String, ?> map) throws Exception {
            ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs self = new ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs();
            return TeaModel.build(map, self);
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setDownstreamDependencyCount(Integer downstreamDependencyCount) {
            this.downstreamDependencyCount = downstreamDependencyCount;
            return this;
        }
        public Integer getDownstreamDependencyCount() {
            return this.downstreamDependencyCount;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setLifeCycle(Integer lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }
        public Integer getLifeCycle() {
            return this.lifeCycle;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setMcProjectName(String mcProjectName) {
            this.mcProjectName = mcProjectName;
            return this;
        }
        public String getMcProjectName() {
            return this.mcProjectName;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setRuleCategory(String ruleCategory) {
            this.ruleCategory = ruleCategory;
            return this;
        }
        public String getRuleCategory() {
            return this.ruleCategory;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs setTableSize(Long tableSize) {
            this.tableSize = tableSize;
            return this;
        }
        public Long getTableSize() {
            return this.tableSize;
        }

    }

    public static class ListGovernanceIssueTablesResponseBodyData extends TeaModel {
        @NameInMap("DataServiceAPIs")
        public java.util.List<ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs> dataServiceAPIs;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListGovernanceIssueTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGovernanceIssueTablesResponseBodyData self = new ListGovernanceIssueTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGovernanceIssueTablesResponseBodyData setDataServiceAPIs(java.util.List<ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs> dataServiceAPIs) {
            this.dataServiceAPIs = dataServiceAPIs;
            return this;
        }
        public java.util.List<ListGovernanceIssueTablesResponseBodyDataDataServiceAPIs> getDataServiceAPIs() {
            return this.dataServiceAPIs;
        }

        public ListGovernanceIssueTablesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGovernanceIssueTablesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGovernanceIssueTablesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
