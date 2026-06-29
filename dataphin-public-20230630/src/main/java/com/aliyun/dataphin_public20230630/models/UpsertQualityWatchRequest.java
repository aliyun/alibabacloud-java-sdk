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
     * <p>The update instruction.</p>
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
         * <p>The cell aggregate table name.</p>
         * 
         * <strong>example:</strong>
         * <p>dws_all</p>
         */
        @NameInMap("CellSumLogicTableName")
        public String cellSumLogicTableName;

        /**
         * <p>The metric computation type. Valid values:</p>
         * <ul>
         * <li>AUTO</li>
         * <li>CUSTOM</li>
         * <li>MOUNT</li>
         * <li>COMBINE.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        @NameInMap("ComputeType")
        public String computeType;

        /**
         * <p>The metric data type.</p>
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
         * <p>The metric display name.</p>
         * 
         * <strong>example:</strong>
         * <p>logic</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The statistical granularity name.</p>
         * 
         * <strong>example:</strong>
         * <p>全站汇总表</p>
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
         * <p>The metric type. Valid values:</p>
         * <ul>
         * <li>INDEX.</li>
         * </ul>
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
         * <p>The monitored object ID. If this parameter is specified, the object is updated. If this parameter is not specified, a new object is created.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The monitoring metrics object.</p>
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
         * <p>The monitored object type. Valid values:</p>
         * <ul>
         * <li>TABLE: Dataphin table.</li>
         * <li>DATASOURCE_TABLE: global table.</li>
         * <li>DATASOURCE: data source.</li>
         * <li>INDEX: metric.</li>
         * <li>REALTIME_LOGICAL_TABLE: real-time meta table.</li>
         * </ul>
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
