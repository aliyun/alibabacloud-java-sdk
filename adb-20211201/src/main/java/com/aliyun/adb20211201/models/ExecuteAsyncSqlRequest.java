// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExecuteAsyncSqlRequest extends TeaModel {
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
    public java.util.List<ExecuteAsyncSqlRequestTemporaryParamProps> temporaryParamProps;

    public static ExecuteAsyncSqlRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAsyncSqlRequest self = new ExecuteAsyncSqlRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAsyncSqlRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ExecuteAsyncSqlRequest setDevParamsId(Long devParamsId) {
        this.devParamsId = devParamsId;
        return this;
    }
    public Long getDevParamsId() {
        return this.devParamsId;
    }

    public ExecuteAsyncSqlRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public ExecuteAsyncSqlRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ExecuteAsyncSqlRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ExecuteAsyncSqlRequest setProcessDefinitionCode(Long processDefinitionCode) {
        this.processDefinitionCode = processDefinitionCode;
        return this;
    }
    public Long getProcessDefinitionCode() {
        return this.processDefinitionCode;
    }

    public ExecuteAsyncSqlRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public ExecuteAsyncSqlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExecuteAsyncSqlRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public ExecuteAsyncSqlRequest setSaveHistory(Boolean saveHistory) {
        this.saveHistory = saveHistory;
        return this;
    }
    public Boolean getSaveHistory() {
        return this.saveHistory;
    }

    public ExecuteAsyncSqlRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public ExecuteAsyncSqlRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public ExecuteAsyncSqlRequest setTemporaryParamProps(java.util.List<ExecuteAsyncSqlRequestTemporaryParamProps> temporaryParamProps) {
        this.temporaryParamProps = temporaryParamProps;
        return this;
    }
    public java.util.List<ExecuteAsyncSqlRequestTemporaryParamProps> getTemporaryParamProps() {
        return this.temporaryParamProps;
    }

    public static class ExecuteAsyncSqlRequestTemporaryParamProps extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ExecuteAsyncSqlRequestTemporaryParamProps build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAsyncSqlRequestTemporaryParamProps self = new ExecuteAsyncSqlRequestTemporaryParamProps();
            return TeaModel.build(map, self);
        }

        public ExecuteAsyncSqlRequestTemporaryParamProps setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ExecuteAsyncSqlRequestTemporaryParamProps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
