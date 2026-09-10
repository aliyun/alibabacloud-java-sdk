// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class CreateExecuteSqlConversionRequest extends TeaModel {
    /**
     * <p>The source dialect.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("sourceDialect")
    public String sourceDialect;

    /**
     * <p>The list of source SQL scripts.</p>
     */
    @NameInMap("sourceSqlScript")
    public java.util.List<CreateExecuteSqlConversionRequestSourceSqlScript> sourceSqlScript;

    /**
     * <p>The target dialect.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("targetDialect")
    public String targetDialect;

    /**
     * <p>The task description.</p>
     * 
     * <strong>example:</strong>
     * <p>Data validation task description</p>
     */
    @NameInMap("taskDescription")
    public String taskDescription;

    /**
     * <p>The task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>data_check_task_demo</p>
     */
    @NameInMap("taskName")
    public String taskName;

    /**
     * <p>The script type. Valid values: 0 (DDL) and 1 (DQL).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("type")
    public Integer type;

    public static CreateExecuteSqlConversionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExecuteSqlConversionRequest self = new CreateExecuteSqlConversionRequest();
        return TeaModel.build(map, self);
    }

    public CreateExecuteSqlConversionRequest setSourceDialect(String sourceDialect) {
        this.sourceDialect = sourceDialect;
        return this;
    }
    public String getSourceDialect() {
        return this.sourceDialect;
    }

    public CreateExecuteSqlConversionRequest setSourceSqlScript(java.util.List<CreateExecuteSqlConversionRequestSourceSqlScript> sourceSqlScript) {
        this.sourceSqlScript = sourceSqlScript;
        return this;
    }
    public java.util.List<CreateExecuteSqlConversionRequestSourceSqlScript> getSourceSqlScript() {
        return this.sourceSqlScript;
    }

    public CreateExecuteSqlConversionRequest setTargetDialect(String targetDialect) {
        this.targetDialect = targetDialect;
        return this;
    }
    public String getTargetDialect() {
        return this.targetDialect;
    }

    public CreateExecuteSqlConversionRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public CreateExecuteSqlConversionRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateExecuteSqlConversionRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public static class CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList extends TeaModel {
        /**
         * <p>The primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The source type. Valid values: DB and Schema.</p>
         * 
         * <strong>example:</strong>
         * <p>db_demo</p>
         */
        @NameInMap("sourceSchema")
        public String sourceSchema;

        /**
         * <p>The source table name.</p>
         * 
         * <strong>example:</strong>
         * <p>table_demo</p>
         */
        @NameInMap("sourceTableName")
        public String sourceTableName;

        /**
         * <p>The target table name.</p>
         * 
         * <strong>example:</strong>
         * <p>table_demo</p>
         */
        @NameInMap("targetTableName")
        public String targetTableName;

        /**
         * <p>The target type. Valid values: DB and Schema.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        @NameInMap("targetType")
        public String targetType;

        /**
         * <p>The SQL conversion task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("uid")
        public String uid;

        public static CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList build(java.util.Map<String, ?> map) throws Exception {
            CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList self = new CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList();
            return TeaModel.build(map, self);
        }

        public CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList setSourceSchema(String sourceSchema) {
            this.sourceSchema = sourceSchema;
            return this;
        }
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        public CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

        public CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class CreateExecuteSqlConversionRequestSourceSqlScript extends TeaModel {
        /**
         * <p>The error reason.</p>
         * 
         * <strong>example:</strong>
         * <p>connection timeout</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The time when the conversion is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16T10:00:00Z</p>
         */
        @NameInMap("finishTime")
        public String finishTime;

        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("scriptId")
        public Long scriptId;

        /**
         * <p>The script name.</p>
         * 
         * <strong>example:</strong>
         * <p>node_script_demo</p>
         */
        @NameInMap("scriptName")
        public String scriptName;

        /**
         * <p>The script conversion status. In conversion job scenarios, valid values: pass (conversion succeeded), turning (conversion in progress), fail (conversion failed). In some scenarios, the following values are used: success (succeeded), failed (failed), skipped (skipped).</p>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("scriptTransformStatus")
        public String scriptTransformStatus;

        /**
         * <p>The converted script content.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM t;</p>
         */
        @NameInMap("sqlResultContent")
        public String sqlResultContent;

        /**
         * <p>The original script content.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM t;</p>
         */
        @NameInMap("sqlSourceContent")
        public String sqlSourceContent;

        /**
         * <p>The table name mappings for conversion.</p>
         */
        @NameInMap("tableMappingList")
        public java.util.List<CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList> tableMappingList;

        public static CreateExecuteSqlConversionRequestSourceSqlScript build(java.util.Map<String, ?> map) throws Exception {
            CreateExecuteSqlConversionRequestSourceSqlScript self = new CreateExecuteSqlConversionRequestSourceSqlScript();
            return TeaModel.build(map, self);
        }

        public CreateExecuteSqlConversionRequestSourceSqlScript setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CreateExecuteSqlConversionRequestSourceSqlScript setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public CreateExecuteSqlConversionRequestSourceSqlScript setScriptId(Long scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public Long getScriptId() {
            return this.scriptId;
        }

        public CreateExecuteSqlConversionRequestSourceSqlScript setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public CreateExecuteSqlConversionRequestSourceSqlScript setScriptTransformStatus(String scriptTransformStatus) {
            this.scriptTransformStatus = scriptTransformStatus;
            return this;
        }
        public String getScriptTransformStatus() {
            return this.scriptTransformStatus;
        }

        public CreateExecuteSqlConversionRequestSourceSqlScript setSqlResultContent(String sqlResultContent) {
            this.sqlResultContent = sqlResultContent;
            return this;
        }
        public String getSqlResultContent() {
            return this.sqlResultContent;
        }

        public CreateExecuteSqlConversionRequestSourceSqlScript setSqlSourceContent(String sqlSourceContent) {
            this.sqlSourceContent = sqlSourceContent;
            return this;
        }
        public String getSqlSourceContent() {
            return this.sqlSourceContent;
        }

        public CreateExecuteSqlConversionRequestSourceSqlScript setTableMappingList(java.util.List<CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList> tableMappingList) {
            this.tableMappingList = tableMappingList;
            return this;
        }
        public java.util.List<CreateExecuteSqlConversionRequestSourceSqlScriptTableMappingList> getTableMappingList() {
            return this.tableMappingList;
        }

    }

}
