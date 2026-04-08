// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsTimerResponseBody extends TeaModel {
    @NameInMap("data")
    public GetMmsTimerResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>0a06dfe716674588654372173ec0da</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMmsTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMmsTimerResponseBody self = new GetMmsTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMmsTimerResponseBody setData(GetMmsTimerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMmsTimerResponseBodyData getData() {
        return this.data;
    }

    public GetMmsTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMmsTimerResponseBodyDataConfig extends TeaModel {
        @NameInMap("columnMapping")
        public java.util.Map<String, String> columnMapping;

        @NameInMap("enableDataMigration")
        public Boolean enableDataMigration;

        @NameInMap("enableSchemaMigration")
        public Boolean enableSchemaMigration;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableVerification")
        public Boolean enableVerification;

        @NameInMap("others")
        public java.util.Map<String, ?> others;

        @NameInMap("partitionFilters")
        public java.util.Map<String, String> partitionFilters;

        @NameInMap("partitions")
        public java.util.List<Long> partitions;

        @NameInMap("tableBlackList")
        public java.util.List<String> tableBlackList;

        @NameInMap("tableMapping")
        public java.util.Map<String, String> tableMapping;

        @NameInMap("tableWhiteList")
        public java.util.List<String> tableWhiteList;

        @NameInMap("tables")
        public java.util.List<String> tables;

        public static GetMmsTimerResponseBodyDataConfig build(java.util.Map<String, ?> map) throws Exception {
            GetMmsTimerResponseBodyDataConfig self = new GetMmsTimerResponseBodyDataConfig();
            return TeaModel.build(map, self);
        }

        public GetMmsTimerResponseBodyDataConfig setColumnMapping(java.util.Map<String, String> columnMapping) {
            this.columnMapping = columnMapping;
            return this;
        }
        public java.util.Map<String, String> getColumnMapping() {
            return this.columnMapping;
        }

        public GetMmsTimerResponseBodyDataConfig setEnableDataMigration(Boolean enableDataMigration) {
            this.enableDataMigration = enableDataMigration;
            return this;
        }
        public Boolean getEnableDataMigration() {
            return this.enableDataMigration;
        }

        public GetMmsTimerResponseBodyDataConfig setEnableSchemaMigration(Boolean enableSchemaMigration) {
            this.enableSchemaMigration = enableSchemaMigration;
            return this;
        }
        public Boolean getEnableSchemaMigration() {
            return this.enableSchemaMigration;
        }

        public GetMmsTimerResponseBodyDataConfig setEnableVerification(Boolean enableVerification) {
            this.enableVerification = enableVerification;
            return this;
        }
        public Boolean getEnableVerification() {
            return this.enableVerification;
        }

        public GetMmsTimerResponseBodyDataConfig setOthers(java.util.Map<String, ?> others) {
            this.others = others;
            return this;
        }
        public java.util.Map<String, ?> getOthers() {
            return this.others;
        }

        public GetMmsTimerResponseBodyDataConfig setPartitionFilters(java.util.Map<String, String> partitionFilters) {
            this.partitionFilters = partitionFilters;
            return this;
        }
        public java.util.Map<String, String> getPartitionFilters() {
            return this.partitionFilters;
        }

        public GetMmsTimerResponseBodyDataConfig setPartitions(java.util.List<Long> partitions) {
            this.partitions = partitions;
            return this;
        }
        public java.util.List<Long> getPartitions() {
            return this.partitions;
        }

        public GetMmsTimerResponseBodyDataConfig setTableBlackList(java.util.List<String> tableBlackList) {
            this.tableBlackList = tableBlackList;
            return this;
        }
        public java.util.List<String> getTableBlackList() {
            return this.tableBlackList;
        }

        public GetMmsTimerResponseBodyDataConfig setTableMapping(java.util.Map<String, String> tableMapping) {
            this.tableMapping = tableMapping;
            return this;
        }
        public java.util.Map<String, String> getTableMapping() {
            return this.tableMapping;
        }

        public GetMmsTimerResponseBodyDataConfig setTableWhiteList(java.util.List<String> tableWhiteList) {
            this.tableWhiteList = tableWhiteList;
            return this;
        }
        public java.util.List<String> getTableWhiteList() {
            return this.tableWhiteList;
        }

        public GetMmsTimerResponseBodyDataConfig setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

    }

    public static class GetMmsTimerResponseBodyData extends TeaModel {
        @NameInMap("config")
        public GetMmsTimerResponseBodyDataConfig config;

        /**
         * <strong>example:</strong>
         * <p>1730946421757</p>
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
         * <p>2523</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>sale_detail</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("scheduleType")
        public String scheduleType;

        /**
         * <strong>example:</strong>
         * <p>2000017</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <strong>example:</strong>
         * <p>mms_test</p>
         */
        @NameInMap("srcDbName")
        public String srcDbName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("stopped")
        public Boolean stopped;

        /**
         * <strong>example:</strong>
         * <p>Daily, Hourly</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2026-04-01T02:18:01Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>p1=1/p2=abc</p>
         */
        @NameInMap("value")
        public String value;

        public static GetMmsTimerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMmsTimerResponseBodyData self = new GetMmsTimerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMmsTimerResponseBodyData setConfig(GetMmsTimerResponseBodyDataConfig config) {
            this.config = config;
            return this;
        }
        public GetMmsTimerResponseBodyDataConfig getConfig() {
            return this.config;
        }

        public GetMmsTimerResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMmsTimerResponseBodyData setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetMmsTimerResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMmsTimerResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMmsTimerResponseBodyData setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public GetMmsTimerResponseBodyData setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public GetMmsTimerResponseBodyData setSrcDbName(String srcDbName) {
            this.srcDbName = srcDbName;
            return this;
        }
        public String getSrcDbName() {
            return this.srcDbName;
        }

        public GetMmsTimerResponseBodyData setStopped(Boolean stopped) {
            this.stopped = stopped;
            return this;
        }
        public Boolean getStopped() {
            return this.stopped;
        }

        public GetMmsTimerResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMmsTimerResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetMmsTimerResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
