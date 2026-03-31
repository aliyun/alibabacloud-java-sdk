// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsJobResponseBody extends TeaModel {
    @NameInMap("data")
    public GetMmsJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>D9F872FD-5DDE-30A6-8C8A-1B8C6A81059F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMmsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMmsJobResponseBody self = new GetMmsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMmsJobResponseBody setData(GetMmsJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMmsJobResponseBodyData getData() {
        return this.data;
    }

    public GetMmsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMmsJobResponseBodyDataConfig extends TeaModel {
        @NameInMap("columnMapping")
        public java.util.Map<String, String> columnMapping;

        @NameInMap("enableVerification")
        public Boolean enableVerification;

        @NameInMap("increment")
        public Boolean increment;

        @NameInMap("others")
        public java.util.Map<String, ?> others;

        @NameInMap("partitionFilters")
        public java.util.Map<String, String> partitionFilters;

        @NameInMap("partitions")
        public java.util.List<Long> partitions;

        @NameInMap("schemaOnly")
        public Boolean schemaOnly;

        @NameInMap("tableBlackList")
        public java.util.List<String> tableBlackList;

        @NameInMap("tableMapping")
        public java.util.Map<String, String> tableMapping;

        @NameInMap("tableWhiteList")
        public java.util.List<String> tableWhiteList;

        @NameInMap("tables")
        public java.util.List<String> tables;

        @NameInMap("taskType")
        public String taskType;

        @NameInMap("tunnelQuota")
        public String tunnelQuota;

        public static GetMmsJobResponseBodyDataConfig build(java.util.Map<String, ?> map) throws Exception {
            GetMmsJobResponseBodyDataConfig self = new GetMmsJobResponseBodyDataConfig();
            return TeaModel.build(map, self);
        }

        public GetMmsJobResponseBodyDataConfig setColumnMapping(java.util.Map<String, String> columnMapping) {
            this.columnMapping = columnMapping;
            return this;
        }
        public java.util.Map<String, String> getColumnMapping() {
            return this.columnMapping;
        }

        public GetMmsJobResponseBodyDataConfig setEnableVerification(Boolean enableVerification) {
            this.enableVerification = enableVerification;
            return this;
        }
        public Boolean getEnableVerification() {
            return this.enableVerification;
        }

        public GetMmsJobResponseBodyDataConfig setIncrement(Boolean increment) {
            this.increment = increment;
            return this;
        }
        public Boolean getIncrement() {
            return this.increment;
        }

        public GetMmsJobResponseBodyDataConfig setOthers(java.util.Map<String, ?> others) {
            this.others = others;
            return this;
        }
        public java.util.Map<String, ?> getOthers() {
            return this.others;
        }

        public GetMmsJobResponseBodyDataConfig setPartitionFilters(java.util.Map<String, String> partitionFilters) {
            this.partitionFilters = partitionFilters;
            return this;
        }
        public java.util.Map<String, String> getPartitionFilters() {
            return this.partitionFilters;
        }

        public GetMmsJobResponseBodyDataConfig setPartitions(java.util.List<Long> partitions) {
            this.partitions = partitions;
            return this;
        }
        public java.util.List<Long> getPartitions() {
            return this.partitions;
        }

        public GetMmsJobResponseBodyDataConfig setSchemaOnly(Boolean schemaOnly) {
            this.schemaOnly = schemaOnly;
            return this;
        }
        public Boolean getSchemaOnly() {
            return this.schemaOnly;
        }

        public GetMmsJobResponseBodyDataConfig setTableBlackList(java.util.List<String> tableBlackList) {
            this.tableBlackList = tableBlackList;
            return this;
        }
        public java.util.List<String> getTableBlackList() {
            return this.tableBlackList;
        }

        public GetMmsJobResponseBodyDataConfig setTableMapping(java.util.Map<String, String> tableMapping) {
            this.tableMapping = tableMapping;
            return this;
        }
        public java.util.Map<String, String> getTableMapping() {
            return this.tableMapping;
        }

        public GetMmsJobResponseBodyDataConfig setTableWhiteList(java.util.List<String> tableWhiteList) {
            this.tableWhiteList = tableWhiteList;
            return this;
        }
        public java.util.List<String> getTableWhiteList() {
            return this.tableWhiteList;
        }

        public GetMmsJobResponseBodyDataConfig setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

        public GetMmsJobResponseBodyDataConfig setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetMmsJobResponseBodyDataConfig setTunnelQuota(String tunnelQuota) {
            this.tunnelQuota = tunnelQuota;
            return this;
        }
        public String getTunnelQuota() {
            return this.tunnelQuota;
        }

    }

    public static class GetMmsJobResponseBodyData extends TeaModel {
        @NameInMap("config")
        public GetMmsJobResponseBodyDataConfig config;

        /**
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:17</p>
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

        @NameInMap("eta")
        public String eta;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>migrate_db_1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>DOING</p>
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
         * <p>100</p>
         */
        @NameInMap("taskDone")
        public Integer taskDone;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("taskNum")
        public Integer taskNum;

        /**
         * <strong>example:</strong>
         * <p>Tables</p>
         */
        @NameInMap("type")
        public String type;

        public static GetMmsJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMmsJobResponseBodyData self = new GetMmsJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMmsJobResponseBodyData setConfig(GetMmsJobResponseBodyDataConfig config) {
            this.config = config;
            return this;
        }
        public GetMmsJobResponseBodyDataConfig getConfig() {
            return this.config;
        }

        public GetMmsJobResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMmsJobResponseBodyData setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetMmsJobResponseBodyData setDstDbName(String dstDbName) {
            this.dstDbName = dstDbName;
            return this;
        }
        public String getDstDbName() {
            return this.dstDbName;
        }

        public GetMmsJobResponseBodyData setDstSchemaName(String dstSchemaName) {
            this.dstSchemaName = dstSchemaName;
            return this;
        }
        public String getDstSchemaName() {
            return this.dstSchemaName;
        }

        public GetMmsJobResponseBodyData setEta(String eta) {
            this.eta = eta;
            return this;
        }
        public String getEta() {
            return this.eta;
        }

        public GetMmsJobResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMmsJobResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMmsJobResponseBodyData setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public GetMmsJobResponseBodyData setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public GetMmsJobResponseBodyData setSrcDbName(String srcDbName) {
            this.srcDbName = srcDbName;
            return this;
        }
        public String getSrcDbName() {
            return this.srcDbName;
        }

        public GetMmsJobResponseBodyData setSrcSchemaName(String srcSchemaName) {
            this.srcSchemaName = srcSchemaName;
            return this;
        }
        public String getSrcSchemaName() {
            return this.srcSchemaName;
        }

        public GetMmsJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMmsJobResponseBodyData setStopped(Boolean stopped) {
            this.stopped = stopped;
            return this;
        }
        public Boolean getStopped() {
            return this.stopped;
        }

        public GetMmsJobResponseBodyData setTaskDone(Integer taskDone) {
            this.taskDone = taskDone;
            return this;
        }
        public Integer getTaskDone() {
            return this.taskDone;
        }

        public GetMmsJobResponseBodyData setTaskNum(Integer taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Integer getTaskNum() {
            return this.taskNum;
        }

        public GetMmsJobResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
