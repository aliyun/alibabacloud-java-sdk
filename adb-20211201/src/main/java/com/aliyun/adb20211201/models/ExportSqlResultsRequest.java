// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExportSqlResultsRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DevParamsId")
    public Long devParamsId;

    @NameInMap("ProcessDefinitionCode")
    public Long processDefinitionCode;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourcePool")
    public String resourcePool;

    @NameInMap("Schema")
    public String schema;

    @NameInMap("Sql")
    public String sql;

    @NameInMap("TemporaryParamProps")
    public java.util.List<ExportSqlResultsRequestTemporaryParamProps> temporaryParamProps;

    public static ExportSqlResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportSqlResultsRequest self = new ExportSqlResultsRequest();
        return TeaModel.build(map, self);
    }

    public ExportSqlResultsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ExportSqlResultsRequest setDevParamsId(Long devParamsId) {
        this.devParamsId = devParamsId;
        return this;
    }
    public Long getDevParamsId() {
        return this.devParamsId;
    }

    public ExportSqlResultsRequest setProcessDefinitionCode(Long processDefinitionCode) {
        this.processDefinitionCode = processDefinitionCode;
        return this;
    }
    public Long getProcessDefinitionCode() {
        return this.processDefinitionCode;
    }

    public ExportSqlResultsRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public ExportSqlResultsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExportSqlResultsRequest setResourcePool(String resourcePool) {
        this.resourcePool = resourcePool;
        return this;
    }
    public String getResourcePool() {
        return this.resourcePool;
    }

    public ExportSqlResultsRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public ExportSqlResultsRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public ExportSqlResultsRequest setTemporaryParamProps(java.util.List<ExportSqlResultsRequestTemporaryParamProps> temporaryParamProps) {
        this.temporaryParamProps = temporaryParamProps;
        return this;
    }
    public java.util.List<ExportSqlResultsRequestTemporaryParamProps> getTemporaryParamProps() {
        return this.temporaryParamProps;
    }

    public static class ExportSqlResultsRequestTemporaryParamProps extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ExportSqlResultsRequestTemporaryParamProps build(java.util.Map<String, ?> map) throws Exception {
            ExportSqlResultsRequestTemporaryParamProps self = new ExportSqlResultsRequestTemporaryParamProps();
            return TeaModel.build(map, self);
        }

        public ExportSqlResultsRequestTemporaryParamProps setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ExportSqlResultsRequestTemporaryParamProps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
