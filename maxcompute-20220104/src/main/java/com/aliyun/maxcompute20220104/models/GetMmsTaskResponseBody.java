// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsTaskResponseBody extends TeaModel {
    @NameInMap("data")
    public GetMmsTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>73207140-0FD5-588A-B11A-3CE093924196</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMmsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMmsTaskResponseBody self = new GetMmsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMmsTaskResponseBody setData(GetMmsTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMmsTaskResponseBodyData getData() {
        return this.data;
    }

    public GetMmsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMmsTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-10-25 04:21:01</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("dbId")
        public Long dbId;

        /**
         * <strong>example:</strong>
         * <p>mms_target</p>
         */
        @NameInMap("dstDbName")
        public String dstDbName;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("dstSchemaName")
        public String dstSchemaName;

        /**
         * <strong>example:</strong>
         * <p>table_1</p>
         */
        @NameInMap("dstTableName")
        public String dstTableName;

        /**
         * <strong>example:</strong>
         * <p>2024-10-25 07:21:01</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>7680</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>87</p>
         */
        @NameInMap("jobId")
        public Long jobId;

        /**
         * <strong>example:</strong>
         * <p>test_odps_spark</p>
         */
        @NameInMap("jobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("retriedTimes")
        public Integer retriedTimes;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("running")
        public Boolean running;

        /**
         * <strong>example:</strong>
         * <p>2000015</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("sourceName")
        public String sourceName;

        /**
         * <strong>example:</strong>
         * <p>mms_test</p>
         */
        @NameInMap("srcDbName")
        public String srcDbName;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("srcSchemaName")
        public String srcSchemaName;

        /**
         * <strong>example:</strong>
         * <p>table_1</p>
         */
        @NameInMap("srcTableName")
        public String srcTableName;

        /**
         * <strong>example:</strong>
         * <p>2024-10-25 06:21:01</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>DATA_DOING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("stopped")
        public Boolean stopped;

        /**
         * <strong>example:</strong>
         * <p>2323</p>
         */
        @NameInMap("tableId")
        public Long tableId;

        /**
         * <strong>example:</strong>
         * <p>BIGQUERY</p>
         */
        @NameInMap("type")
        public String type;

        public static GetMmsTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMmsTaskResponseBodyData self = new GetMmsTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMmsTaskResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMmsTaskResponseBodyData setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetMmsTaskResponseBodyData setDstDbName(String dstDbName) {
            this.dstDbName = dstDbName;
            return this;
        }
        public String getDstDbName() {
            return this.dstDbName;
        }

        public GetMmsTaskResponseBodyData setDstSchemaName(String dstSchemaName) {
            this.dstSchemaName = dstSchemaName;
            return this;
        }
        public String getDstSchemaName() {
            return this.dstSchemaName;
        }

        public GetMmsTaskResponseBodyData setDstTableName(String dstTableName) {
            this.dstTableName = dstTableName;
            return this;
        }
        public String getDstTableName() {
            return this.dstTableName;
        }

        public GetMmsTaskResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetMmsTaskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMmsTaskResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetMmsTaskResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetMmsTaskResponseBodyData setRetriedTimes(Integer retriedTimes) {
            this.retriedTimes = retriedTimes;
            return this;
        }
        public Integer getRetriedTimes() {
            return this.retriedTimes;
        }

        public GetMmsTaskResponseBodyData setRunning(Boolean running) {
            this.running = running;
            return this;
        }
        public Boolean getRunning() {
            return this.running;
        }

        public GetMmsTaskResponseBodyData setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public GetMmsTaskResponseBodyData setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public GetMmsTaskResponseBodyData setSrcDbName(String srcDbName) {
            this.srcDbName = srcDbName;
            return this;
        }
        public String getSrcDbName() {
            return this.srcDbName;
        }

        public GetMmsTaskResponseBodyData setSrcSchemaName(String srcSchemaName) {
            this.srcSchemaName = srcSchemaName;
            return this;
        }
        public String getSrcSchemaName() {
            return this.srcSchemaName;
        }

        public GetMmsTaskResponseBodyData setSrcTableName(String srcTableName) {
            this.srcTableName = srcTableName;
            return this;
        }
        public String getSrcTableName() {
            return this.srcTableName;
        }

        public GetMmsTaskResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMmsTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMmsTaskResponseBodyData setStopped(Boolean stopped) {
            this.stopped = stopped;
            return this;
        }
        public Boolean getStopped() {
            return this.stopped;
        }

        public GetMmsTaskResponseBodyData setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

        public GetMmsTaskResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
