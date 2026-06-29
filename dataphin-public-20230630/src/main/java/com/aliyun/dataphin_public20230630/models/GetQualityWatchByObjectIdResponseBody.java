// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityWatchByObjectIdResponseBody extends TeaModel {
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
     * <p>The error details from the backend.</p>
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
    public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo qualityWatchInfo;

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

    public static GetQualityWatchByObjectIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityWatchByObjectIdResponseBody self = new GetQualityWatchByObjectIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityWatchByObjectIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityWatchByObjectIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityWatchByObjectIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityWatchByObjectIdResponseBody setQualityWatchInfo(GetQualityWatchByObjectIdResponseBodyQualityWatchInfo qualityWatchInfo) {
        this.qualityWatchInfo = qualityWatchInfo;
        return this;
    }
    public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo getQualityWatchInfo() {
        return this.qualityWatchInfo;
    }

    public GetQualityWatchByObjectIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityWatchByObjectIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo extends TeaModel {
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
         * <p>The name of the creator.</p>
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
         * <p>The datasource ID.</p>
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
         * <p>The datasource name.</p>
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
         * <p>The datasource type. Valid values:</p>
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

        public static GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo self = new GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo extends TeaModel {
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
         * <p>The name of the cell aggregate table.</p>
         * 
         * <strong>example:</strong>
         * <p>dws_all</p>
         */
        @NameInMap("CellSumLogicTableName")
        public String cellSumLogicTableName;

        /**
         * <p>The computation type of the metric. Valid values:</p>
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
         * <p>The display name of the statistical granularity.</p>
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

        public static GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo self = new GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setCellSumLogicTableName(String cellSumLogicTableName) {
            this.cellSumLogicTableName = cellSumLogicTableName;
            return this;
        }
        public String getCellSumLogicTableName() {
            return this.cellSumLogicTableName;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setComputeType(String computeType) {
            this.computeType = computeType;
            return this;
        }
        public String getComputeType() {
            return this.computeType;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setDateType(String dateType) {
            this.dateType = dateType;
            return this;
        }
        public String getDateType() {
            return this.dateType;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setGranularityDisplayName(String granularityDisplayName) {
            this.granularityDisplayName = granularityDisplayName;
            return this;
        }
        public String getGranularityDisplayName() {
            return this.granularityDisplayName;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setGranularityId(Long granularityId) {
            this.granularityId = granularityId;
            return this;
        }
        public Long getGranularityId() {
            return this.granularityId;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo extends TeaModel {
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
         * <p>The datasource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The datasource type.</p>
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

        public static GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo self = new GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setIsPartitionTable(Boolean isPartitionTable) {
            this.isPartitionTable = isPartitionTable;
            return this;
        }
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetQualityWatchByObjectIdResponseBodyQualityWatchInfo extends TeaModel {
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
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The datasource details.</p>
         */
        @NameInMap("DataSourceInfo")
        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo dataSourceInfo;

        /**
         * <p>The number of enabled rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnabledRuleCount")
        public Long enabledRuleCount;

        /**
         * <p>The monitoring ID.</p>
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
        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo indexInfo;

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
         * <p>The monitoring name.</p>
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
        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo tableInfo;

        /**
         * <p>The monitored object type. Valid values:</p>
         * <ul>
         * <li>TABLE: Dataphin table.</li>
         * <li>DATASOURCE_TABLE: global table.</li>
         * <li>DATASOURCE: datasource.</li>
         * <li>INDEX: metric.</li>
         * <li>REALTIME_LOGICAL_TABLE: real-time meta table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetQualityWatchByObjectIdResponseBodyQualityWatchInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityWatchByObjectIdResponseBodyQualityWatchInfo self = new GetQualityWatchByObjectIdResponseBodyQualityWatchInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setDataSourceInfo(GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo dataSourceInfo) {
            this.dataSourceInfo = dataSourceInfo;
            return this;
        }
        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoDataSourceInfo getDataSourceInfo() {
            return this.dataSourceInfo;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setEnabledRuleCount(Long enabledRuleCount) {
            this.enabledRuleCount = enabledRuleCount;
            return this;
        }
        public Long getEnabledRuleCount() {
            return this.enabledRuleCount;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setIndexInfo(GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo indexInfo) {
            this.indexInfo = indexInfo;
            return this;
        }
        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoIndexInfo getIndexInfo() {
            return this.indexInfo;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setLatestWatchTaskId(Long latestWatchTaskId) {
            this.latestWatchTaskId = latestWatchTaskId;
            return this;
        }
        public Long getLatestWatchTaskId() {
            return this.latestWatchTaskId;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setLatestWatchTaskStatus(String latestWatchTaskStatus) {
            this.latestWatchTaskStatus = latestWatchTaskStatus;
            return this;
        }
        public String getLatestWatchTaskStatus() {
            return this.latestWatchTaskStatus;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setQualityOwner(String qualityOwner) {
            this.qualityOwner = qualityOwner;
            return this;
        }
        public String getQualityOwner() {
            return this.qualityOwner;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setQualityOwnerName(String qualityOwnerName) {
            this.qualityOwnerName = qualityOwnerName;
            return this;
        }
        public String getQualityOwnerName() {
            return this.qualityOwnerName;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setRuleCount(Long ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Long getRuleCount() {
            return this.ruleCount;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setTableInfo(GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo tableInfo) {
            this.tableInfo = tableInfo;
            return this;
        }
        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfoTableInfo getTableInfo() {
            return this.tableInfo;
        }

        public GetQualityWatchByObjectIdResponseBodyQualityWatchInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
