// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityWatchRequest extends TeaModel {
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

    /**
     * <p>The upsert command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpsertCommand")
    public UpsertQualityWatchRequestUpsertCommand upsertCommand;

    public static UpsertQualityWatchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityWatchRequest self = new UpsertQualityWatchRequest();
        return TeaModel.build(map, self);
    }

    public UpsertQualityWatchRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpsertQualityWatchRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpsertQualityWatchRequest setUpsertCommand(UpsertQualityWatchRequestUpsertCommand upsertCommand) {
        this.upsertCommand = upsertCommand;
        return this;
    }
    public UpsertQualityWatchRequestUpsertCommand getUpsertCommand() {
        return this.upsertCommand;
    }

    public static class UpsertQualityWatchRequestUpsertCommandDataSourceInfo extends TeaModel {
        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        public static UpsertQualityWatchRequestUpsertCommandDataSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityWatchRequestUpsertCommandDataSourceInfo self = new UpsertQualityWatchRequestUpsertCommandDataSourceInfo();
            return TeaModel.build(map, self);
        }

        public UpsertQualityWatchRequestUpsertCommandDataSourceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class UpsertQualityWatchRequestUpsertCommandIndexInfo extends TeaModel {
        /**
         * <p>The business unit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The name of the unit aggregate table.</p>
         * 
         * <strong>example:</strong>
         * <p>dws_all</p>
         */
        @NameInMap("CellSumLogicTableName")
        public String cellSumLogicTableName;

        /**
         * <p>The computation type of the metric. Valid values: AUTO, CUSTOM, MOUNT, and COMBINE.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        @NameInMap("ComputeType")
        public String computeType;

        /**
         * <p>The data type of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        @NameInMap("DateType")
        public String dateType;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>logic</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The name of the statistical granularity.</p>
         * 
         * <strong>example:</strong>
         * <p>Site-wide aggregate table</p>
         */
        @NameInMap("GranularityDisplayName")
        public String granularityDisplayName;

        /**
         * <p>The statistical granularity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18755764</p>
         */
        @NameInMap("GranularityId")
        public Long granularityId;

        /**
         * <p>The metric ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_idx_</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The type of the metric. Valid value: INDEX.</p>
         * 
         * <strong>example:</strong>
         * <p>INDEX</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpsertQualityWatchRequestUpsertCommandIndexInfo build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityWatchRequestUpsertCommandIndexInfo self = new UpsertQualityWatchRequestUpsertCommandIndexInfo();
            return TeaModel.build(map, self);
        }

        public UpsertQualityWatchRequestUpsertCommandIndexInfo setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public UpsertQualityWatchRequestUpsertCommandIndexInfo setCellSumLogicTableName(String cellSumLogicTableName) {
            this.cellSumLogicTableName = cellSumLogicTableName;
            return this;
        }
        public String getCellSumLogicTableName() {
            return this.cellSumLogicTableName;
        }

        public UpsertQualityWatchRequestUpsertCommandIndexInfo setComputeType(String computeType) {
            this.computeType = computeType;
            return this;
        }
        public String getComputeType() {
            return this.computeType;
        }

        public UpsertQualityWatchRequestUpsertCommandIndexInfo setDateType(String dateType) {
            this.dateType = dateType;
            return this;
        }
        public String getDateType() {
            return this.dateType;
        }

        public UpsertQualityWatchRequestUpsertCommandIndexInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpsertQualityWatchRequestUpsertCommandIndexInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpsertQualityWatchRequestUpsertCommandIndexInfo setGranularityDisplayName(String granularityDisplayName) {
            this.granularityDisplayName = granularityDisplayName;
            return this;
        }
        public String getGranularityDisplayName() {
            return this.granularityDisplayName;
        }

        public UpsertQualityWatchRequestUpsertCommandIndexInfo setGranularityId(Long granularityId) {
            this.granularityId = granularityId;
            return this;
        }
        public Long getGranularityId() {
            return this.granularityId;
        }

        public UpsertQualityWatchRequestUpsertCommandIndexInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpsertQualityWatchRequestUpsertCommandIndexInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpsertQualityWatchRequestUpsertCommandIndexInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public UpsertQualityWatchRequestUpsertCommandIndexInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpsertQualityWatchRequestUpsertCommandTableInfo extends TeaModel {
        /**
         * <p>The table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Id")
        public String id;

        public static UpsertQualityWatchRequestUpsertCommandTableInfo build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityWatchRequestUpsertCommandTableInfo self = new UpsertQualityWatchRequestUpsertCommandTableInfo();
            return TeaModel.build(map, self);
        }

        public UpsertQualityWatchRequestUpsertCommandTableInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class UpsertQualityWatchRequestUpsertCommand extends TeaModel {
        /**
         * <p>The data source details.</p>
         */
        @NameInMap("DataSourceInfo")
        public UpsertQualityWatchRequestUpsertCommandDataSourceInfo dataSourceInfo;

        /**
         * <p>The monitored object ID. If you specify this parameter, the operation updates the object. If you do not specify this parameter, the operation creates a new object.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The monitored metric object.</p>
         */
        @NameInMap("IndexInfo")
        public UpsertQualityWatchRequestUpsertCommandIndexInfo indexInfo;

        /**
         * <p>The quality owner.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("QualityOwner")
        public String qualityOwner;

        /**
         * <p>The monitored table object.</p>
         */
        @NameInMap("TableInfo")
        public UpsertQualityWatchRequestUpsertCommandTableInfo tableInfo;

        /**
         * <p>The monitored object type. Valid values: TABLE (Dataphin table), DATASOURCE_TABLE (global table), DATASOURCE (data source), INDEX (metric), and REALTIME_LOGICAL_TABLE (real-time metatable).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpsertQualityWatchRequestUpsertCommand build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityWatchRequestUpsertCommand self = new UpsertQualityWatchRequestUpsertCommand();
            return TeaModel.build(map, self);
        }

        public UpsertQualityWatchRequestUpsertCommand setDataSourceInfo(UpsertQualityWatchRequestUpsertCommandDataSourceInfo dataSourceInfo) {
            this.dataSourceInfo = dataSourceInfo;
            return this;
        }
        public UpsertQualityWatchRequestUpsertCommandDataSourceInfo getDataSourceInfo() {
            return this.dataSourceInfo;
        }

        public UpsertQualityWatchRequestUpsertCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpsertQualityWatchRequestUpsertCommand setIndexInfo(UpsertQualityWatchRequestUpsertCommandIndexInfo indexInfo) {
            this.indexInfo = indexInfo;
            return this;
        }
        public UpsertQualityWatchRequestUpsertCommandIndexInfo getIndexInfo() {
            return this.indexInfo;
        }

        public UpsertQualityWatchRequestUpsertCommand setQualityOwner(String qualityOwner) {
            this.qualityOwner = qualityOwner;
            return this;
        }
        public String getQualityOwner() {
            return this.qualityOwner;
        }

        public UpsertQualityWatchRequestUpsertCommand setTableInfo(UpsertQualityWatchRequestUpsertCommandTableInfo tableInfo) {
            this.tableInfo = tableInfo;
            return this;
        }
        public UpsertQualityWatchRequestUpsertCommandTableInfo getTableInfo() {
            return this.tableInfo;
        }

        public UpsertQualityWatchRequestUpsertCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
