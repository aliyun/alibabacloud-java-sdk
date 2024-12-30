// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBatchTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateBatchTaskRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchTaskRequest self = new CreateBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchTaskRequest setCreateCommand(CreateBatchTaskRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateBatchTaskRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateBatchTaskRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateBatchTaskRequestCreateCommand extends TeaModel {
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
        public String dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>erp</p>
         */
        @NameInMap("DataSourceSchema")
        public String dataSourceSchema;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/a/b</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <strong>example:</strong>
         * <p>PYTHON3_7</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test111</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10121101</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("PythonModuleList")
        public java.util.List<String> pythonModuleList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ScheduleType")
        public Integer scheduleType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        public static CreateBatchTaskRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchTaskRequestCreateCommand self = new CreateBatchTaskRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateBatchTaskRequestCreateCommand setDataSourceCatalog(String dataSourceCatalog) {
            this.dataSourceCatalog = dataSourceCatalog;
            return this;
        }
        public String getDataSourceCatalog() {
            return this.dataSourceCatalog;
        }

        public CreateBatchTaskRequestCreateCommand setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public CreateBatchTaskRequestCreateCommand setDataSourceSchema(String dataSourceSchema) {
            this.dataSourceSchema = dataSourceSchema;
            return this;
        }
        public String getDataSourceSchema() {
            return this.dataSourceSchema;
        }

        public CreateBatchTaskRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateBatchTaskRequestCreateCommand setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateBatchTaskRequestCreateCommand setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public CreateBatchTaskRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBatchTaskRequestCreateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateBatchTaskRequestCreateCommand setPythonModuleList(java.util.List<String> pythonModuleList) {
            this.pythonModuleList = pythonModuleList;
            return this;
        }
        public java.util.List<String> getPythonModuleList() {
            return this.pythonModuleList;
        }

        public CreateBatchTaskRequestCreateCommand setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public CreateBatchTaskRequestCreateCommand setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

}
