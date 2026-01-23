// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateSecurityIdentifyResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateSecurityIdentifyResultRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

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

    public static class CreateSecurityIdentifyResultRequestCreateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClassifyId")
        public Long classifyId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>COVER_ALL</p>
         */
        @NameInMap("ConflictStrategy")
        public String conflictStrategy;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("DatasourceEnv")
        public String datasourceEnv;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDatasourceTable")
        public Boolean isDatasourceTable;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TableCatalog")
        public String tableCatalog;

        /**
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
