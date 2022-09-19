// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExecuteSyncSqlRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DevParamsId")
    public Long devParamsId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProcessDefinitionCode")
    public Long processDefinitionCode;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroup")
    public String resourceGroup;

    @NameInMap("SaveHistory")
    public Boolean saveHistory;

    @NameInMap("Schema")
    public String schema;

    @NameInMap("Sql")
    public String sql;

    @NameInMap("TemporaryParamProps")
    public java.util.List<ExecuteSyncSqlRequestTemporaryParamProps> temporaryParamProps;

    public static ExecuteSyncSqlRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSyncSqlRequest self = new ExecuteSyncSqlRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteSyncSqlRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ExecuteSyncSqlRequest setDevParamsId(Long devParamsId) {
        this.devParamsId = devParamsId;
        return this;
    }
    public Long getDevParamsId() {
        return this.devParamsId;
    }

    public ExecuteSyncSqlRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public ExecuteSyncSqlRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ExecuteSyncSqlRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ExecuteSyncSqlRequest setProcessDefinitionCode(Long processDefinitionCode) {
        this.processDefinitionCode = processDefinitionCode;
        return this;
    }
    public Long getProcessDefinitionCode() {
        return this.processDefinitionCode;
    }

    public ExecuteSyncSqlRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public ExecuteSyncSqlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExecuteSyncSqlRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public ExecuteSyncSqlRequest setSaveHistory(Boolean saveHistory) {
        this.saveHistory = saveHistory;
        return this;
    }
    public Boolean getSaveHistory() {
        return this.saveHistory;
    }

    public ExecuteSyncSqlRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public ExecuteSyncSqlRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public ExecuteSyncSqlRequest setTemporaryParamProps(java.util.List<ExecuteSyncSqlRequestTemporaryParamProps> temporaryParamProps) {
        this.temporaryParamProps = temporaryParamProps;
        return this;
    }
    public java.util.List<ExecuteSyncSqlRequestTemporaryParamProps> getTemporaryParamProps() {
        return this.temporaryParamProps;
    }

    public static class ExecuteSyncSqlRequestTemporaryParamProps extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ExecuteSyncSqlRequestTemporaryParamProps build(java.util.Map<String, ?> map) throws Exception {
            ExecuteSyncSqlRequestTemporaryParamProps self = new ExecuteSyncSqlRequestTemporaryParamProps();
            return TeaModel.build(map, self);
        }

        public ExecuteSyncSqlRequestTemporaryParamProps setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ExecuteSyncSqlRequestTemporaryParamProps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
