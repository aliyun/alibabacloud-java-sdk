// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityWatchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
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
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>dws_all</p>
         */
        @NameInMap("CellSumLogicTableName")
        public String cellSumLogicTableName;

        /**
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        @NameInMap("ComputeType")
        public String computeType;

        /**
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        @NameInMap("DateType")
        public String dateType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>logic</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>全站汇总表</p>
         */
        @NameInMap("GranularityDisplayName")
        public String granularityDisplayName;

        /**
         * <strong>example:</strong>
         * <p>18755764</p>
         */
        @NameInMap("GranularityId")
        public Long granularityId;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>test_idx_</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
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
        @NameInMap("DataSourceInfo")
        public UpsertQualityWatchRequestUpsertCommandDataSourceInfo dataSourceInfo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("IndexInfo")
        public UpsertQualityWatchRequestUpsertCommandIndexInfo indexInfo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("QualityOwner")
        public String qualityOwner;

        @NameInMap("TableInfo")
        public UpsertQualityWatchRequestUpsertCommandTableInfo tableInfo;

        /**
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
