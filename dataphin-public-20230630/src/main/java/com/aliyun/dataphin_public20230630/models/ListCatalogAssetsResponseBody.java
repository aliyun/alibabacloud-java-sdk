// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListCatalogAssetsResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data catalog asset list.</p>
     */
    @NameInMap("Data")
    public ListCatalogAssetsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend response exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

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

    public static ListCatalogAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogAssetsResponseBody self = new ListCatalogAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCatalogAssetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCatalogAssetsResponseBody setData(ListCatalogAssetsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCatalogAssetsResponseBodyData getData() {
        return this.data;
    }

    public ListCatalogAssetsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCatalogAssetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCatalogAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCatalogAssetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCatalogAssetsResponseBodyDataAssetListDirectories extends TeaModel {
        /**
         * <p>The directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>102260</p>
         */
        @NameInMap("DirectoryId")
        public Long directoryId;

        /**
         * <p>The directory name.</p>
         * 
         * <strong>example:</strong>
         * <p>线上电商平台</p>
         */
        @NameInMap("DirectoryName")
        public String directoryName;

        /**
         * <p>The topic ID.</p>
         * 
         * <strong>example:</strong>
         * <p>101676</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>全渠道数据专题</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        public static ListCatalogAssetsResponseBodyDataAssetListDirectories build(java.util.Map<String, ?> map) throws Exception {
            ListCatalogAssetsResponseBodyDataAssetListDirectories self = new ListCatalogAssetsResponseBodyDataAssetListDirectories();
            return TeaModel.build(map, self);
        }

        public ListCatalogAssetsResponseBodyDataAssetListDirectories setDirectoryId(Long directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public Long getDirectoryId() {
            return this.directoryId;
        }

        public ListCatalogAssetsResponseBodyDataAssetListDirectories setDirectoryName(String directoryName) {
            this.directoryName = directoryName;
            return this;
        }
        public String getDirectoryName() {
            return this.directoryName;
        }

        public ListCatalogAssetsResponseBodyDataAssetListDirectories setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public ListCatalogAssetsResponseBodyDataAssetListDirectories setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class ListCatalogAssetsResponseBodyDataAssetList extends TeaModel {
        /**
         * <p>The API call mode. Returned when the asset type is API. Valid values:</p>
         * <ul>
         * <li>1: synchronous call.</li>
         * <li>2: asynchronous call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApiCallMode")
        public String apiCallMode;

        /**
         * <p>The API group name. Returned when the asset type is API.</p>
         * 
         * <strong>example:</strong>
         * <p>默认API分组</p>
         */
        @NameInMap("ApiGroupName")
        public String apiGroupName;

        /**
         * <p>The API ID. Returned when the asset type is API.</p>
         * 
         * <strong>example:</strong>
         * <p>10441</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>The API operation type. Returned when the asset type is API. Valid values:</p>
         * <ul>
         * <li>1: Get.</li>
         * <li>2: List.</li>
         * <li>3: Create.</li>
         * <li>4: Update.</li>
         * <li>5: Delete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApiRequestMethod")
        public String apiRequestMethod;

        /**
         * <p>The asset description.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("AssetDescription")
        public String assetDescription;

        /**
         * <p>The asset display name. Returned when the asset type is TABLE, INDEX, or BIZ_INDEX.</p>
         * 
         * <strong>example:</strong>
         * <p>abc表</p>
         */
        @NameInMap("AssetDisplayName")
        public String assetDisplayName;

        /**
         * <p>The asset source. For TABLE (physical table), the value is in the format &quot;Dataphin-workspace type-project Chinese name (project English name)&quot;. For TABLE (logical table), the value is in the format &quot;Dataphin-workspace type-data domain Chinese name (data domain English name)&quot;. For TABLE (data source table), the value is in the format &quot;source system name-data source name-database/schema name&quot;. For INDEX (standard modeling metric), the value is the asset source of the associated aggregate table. For INDEX (custom metric), the value is the asset source of the source table. For API, the value is the data service project name. For PAGE, the value is the application system name.</p>
         * 
         * <strong>example:</strong>
         * <p>Dataphin-中间层-服饰零售 (LD_Fashion)</p>
         */
        @NameInMap("AssetFrom")
        public String assetFrom;

        /**
         * <p>The asset full name. Returned when the asset type is TABLE or INDEX.</p>
         * 
         * <strong>example:</strong>
         * <p>dwd_all.abc</p>
         */
        @NameInMap("AssetFullName")
        public String assetFullName;

        /**
         * <p>The asset name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("AssetName")
        public String assetName;

        /**
         * <p>The asset tags.</p>
         */
        @NameInMap("AssetTags")
        public java.util.List<String> assetTags;

        /**
         * <p>The asset type. Valid values: TABLE (table, including views and materialized views), INDEX (technical metric), BIZ_INDEX (business metric), API, and PAGE (dashboard).</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The BI workspace or directory to which the asset belongs. Returned when the asset type is PAGE (dashboard).</p>
         * 
         * <strong>example:</strong>
         * <p>dataphin演示空间</p>
         */
        @NameInMap("BiCatalog")
        public String biCatalog;

        /**
         * <p>The ID of the business unit to which the asset belongs. Returned when the asset type is TABLE (logical tables only) or INDEX (technical metrics whose source table is a logical table only).</p>
         * 
         * <strong>example:</strong>
         * <p>6865277495315392</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The name of the business unit to which the asset belongs. Returned when the asset type is TABLE (logical tables only) or INDEX (technical metrics whose source table is a logical table only).</p>
         * 
         * <strong>example:</strong>
         * <p>服饰零售（LD_Fashion）</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <p>The total number of charts. Returned when the asset type is PAGE (dashboard).</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("ChartCount")
        public Long chartCount;

        /**
         * <p>The ID of the subject domain to which the asset belongs. Returned when the asset type is TABLE (logical tables only) or INDEX (technical metrics whose source table is a logical table only).</p>
         * 
         * <strong>example:</strong>
         * <p>49837403</p>
         */
        @NameInMap("DataCellId")
        public String dataCellId;

        /**
         * <p>The name of the subject domain to which the asset belongs. Returned when the asset type is TABLE (logical tables only) or INDEX (technical metrics whose source table is a logical table only).</p>
         * 
         * <strong>example:</strong>
         * <p>课程域</p>
         */
        @NameInMap("DataCellName")
        public String dataCellName;

        /**
         * <p>The name of the data source to which the asset belongs. Returned when the asset type is TABLE (data source tables only) or INDEX (technical metrics whose source table is a data source table only).</p>
         * 
         * <strong>example:</strong>
         * <p>demo_mysql</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The ID of the data source to which the asset belongs. Returned when the asset type is TABLE (data source tables only) or INDEX (technical metrics whose source table is a data source table only).</p>
         * 
         * <strong>example:</strong>
         * <p>7305549302863001856</p>
         */
        @NameInMap("DatasourceId")
        public Long datasourceId;

        /**
         * <p>The directories to which the asset belongs, including topic ID, topic name, directory ID, and directory name.</p>
         */
        @NameInMap("Directories")
        public java.util.List<ListCatalogAssetsResponseBodyDataAssetListDirectories> directories;

        /**
         * <p>The statistical granularity name of the technical metric. Returned when the asset type is INDEX.</p>
         * 
         * <strong>example:</strong>
         * <p>课程</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <p>The asset GUID, which serves as the unique identifier of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>dp_ds_table.300023201.7311626611751680256.load_test.abc</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <p>Indicates whether the asset is deleted.</p>
         */
        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        /**
         * <p>The highest sensitivity level. Returned when the asset type is TABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>L3</p>
         */
        @NameInMap("MaxSecurityLevel")
        public String maxSecurityLevel;

        /**
         * <p>The ID of the project to which the asset belongs. Returned when the asset type is TABLE (physical tables only) or INDEX (technical metrics whose source table is a physical table only).</p>
         * 
         * <strong>example:</strong>
         * <p>6865331517728384</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The name of the project to which the asset belongs. Returned when the asset type is TABLE (physical tables only) or INDEX (technical metrics whose source table is a physical table only).</p>
         * 
         * <strong>example:</strong>
         * <p>train</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The subtype. Valid values: DIM_NORMAL (common logical dimension table), DIM_ENUM (enumeration logical dimension table), DIM_VIRTUAL (virtual logical dimension table), SUM_BIZ_UNIT (aggregate logical table), FACT_EVENT (event fact logical table), FACT_SNAPSHOT (snapshot fact logical table), DATASOURCE_TABLE (data source table), PHYSICAL_TABLE (physical table), DATASOURCE_VIEW (view - data source view), PHYSICAL_VIEW (physical view), MATERIALIZED_VIEW (materialized view), BIZ_INDEX (business metric), INDEX (technical metric - standard modeling metric), and CUSTOM_INDEX (technical metric - custom metric).</p>
         * 
         * <strong>example:</strong>
         * <p>DIM_NORMAL</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The GUID of the aggregate table to which the asset belongs. Returned when the asset type is INDEX.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.300023201.test.ads_gross</p>
         */
        @NameInMap("SumTableGuid")
        public String sumTableGuid;

        /**
         * <p>The name of the aggregate table to which the asset belongs. Returned when the asset type is INDEX.</p>
         * 
         * <strong>example:</strong>
         * <p>ads_gross</p>
         */
        @NameInMap("SumTableName")
        public String sumTableName;

        public static ListCatalogAssetsResponseBodyDataAssetList build(java.util.Map<String, ?> map) throws Exception {
            ListCatalogAssetsResponseBodyDataAssetList self = new ListCatalogAssetsResponseBodyDataAssetList();
            return TeaModel.build(map, self);
        }

        public ListCatalogAssetsResponseBodyDataAssetList setApiCallMode(String apiCallMode) {
            this.apiCallMode = apiCallMode;
            return this;
        }
        public String getApiCallMode() {
            return this.apiCallMode;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setApiGroupName(String apiGroupName) {
            this.apiGroupName = apiGroupName;
            return this;
        }
        public String getApiGroupName() {
            return this.apiGroupName;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setApiRequestMethod(String apiRequestMethod) {
            this.apiRequestMethod = apiRequestMethod;
            return this;
        }
        public String getApiRequestMethod() {
            return this.apiRequestMethod;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setAssetDescription(String assetDescription) {
            this.assetDescription = assetDescription;
            return this;
        }
        public String getAssetDescription() {
            return this.assetDescription;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setAssetDisplayName(String assetDisplayName) {
            this.assetDisplayName = assetDisplayName;
            return this;
        }
        public String getAssetDisplayName() {
            return this.assetDisplayName;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setAssetFrom(String assetFrom) {
            this.assetFrom = assetFrom;
            return this;
        }
        public String getAssetFrom() {
            return this.assetFrom;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setAssetFullName(String assetFullName) {
            this.assetFullName = assetFullName;
            return this;
        }
        public String getAssetFullName() {
            return this.assetFullName;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setAssetName(String assetName) {
            this.assetName = assetName;
            return this;
        }
        public String getAssetName() {
            return this.assetName;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setAssetTags(java.util.List<String> assetTags) {
            this.assetTags = assetTags;
            return this;
        }
        public java.util.List<String> getAssetTags() {
            return this.assetTags;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setBiCatalog(String biCatalog) {
            this.biCatalog = biCatalog;
            return this;
        }
        public String getBiCatalog() {
            return this.biCatalog;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setChartCount(Long chartCount) {
            this.chartCount = chartCount;
            return this;
        }
        public Long getChartCount() {
            return this.chartCount;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setDataCellId(String dataCellId) {
            this.dataCellId = dataCellId;
            return this;
        }
        public String getDataCellId() {
            return this.dataCellId;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setDataCellName(String dataCellName) {
            this.dataCellName = dataCellName;
            return this;
        }
        public String getDataCellName() {
            return this.dataCellName;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setDatasourceId(Long datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public Long getDatasourceId() {
            return this.datasourceId;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setDirectories(java.util.List<ListCatalogAssetsResponseBodyDataAssetListDirectories> directories) {
            this.directories = directories;
            return this;
        }
        public java.util.List<ListCatalogAssetsResponseBodyDataAssetListDirectories> getDirectories() {
            return this.directories;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setMaxSecurityLevel(String maxSecurityLevel) {
            this.maxSecurityLevel = maxSecurityLevel;
            return this;
        }
        public String getMaxSecurityLevel() {
            return this.maxSecurityLevel;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setSumTableGuid(String sumTableGuid) {
            this.sumTableGuid = sumTableGuid;
            return this;
        }
        public String getSumTableGuid() {
            return this.sumTableGuid;
        }

        public ListCatalogAssetsResponseBodyDataAssetList setSumTableName(String sumTableName) {
            this.sumTableName = sumTableName;
            return this;
        }
        public String getSumTableName() {
            return this.sumTableName;
        }

    }

    public static class ListCatalogAssetsResponseBodyData extends TeaModel {
        /**
         * <p>The asset list.</p>
         */
        @NameInMap("AssetList")
        public java.util.List<ListCatalogAssetsResponseBodyDataAssetList> assetList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListCatalogAssetsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCatalogAssetsResponseBodyData self = new ListCatalogAssetsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCatalogAssetsResponseBodyData setAssetList(java.util.List<ListCatalogAssetsResponseBodyDataAssetList> assetList) {
            this.assetList = assetList;
            return this;
        }
        public java.util.List<ListCatalogAssetsResponseBodyDataAssetList> getAssetList() {
            return this.assetList;
        }

        public ListCatalogAssetsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
