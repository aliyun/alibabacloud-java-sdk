// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetCatalogAssetDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCatalogAssetDetailsResponseBodyData data;

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

    public static GetCatalogAssetDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogAssetDetailsResponseBody self = new GetCatalogAssetDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCatalogAssetDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCatalogAssetDetailsResponseBody setData(GetCatalogAssetDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCatalogAssetDetailsResponseBodyData getData() {
        return this.data;
    }

    public GetCatalogAssetDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCatalogAssetDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCatalogAssetDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCatalogAssetDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCatalogAssetDetailsResponseBodyDataColumnsAssociatedEntity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7137404445633152</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>LD_train</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <strong>example:</strong>
         * <p>上药erp数据源</p>
         */
        @NameInMap("DimensionDisplayName")
        public String dimensionDisplayName;

        /**
         * <strong>example:</strong>
         * <p>68014359</p>
         */
        @NameInMap("DimensionId")
        public Long dimensionId;

        /**
         * <strong>example:</strong>
         * <p>etl_source</p>
         */
        @NameInMap("DimensionName")
        public String dimensionName;

        public static GetCatalogAssetDetailsResponseBodyDataColumnsAssociatedEntity build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogAssetDetailsResponseBodyDataColumnsAssociatedEntity self = new GetCatalogAssetDetailsResponseBodyDataColumnsAssociatedEntity();
            return TeaModel.build(map, self);
        }

        public GetCatalogAssetDetailsResponseBodyDataColumnsAssociatedEntity setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumnsAssociatedEntity setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumnsAssociatedEntity setDimensionDisplayName(String dimensionDisplayName) {
            this.dimensionDisplayName = dimensionDisplayName;
            return this;
        }
        public String getDimensionDisplayName() {
            return this.dimensionDisplayName;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumnsAssociatedEntity setDimensionId(Long dimensionId) {
            this.dimensionId = dimensionId;
            return this;
        }
        public Long getDimensionId() {
            return this.dimensionId;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumnsAssociatedEntity setDimensionName(String dimensionName) {
            this.dimensionName = dimensionName;
            return this;
        }
        public String getDimensionName() {
            return this.dimensionName;
        }

    }

    public static class GetCatalogAssetDetailsResponseBodyDataColumnsStandards extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hr_person_id</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>120350</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetCatalogAssetDetailsResponseBodyDataColumnsStandards build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogAssetDetailsResponseBodyDataColumnsStandards self = new GetCatalogAssetDetailsResponseBodyDataColumnsStandards();
            return TeaModel.build(map, self);
        }

        public GetCatalogAssetDetailsResponseBodyDataColumnsStandards setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumnsStandards setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumnsStandards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetCatalogAssetDetailsResponseBodyDataColumns extends TeaModel {
        @NameInMap("AssociatedEntity")
        public GetCatalogAssetDetailsResponseBodyDataColumnsAssociatedEntity associatedEntity;

        /**
         * <strong>example:</strong>
         * <p>DIMENSION</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <strong>example:</strong>
         * <p>/交易信息/0000001</p>
         */
        @NameInMap("ClassifyName")
        public String classifyName;

        /**
         * <strong>example:</strong>
         * <p>double</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>门店客流转化率</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>dp_table.300023201.ld_fashion.dws_lulu_location.conversion_rate</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <strong>example:</strong>
         * <p>L4</p>
         */
        @NameInMap("LevelShortName")
        public String levelShortName;

        /**
         * <strong>example:</strong>
         * <p>conversion_rate</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("QualityScore")
        public Double qualityScore;

        @NameInMap("Standards")
        public java.util.List<GetCatalogAssetDetailsResponseBodyDataColumnsStandards> standards;

        public static GetCatalogAssetDetailsResponseBodyDataColumns build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogAssetDetailsResponseBodyDataColumns self = new GetCatalogAssetDetailsResponseBodyDataColumns();
            return TeaModel.build(map, self);
        }

        public GetCatalogAssetDetailsResponseBodyDataColumns setAssociatedEntity(GetCatalogAssetDetailsResponseBodyDataColumnsAssociatedEntity associatedEntity) {
            this.associatedEntity = associatedEntity;
            return this;
        }
        public GetCatalogAssetDetailsResponseBodyDataColumnsAssociatedEntity getAssociatedEntity() {
            return this.associatedEntity;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumns setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumns setClassifyName(String classifyName) {
            this.classifyName = classifyName;
            return this;
        }
        public String getClassifyName() {
            return this.classifyName;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumns setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumns setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumns setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumns setLevelShortName(String levelShortName) {
            this.levelShortName = levelShortName;
            return this;
        }
        public String getLevelShortName() {
            return this.levelShortName;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumns setQualityScore(Double qualityScore) {
            this.qualityScore = qualityScore;
            return this;
        }
        public Double getQualityScore() {
            return this.qualityScore;
        }

        public GetCatalogAssetDetailsResponseBodyDataColumns setStandards(java.util.List<GetCatalogAssetDetailsResponseBodyDataColumnsStandards> standards) {
            this.standards = standards;
            return this;
        }
        public java.util.List<GetCatalogAssetDetailsResponseBodyDataColumnsStandards> getStandards() {
            return this.standards;
        }

    }

    public static class GetCatalogAssetDetailsResponseBodyDataCustomAttributes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MANAGEMENT</p>
         */
        @NameInMap("AttrType")
        public String attrType;

        /**
         * <strong>example:</strong>
         * <p>gkglbm</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>归口管理部门</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetCatalogAssetDetailsResponseBodyDataCustomAttributes build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogAssetDetailsResponseBodyDataCustomAttributes self = new GetCatalogAssetDetailsResponseBodyDataCustomAttributes();
            return TeaModel.build(map, self);
        }

        public GetCatalogAssetDetailsResponseBodyDataCustomAttributes setAttrType(String attrType) {
            this.attrType = attrType;
            return this;
        }
        public String getAttrType() {
            return this.attrType;
        }

        public GetCatalogAssetDetailsResponseBodyDataCustomAttributes setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetCatalogAssetDetailsResponseBodyDataCustomAttributes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCatalogAssetDetailsResponseBodyDataCustomAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCatalogAssetDetailsResponseBodyDataDirectories extends TeaModel {
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

        public static GetCatalogAssetDetailsResponseBodyDataDirectories build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogAssetDetailsResponseBodyDataDirectories self = new GetCatalogAssetDetailsResponseBodyDataDirectories();
            return TeaModel.build(map, self);
        }

        public GetCatalogAssetDetailsResponseBodyDataDirectories setDirectoryId(Long directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public Long getDirectoryId() {
            return this.directoryId;
        }

        public GetCatalogAssetDetailsResponseBodyDataDirectories setDirectoryName(String directoryName) {
            this.directoryName = directoryName;
            return this;
        }
        public String getDirectoryName() {
            return this.directoryName;
        }

        public GetCatalogAssetDetailsResponseBodyDataDirectories setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public GetCatalogAssetDetailsResponseBodyDataDirectories setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class GetCatalogAssetDetailsResponseBodyDataFirstOnShelveUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetCatalogAssetDetailsResponseBodyDataFirstOnShelveUser build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogAssetDetailsResponseBodyDataFirstOnShelveUser self = new GetCatalogAssetDetailsResponseBodyDataFirstOnShelveUser();
            return TeaModel.build(map, self);
        }

        public GetCatalogAssetDetailsResponseBodyDataFirstOnShelveUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetCatalogAssetDetailsResponseBodyDataFirstOnShelveUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetCatalogAssetDetailsResponseBodyDataLastOnShelveUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetCatalogAssetDetailsResponseBodyDataLastOnShelveUser build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogAssetDetailsResponseBodyDataLastOnShelveUser self = new GetCatalogAssetDetailsResponseBodyDataLastOnShelveUser();
            return TeaModel.build(map, self);
        }

        public GetCatalogAssetDetailsResponseBodyDataLastOnShelveUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetCatalogAssetDetailsResponseBodyDataLastOnShelveUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetCatalogAssetDetailsResponseBodyDataOwner extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetCatalogAssetDetailsResponseBodyDataOwner build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogAssetDetailsResponseBodyDataOwner self = new GetCatalogAssetDetailsResponseBodyDataOwner();
            return TeaModel.build(map, self);
        }

        public GetCatalogAssetDetailsResponseBodyDataOwner setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetCatalogAssetDetailsResponseBodyDataOwner setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosOwners extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosOwners build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosOwners self = new GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosOwners();
            return TeaModel.build(map, self);
        }

        public GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosOwners setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosOwners setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosProject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6865331517728384</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>fashion_cdm</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        public static GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosProject build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosProject self = new GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosProject();
            return TeaModel.build(map, self);
        }

        public GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosProject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosProject setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos extends TeaModel {
        @NameInMap("BizUnit")
        public String bizUnit;

        /**
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>n_7443633109495119872</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>2345</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("NodeScheduleType")
        public String nodeScheduleType;

        @NameInMap("Owners")
        public java.util.List<GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosOwners> owners;

        @NameInMap("Project")
        public GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosProject project;

        /**
         * <strong>example:</strong>
         * <p>DLINK</p>
         */
        @NameInMap("SubBizType")
        public String subBizType;

        public static GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos self = new GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos();
            return TeaModel.build(map, self);
        }

        public GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos setBizUnit(String bizUnit) {
            this.bizUnit = bizUnit;
            return this;
        }
        public String getBizUnit() {
            return this.bizUnit;
        }

        public GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos setNodeScheduleType(String nodeScheduleType) {
            this.nodeScheduleType = nodeScheduleType;
            return this;
        }
        public String getNodeScheduleType() {
            return this.nodeScheduleType;
        }

        public GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos setOwners(java.util.List<GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosOwners> owners) {
            this.owners = owners;
            return this;
        }
        public java.util.List<GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosOwners> getOwners() {
            return this.owners;
        }

        public GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos setProject(GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosProject project) {
            this.project = project;
            return this;
        }
        public GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfosProject getProject() {
            return this.project;
        }

        public GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos setSubBizType(String subBizType) {
            this.subBizType = subBizType;
            return this;
        }
        public String getSubBizType() {
            return this.subBizType;
        }

    }

    public static class GetCatalogAssetDetailsResponseBodyData extends TeaModel {
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
         * <p><a href="https://dataphin.poc.lydaas.com/market/catalog/detail/table/">https://dataphin.poc.lydaas.com/market/catalog/detail/table/</a>...</p>
         */
        @NameInMap("AssetDetailUrl")
        public String assetDetailUrl;

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
         * <p>0</p>
         */
        @NameInMap("CollectionCount")
        public Long collectionCount;

        @NameInMap("Columns")
        public java.util.List<GetCatalogAssetDetailsResponseBodyDataColumns> columns;

        /**
         * <strong>example:</strong>
         * <p>2024-10-11 16:10:19</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomAttributes")
        public java.util.List<GetCatalogAssetDetailsResponseBodyDataCustomAttributes> customAttributes;

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
        public java.util.List<GetCatalogAssetDetailsResponseBodyDataDirectories> directories;

        /**
         * <strong>example:</strong>
         * <p>2025-05-22 10:06:20</p>
         */
        @NameInMap("FirstOnShelveTime")
        public String firstOnShelveTime;

        @NameInMap("FirstOnShelveUser")
        public GetCatalogAssetDetailsResponseBodyDataFirstOnShelveUser firstOnShelveUser;

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

        @NameInMap("Instruction")
        public String instruction;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("IsPartitionTable")
        public Boolean isPartitionTable;

        /**
         * <strong>example:</strong>
         * <p>2024-10-11 16:10:19</p>
         */
        @NameInMap("LastDdlTime")
        public String lastDdlTime;

        /**
         * <strong>example:</strong>
         * <p>2024-10-11 16:10:19</p>
         */
        @NameInMap("LastDmlTime")
        public String lastDmlTime;

        /**
         * <strong>example:</strong>
         * <p>2025-05-22 10:06:20</p>
         */
        @NameInMap("LastOnShelveTime")
        public String lastOnShelveTime;

        @NameInMap("LastOnShelveUser")
        public GetCatalogAssetDetailsResponseBodyDataLastOnShelveUser lastOnShelveUser;

        @NameInMap("MaintainUserGroups")
        public java.util.List<String> maintainUserGroups;

        @NameInMap("MaintainUserIds")
        public java.util.List<String> maintainUserIds;

        /**
         * <strong>example:</strong>
         * <p>L3</p>
         */
        @NameInMap("MaxSecurityLevel")
        public String maxSecurityLevel;

        /**
         * <strong>example:</strong>
         * <p>2024-10-11 16:10:19</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Owner")
        public GetCatalogAssetDetailsResponseBodyDataOwner owner;

        /**
         * <strong>example:</strong>
         * <p>ds</p>
         */
        @NameInMap("PartitionKey")
        public String partitionKey;

        /**
         * <strong>example:</strong>
         * <p>employee_id</p>
         */
        @NameInMap("PrimaryKey")
        public String primaryKey;

        /**
         * <strong>example:</strong>
         * <p>ALL_USERS_CAN_VIEW</p>
         */
        @NameInMap("ProfilingReportViewScopeType")
        public String profilingReportViewScopeType;

        @NameInMap("ProfilingReportViewScopeUserGroups")
        public java.util.List<String> profilingReportViewScopeUserGroups;

        @NameInMap("ProfilingReportViewScopeUserIds")
        public java.util.List<String> profilingReportViewScopeUserIds;

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
         * <p>5</p>
         */
        @NameInMap("ReadCount")
        public Long readCount;

        /**
         * <strong>example:</strong>
         * <p>ALL_USERS_CAN_VIEW</p>
         */
        @NameInMap("ShelveViewScopeType")
        public String shelveViewScopeType;

        @NameInMap("ShelveViewScopeUserGroups")
        public java.util.List<String> shelveViewScopeUserGroups;

        @NameInMap("ShelveViewScopeUserIds")
        public java.util.List<String> shelveViewScopeUserIds;

        @NameInMap("SimpleNodeInfos")
        public java.util.List<GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos> simpleNodeInfos;

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

        /**
         * <strong>example:</strong>
         * <p>36000</p>
         */
        @NameInMap("TableLifeCycle")
        public String tableLifeCycle;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TableSizeInBytes")
        public Long tableSizeInBytes;

        public static GetCatalogAssetDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogAssetDetailsResponseBodyData self = new GetCatalogAssetDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCatalogAssetDetailsResponseBodyData setApiCallMode(String apiCallMode) {
            this.apiCallMode = apiCallMode;
            return this;
        }
        public String getApiCallMode() {
            return this.apiCallMode;
        }

        public GetCatalogAssetDetailsResponseBodyData setApiGroupName(String apiGroupName) {
            this.apiGroupName = apiGroupName;
            return this;
        }
        public String getApiGroupName() {
            return this.apiGroupName;
        }

        public GetCatalogAssetDetailsResponseBodyData setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public GetCatalogAssetDetailsResponseBodyData setApiRequestMethod(String apiRequestMethod) {
            this.apiRequestMethod = apiRequestMethod;
            return this;
        }
        public String getApiRequestMethod() {
            return this.apiRequestMethod;
        }

        public GetCatalogAssetDetailsResponseBodyData setAssetDescription(String assetDescription) {
            this.assetDescription = assetDescription;
            return this;
        }
        public String getAssetDescription() {
            return this.assetDescription;
        }

        public GetCatalogAssetDetailsResponseBodyData setAssetDetailUrl(String assetDetailUrl) {
            this.assetDetailUrl = assetDetailUrl;
            return this;
        }
        public String getAssetDetailUrl() {
            return this.assetDetailUrl;
        }

        public GetCatalogAssetDetailsResponseBodyData setAssetDisplayName(String assetDisplayName) {
            this.assetDisplayName = assetDisplayName;
            return this;
        }
        public String getAssetDisplayName() {
            return this.assetDisplayName;
        }

        public GetCatalogAssetDetailsResponseBodyData setAssetFrom(String assetFrom) {
            this.assetFrom = assetFrom;
            return this;
        }
        public String getAssetFrom() {
            return this.assetFrom;
        }

        public GetCatalogAssetDetailsResponseBodyData setAssetFullName(String assetFullName) {
            this.assetFullName = assetFullName;
            return this;
        }
        public String getAssetFullName() {
            return this.assetFullName;
        }

        public GetCatalogAssetDetailsResponseBodyData setAssetName(String assetName) {
            this.assetName = assetName;
            return this;
        }
        public String getAssetName() {
            return this.assetName;
        }

        public GetCatalogAssetDetailsResponseBodyData setAssetTags(java.util.List<String> assetTags) {
            this.assetTags = assetTags;
            return this;
        }
        public java.util.List<String> getAssetTags() {
            return this.assetTags;
        }

        public GetCatalogAssetDetailsResponseBodyData setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public GetCatalogAssetDetailsResponseBodyData setBiCatalog(String biCatalog) {
            this.biCatalog = biCatalog;
            return this;
        }
        public String getBiCatalog() {
            return this.biCatalog;
        }

        public GetCatalogAssetDetailsResponseBodyData setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public GetCatalogAssetDetailsResponseBodyData setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public GetCatalogAssetDetailsResponseBodyData setChartCount(Long chartCount) {
            this.chartCount = chartCount;
            return this;
        }
        public Long getChartCount() {
            return this.chartCount;
        }

        public GetCatalogAssetDetailsResponseBodyData setCollectionCount(Long collectionCount) {
            this.collectionCount = collectionCount;
            return this;
        }
        public Long getCollectionCount() {
            return this.collectionCount;
        }

        public GetCatalogAssetDetailsResponseBodyData setColumns(java.util.List<GetCatalogAssetDetailsResponseBodyDataColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<GetCatalogAssetDetailsResponseBodyDataColumns> getColumns() {
            return this.columns;
        }

        public GetCatalogAssetDetailsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetCatalogAssetDetailsResponseBodyData setCustomAttributes(java.util.List<GetCatalogAssetDetailsResponseBodyDataCustomAttributes> customAttributes) {
            this.customAttributes = customAttributes;
            return this;
        }
        public java.util.List<GetCatalogAssetDetailsResponseBodyDataCustomAttributes> getCustomAttributes() {
            return this.customAttributes;
        }

        public GetCatalogAssetDetailsResponseBodyData setDataCellId(String dataCellId) {
            this.dataCellId = dataCellId;
            return this;
        }
        public String getDataCellId() {
            return this.dataCellId;
        }

        public GetCatalogAssetDetailsResponseBodyData setDataCellName(String dataCellName) {
            this.dataCellName = dataCellName;
            return this;
        }
        public String getDataCellName() {
            return this.dataCellName;
        }

        public GetCatalogAssetDetailsResponseBodyData setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public GetCatalogAssetDetailsResponseBodyData setDatasourceId(Long datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public Long getDatasourceId() {
            return this.datasourceId;
        }

        public GetCatalogAssetDetailsResponseBodyData setDirectories(java.util.List<GetCatalogAssetDetailsResponseBodyDataDirectories> directories) {
            this.directories = directories;
            return this;
        }
        public java.util.List<GetCatalogAssetDetailsResponseBodyDataDirectories> getDirectories() {
            return this.directories;
        }

        public GetCatalogAssetDetailsResponseBodyData setFirstOnShelveTime(String firstOnShelveTime) {
            this.firstOnShelveTime = firstOnShelveTime;
            return this;
        }
        public String getFirstOnShelveTime() {
            return this.firstOnShelveTime;
        }

        public GetCatalogAssetDetailsResponseBodyData setFirstOnShelveUser(GetCatalogAssetDetailsResponseBodyDataFirstOnShelveUser firstOnShelveUser) {
            this.firstOnShelveUser = firstOnShelveUser;
            return this;
        }
        public GetCatalogAssetDetailsResponseBodyDataFirstOnShelveUser getFirstOnShelveUser() {
            return this.firstOnShelveUser;
        }

        public GetCatalogAssetDetailsResponseBodyData setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public GetCatalogAssetDetailsResponseBodyData setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetCatalogAssetDetailsResponseBodyData setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public GetCatalogAssetDetailsResponseBodyData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public GetCatalogAssetDetailsResponseBodyData setIsPartitionTable(Boolean isPartitionTable) {
            this.isPartitionTable = isPartitionTable;
            return this;
        }
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        public GetCatalogAssetDetailsResponseBodyData setLastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        public GetCatalogAssetDetailsResponseBodyData setLastDmlTime(String lastDmlTime) {
            this.lastDmlTime = lastDmlTime;
            return this;
        }
        public String getLastDmlTime() {
            return this.lastDmlTime;
        }

        public GetCatalogAssetDetailsResponseBodyData setLastOnShelveTime(String lastOnShelveTime) {
            this.lastOnShelveTime = lastOnShelveTime;
            return this;
        }
        public String getLastOnShelveTime() {
            return this.lastOnShelveTime;
        }

        public GetCatalogAssetDetailsResponseBodyData setLastOnShelveUser(GetCatalogAssetDetailsResponseBodyDataLastOnShelveUser lastOnShelveUser) {
            this.lastOnShelveUser = lastOnShelveUser;
            return this;
        }
        public GetCatalogAssetDetailsResponseBodyDataLastOnShelveUser getLastOnShelveUser() {
            return this.lastOnShelveUser;
        }

        public GetCatalogAssetDetailsResponseBodyData setMaintainUserGroups(java.util.List<String> maintainUserGroups) {
            this.maintainUserGroups = maintainUserGroups;
            return this;
        }
        public java.util.List<String> getMaintainUserGroups() {
            return this.maintainUserGroups;
        }

        public GetCatalogAssetDetailsResponseBodyData setMaintainUserIds(java.util.List<String> maintainUserIds) {
            this.maintainUserIds = maintainUserIds;
            return this;
        }
        public java.util.List<String> getMaintainUserIds() {
            return this.maintainUserIds;
        }

        public GetCatalogAssetDetailsResponseBodyData setMaxSecurityLevel(String maxSecurityLevel) {
            this.maxSecurityLevel = maxSecurityLevel;
            return this;
        }
        public String getMaxSecurityLevel() {
            return this.maxSecurityLevel;
        }

        public GetCatalogAssetDetailsResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetCatalogAssetDetailsResponseBodyData setOwner(GetCatalogAssetDetailsResponseBodyDataOwner owner) {
            this.owner = owner;
            return this;
        }
        public GetCatalogAssetDetailsResponseBodyDataOwner getOwner() {
            return this.owner;
        }

        public GetCatalogAssetDetailsResponseBodyData setPartitionKey(String partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public String getPartitionKey() {
            return this.partitionKey;
        }

        public GetCatalogAssetDetailsResponseBodyData setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public GetCatalogAssetDetailsResponseBodyData setProfilingReportViewScopeType(String profilingReportViewScopeType) {
            this.profilingReportViewScopeType = profilingReportViewScopeType;
            return this;
        }
        public String getProfilingReportViewScopeType() {
            return this.profilingReportViewScopeType;
        }

        public GetCatalogAssetDetailsResponseBodyData setProfilingReportViewScopeUserGroups(java.util.List<String> profilingReportViewScopeUserGroups) {
            this.profilingReportViewScopeUserGroups = profilingReportViewScopeUserGroups;
            return this;
        }
        public java.util.List<String> getProfilingReportViewScopeUserGroups() {
            return this.profilingReportViewScopeUserGroups;
        }

        public GetCatalogAssetDetailsResponseBodyData setProfilingReportViewScopeUserIds(java.util.List<String> profilingReportViewScopeUserIds) {
            this.profilingReportViewScopeUserIds = profilingReportViewScopeUserIds;
            return this;
        }
        public java.util.List<String> getProfilingReportViewScopeUserIds() {
            return this.profilingReportViewScopeUserIds;
        }

        public GetCatalogAssetDetailsResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetCatalogAssetDetailsResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetCatalogAssetDetailsResponseBodyData setReadCount(Long readCount) {
            this.readCount = readCount;
            return this;
        }
        public Long getReadCount() {
            return this.readCount;
        }

        public GetCatalogAssetDetailsResponseBodyData setShelveViewScopeType(String shelveViewScopeType) {
            this.shelveViewScopeType = shelveViewScopeType;
            return this;
        }
        public String getShelveViewScopeType() {
            return this.shelveViewScopeType;
        }

        public GetCatalogAssetDetailsResponseBodyData setShelveViewScopeUserGroups(java.util.List<String> shelveViewScopeUserGroups) {
            this.shelveViewScopeUserGroups = shelveViewScopeUserGroups;
            return this;
        }
        public java.util.List<String> getShelveViewScopeUserGroups() {
            return this.shelveViewScopeUserGroups;
        }

        public GetCatalogAssetDetailsResponseBodyData setShelveViewScopeUserIds(java.util.List<String> shelveViewScopeUserIds) {
            this.shelveViewScopeUserIds = shelveViewScopeUserIds;
            return this;
        }
        public java.util.List<String> getShelveViewScopeUserIds() {
            return this.shelveViewScopeUserIds;
        }

        public GetCatalogAssetDetailsResponseBodyData setSimpleNodeInfos(java.util.List<GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos> simpleNodeInfos) {
            this.simpleNodeInfos = simpleNodeInfos;
            return this;
        }
        public java.util.List<GetCatalogAssetDetailsResponseBodyDataSimpleNodeInfos> getSimpleNodeInfos() {
            return this.simpleNodeInfos;
        }

        public GetCatalogAssetDetailsResponseBodyData setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public GetCatalogAssetDetailsResponseBodyData setSumTableGuid(String sumTableGuid) {
            this.sumTableGuid = sumTableGuid;
            return this;
        }
        public String getSumTableGuid() {
            return this.sumTableGuid;
        }

        public GetCatalogAssetDetailsResponseBodyData setSumTableName(String sumTableName) {
            this.sumTableName = sumTableName;
            return this;
        }
        public String getSumTableName() {
            return this.sumTableName;
        }

        public GetCatalogAssetDetailsResponseBodyData setTableLifeCycle(String tableLifeCycle) {
            this.tableLifeCycle = tableLifeCycle;
            return this;
        }
        public String getTableLifeCycle() {
            return this.tableLifeCycle;
        }

        public GetCatalogAssetDetailsResponseBodyData setTableSizeInBytes(Long tableSizeInBytes) {
            this.tableSizeInBytes = tableSizeInBytes;
            return this;
        }
        public Long getTableSizeInBytes() {
            return this.tableSizeInBytes;
        }

    }

}
