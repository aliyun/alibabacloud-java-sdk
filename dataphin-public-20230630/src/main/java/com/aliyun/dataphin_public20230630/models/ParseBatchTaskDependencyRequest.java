// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ParseBatchTaskDependencyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ParseCommand")
    public ParseBatchTaskDependencyRequestParseCommand parseCommand;

    public static ParseBatchTaskDependencyRequest build(java.util.Map<String, ?> map) throws Exception {
        ParseBatchTaskDependencyRequest self = new ParseBatchTaskDependencyRequest();
        return TeaModel.build(map, self);
    }

    public ParseBatchTaskDependencyRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ParseBatchTaskDependencyRequest setParseCommand(ParseBatchTaskDependencyRequestParseCommand parseCommand) {
        this.parseCommand = parseCommand;
        return this;
    }
    public ParseBatchTaskDependencyRequestParseCommand getParseCommand() {
        return this.parseCommand;
    }

    public static class ParseBatchTaskDependencyRequestParseCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from t_test limit 1;</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>mysql_catalog</p>
         */
        @NameInMap("DataSourceCatalog")
        public String dataSourceCatalog;

        /**
         * <strong>example:</strong>
         * <p>12131111</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>erp</p>
         */
        @NameInMap("DataSourceSchema")
        public String dataSourceSchema;

        @NameInMap("IncludeAllInputTables")
        public Boolean includeAllInputTables;

        @NameInMap("NeedQueryLineages")
        public Boolean needQueryLineages;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute_SQL</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>131211211</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static ParseBatchTaskDependencyRequestParseCommand build(java.util.Map<String, ?> map) throws Exception {
            ParseBatchTaskDependencyRequestParseCommand self = new ParseBatchTaskDependencyRequestParseCommand();
            return TeaModel.build(map, self);
        }

        public ParseBatchTaskDependencyRequestParseCommand setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ParseBatchTaskDependencyRequestParseCommand setDataSourceCatalog(String dataSourceCatalog) {
            this.dataSourceCatalog = dataSourceCatalog;
            return this;
        }
        public String getDataSourceCatalog() {
            return this.dataSourceCatalog;
        }

        public ParseBatchTaskDependencyRequestParseCommand setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public ParseBatchTaskDependencyRequestParseCommand setDataSourceSchema(String dataSourceSchema) {
            this.dataSourceSchema = dataSourceSchema;
            return this;
        }
        public String getDataSourceSchema() {
            return this.dataSourceSchema;
        }

        public ParseBatchTaskDependencyRequestParseCommand setIncludeAllInputTables(Boolean includeAllInputTables) {
            this.includeAllInputTables = includeAllInputTables;
            return this;
        }
        public Boolean getIncludeAllInputTables() {
            return this.includeAllInputTables;
        }

        public ParseBatchTaskDependencyRequestParseCommand setNeedQueryLineages(Boolean needQueryLineages) {
            this.needQueryLineages = needQueryLineages;
            return this;
        }
        public Boolean getNeedQueryLineages() {
            return this.needQueryLineages;
        }

        public ParseBatchTaskDependencyRequestParseCommand setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public ParseBatchTaskDependencyRequestParseCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
