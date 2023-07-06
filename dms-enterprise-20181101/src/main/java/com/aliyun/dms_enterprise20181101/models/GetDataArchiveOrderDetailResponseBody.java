// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataArchiveOrderDetailResponseBody extends TeaModel {
    @NameInMap("DataArchiveOrderDetail")
    public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail dataArchiveOrderDetail;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static GetDataArchiveOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataArchiveOrderDetailResponseBody self = new GetDataArchiveOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataArchiveOrderDetailResponseBody setDataArchiveOrderDetail(GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail dataArchiveOrderDetail) {
        this.dataArchiveOrderDetail = dataArchiveOrderDetail;
        return this;
    }
    public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail getDataArchiveOrderDetail() {
        return this.dataArchiveOrderDetail;
    }

    public GetDataArchiveOrderDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataArchiveOrderDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataArchiveOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataArchiveOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataArchiveOrderDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo extends TeaModel {
        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CronBeginDate")
        public String cronBeginDate;

        @NameInMap("CronEndDate")
        public String cronEndDate;

        @NameInMap("CronTrigger")
        public Boolean cronTrigger;

        @NameInMap("DWDevelop")
        public Boolean DWDevelop;

        @NameInMap("DagName")
        public String dagName;

        @NameInMap("DagOwnerId")
        public String dagOwnerId;

        @NameInMap("DeployId")
        public Long deployId;

        @NameInMap("Description")
        public String description;

        @NameInMap("EditDagId")
        public Long editDagId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsPublic")
        public Long isPublic;

        @NameInMap("Legacy")
        public Boolean legacy;

        @NameInMap("System")
        public Boolean system;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TriggerOnce")
        public Boolean triggerOnce;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setCronBeginDate(String cronBeginDate) {
            this.cronBeginDate = cronBeginDate;
            return this;
        }
        public String getCronBeginDate() {
            return this.cronBeginDate;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setCronEndDate(String cronEndDate) {
            this.cronEndDate = cronEndDate;
            return this;
        }
        public String getCronEndDate() {
            return this.cronEndDate;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setCronTrigger(Boolean cronTrigger) {
            this.cronTrigger = cronTrigger;
            return this;
        }
        public Boolean getCronTrigger() {
            return this.cronTrigger;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setDWDevelop(Boolean DWDevelop) {
            this.DWDevelop = DWDevelop;
            return this;
        }
        public Boolean getDWDevelop() {
            return this.DWDevelop;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setDagName(String dagName) {
            this.dagName = dagName;
            return this;
        }
        public String getDagName() {
            return this.dagName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setDagOwnerId(String dagOwnerId) {
            this.dagOwnerId = dagOwnerId;
            return this;
        }
        public String getDagOwnerId() {
            return this.dagOwnerId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setDeployId(Long deployId) {
            this.deployId = deployId;
            return this;
        }
        public Long getDeployId() {
            return this.deployId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setEditDagId(Long editDagId) {
            this.editDagId = editDagId;
            return this;
        }
        public Long getEditDagId() {
            return this.editDagId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setIsPublic(Long isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public Long getIsPublic() {
            return this.isPublic;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setLegacy(Boolean legacy) {
            this.legacy = legacy;
            return this;
        }
        public Boolean getLegacy() {
            return this.legacy;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setTriggerOnce(Boolean triggerOnce) {
            this.triggerOnce = triggerOnce;
            return this;
        }
        public Boolean getTriggerOnce() {
            return this.triggerOnce;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup extends TeaModel {
        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Description")
        public String description;

        @NameInMap("FreeOrStable")
        public Boolean freeOrStable;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GroupMode")
        public String groupMode;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LastMenderId")
        public Long lastMenderId;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setFreeOrStable(Boolean freeOrStable) {
            this.freeOrStable = freeOrStable;
            return this;
        }
        public Boolean getFreeOrStable() {
            return this.freeOrStable;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setGroupMode(String groupMode) {
            this.groupMode = groupMode;
            return this;
        }
        public String getGroupMode() {
            return this.groupMode;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setLastMenderId(Long lastMenderId) {
            this.lastMenderId = lastMenderId;
            return this;
        }
        public Long getLastMenderId() {
            return this.lastMenderId;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("AlterTimeout")
        public Long alterTimeout;

        @NameInMap("AssetControl")
        public Boolean assetControl;

        @NameInMap("CatalogName")
        public String catalogName;

        @NameInMap("ClusterNode")
        public String clusterNode;

        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("DbaId")
        public Long dbaId;

        @NameInMap("DbaName")
        public String dbaName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Follow")
        public Boolean follow;

        @NameInMap("Host")
        public String host;

        @NameInMap("Idc")
        public String idc;

        @NameInMap("IdcTitle")
        public String idcTitle;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("InstanceSource")
        public String instanceSource;

        @NameInMap("LastSyncTime")
        public String lastSyncTime;

        @NameInMap("Level")
        public String level;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("OwnerIds")
        public java.util.List<Long> ownerIds;

        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        @NameInMap("Port")
        public Long port;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("SearchName")
        public String searchName;

        @NameInMap("StandardGroup")
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup standardGroup;

        @NameInMap("State")
        public String state;

        @NameInMap("TableCount")
        public Long tableCount;

        @NameInMap("TnsName")
        public String tnsName;

        @NameInMap("UnitType")
        public String unitType;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setAlterTimeout(Long alterTimeout) {
            this.alterTimeout = alterTimeout;
            return this;
        }
        public Long getAlterTimeout() {
            return this.alterTimeout;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setAssetControl(Boolean assetControl) {
            this.assetControl = assetControl;
            return this;
        }
        public Boolean getAssetControl() {
            return this.assetControl;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setClusterNode(String clusterNode) {
            this.clusterNode = clusterNode;
            return this;
        }
        public String getClusterNode() {
            return this.clusterNode;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setDbaId(Long dbaId) {
            this.dbaId = dbaId;
            return this;
        }
        public Long getDbaId() {
            return this.dbaId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setDbaName(String dbaName) {
            this.dbaName = dbaName;
            return this;
        }
        public String getDbaName() {
            return this.dbaName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setFollow(Boolean follow) {
            this.follow = follow;
            return this;
        }
        public Boolean getFollow() {
            return this.follow;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setIdc(String idc) {
            this.idc = idc;
            return this;
        }
        public String getIdc() {
            return this.idc;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setIdcTitle(String idcTitle) {
            this.idcTitle = idcTitle;
            return this;
        }
        public String getIdcTitle() {
            return this.idcTitle;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setInstanceSource(String instanceSource) {
            this.instanceSource = instanceSource;
            return this;
        }
        public String getInstanceSource() {
            return this.instanceSource;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setLastSyncTime(String lastSyncTime) {
            this.lastSyncTime = lastSyncTime;
            return this;
        }
        public String getLastSyncTime() {
            return this.lastSyncTime;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setOwnerIds(java.util.List<Long> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<Long> getOwnerIds() {
            return this.ownerIds;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setStandardGroup(GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup standardGroup) {
            this.standardGroup = standardGroup;
            return this;
        }
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup getStandardGroup() {
            return this.standardGroup;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setTableCount(Long tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Long getTableCount() {
            return this.tableCount;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setTnsName(String tnsName) {
            this.tnsName = tnsName;
            return this;
        }
        public String getTnsName() {
            return this.tnsName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setUnitType(String unitType) {
            this.unitType = unitType;
            return this;
        }
        public String getUnitType() {
            return this.unitType;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances extends TeaModel {
        @NameInMap("BusinessTime")
        public String businessTime;

        @NameInMap("DagId")
        public Long dagId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HistoryDagId")
        public Long historyDagId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LastRunningContext")
        public String lastRunningContext;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Status")
        public Long status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TriggerType")
        public Long triggerType;

        @NameInMap("Version")
        public String version;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setBusinessTime(String businessTime) {
            this.businessTime = businessTime;
            return this;
        }
        public String getBusinessTime() {
            return this.businessTime;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setHistoryDagId(Long historyDagId) {
            this.historyDagId = historyDagId;
            return this;
        }
        public Long getHistoryDagId() {
            return this.historyDagId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setLastRunningContext(String lastRunningContext) {
            this.lastRunningContext = lastRunningContext;
            return this;
        }
        public String getLastRunningContext() {
            return this.lastRunningContext;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setTriggerType(Long triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public Long getTriggerType() {
            return this.triggerType;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult extends TeaModel {
        @NameInMap("CronFireType")
        public String cronFireType;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult setCronFireType(String cronFireType) {
            this.cronFireType = cronFireType;
            return this;
        }
        public String getCronFireType() {
            return this.cronFireType;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData extends TeaModel {
        @NameInMap("DagInfo")
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo dagInfo;

        @NameInMap("DbBaseInfo")
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo dbBaseInfo;

        @NameInMap("InstanceTotal")
        public Long instanceTotal;

        @NameInMap("Instances")
        public java.util.List<GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances> instances;

        @NameInMap("NextFireTimeResult")
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult nextFireTimeResult;

        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TempTableNameMap")
        public java.util.Map<String, ?> tempTableNameMap;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setDagInfo(GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo dagInfo) {
            this.dagInfo = dagInfo;
            return this;
        }
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo getDagInfo() {
            return this.dagInfo;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setDbBaseInfo(GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo dbBaseInfo) {
            this.dbBaseInfo = dbBaseInfo;
            return this;
        }
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo getDbBaseInfo() {
            return this.dbBaseInfo;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setInstanceTotal(Long instanceTotal) {
            this.instanceTotal = instanceTotal;
            return this;
        }
        public Long getInstanceTotal() {
            return this.instanceTotal;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setInstances(java.util.List<GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances> getInstances() {
            return this.instances;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setNextFireTimeResult(GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult nextFireTimeResult) {
            this.nextFireTimeResult = nextFireTimeResult;
            return this;
        }
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult getNextFireTimeResult() {
            return this.nextFireTimeResult;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setTempTableNameMap(java.util.Map<String, ?> tempTableNameMap) {
            this.tempTableNameMap = tempTableNameMap;
            return this;
        }
        public java.util.Map<String, ?> getTempTableNameMap() {
            return this.tempTableNameMap;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TableWhere")
        public String tableWhere;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes setTableWhere(String tableWhere) {
            this.tableWhere = tableWhere;
            return this;
        }
        public String getTableWhere() {
            return this.tableWhere;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam extends TeaModel {
        @NameInMap("ArchiveMethod")
        public String archiveMethod;

        @NameInMap("DbSchema")
        public String dbSchema;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("OrderAfter")
        public java.util.List<String> orderAfter;

        @NameInMap("RunMethod")
        public String runMethod;

        @NameInMap("SourceDatabaseId")
        public Long sourceDatabaseId;

        @NameInMap("TableIncludes")
        public java.util.List<GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes> tableIncludes;

        @NameInMap("TableMapping")
        public java.util.List<String> tableMapping;

        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        @NameInMap("Variables")
        public java.util.List<String> variables;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setArchiveMethod(String archiveMethod) {
            this.archiveMethod = archiveMethod;
            return this;
        }
        public String getArchiveMethod() {
            return this.archiveMethod;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setDbSchema(String dbSchema) {
            this.dbSchema = dbSchema;
            return this;
        }
        public String getDbSchema() {
            return this.dbSchema;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setOrderAfter(java.util.List<String> orderAfter) {
            this.orderAfter = orderAfter;
            return this;
        }
        public java.util.List<String> getOrderAfter() {
            return this.orderAfter;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setRunMethod(String runMethod) {
            this.runMethod = runMethod;
            return this;
        }
        public String getRunMethod() {
            return this.runMethod;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setSourceDatabaseId(Long sourceDatabaseId) {
            this.sourceDatabaseId = sourceDatabaseId;
            return this;
        }
        public Long getSourceDatabaseId() {
            return this.sourceDatabaseId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setTableIncludes(java.util.List<GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes> tableIncludes) {
            this.tableIncludes = tableIncludes;
            return this;
        }
        public java.util.List<GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes> getTableIncludes() {
            return this.tableIncludes;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setTableMapping(java.util.List<String> tableMapping) {
            this.tableMapping = tableMapping;
            return this;
        }
        public java.util.List<String> getTableMapping() {
            return this.tableMapping;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setVariables(java.util.List<String> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<String> getVariables() {
            return this.variables;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("Committer")
        public String committer;

        @NameInMap("CommitterId")
        public Long committerId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("PluginExtraData")
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData pluginExtraData;

        @NameInMap("PluginParam")
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam pluginParam;

        @NameInMap("PluginType")
        public String pluginType;

        @NameInMap("RelatedUserList")
        public java.util.List<Long> relatedUserList;

        @NameInMap("RelatedUserNickList")
        public java.util.List<String> relatedUserNickList;

        @NameInMap("StatusCode")
        public String statusCode;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("WorkflowInstanceId")
        public Long workflowInstanceId;

        @NameInMap("WorkflowStatusDesc")
        public String workflowStatusDesc;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setCommitter(String committer) {
            this.committer = committer;
            return this;
        }
        public String getCommitter() {
            return this.committer;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setCommitterId(Long committerId) {
            this.committerId = committerId;
            return this;
        }
        public Long getCommitterId() {
            return this.committerId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setPluginExtraData(GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData pluginExtraData) {
            this.pluginExtraData = pluginExtraData;
            return this;
        }
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData getPluginExtraData() {
            return this.pluginExtraData;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setPluginParam(GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam pluginParam) {
            this.pluginParam = pluginParam;
            return this;
        }
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam getPluginParam() {
            return this.pluginParam;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setRelatedUserList(java.util.List<Long> relatedUserList) {
            this.relatedUserList = relatedUserList;
            return this;
        }
        public java.util.List<Long> getRelatedUserList() {
            return this.relatedUserList;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setRelatedUserNickList(java.util.List<String> relatedUserNickList) {
            this.relatedUserNickList = relatedUserNickList;
            return this;
        }
        public java.util.List<String> getRelatedUserNickList() {
            return this.relatedUserNickList;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setWorkflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setWorkflowStatusDesc(String workflowStatusDesc) {
            this.workflowStatusDesc = workflowStatusDesc;
            return this;
        }
        public String getWorkflowStatusDesc() {
            return this.workflowStatusDesc;
        }

    }

}
