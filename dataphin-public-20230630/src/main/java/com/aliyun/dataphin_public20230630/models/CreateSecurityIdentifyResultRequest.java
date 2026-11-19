// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateSecurityIdentifyResultRequest extends TeaModel {
    /**
     * <p>The creation request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateSecurityIdentifyResultRequestCreateCommand createCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static CreateSecurityIdentifyResultRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityIdentifyResultRequest self = new CreateSecurityIdentifyResultRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityIdentifyResultRequest setCreateCommand(CreateSecurityIdentifyResultRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateSecurityIdentifyResultRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateSecurityIdentifyResultRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateSecurityIdentifyResultRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CreateSecurityIdentifyResultRequestCreateCommand extends TeaModel {
        /**
         * <p>The classification ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClassifyId")
        public Long classifyId;

        /**
         * <p>The conflict strategy. Valid values: COVER_ALL (overwrites all online tags) and COVER_UNLOCKED (overwrites only unlocked online tags).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>COVER_ALL</p>
         */
        @NameInMap("ConflictStrategy")
        public String conflictStrategy;

        /**
         * <p>The environment identifier of the datasource. This parameter is required only for datasource tables.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("DatasourceEnv")
        public String datasourceEnv;

        /**
         * <p>The name of the datasource. This parameter is required only for datasource tables.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

        /**
         * <p>The enabled status. Valid values: true (enabled) and false (disabled). Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The name of the field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>Specifies whether the table is a datasource table. Default value: false (treated as a Dataphin table).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDatasourceTable")
        public Boolean isDatasourceTable;

        /**
         * <p>The catalog of the table. For a datasource table, specify the name of the database or schema to which the table belongs. For a Dataphin physical table, specify the English name of the project. For a Dataphin logical table, specify the English name of the business unit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TableCatalog")
        public String tableCatalog;

        /**
         * <p>The name of the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t_test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static CreateSecurityIdentifyResultRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityIdentifyResultRequestCreateCommand self = new CreateSecurityIdentifyResultRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateSecurityIdentifyResultRequestCreateCommand setClassifyId(Long classifyId) {
            this.classifyId = classifyId;
            return this;
        }
        public Long getClassifyId() {
            return this.classifyId;
        }

        public CreateSecurityIdentifyResultRequestCreateCommand setConflictStrategy(String conflictStrategy) {
            this.conflictStrategy = conflictStrategy;
            return this;
        }
        public String getConflictStrategy() {
            return this.conflictStrategy;
        }

        public CreateSecurityIdentifyResultRequestCreateCommand setDatasourceEnv(String datasourceEnv) {
            this.datasourceEnv = datasourceEnv;
            return this;
        }
        public String getDatasourceEnv() {
            return this.datasourceEnv;
        }

        public CreateSecurityIdentifyResultRequestCreateCommand setDatasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public String getDatasourceName() {
            return this.datasourceName;
        }

        public CreateSecurityIdentifyResultRequestCreateCommand setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateSecurityIdentifyResultRequestCreateCommand setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public CreateSecurityIdentifyResultRequestCreateCommand setIsDatasourceTable(Boolean isDatasourceTable) {
            this.isDatasourceTable = isDatasourceTable;
            return this;
        }
        public Boolean getIsDatasourceTable() {
            return this.isDatasourceTable;
        }

        public CreateSecurityIdentifyResultRequestCreateCommand setTableCatalog(String tableCatalog) {
            this.tableCatalog = tableCatalog;
            return this;
        }
        public String getTableCatalog() {
            return this.tableCatalog;
        }

        public CreateSecurityIdentifyResultRequestCreateCommand setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
