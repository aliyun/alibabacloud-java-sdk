// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListCatalogAssetsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListCatalogAssetsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
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
         * <strong>example:</strong>
         * <p>102260</p>
         */
        @NameInMap("DirectoryId")
        public Long directoryId;

        /**
         * <strong>example:</strong>
         * <p>线上电商平台</p>
         */
        @NameInMap("DirectoryName")
        public String directoryName;

        /**
         * <strong>example:</strong>
         * <p>101676</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApiCallMode")
        public String apiCallMode;

        /**
         * <strong>example:</strong>
         * <p>默认API分组</p>
         */
        @NameInMap("ApiGroupName")
        public String apiGroupName;

        /**
         * <strong>example:</strong>
         * <p>10441</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApiRequestMethod")
        public String apiRequestMethod;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("AssetDescription")
        public String assetDescription;

        /**
         * <strong>example:</strong>
         * <p>abc表</p>
         */
        @NameInMap("AssetDisplayName")
        public String assetDisplayName;

        /**
         * <strong>example:</strong>
         * <p>Dataphin-中间层-服饰零售 (LD_Fashion)</p>
         */
        @NameInMap("AssetFrom")
        public String assetFrom;

        /**
         * <strong>example:</strong>
         * <p>dwd_all.abc</p>
         */
        @NameInMap("AssetFullName")
        public String assetFullName;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("AssetName")
        public String assetName;

        @NameInMap("AssetTags")
        public java.util.List<String> assetTags;

        /**
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <strong>example:</strong>
         * <p>dataphin演示空间</p>
         */
        @NameInMap("BiCatalog")
        public String biCatalog;

        /**
         * <strong>example:</strong>
         * <p>6865277495315392</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>服饰零售（LD_Fashion）</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("ChartCount")
        public Long chartCount;

        /**
         * <strong>example:</strong>
         * <p>49837403</p>
         */
        @NameInMap("DataCellId")
        public String dataCellId;

        /**
         * <strong>example:</strong>
         * <p>课程域</p>
         */
        @NameInMap("DataCellName")
        public String dataCellName;

        /**
         * <strong>example:</strong>
         * <p>demo_mysql</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <strong>example:</strong>
         * <p>7305549302863001856</p>
         */
        @NameInMap("DatasourceId")
        public Long datasourceId;

        @NameInMap("Directories")
        public java.util.List<ListCatalogAssetsResponseBodyDataAssetListDirectories> directories;

        /**
         * <strong>example:</strong>
         * <p>课程</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <strong>example:</strong>
         * <p>dp_ds_table.300023201.7311626611751680256.load_test.abc</p>
         */
        @NameInMap("Guid")
        public String guid;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        /**
         * <strong>example:</strong>
         * <p>L3</p>
         */
        @NameInMap("MaxSecurityLevel")
        public String maxSecurityLevel;

        /**
         * <strong>example:</strong>
         * <p>6865331517728384</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>train</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>DIM_NORMAL</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <strong>example:</strong>
         * <p>odps.300023201.test.ads_gross</p>
         */
        @NameInMap("SumTableGuid")
        public String sumTableGuid;

        /**
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
        @NameInMap("AssetList")
        public java.util.List<ListCatalogAssetsResponseBodyDataAssetList> assetList;

        /**
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
