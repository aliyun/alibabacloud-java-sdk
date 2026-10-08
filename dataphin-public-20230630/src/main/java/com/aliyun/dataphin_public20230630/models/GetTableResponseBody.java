// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTableResponseBodyData data;

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
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableResponseBody self = new GetTableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTableResponseBody setData(GetTableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTableResponseBodyData getData() {
        return this.data;
    }

    public GetTableResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTableResponseBodyDataInstructions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>30011211</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerNickName")
        public String ownerNickName;

        /**
         * <strong>example:</strong>
         * <p>使用指南</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetTableResponseBodyDataInstructions build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyDataInstructions self = new GetTableResponseBodyDataInstructions();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyDataInstructions setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTableResponseBodyDataInstructions setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTableResponseBodyDataInstructions setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetTableResponseBodyDataInstructions setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetTableResponseBodyDataInstructions setOwnerNickName(String ownerNickName) {
            this.ownerNickName = ownerNickName;
            return this;
        }
        public String getOwnerNickName() {
            return this.ownerNickName;
        }

        public GetTableResponseBodyDataInstructions setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetTableResponseBodyDataSimpleNodeInfosBizUnit extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>测试板块</p>
         */
        @NameInMap("BizUnitDisplayName")
        public String bizUnitDisplayName;

        /**
         * <strong>example:</strong>
         * <p>2011</p>
         */
        @NameInMap("BizUnitId")
        public String bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>LD_test01</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        public static GetTableResponseBodyDataSimpleNodeInfosBizUnit build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyDataSimpleNodeInfosBizUnit self = new GetTableResponseBodyDataSimpleNodeInfosBizUnit();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyDataSimpleNodeInfosBizUnit setBizUnitDisplayName(String bizUnitDisplayName) {
            this.bizUnitDisplayName = bizUnitDisplayName;
            return this;
        }
        public String getBizUnitDisplayName() {
            return this.bizUnitDisplayName;
        }

        public GetTableResponseBodyDataSimpleNodeInfosBizUnit setBizUnitId(String bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public String getBizUnitId() {
            return this.bizUnitId;
        }

        public GetTableResponseBodyDataSimpleNodeInfosBizUnit setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

    }

    public static class GetTableResponseBodyDataSimpleNodeInfosOwners extends TeaModel {
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

        public static GetTableResponseBodyDataSimpleNodeInfosOwners build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyDataSimpleNodeInfosOwners self = new GetTableResponseBodyDataSimpleNodeInfosOwners();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyDataSimpleNodeInfosOwners setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetTableResponseBodyDataSimpleNodeInfosOwners setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetTableResponseBodyDataSimpleNodeInfosProject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>测试项目</p>
         */
        @NameInMap("ProjectDisplayName")
        public String projectDisplayName;

        /**
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>testPrj</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        public static GetTableResponseBodyDataSimpleNodeInfosProject build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyDataSimpleNodeInfosProject self = new GetTableResponseBodyDataSimpleNodeInfosProject();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyDataSimpleNodeInfosProject setProjectDisplayName(String projectDisplayName) {
            this.projectDisplayName = projectDisplayName;
            return this;
        }
        public String getProjectDisplayName() {
            return this.projectDisplayName;
        }

        public GetTableResponseBodyDataSimpleNodeInfosProject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetTableResponseBodyDataSimpleNodeInfosProject setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class GetTableResponseBodyDataSimpleNodeInfos extends TeaModel {
        @NameInMap("BizUnit")
        public GetTableResponseBodyDataSimpleNodeInfosBizUnit bizUnit;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>n_7443xxxx</p>
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
        public java.util.List<GetTableResponseBodyDataSimpleNodeInfosOwners> owners;

        @NameInMap("Project")
        public GetTableResponseBodyDataSimpleNodeInfosProject project;

        /**
         * <strong>example:</strong>
         * <p>DLINK</p>
         */
        @NameInMap("SubBizType")
        public String subBizType;

        public static GetTableResponseBodyDataSimpleNodeInfos build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyDataSimpleNodeInfos self = new GetTableResponseBodyDataSimpleNodeInfos();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyDataSimpleNodeInfos setBizUnit(GetTableResponseBodyDataSimpleNodeInfosBizUnit bizUnit) {
            this.bizUnit = bizUnit;
            return this;
        }
        public GetTableResponseBodyDataSimpleNodeInfosBizUnit getBizUnit() {
            return this.bizUnit;
        }

        public GetTableResponseBodyDataSimpleNodeInfos setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetTableResponseBodyDataSimpleNodeInfos setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetTableResponseBodyDataSimpleNodeInfos setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetTableResponseBodyDataSimpleNodeInfos setNodeScheduleType(String nodeScheduleType) {
            this.nodeScheduleType = nodeScheduleType;
            return this;
        }
        public String getNodeScheduleType() {
            return this.nodeScheduleType;
        }

        public GetTableResponseBodyDataSimpleNodeInfos setOwners(java.util.List<GetTableResponseBodyDataSimpleNodeInfosOwners> owners) {
            this.owners = owners;
            return this;
        }
        public java.util.List<GetTableResponseBodyDataSimpleNodeInfosOwners> getOwners() {
            return this.owners;
        }

        public GetTableResponseBodyDataSimpleNodeInfos setProject(GetTableResponseBodyDataSimpleNodeInfosProject project) {
            this.project = project;
            return this;
        }
        public GetTableResponseBodyDataSimpleNodeInfosProject getProject() {
            return this.project;
        }

        public GetTableResponseBodyDataSimpleNodeInfos setSubBizType(String subBizType) {
            this.subBizType = subBizType;
            return this;
        }
        public String getSubBizType() {
            return this.subBizType;
        }

    }

    public static class GetTableResponseBodyDataStreamTableConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetTableResponseBodyDataStreamTableConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyDataStreamTableConfig self = new GetTableResponseBodyDataStreamTableConfig();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyDataStreamTableConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTableResponseBodyDataStreamTableConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTableResponseBodyData extends TeaModel {
        @NameInMap("AssetTags")
        public java.util.List<String> assetTags;

        /**
         * <strong>example:</strong>
         * <p>2011</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>LD_test01</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>30011211</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>211</p>
         */
        @NameInMap("DataDomainId")
        public Long dataDomainId;

        /**
         * <strong>example:</strong>
         * <p>课程域</p>
         */
        @NameInMap("DataDomainName")
        public String dataDomainName;

        /**
         * <strong>example:</strong>
         * <p>3301</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>学生</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>dp_ds_table.300023201.7311626611751680256.load_test.abc</p>
         */
        @NameInMap("Guid")
        public String guid;

        @NameInMap("Instructions")
        public java.util.List<GetTableResponseBodyDataInstructions> instructions;

        @NameInMap("IsBasicMode")
        public Boolean isBasicMode;

        @NameInMap("IsPartitionTable")
        public Boolean isPartitionTable;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("LastDdlTime")
        public String lastDdlTime;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("LastDmlTime")
        public String lastDmlTime;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("LastQueryTime")
        public String lastQueryTime;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("LifeCycle")
        public Long lifeCycle;

        /**
         * <strong>example:</strong>
         * <p>t_test01</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("NodeIds")
        public java.util.List<String> nodeIds;

        /**
         * <strong>example:</strong>
         * <p>30011211</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParentModelId")
        public String parentModelId;

        /**
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>testPrj</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SecurityLevel")
        public Long securityLevel;

        /**
         * <strong>example:</strong>
         * <p>高</p>
         */
        @NameInMap("SecurityLevelAbbreviation")
        public String securityLevelAbbreviation;

        /**
         * <strong>example:</strong>
         * <p>高级</p>
         */
        @NameInMap("SecurityLevelName")
        public String securityLevelName;

        @NameInMap("SimpleNodeInfos")
        public java.util.List<GetTableResponseBodyDataSimpleNodeInfos> simpleNodeInfos;

        /**
         * <strong>example:</strong>
         * <p>HIVE</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("StreamTableConfig")
        public java.util.List<GetTableResponseBodyDataStreamTableConfig> streamTableConfig;

        /**
         * <strong>example:</strong>
         * <p>10241024</p>
         */
        @NameInMap("TableSizeInBytes")
        public Long tableSizeInBytes;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("VisitCount30d")
        public Long visitCount30d;

        public static GetTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyData self = new GetTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyData setAssetTags(java.util.List<String> assetTags) {
            this.assetTags = assetTags;
            return this;
        }
        public java.util.List<String> getAssetTags() {
            return this.assetTags;
        }

        public GetTableResponseBodyData setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public GetTableResponseBodyData setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public GetTableResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTableResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetTableResponseBodyData setDataDomainId(Long dataDomainId) {
            this.dataDomainId = dataDomainId;
            return this;
        }
        public Long getDataDomainId() {
            return this.dataDomainId;
        }

        public GetTableResponseBodyData setDataDomainName(String dataDomainName) {
            this.dataDomainName = dataDomainName;
            return this;
        }
        public String getDataDomainName() {
            return this.dataDomainName;
        }

        public GetTableResponseBodyData setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public GetTableResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetTableResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetTableResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public GetTableResponseBodyData setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetTableResponseBodyData setInstructions(java.util.List<GetTableResponseBodyDataInstructions> instructions) {
            this.instructions = instructions;
            return this;
        }
        public java.util.List<GetTableResponseBodyDataInstructions> getInstructions() {
            return this.instructions;
        }

        public GetTableResponseBodyData setIsBasicMode(Boolean isBasicMode) {
            this.isBasicMode = isBasicMode;
            return this;
        }
        public Boolean getIsBasicMode() {
            return this.isBasicMode;
        }

        public GetTableResponseBodyData setIsPartitionTable(Boolean isPartitionTable) {
            this.isPartitionTable = isPartitionTable;
            return this;
        }
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        public GetTableResponseBodyData setLastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        public GetTableResponseBodyData setLastDmlTime(String lastDmlTime) {
            this.lastDmlTime = lastDmlTime;
            return this;
        }
        public String getLastDmlTime() {
            return this.lastDmlTime;
        }

        public GetTableResponseBodyData setLastQueryTime(String lastQueryTime) {
            this.lastQueryTime = lastQueryTime;
            return this;
        }
        public String getLastQueryTime() {
            return this.lastQueryTime;
        }

        public GetTableResponseBodyData setLifeCycle(Long lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }
        public Long getLifeCycle() {
            return this.lifeCycle;
        }

        public GetTableResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableResponseBodyData setNodeIds(java.util.List<String> nodeIds) {
            this.nodeIds = nodeIds;
            return this;
        }
        public java.util.List<String> getNodeIds() {
            return this.nodeIds;
        }

        public GetTableResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTableResponseBodyData setParentModelId(String parentModelId) {
            this.parentModelId = parentModelId;
            return this;
        }
        public String getParentModelId() {
            return this.parentModelId;
        }

        public GetTableResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTableResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetTableResponseBodyData setSecurityLevel(Long securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Long getSecurityLevel() {
            return this.securityLevel;
        }

        public GetTableResponseBodyData setSecurityLevelAbbreviation(String securityLevelAbbreviation) {
            this.securityLevelAbbreviation = securityLevelAbbreviation;
            return this;
        }
        public String getSecurityLevelAbbreviation() {
            return this.securityLevelAbbreviation;
        }

        public GetTableResponseBodyData setSecurityLevelName(String securityLevelName) {
            this.securityLevelName = securityLevelName;
            return this;
        }
        public String getSecurityLevelName() {
            return this.securityLevelName;
        }

        public GetTableResponseBodyData setSimpleNodeInfos(java.util.List<GetTableResponseBodyDataSimpleNodeInfos> simpleNodeInfos) {
            this.simpleNodeInfos = simpleNodeInfos;
            return this;
        }
        public java.util.List<GetTableResponseBodyDataSimpleNodeInfos> getSimpleNodeInfos() {
            return this.simpleNodeInfos;
        }

        public GetTableResponseBodyData setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public GetTableResponseBodyData setStreamTableConfig(java.util.List<GetTableResponseBodyDataStreamTableConfig> streamTableConfig) {
            this.streamTableConfig = streamTableConfig;
            return this;
        }
        public java.util.List<GetTableResponseBodyDataStreamTableConfig> getStreamTableConfig() {
            return this.streamTableConfig;
        }

        public GetTableResponseBodyData setTableSizeInBytes(Long tableSizeInBytes) {
            this.tableSizeInBytes = tableSizeInBytes;
            return this;
        }
        public Long getTableSizeInBytes() {
            return this.tableSizeInBytes;
        }

        public GetTableResponseBodyData setVisitCount30d(Long visitCount30d) {
            this.visitCount30d = visitCount30d;
            return this;
        }
        public Long getVisitCount30d() {
            return this.visitCount30d;
        }

    }

}
