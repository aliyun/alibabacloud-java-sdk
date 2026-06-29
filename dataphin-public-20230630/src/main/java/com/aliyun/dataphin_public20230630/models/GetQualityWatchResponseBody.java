// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityWatchResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The details of the monitored object.</p>
     */
    @NameInMap("QualityWatchInfo")
    public GetQualityWatchResponseBodyQualityWatchInfo qualityWatchInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetQualityWatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityWatchResponseBody self = new GetQualityWatchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityWatchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityWatchResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityWatchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityWatchResponseBody setQualityWatchInfo(GetQualityWatchResponseBodyQualityWatchInfo qualityWatchInfo) {
        this.qualityWatchInfo = qualityWatchInfo;
        return this;
    }
    public GetQualityWatchResponseBodyQualityWatchInfo getQualityWatchInfo() {
        return this.qualityWatchInfo;
    }

    public GetQualityWatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityWatchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The creator name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The environment identifier. Valid values:</p>
         * <ul>
         * <li>PROD</li>
         * <li>DEV.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The data source type. Valid values:</p>
         * <ul>
         * <li>MAX_COMPUTE</li>
         * <li>HADOOP.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo self = new GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetQualityWatchResponseBodyQualityWatchInfoIndexInfo extends TeaModel {
        /**
         * <p>The business unit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The business unit name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <p>The metric catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Catalog")
        public String catalog;

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
         * <p>The metric GUID.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("Guid")
        public String guid;

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
         * <p>logic</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

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

        public static GetQualityWatchResponseBodyQualityWatchInfoIndexInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityWatchResponseBodyQualityWatchInfoIndexInfo self = new GetQualityWatchResponseBodyQualityWatchInfoIndexInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setCellSumLogicTableName(String cellSumLogicTableName) {
            this.cellSumLogicTableName = cellSumLogicTableName;
            return this;
        }
        public String getCellSumLogicTableName() {
            return this.cellSumLogicTableName;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setComputeType(String computeType) {
            this.computeType = computeType;
            return this;
        }
        public String getComputeType() {
            return this.computeType;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setDateType(String dateType) {
            this.dateType = dateType;
            return this;
        }
        public String getDateType() {
            return this.dateType;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setGranularityDisplayName(String granularityDisplayName) {
            this.granularityDisplayName = granularityDisplayName;
            return this;
        }
        public String getGranularityDisplayName() {
            return this.granularityDisplayName;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setGranularityId(Long granularityId) {
            this.granularityId = granularityId;
            return this;
        }
        public Long getGranularityId() {
            return this.granularityId;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetQualityWatchResponseBodyQualityWatchInfoTableInfo extends TeaModel {
        /**
         * <p>The business unit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The business unit name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <p>The table catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The environment identifier. Valid values:</p>
         * <ul>
         * <li>DEV</li>
         * <li>PROD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the table is a partitioned table.</p>
         */
        @NameInMap("IsPartitionTable")
        public Boolean isPartitionTable;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The type. Valid values:</p>
         * <ul>
         * <li>LOGIC_DIM_TABLE: logical dimension table.</li>
         * <li>LOGIC_FACT_TABLE: logical fact table.</li>
         * <li>LOGIC_SUM_TABLE: logical aggregate table.</li>
         * <li>LOGIC_LABEL_TABLE: logical label table.</li>
         * <li>PHYSICAL_TABLE: physical table.</li>
         * <li>REALTIME_LOGICAL_TABLE: real-time meta table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LOGIC_DIM_TABLE</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetQualityWatchResponseBodyQualityWatchInfoTableInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityWatchResponseBodyQualityWatchInfoTableInfo self = new GetQualityWatchResponseBodyQualityWatchInfoTableInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setIsPartitionTable(Boolean isPartitionTable) {
            this.isPartitionTable = isPartitionTable;
            return this;
        }
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetQualityWatchResponseBodyQualityWatchInfo extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The creator name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The datasource config details.</p>
         */
        @NameInMap("DataSourceInfo")
        public GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo dataSourceInfo;

        /**
         * <p>The number of enabled rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnabledRuleCount")
        public Long enabledRuleCount;

        /**
         * <p>The monitor ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The metric details.</p>
         */
        @NameInMap("IndexInfo")
        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo indexInfo;

        /**
         * <p>The ID of the most recent quality watchtask for the monitored object.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LatestWatchTaskId")
        public Long latestWatchTaskId;

        /**
         * <p>The status of the most recent quality watchtask for the monitored object.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("LatestWatchTaskStatus")
        public String latestWatchTaskStatus;

        /**
         * <p>The user ID of the last modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The monitor name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user ID of the quality owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("QualityOwner")
        public String qualityOwner;

        /**
         * <p>The display name of the quality owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("QualityOwnerName")
        public String qualityOwnerName;

        /**
         * <p>The number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("RuleCount")
        public Long ruleCount;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>ENABLE</li>
         * <li>DISABLE.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The monitored table object.</p>
         */
        @NameInMap("TableInfo")
        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo tableInfo;

        /**
         * <p>The monitored object type. Valid values:</p>
         * <ul>
         * <li>TABLE: Dataphin table.</li>
         * <li>DATASOURCE_TABLE: full-domain table.</li>
         * <li>DATASOURCE: data source.</li>
         * <li>INDEX: metric.</li>
         * <li>REALTIME_LOGICAL_TABLE: real-time meta table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetQualityWatchResponseBodyQualityWatchInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityWatchResponseBodyQualityWatchInfo self = new GetQualityWatchResponseBodyQualityWatchInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setDataSourceInfo(GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo dataSourceInfo) {
            this.dataSourceInfo = dataSourceInfo;
            return this;
        }
        public GetQualityWatchResponseBodyQualityWatchInfoDataSourceInfo getDataSourceInfo() {
            return this.dataSourceInfo;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setEnabledRuleCount(Long enabledRuleCount) {
            this.enabledRuleCount = enabledRuleCount;
            return this;
        }
        public Long getEnabledRuleCount() {
            return this.enabledRuleCount;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setIndexInfo(GetQualityWatchResponseBodyQualityWatchInfoIndexInfo indexInfo) {
            this.indexInfo = indexInfo;
            return this;
        }
        public GetQualityWatchResponseBodyQualityWatchInfoIndexInfo getIndexInfo() {
            return this.indexInfo;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setLatestWatchTaskId(Long latestWatchTaskId) {
            this.latestWatchTaskId = latestWatchTaskId;
            return this;
        }
        public Long getLatestWatchTaskId() {
            return this.latestWatchTaskId;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setLatestWatchTaskStatus(String latestWatchTaskStatus) {
            this.latestWatchTaskStatus = latestWatchTaskStatus;
            return this;
        }
        public String getLatestWatchTaskStatus() {
            return this.latestWatchTaskStatus;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setQualityOwner(String qualityOwner) {
            this.qualityOwner = qualityOwner;
            return this;
        }
        public String getQualityOwner() {
            return this.qualityOwner;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setQualityOwnerName(String qualityOwnerName) {
            this.qualityOwnerName = qualityOwnerName;
            return this;
        }
        public String getQualityOwnerName() {
            return this.qualityOwnerName;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setRuleCount(Long ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Long getRuleCount() {
            return this.ruleCount;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setTableInfo(GetQualityWatchResponseBodyQualityWatchInfoTableInfo tableInfo) {
            this.tableInfo = tableInfo;
            return this;
        }
        public GetQualityWatchResponseBodyQualityWatchInfoTableInfo getTableInfo() {
            return this.tableInfo;
        }

        public GetQualityWatchResponseBodyQualityWatchInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
