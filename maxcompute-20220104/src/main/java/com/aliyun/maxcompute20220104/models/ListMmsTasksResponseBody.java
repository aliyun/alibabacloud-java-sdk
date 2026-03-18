// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsTasksResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListMmsTasksResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>373A5CB2-8570-53BE-A98F-729B11D7A8B0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMmsTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMmsTasksResponseBody self = new ListMmsTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMmsTasksResponseBody setData(ListMmsTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMmsTasksResponseBodyData getData() {
        return this.data;
    }

    public ListMmsTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMmsTasksResponseBodyDataObjectList extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-25 04:21:01</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The ID of the source database.</p>
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
         * <p>default</p>
         */
        @NameInMap("dstSchemaName")
        public String dstSchemaName;

        /**
         * <p>The destination MaxCompute table.</p>
         * 
         * <strong>example:</strong>
         * <p>table_1</p>
         */
        @NameInMap("dstTableName")
        public String dstTableName;

        /**
         * <p>The end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-25 07:21:01</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The ID of the migration task.</p>
         * 
         * <strong>example:</strong>
         * <p>2323</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The ID of the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>87</p>
         */
        @NameInMap("jobId")
        public Long jobId;

        /**
         * <p>The name of the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>test_odps_spark</p>
         */
        @NameInMap("jobName")
        public String jobName;

        /**
         * <p>The number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("retriedTimes")
        public Integer retriedTimes;

        /**
         * <p>Indicates whether the task is running.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("running")
        public Boolean running;

        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>2000028</p>
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
         * <p>db_1</p>
         */
        @NameInMap("srcDbName")
        public String srcDbName;

        /**
         * <p>The name of the source schema. This parameter specifies the schema in a Layer 3 namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("srcSchemaName")
        public String srcSchemaName;

        /**
         * <p>The name of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>table_1</p>
         */
        @NameInMap("srcTableName")
        public String srcTableName;

        /**
         * <p>The start time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-25 06:21:01</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The status of the migration task.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_DOING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Indicates whether the task is stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("stopped")
        public Boolean stopped;

        /**
         * <p>The ID of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("tableId")
        public Long tableId;

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGQUERY</p>
         */
        @NameInMap("type")
        public String type;

        public static ListMmsTasksResponseBodyDataObjectList build(java.util.Map<String, ?> map) throws Exception {
            ListMmsTasksResponseBodyDataObjectList self = new ListMmsTasksResponseBodyDataObjectList();
            return TeaModel.build(map, self);
        }

        public ListMmsTasksResponseBodyDataObjectList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMmsTasksResponseBodyDataObjectList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListMmsTasksResponseBodyDataObjectList setDstDbName(String dstDbName) {
            this.dstDbName = dstDbName;
            return this;
        }
        public String getDstDbName() {
            return this.dstDbName;
        }

        public ListMmsTasksResponseBodyDataObjectList setDstSchemaName(String dstSchemaName) {
            this.dstSchemaName = dstSchemaName;
            return this;
        }
        public String getDstSchemaName() {
            return this.dstSchemaName;
        }

        public ListMmsTasksResponseBodyDataObjectList setDstTableName(String dstTableName) {
            this.dstTableName = dstTableName;
            return this;
        }
        public String getDstTableName() {
            return this.dstTableName;
        }

        public ListMmsTasksResponseBodyDataObjectList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListMmsTasksResponseBodyDataObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMmsTasksResponseBodyDataObjectList setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListMmsTasksResponseBodyDataObjectList setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListMmsTasksResponseBodyDataObjectList setRetriedTimes(Integer retriedTimes) {
            this.retriedTimes = retriedTimes;
            return this;
        }
        public Integer getRetriedTimes() {
            return this.retriedTimes;
        }

        public ListMmsTasksResponseBodyDataObjectList setRunning(Boolean running) {
            this.running = running;
            return this;
        }
        public Boolean getRunning() {
            return this.running;
        }

        public ListMmsTasksResponseBodyDataObjectList setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public ListMmsTasksResponseBodyDataObjectList setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ListMmsTasksResponseBodyDataObjectList setSrcDbName(String srcDbName) {
            this.srcDbName = srcDbName;
            return this;
        }
        public String getSrcDbName() {
            return this.srcDbName;
        }

        public ListMmsTasksResponseBodyDataObjectList setSrcSchemaName(String srcSchemaName) {
            this.srcSchemaName = srcSchemaName;
            return this;
        }
        public String getSrcSchemaName() {
            return this.srcSchemaName;
        }

        public ListMmsTasksResponseBodyDataObjectList setSrcTableName(String srcTableName) {
            this.srcTableName = srcTableName;
            return this;
        }
        public String getSrcTableName() {
            return this.srcTableName;
        }

        public ListMmsTasksResponseBodyDataObjectList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListMmsTasksResponseBodyDataObjectList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMmsTasksResponseBodyDataObjectList setStopped(Boolean stopped) {
            this.stopped = stopped;
            return this;
        }
        public Boolean getStopped() {
            return this.stopped;
        }

        public ListMmsTasksResponseBodyDataObjectList setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

        public ListMmsTasksResponseBodyDataObjectList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMmsTasksResponseBodyData extends TeaModel {
        /**
         * <p>The list of migration tasks.</p>
         */
        @NameInMap("objectList")
        public java.util.List<ListMmsTasksResponseBodyDataObjectList> objectList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page.</p>
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

        public static ListMmsTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMmsTasksResponseBodyData self = new ListMmsTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMmsTasksResponseBodyData setObjectList(java.util.List<ListMmsTasksResponseBodyDataObjectList> objectList) {
            this.objectList = objectList;
            return this;
        }
        public java.util.List<ListMmsTasksResponseBodyDataObjectList> getObjectList() {
            return this.objectList;
        }

        public ListMmsTasksResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListMmsTasksResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMmsTasksResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
