// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecuteAdHocTaskRequest extends TeaModel {
    /**
     * <p>The execution command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExecuteCommand")
    public ExecuteAdHocTaskRequestExecuteCommand executeCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ExecuteAdHocTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAdHocTaskRequest self = new ExecuteAdHocTaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAdHocTaskRequest setExecuteCommand(ExecuteAdHocTaskRequestExecuteCommand executeCommand) {
        this.executeCommand = executeCommand;
        return this;
    }
    public ExecuteAdHocTaskRequestExecuteCommand getExecuteCommand() {
        return this.executeCommand;
    }

    public ExecuteAdHocTaskRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ExecuteAdHocTaskRequestExecuteCommandParamList extends TeaModel {
        /**
         * <p>The parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The parameter value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ExecuteAdHocTaskRequestExecuteCommandParamList build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAdHocTaskRequestExecuteCommandParamList self = new ExecuteAdHocTaskRequestExecuteCommandParamList();
            return TeaModel.build(map, self);
        }

        public ExecuteAdHocTaskRequestExecuteCommandParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ExecuteAdHocTaskRequestExecuteCommandParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExecuteAdHocTaskRequestExecuteCommand extends TeaModel {
        /**
         * <p>The node script.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>show tables;</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The catalog for a database SQL task. This parameter takes effect only for data source types that require a catalog, such as Presto.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_catalog</p>
         */
        @NameInMap("DataSourceCatalog")
        public String dataSourceCatalog;

        /**
         * <p>The data source ID for a database SQL task.</p>
         * 
         * <strong>example:</strong>
         * <p>12131111</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <p>The schema for a database SQL task. This parameter takes effect only for data source types that require a schema, such as Oracle.</p>
         * 
         * <strong>example:</strong>
         * <p>erp</p>
         */
        @NameInMap("DataSourceSchema")
        public String dataSourceSchema;

        /**
         * <p>The node type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute_SQL</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        /**
         * <p>The runtime parameters.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<ExecuteAdHocTaskRequestExecuteCommandParamList> paramList;

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123222121</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static ExecuteAdHocTaskRequestExecuteCommand build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAdHocTaskRequestExecuteCommand self = new ExecuteAdHocTaskRequestExecuteCommand();
            return TeaModel.build(map, self);
        }

        public ExecuteAdHocTaskRequestExecuteCommand setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecuteAdHocTaskRequestExecuteCommand setDataSourceCatalog(String dataSourceCatalog) {
            this.dataSourceCatalog = dataSourceCatalog;
            return this;
        }
        public String getDataSourceCatalog() {
            return this.dataSourceCatalog;
        }

        public ExecuteAdHocTaskRequestExecuteCommand setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public ExecuteAdHocTaskRequestExecuteCommand setDataSourceSchema(String dataSourceSchema) {
            this.dataSourceSchema = dataSourceSchema;
            return this;
        }
        public String getDataSourceSchema() {
            return this.dataSourceSchema;
        }

        public ExecuteAdHocTaskRequestExecuteCommand setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public ExecuteAdHocTaskRequestExecuteCommand setParamList(java.util.List<ExecuteAdHocTaskRequestExecuteCommandParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<ExecuteAdHocTaskRequestExecuteCommandParamList> getParamList() {
            return this.paramList;
        }

        public ExecuteAdHocTaskRequestExecuteCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
