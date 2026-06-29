// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBatchTaskRequest extends TeaModel {
    /**
     * <p>The create command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateBatchTaskRequestCreateCommand createCommand;

    /**
     * <p>The tenant ID.</p>
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
         * <p>The catalog for a database SQL node. This parameter takes effect only for data source types that require a catalog, such as Presto.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_catalog</p>
         */
        @NameInMap("DataSourceCatalog")
        public String dataSourceCatalog;

        /**
         * <p>The data source ID for a database SQL node.</p>
         * 
         * <strong>example:</strong>
         * <p>12131111</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The schema for a database SQL node. This parameter takes effect only for data source types that require a schema, such as Oracle.</p>
         * 
         * <strong>example:</strong>
         * <p>erp</p>
         */
        @NameInMap("DataSourceSchema")
        public String dataSourceSchema;

        /**
         * <p>The description.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The folder path in the menu tree to which the node belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/a/b</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The execution engine for the node, such as a Python node. Valid values:</p>
         * <ul>
         * <li>1: PYTHON2_7</li>
         * <li>2: PYTHON3_7</li>
         * <li>3: PYTHON3_11.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PYTHON3_7</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The name of the batch task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test111</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the project to which the node belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10121101</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The list of third-party Python packages that the node depends on.</p>
         */
        @NameInMap("PythonModuleList")
        public java.util.List<String> pythonModuleList;

        /**
         * <p>The scheduling type. Valid values:</p>
         * <ul>
         * <li>1: periodic node.</li>
         * <li>3: manual node.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ScheduleType")
        public Integer scheduleType;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li>Hive_SQL: 1</li>
         * <li>Hive_SQL_23X: 101</li>
         * <li>HIVE_SQL_FUSION_INSIGHT_80X: 111</li>
         * <li>COMMON_HIVE_SQL: 131</li>
         * <li>HADOOP_MR: 2</li>
         * <li>MaxCompute_SQL: 5</li>
         * <li>MaxCompute_MR: 6</li>
         * <li>SPARK_SQL_ON_MAX_COMPUTE: 7</li>
         * <li>SPARK_JAR_ON_MAX_COMPUTE: 8</li>
         * <li>SPARK_SQL_ON_HIVE: 17</li>
         * <li>Spark_JAR_ON_HIVE: 18</li>
         * <li>Shell: 10</li>
         * <li>PAI_DESIGNER: 71</li>
         * <li>DataX: 15</li>
         * <li>Merge: 16</li>
         * <li>Python: 21</li>
         * <li>Python37x: 22</li>
         * <li>Perl: 23</li>
         * <li>Python311x: 24</li>
         * <li>OneService_SQL: 25</li>
         * <li>ONE_SERVICE_SQL_ADB_FOR_PG: 26</li>
         * <li>OneService_SQL_Hive11x: 27</li>
         * <li>OneService_SQL_Hive23x: 29</li>
         * <li>ONE_SERVICE_SQL_TDH_INCEPTOR: 75</li>
         * <li>ONE_SERVICE_SQL_HIVE_CDP: 91</li>
         * <li>ONE_SERVICE_SQL_HIVE_ASIA_INFO_DP_53X: 92</li>
         * <li>Dlink: 30</li>
         * <li>ONE_SERVICE_SQL_ADB_FOR_MYSQL: 33</li>
         * <li>Logical: 31</li>
         * <li>Flink_Streaming: 41</li>
         * <li>Flink_Batch: 42</li>
         * <li>ADB_FOR_PG: 51</li>
         * <li>DryRun: 100</li>
         * <li>CHECK: 902</li>
         * <li>VIRTUAL: 999</li>
         * <li>INCEPTOR_SQL: 10000</li>
         * <li>HOLOGRES_SQL: 28</li>
         * <li>ARGODB_SQL: 76</li>
         * <li>IMPALA_SQL: 78</li>
         * <li>STARROCKS_SQL: 79</li>
         * <li>SPARK_SQL: 80</li>
         * <li>GAUSS_SQL: 81</li>
         * <li>DATABASE_SQL: 998</li>
         * <li>EXTERNAL_TRIGGER: 997.</li>
         * </ul>
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
