// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityWatchesResponseBody extends TeaModel {
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
     * <p>The paged query result.</p>
     */
    @NameInMap("PageResult")
    public ListQualityWatchesResponseBodyPageResult pageResult;

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

    public static ListQualityWatchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQualityWatchesResponseBody self = new ListQualityWatchesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQualityWatchesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListQualityWatchesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListQualityWatchesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQualityWatchesResponseBody setPageResult(ListQualityWatchesResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListQualityWatchesResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListQualityWatchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQualityWatchesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo extends TeaModel {
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
         * <p>The data source IDs.</p>
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
         * <p>The owner user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The owner name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The data source type, such as MAX_COMPUTE or HADOOP.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo self = new ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo();
            return TeaModel.build(map, self);
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo extends TeaModel {
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
         * <p>The owner user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The owner name.</p>
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

        public static ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo build(java.util.Map<String, ?> map) throws Exception {
            ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo self = new ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo();
            return TeaModel.build(map, self);
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setCellSumLogicTableName(String cellSumLogicTableName) {
            this.cellSumLogicTableName = cellSumLogicTableName;
            return this;
        }
        public String getCellSumLogicTableName() {
            return this.cellSumLogicTableName;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setComputeType(String computeType) {
            this.computeType = computeType;
            return this;
        }
        public String getComputeType() {
            return this.computeType;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setDateType(String dateType) {
            this.dateType = dateType;
            return this;
        }
        public String getDateType() {
            return this.dateType;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setGranularityDisplayName(String granularityDisplayName) {
            this.granularityDisplayName = granularityDisplayName;
            return this;
        }
        public String getGranularityDisplayName() {
            return this.granularityDisplayName;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setGranularityId(Long granularityId) {
            this.granularityId = granularityId;
            return this;
        }
        public Long getGranularityId() {
            return this.granularityId;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo extends TeaModel {
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
         * <p>The owner user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The owner name.</p>
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
         * <li>LOGIC_DIM_TABLE: logical dimension table</li>
         * <li>LOGIC_FACT_TABLE: logical fact table</li>
         * <li>LOGIC_SUM_TABLE: logical aggregate table</li>
         * <li>LOGIC_LABEL_TABLE: logical label table</li>
         * <li>PHYSICAL_TABLE: physical table</li>
         * <li>REALTIME_LOGICAL_TABLE: real-time meta table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LOGIC_DIM_TABLE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo build(java.util.Map<String, ?> map) throws Exception {
            ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo self = new ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo();
            return TeaModel.build(map, self);
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setIsPartitionTable(Boolean isPartitionTable) {
            this.isPartitionTable = isPartitionTable;
            return this;
        }
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListQualityWatchesResponseBodyPageResultQualityWatchList extends TeaModel {
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
         * <p>The data source details.</p>
         */
        @NameInMap("DataSourceInfo")
        public ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo dataSourceInfo;

        /**
         * <p>The number of enabled rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnabledRuleCount")
        public Long enabledRuleCount;

        /**
         * <p>The monitored object ID.</p>
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
        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo indexInfo;

        /**
         * <p>The record ID of the latest quality watchtask for the monitored object.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LatestWatchTaskId")
        public Long latestWatchTaskId;

        /**
         * <p>The record status of the latest quality watchtask for the monitored object.</p>
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
         * <p>The monitored object name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The quality owner user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("QualityOwner")
        public String qualityOwner;

        /**
         * <p>The quality owner display name.</p>
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
        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo tableInfo;

        /**
         * <p>The monitored object type. Valid values:</p>
         * <ul>
         * <li>TABLE: Dataphin table</li>
         * <li>DATASOURCE_TABLE: full-domain table</li>
         * <li>DATASOURCE: data source</li>
         * <li>INDEX: metric</li>
         * <li>REALTIME_LOGICAL_TABLE: real-time meta table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListQualityWatchesResponseBodyPageResultQualityWatchList build(java.util.Map<String, ?> map) throws Exception {
            ListQualityWatchesResponseBodyPageResultQualityWatchList self = new ListQualityWatchesResponseBodyPageResultQualityWatchList();
            return TeaModel.build(map, self);
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setDataSourceInfo(ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo dataSourceInfo) {
            this.dataSourceInfo = dataSourceInfo;
            return this;
        }
        public ListQualityWatchesResponseBodyPageResultQualityWatchListDataSourceInfo getDataSourceInfo() {
            return this.dataSourceInfo;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setEnabledRuleCount(Long enabledRuleCount) {
            this.enabledRuleCount = enabledRuleCount;
            return this;
        }
        public Long getEnabledRuleCount() {
            return this.enabledRuleCount;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setIndexInfo(ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo indexInfo) {
            this.indexInfo = indexInfo;
            return this;
        }
        public ListQualityWatchesResponseBodyPageResultQualityWatchListIndexInfo getIndexInfo() {
            return this.indexInfo;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setLatestWatchTaskId(Long latestWatchTaskId) {
            this.latestWatchTaskId = latestWatchTaskId;
            return this;
        }
        public Long getLatestWatchTaskId() {
            return this.latestWatchTaskId;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setLatestWatchTaskStatus(String latestWatchTaskStatus) {
            this.latestWatchTaskStatus = latestWatchTaskStatus;
            return this;
        }
        public String getLatestWatchTaskStatus() {
            return this.latestWatchTaskStatus;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setQualityOwner(String qualityOwner) {
            this.qualityOwner = qualityOwner;
            return this;
        }
        public String getQualityOwner() {
            return this.qualityOwner;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setQualityOwnerName(String qualityOwnerName) {
            this.qualityOwnerName = qualityOwnerName;
            return this;
        }
        public String getQualityOwnerName() {
            return this.qualityOwnerName;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setRuleCount(Long ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Long getRuleCount() {
            return this.ruleCount;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setTableInfo(ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo tableInfo) {
            this.tableInfo = tableInfo;
            return this;
        }
        public ListQualityWatchesResponseBodyPageResultQualityWatchListTableInfo getTableInfo() {
            return this.tableInfo;
        }

        public ListQualityWatchesResponseBodyPageResultQualityWatchList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListQualityWatchesResponseBodyPageResult extends TeaModel {
        /**
         * <p>The paged list of quality watchtasks.</p>
         */
        @NameInMap("QualityWatchList")
        public java.util.List<ListQualityWatchesResponseBodyPageResultQualityWatchList> qualityWatchList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListQualityWatchesResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListQualityWatchesResponseBodyPageResult self = new ListQualityWatchesResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListQualityWatchesResponseBodyPageResult setQualityWatchList(java.util.List<ListQualityWatchesResponseBodyPageResultQualityWatchList> qualityWatchList) {
            this.qualityWatchList = qualityWatchList;
            return this;
        }
        public java.util.List<ListQualityWatchesResponseBodyPageResultQualityWatchList> getQualityWatchList() {
            return this.qualityWatchList;
        }

        public ListQualityWatchesResponseBodyPageResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
