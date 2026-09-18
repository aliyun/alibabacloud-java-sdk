// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsJobsResponseBody extends TeaModel {
    /**
     * <p>The details of the returned data.</p>
     */
    @NameInMap("data")
    public ListMmsJobsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1112E7C7-C65F-57A2-A7C7-3B178AA257B6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMmsJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMmsJobsResponseBody self = new ListMmsJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMmsJobsResponseBody setData(ListMmsJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMmsJobsResponseBodyData getData() {
        return this.data;
    }

    public ListMmsJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMmsJobsResponseBodyDataObjectListConfig extends TeaModel {
        /**
         * <p>The mapping from source column names to destination column names.</p>
         */
        @NameInMap("columnMapping")
        public java.util.Map<String, String> columnMapping;

        /**
         * <p>Enable verification. The current method runs SELECT COUNT on both the source and destination and compares the row counts.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableVerification")
        public Boolean enableVerification;

        /**
         * <p>Enable incremental migration. Only new or modified partitions are migrated. Modified partitions are re-migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("increment")
        public Boolean increment;

        /**
         * <p>Other configuration settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;spark.executor.mem&quot;: &quot;2g&quot;}</p>
         */
        @NameInMap("others")
        public java.util.Map<String, ?> others;

        /**
         * <p>The partition filter expression. Specify the partition filter expression for each table.</p>
         */
        @NameInMap("partitionFilters")
        public java.util.Map<String, String> partitionFilters;

        /**
         * <p>When type is set to Partitions, specify the partition IDs of the tables to migrate.</p>
         */
        @NameInMap("partitions")
        public java.util.List<Long> partitions;

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("schemaOnly")
        public Boolean schemaOnly;

        /**
         * <p>When type is set to Database, specify the tables to exclude from migration.</p>
         */
        @NameInMap("tableBlackList")
        public java.util.List<String> tableBlackList;

        /**
         * <p>The mapping from source table names to destination table names.</p>
         */
        @NameInMap("tableMapping")
        public java.util.Map<String, String> tableMapping;

        /**
         * <p>When type is set to Database, specify the tables to migrate. If you do not specify tableWhiteList, all tables in the specified database are migrated.</p>
         */
        @NameInMap("tableWhiteList")
        public java.util.List<String> tableWhiteList;

        /**
         * <p>When type is set to Tables, specify the names of the tables to migrate.</p>
         */
        @NameInMap("tables")
        public java.util.List<String> tables;

        /**
         * <p>Deprecated. Valid values: MOCK, HIVE (hive udtf task), HIVE_DATAX (hive datax task), COPY_TASK (ODPS Copy Task), ODPS_INSERT_OVERWRITE (ODPS simple insert overwrite task), MC2MC_VERIFY, OSS, HIVE_OSS, HIVE_SPARK, and BIGQUERY.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGQUERY</p>
         */
        @NameInMap("taskType")
        public String taskType;

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>Depcreated</p>
         */
        @NameInMap("tunnelQuota")
        public String tunnelQuota;

        public static ListMmsJobsResponseBodyDataObjectListConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMmsJobsResponseBodyDataObjectListConfig self = new ListMmsJobsResponseBodyDataObjectListConfig();
            return TeaModel.build(map, self);
        }

        public ListMmsJobsResponseBodyDataObjectListConfig setColumnMapping(java.util.Map<String, String> columnMapping) {
            this.columnMapping = columnMapping;
            return this;
        }
        public java.util.Map<String, String> getColumnMapping() {
            return this.columnMapping;
        }

        public ListMmsJobsResponseBodyDataObjectListConfig setEnableVerification(Boolean enableVerification) {
            this.enableVerification = enableVerification;
            return this;
        }
        public Boolean getEnableVerification() {
            return this.enableVerification;
        }

        public ListMmsJobsResponseBodyDataObjectListConfig setIncrement(Boolean increment) {
            this.increment = increment;
            return this;
        }
        public Boolean getIncrement() {
            return this.increment;
        }

        public ListMmsJobsResponseBodyDataObjectListConfig setOthers(java.util.Map<String, ?> others) {
            this.others = others;
            return this;
        }
        public java.util.Map<String, ?> getOthers() {
            return this.others;
        }

        public ListMmsJobsResponseBodyDataObjectListConfig setPartitionFilters(java.util.Map<String, String> partitionFilters) {
            this.partitionFilters = partitionFilters;
            return this;
        }
        public java.util.Map<String, String> getPartitionFilters() {
            return this.partitionFilters;
        }

        public ListMmsJobsResponseBodyDataObjectListConfig setPartitions(java.util.List<Long> partitions) {
            this.partitions = partitions;
            return this;
        }
        public java.util.List<Long> getPartitions() {
            return this.partitions;
        }

        public ListMmsJobsResponseBodyDataObjectListConfig setSchemaOnly(Boolean schemaOnly) {
            this.schemaOnly = schemaOnly;
            return this;
        }
        public Boolean getSchemaOnly() {
            return this.schemaOnly;
        }

        public ListMmsJobsResponseBodyDataObjectListConfig setTableBlackList(java.util.List<String> tableBlackList) {
            this.tableBlackList = tableBlackList;
            return this;
        }
        public java.util.List<String> getTableBlackList() {
            return this.tableBlackList;
        }

        public ListMmsJobsResponseBodyDataObjectListConfig setTableMapping(java.util.Map<String, String> tableMapping) {
            this.tableMapping = tableMapping;
            return this;
        }
        public java.util.Map<String, String> getTableMapping() {
            return this.tableMapping;
        }

        public ListMmsJobsResponseBodyDataObjectListConfig setTableWhiteList(java.util.List<String> tableWhiteList) {
            this.tableWhiteList = tableWhiteList;
            return this;
        }
        public java.util.List<String> getTableWhiteList() {
            return this.tableWhiteList;
        }

        public ListMmsJobsResponseBodyDataObjectListConfig setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

        public ListMmsJobsResponseBodyDataObjectListConfig setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListMmsJobsResponseBodyDataObjectListConfig setTunnelQuota(String tunnelQuota) {
            this.tunnelQuota = tunnelQuota;
            return this;
        }
        public String getTunnelQuota() {
            return this.tunnelQuota;
        }

    }

    public static class ListMmsJobsResponseBodyDataObjectList extends TeaModel {
        /**
         * <p>The configuration of the migration job.</p>
         */
        @NameInMap("config")
        public ListMmsJobsResponseBodyDataObjectListConfig config;

        /**
         * <p>Indicates whether the migration job is stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:17</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The source database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>196</p>
         */
        @NameInMap("dbId")
        public Long dbId;

        /**
         * <p>The destination MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>mms_test</p>
         */
        @NameInMap("dstDbName")
        public String dstDbName;

        /**
         * <p>The destination MaxCompute schema.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table_1</p>
         */
        @NameInMap("dstSchemaName")
        public String dstSchemaName;

        /**
         * <p>The estimated completion time of the migration. A smaller eta value increases the priority of the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-06</p>
         */
        @NameInMap("eta")
        public String eta;

        /**
         * <p>The migration job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The name of the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>migrate_db_1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2000015</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("sourceName")
        public String sourceName;

        /**
         * <p>The name of the source database.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db_1</p>
         */
        @NameInMap("srcDbName")
        public String srcDbName;

        /**
         * <p>The source schema name. This is the schema in a Layer 3 namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table_1</p>
         */
        @NameInMap("srcSchemaName")
        public String srcSchemaName;

        /**
         * <p>The status of the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>DONE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Indicates whether the migration job is stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("stopped")
        public Boolean stopped;

        /**
         * <p>The number of completed migration tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("taskDone")
        public Integer taskDone;

        /**
         * <p>The number of migration tasks in the job.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("taskNum")
        public Integer taskNum;

        /**
         * <p>The migration scope. Valid values: Database, Tables, and Partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>Tables</p>
         */
        @NameInMap("type")
        public String type;

        public static ListMmsJobsResponseBodyDataObjectList build(java.util.Map<String, ?> map) throws Exception {
            ListMmsJobsResponseBodyDataObjectList self = new ListMmsJobsResponseBodyDataObjectList();
            return TeaModel.build(map, self);
        }

        public ListMmsJobsResponseBodyDataObjectList setConfig(ListMmsJobsResponseBodyDataObjectListConfig config) {
            this.config = config;
            return this;
        }
        public ListMmsJobsResponseBodyDataObjectListConfig getConfig() {
            return this.config;
        }

        public ListMmsJobsResponseBodyDataObjectList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMmsJobsResponseBodyDataObjectList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListMmsJobsResponseBodyDataObjectList setDstDbName(String dstDbName) {
            this.dstDbName = dstDbName;
            return this;
        }
        public String getDstDbName() {
            return this.dstDbName;
        }

        public ListMmsJobsResponseBodyDataObjectList setDstSchemaName(String dstSchemaName) {
            this.dstSchemaName = dstSchemaName;
            return this;
        }
        public String getDstSchemaName() {
            return this.dstSchemaName;
        }

        public ListMmsJobsResponseBodyDataObjectList setEta(String eta) {
            this.eta = eta;
            return this;
        }
        public String getEta() {
            return this.eta;
        }

        public ListMmsJobsResponseBodyDataObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMmsJobsResponseBodyDataObjectList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMmsJobsResponseBodyDataObjectList setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public ListMmsJobsResponseBodyDataObjectList setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ListMmsJobsResponseBodyDataObjectList setSrcDbName(String srcDbName) {
            this.srcDbName = srcDbName;
            return this;
        }
        public String getSrcDbName() {
            return this.srcDbName;
        }

        public ListMmsJobsResponseBodyDataObjectList setSrcSchemaName(String srcSchemaName) {
            this.srcSchemaName = srcSchemaName;
            return this;
        }
        public String getSrcSchemaName() {
            return this.srcSchemaName;
        }

        public ListMmsJobsResponseBodyDataObjectList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMmsJobsResponseBodyDataObjectList setStopped(Boolean stopped) {
            this.stopped = stopped;
            return this;
        }
        public Boolean getStopped() {
            return this.stopped;
        }

        public ListMmsJobsResponseBodyDataObjectList setTaskDone(Integer taskDone) {
            this.taskDone = taskDone;
            return this;
        }
        public Integer getTaskDone() {
            return this.taskDone;
        }

        public ListMmsJobsResponseBodyDataObjectList setTaskNum(Integer taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Integer getTaskNum() {
            return this.taskNum;
        }

        public ListMmsJobsResponseBodyDataObjectList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMmsJobsResponseBodyData extends TeaModel {
        /**
         * <p>The list of migration jobs.</p>
         */
        @NameInMap("objectList")
        public java.util.List<ListMmsJobsResponseBodyDataObjectList> objectList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ListMmsJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMmsJobsResponseBodyData self = new ListMmsJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMmsJobsResponseBodyData setObjectList(java.util.List<ListMmsJobsResponseBodyDataObjectList> objectList) {
            this.objectList = objectList;
            return this;
        }
        public java.util.List<ListMmsJobsResponseBodyDataObjectList> getObjectList() {
            return this.objectList;
        }

        public ListMmsJobsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListMmsJobsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMmsJobsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
