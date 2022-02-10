// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobDetailResponseBody extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BeginTimestamp")
    public String beginTimestamp;

    @NameInMap("Checkpoint")
    public Long checkpoint;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("ConsumptionCheckpoint")
    public String consumptionCheckpoint;

    @NameInMap("ConsumptionClient")
    public String consumptionClient;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DatabaseCount")
    public Integer databaseCount;

    @NameInMap("DbObject")
    public String dbObject;

    @NameInMap("Delay")
    public Long delay;

    @NameInMap("DemoJob")
    public Boolean demoJob;

    @NameInMap("DestNetType")
    public String destNetType;

    @NameInMap("DestinationEndpoint")
    public DescribeDtsJobDetailResponseBodyDestinationEndpoint destinationEndpoint;

    @NameInMap("DtsInstanceID")
    public String dtsInstanceID;

    @NameInMap("DtsJobClass")
    public String dtsJobClass;

    @NameInMap("DtsJobDirection")
    public String dtsJobDirection;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("DtsJobName")
    public String dtsJobName;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("EndTimestamp")
    public String endTimestamp;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("EtlCalculator")
    public String etlCalculator;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("FinishTime")
    public String finishTime;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("MigrationMode")
    public DescribeDtsJobDetailResponseBodyMigrationMode migrationMode;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Reserved")
    public String reserved;

    @NameInMap("SourceEndpoint")
    public DescribeDtsJobDetailResponseBodySourceEndpoint sourceEndpoint;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubDistributedJob")
    public java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJob> subDistributedJob;

    @NameInMap("SubSyncJob")
    public java.util.List<DescribeDtsJobDetailResponseBodySubSyncJob> subSyncJob;

    @NameInMap("SubscribeTopic")
    public String subscribeTopic;

    @NameInMap("SubscriptionDataType")
    public DescribeDtsJobDetailResponseBodySubscriptionDataType subscriptionDataType;

    @NameInMap("SubscriptionHost")
    public DescribeDtsJobDetailResponseBodySubscriptionHost subscriptionHost;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("TaskType")
    public String taskType;

    public static DescribeDtsJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobDetailResponseBody self = new DescribeDtsJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobDetailResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeDtsJobDetailResponseBody setBeginTimestamp(String beginTimestamp) {
        this.beginTimestamp = beginTimestamp;
        return this;
    }
    public String getBeginTimestamp() {
        return this.beginTimestamp;
    }

    public DescribeDtsJobDetailResponseBody setCheckpoint(Long checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public Long getCheckpoint() {
        return this.checkpoint;
    }

    public DescribeDtsJobDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeDtsJobDetailResponseBody setConsumptionCheckpoint(String consumptionCheckpoint) {
        this.consumptionCheckpoint = consumptionCheckpoint;
        return this;
    }
    public String getConsumptionCheckpoint() {
        return this.consumptionCheckpoint;
    }

    public DescribeDtsJobDetailResponseBody setConsumptionClient(String consumptionClient) {
        this.consumptionClient = consumptionClient;
        return this;
    }
    public String getConsumptionClient() {
        return this.consumptionClient;
    }

    public DescribeDtsJobDetailResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDtsJobDetailResponseBody setDatabaseCount(Integer databaseCount) {
        this.databaseCount = databaseCount;
        return this;
    }
    public Integer getDatabaseCount() {
        return this.databaseCount;
    }

    public DescribeDtsJobDetailResponseBody setDbObject(String dbObject) {
        this.dbObject = dbObject;
        return this;
    }
    public String getDbObject() {
        return this.dbObject;
    }

    public DescribeDtsJobDetailResponseBody setDelay(Long delay) {
        this.delay = delay;
        return this;
    }
    public Long getDelay() {
        return this.delay;
    }

    public DescribeDtsJobDetailResponseBody setDemoJob(Boolean demoJob) {
        this.demoJob = demoJob;
        return this;
    }
    public Boolean getDemoJob() {
        return this.demoJob;
    }

    public DescribeDtsJobDetailResponseBody setDestNetType(String destNetType) {
        this.destNetType = destNetType;
        return this;
    }
    public String getDestNetType() {
        return this.destNetType;
    }

    public DescribeDtsJobDetailResponseBody setDestinationEndpoint(DescribeDtsJobDetailResponseBodyDestinationEndpoint destinationEndpoint) {
        this.destinationEndpoint = destinationEndpoint;
        return this;
    }
    public DescribeDtsJobDetailResponseBodyDestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    public DescribeDtsJobDetailResponseBody setDtsInstanceID(String dtsInstanceID) {
        this.dtsInstanceID = dtsInstanceID;
        return this;
    }
    public String getDtsInstanceID() {
        return this.dtsInstanceID;
    }

    public DescribeDtsJobDetailResponseBody setDtsJobClass(String dtsJobClass) {
        this.dtsJobClass = dtsJobClass;
        return this;
    }
    public String getDtsJobClass() {
        return this.dtsJobClass;
    }

    public DescribeDtsJobDetailResponseBody setDtsJobDirection(String dtsJobDirection) {
        this.dtsJobDirection = dtsJobDirection;
        return this;
    }
    public String getDtsJobDirection() {
        return this.dtsJobDirection;
    }

    public DescribeDtsJobDetailResponseBody setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDtsJobDetailResponseBody setDtsJobName(String dtsJobName) {
        this.dtsJobName = dtsJobName;
        return this;
    }
    public String getDtsJobName() {
        return this.dtsJobName;
    }

    public DescribeDtsJobDetailResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDtsJobDetailResponseBody setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeDtsJobDetailResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDtsJobDetailResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDtsJobDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeDtsJobDetailResponseBody setEtlCalculator(String etlCalculator) {
        this.etlCalculator = etlCalculator;
        return this;
    }
    public String getEtlCalculator() {
        return this.etlCalculator;
    }

    public DescribeDtsJobDetailResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDtsJobDetailResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public DescribeDtsJobDetailResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDtsJobDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDtsJobDetailResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public DescribeDtsJobDetailResponseBody setMigrationMode(DescribeDtsJobDetailResponseBodyMigrationMode migrationMode) {
        this.migrationMode = migrationMode;
        return this;
    }
    public DescribeDtsJobDetailResponseBodyMigrationMode getMigrationMode() {
        return this.migrationMode;
    }

    public DescribeDtsJobDetailResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDtsJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDtsJobDetailResponseBody setReserved(String reserved) {
        this.reserved = reserved;
        return this;
    }
    public String getReserved() {
        return this.reserved;
    }

    public DescribeDtsJobDetailResponseBody setSourceEndpoint(DescribeDtsJobDetailResponseBodySourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public DescribeDtsJobDetailResponseBodySourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public DescribeDtsJobDetailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDtsJobDetailResponseBody setSubDistributedJob(java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJob> subDistributedJob) {
        this.subDistributedJob = subDistributedJob;
        return this;
    }
    public java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJob> getSubDistributedJob() {
        return this.subDistributedJob;
    }

    public DescribeDtsJobDetailResponseBody setSubSyncJob(java.util.List<DescribeDtsJobDetailResponseBodySubSyncJob> subSyncJob) {
        this.subSyncJob = subSyncJob;
        return this;
    }
    public java.util.List<DescribeDtsJobDetailResponseBodySubSyncJob> getSubSyncJob() {
        return this.subSyncJob;
    }

    public DescribeDtsJobDetailResponseBody setSubscribeTopic(String subscribeTopic) {
        this.subscribeTopic = subscribeTopic;
        return this;
    }
    public String getSubscribeTopic() {
        return this.subscribeTopic;
    }

    public DescribeDtsJobDetailResponseBody setSubscriptionDataType(DescribeDtsJobDetailResponseBodySubscriptionDataType subscriptionDataType) {
        this.subscriptionDataType = subscriptionDataType;
        return this;
    }
    public DescribeDtsJobDetailResponseBodySubscriptionDataType getSubscriptionDataType() {
        return this.subscriptionDataType;
    }

    public DescribeDtsJobDetailResponseBody setSubscriptionHost(DescribeDtsJobDetailResponseBodySubscriptionHost subscriptionHost) {
        this.subscriptionHost = subscriptionHost;
        return this;
    }
    public DescribeDtsJobDetailResponseBodySubscriptionHost getSubscriptionHost() {
        return this.subscriptionHost;
    }

    public DescribeDtsJobDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDtsJobDetailResponseBody setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public DescribeDtsJobDetailResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public static class DescribeDtsJobDetailResponseBodyDestinationEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobDetailResponseBodyDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodyDestinationEndpoint self = new DescribeDtsJobDetailResponseBodyDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobDetailResponseBodyMigrationMode extends TeaModel {
        @NameInMap("DataExtractTransformLoad")
        public Boolean dataExtractTransformLoad;

        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        public static DescribeDtsJobDetailResponseBodyMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodyMigrationMode self = new DescribeDtsJobDetailResponseBodyMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodyMigrationMode setDataExtractTransformLoad(Boolean dataExtractTransformLoad) {
            this.dataExtractTransformLoad = dataExtractTransformLoad;
            return this;
        }
        public Boolean getDataExtractTransformLoad() {
            return this.dataExtractTransformLoad;
        }

        public DescribeDtsJobDetailResponseBodyMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeDtsJobDetailResponseBodyMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeDtsJobDetailResponseBodyMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySourceEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobDetailResponseBodySourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySourceEndpoint self = new DescribeDtsJobDetailResponseBodySourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobDataEtlStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobDataEtlStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobDataEtlStatus self = new DescribeDtsJobDetailResponseBodySubDistributedJobDataEtlStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataEtlStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataEtlStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataEtlStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataEtlStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataEtlStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobDataInitializationStatus self = new DescribeDtsJobDetailResponseBodySubDistributedJobDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataInitializationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobDataSynchronizationStatus self = new DescribeDtsJobDetailResponseBodySubDistributedJobDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataSynchronizationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataSynchronizationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("RoleName")
        public String roleName;

        // DISABLE: 不使用 SSL, ENABLE_WITH_CERTIFICATE: 使用 SSL, 需要用户上传 CA 证书, ENABLE_ONLY_4_MONGODB_ATLAS: 使用 SSL, 但只适用于 AWS MongoDB Altas, 不需要证书, ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256: Kafka SCRAM-SHA-256 支持, 不需要证书
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint self = new DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobMigrationMode extends TeaModel {
        @NameInMap("DataExtractTransformLoad")
        public Boolean dataExtractTransformLoad;

        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobMigrationMode self = new DescribeDtsJobDetailResponseBodySubDistributedJobMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobMigrationMode setDataExtractTransformLoad(Boolean dataExtractTransformLoad) {
            this.dataExtractTransformLoad = dataExtractTransformLoad;
            return this;
        }
        public Boolean getDataExtractTransformLoad() {
            return this.dataExtractTransformLoad;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobPerformance extends TeaModel {
        // 每秒同步的流量，单位为：MB/s
        @NameInMap("Flow")
        public String flow;

        // 每秒同步的记录数
        @NameInMap("Rps")
        public String rps;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobPerformance self = new DescribeDtsJobDetailResponseBodySubDistributedJobPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobPerformance setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobPerformance setRps(String rps) {
            this.rps = rps;
            return this;
        }
        public String getRps() {
            return this.rps;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatusDetail extends TeaModel {
        // 预检查项
        @NameInMap("CheckItem")
        public String checkItem;

        // 检查项的描述
        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        // 检查结果 (NotStarted: 未启动, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Warning: 警告, Success: 完成)
        @NameInMap("CheckResult")
        public String checkResult;

        // 错误原因
        @NameInMap("FailedReason")
        public String failedReason;

        // 修复方法
        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatusDetail self = new DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatusDetail setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatusDetail setCheckItemDescription(String checkItemDescription) {
            this.checkItemDescription = checkItemDescription;
            return this;
        }
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatusDetail setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatusDetail setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatusDetail> detail;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatus self = new DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatus setDetail(java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobRetryState extends TeaModel {
        // 错误信息
        @NameInMap("ErrMsg")
        public String errMsg;

        // 任务ID
        @NameInMap("JobId")
        public String jobId;

        // 最大重试时间,单位秒
        @NameInMap("MaxRetryTime")
        public Integer maxRetryTime;

        // 模块名称 reader/store/writer/full/struct
        @NameInMap("Module")
        public String module;

        // 已重试次数
        @NameInMap("RetryCount")
        public Integer retryCount;

        // srcDB/destDB/metaDB/dstore
        @NameInMap("RetryTarget")
        public String retryTarget;

        // 已重试时间,单位秒
        @NameInMap("RetryTime")
        public Integer retryTime;

        // 是否重试中
        @NameInMap("Retrying")
        public Boolean retrying;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobRetryState build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobRetryState self = new DescribeDtsJobDetailResponseBodySubDistributedJobRetryState();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobRetryState setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobRetryState setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobRetryState setMaxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobRetryState setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobRetryState setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobRetryState setRetryTarget(String retryTarget) {
            this.retryTarget = retryTarget;
            return this;
        }
        public String getRetryTarget() {
            return this.retryTarget;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobRetryState setRetryTime(Integer retryTime) {
            this.retryTime = retryTime;
            return this;
        }
        public Integer getRetryTime() {
            return this.retryTime;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobRetryState setRetrying(Boolean retrying) {
            this.retrying = retrying;
            return this;
        }
        public Boolean getRetrying() {
            return this.retrying;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataEtlStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataEtlStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataEtlStatus self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataEtlStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataEtlStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataEtlStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataEtlStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataEtlStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataEtlStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataInitializationStatus self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataInitializationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataSynchronizationStatus self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataSynchronizationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataSynchronizationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("RoleName")
        public String roleName;

        // DISABLE: 不使用 SSL, ENABLE_WITH_CERTIFICATE: 使用 SSL, 需要用户上传 CA 证书, ENABLE_ONLY_4_MONGODB_ATLAS: 使用 SSL, 但只适用于 AWS MongoDB Altas, 不需要证书, ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256: Kafka SCRAM-SHA-256 支持, 不需要证书
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobMigrationMode extends TeaModel {
        @NameInMap("DataExtractTransformLoad")
        public Boolean dataExtractTransformLoad;

        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobMigrationMode self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobMigrationMode setDataExtractTransformLoad(Boolean dataExtractTransformLoad) {
            this.dataExtractTransformLoad = dataExtractTransformLoad;
            return this;
        }
        public Boolean getDataExtractTransformLoad() {
            return this.dataExtractTransformLoad;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPerformance extends TeaModel {
        // 每秒同步的流量，单位为：MB/s
        @NameInMap("Flow")
        public String flow;

        // 每秒同步的记录数
        @NameInMap("Rps")
        public String rps;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPerformance self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPerformance setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPerformance setRps(String rps) {
            this.rps = rps;
            return this;
        }
        public String getRps() {
            return this.rps;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatusDetail extends TeaModel {
        // 预检查项
        @NameInMap("CheckItem")
        public String checkItem;

        // 检查项的描述
        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        // 检查结果 (NotStarted: 未启动, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Warning: 警告, Success: 完成)
        @NameInMap("CheckResult")
        public String checkResult;

        // 错误原因
        @NameInMap("FailedReason")
        public String failedReason;

        // 修复方法
        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatusDetail self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatusDetail setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatusDetail setCheckItemDescription(String checkItemDescription) {
            this.checkItemDescription = checkItemDescription;
            return this;
        }
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatusDetail setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatusDetail setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatusDetail> detail;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatus self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatus setDetail(java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState extends TeaModel {
        // 错误信息
        @NameInMap("ErrMsg")
        public String errMsg;

        // 任务ID
        @NameInMap("JobId")
        public String jobId;

        // 最大重试时间,单位秒
        @NameInMap("MaxRetryTime")
        public Integer maxRetryTime;

        // 模块名称 reader/store/writer/full/struct
        @NameInMap("Module")
        public String module;

        // 已重试次数
        @NameInMap("RetryCount")
        public Integer retryCount;

        // srcDB/destDB/metaDB/dstore
        @NameInMap("RetryTarget")
        public String retryTarget;

        // 已重试时间,单位秒
        @NameInMap("RetryTime")
        public Integer retryTime;

        // 是否重试中
        @NameInMap("Retrying")
        public Boolean retrying;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState setMaxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState setRetryTarget(String retryTarget) {
            this.retryTarget = retryTarget;
            return this;
        }
        public String getRetryTarget() {
            return this.retryTarget;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState setRetryTime(Integer retryTime) {
            this.retryTime = retryTime;
            return this;
        }
        public Integer getRetryTime() {
            return this.retryTime;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState setRetrying(Boolean retrying) {
            this.retrying = retrying;
            return this;
        }
        public Boolean getRetrying() {
            return this.retrying;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("RoleName")
        public String roleName;

        // DISABLE: 不使用 SSL, ENABLE_WITH_CERTIFICATE: 使用 SSL, 需要用户上传 CA 证书, ENABLE_ONLY_4_MONGODB_ATLAS: 使用 SSL, 但只适用于 AWS MongoDB Altas, 不需要证书, ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256: Kafka SCRAM-SHA-256 支持, 不需要证书
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobStructureInitializationStatus self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobStructureInitializationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionDataType extends TeaModel {
        @NameInMap("Ddl")
        public Boolean ddl;

        @NameInMap("Dml")
        public Boolean dml;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionDataType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionDataType self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionDataType();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionDataType setDdl(Boolean ddl) {
            this.ddl = ddl;
            return this;
        }
        public Boolean getDdl() {
            return this.ddl;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionDataType setDml(Boolean dml) {
            this.dml = dml;
            return this;
        }
        public Boolean getDml() {
            return this.dml;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionHost extends TeaModel {
        @NameInMap("PrivateHost")
        public String privateHost;

        @NameInMap("PublicHost")
        public String publicHost;

        @NameInMap("VpcHost")
        public String vpcHost;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionHost self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionHost();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionHost setPrivateHost(String privateHost) {
            this.privateHost = privateHost;
            return this;
        }
        public String getPrivateHost() {
            return this.privateHost;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionHost setPublicHost(String publicHost) {
            this.publicHost = publicHost;
            return this;
        }
        public String getPublicHost() {
            return this.publicHost;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionHost setVpcHost(String vpcHost) {
            this.vpcHost = vpcHost;
            return this;
        }
        public String getVpcHost() {
            return this.vpcHost;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList extends TeaModel {
        // 用户id
        @NameInMap("AliUid")
        public Long aliUid;

        // 标签操作者
        @NameInMap("Creator")
        public Long creator;

        // 创建时间
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // 修改时间
        @NameInMap("GmtModified")
        public String gmtModified;

        // 主键
        @NameInMap("Id")
        public Long id;

        // region_id
        @NameInMap("RegionId")
        public String regionId;

        // dts instance id
        @NameInMap("ResourceId")
        public String resourceId;

        // 资源类型
        @NameInMap("ResourceType")
        public String resourceType;

        // 0为public，1为private (Public, Private, All)
        @NameInMap("Scope")
        public String scope;

        // 任务所在region，注意一般是dts的目标端region
        @NameInMap("SrcRegion")
        public String srcRegion;

        // 标签类型：系统标签－System，用户标签－Custom (Custom, System, All)
        @NameInMap("TagCategory")
        public String tagCategory;

        // 标签键tagkey
        @NameInMap("TagKey")
        public String tagKey;

        // 标签值tagvalue
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList setCreator(Long creator) {
            this.creator = creator;
            return this;
        }
        public Long getCreator() {
            return this.creator;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList setTagCategory(String tagCategory) {
            this.tagCategory = tagCategory;
            return this;
        }
        public String getTagCategory() {
            return this.tagCategory;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("BeginTimestamp")
        public String beginTimestamp;

        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        @NameInMap("ConsumptionClient")
        public String consumptionClient;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataEtlStatus")
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataEtlStatus dataEtlStatus;

        @NameInMap("DataInitializationStatus")
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DatabaseCount")
        public Integer databaseCount;

        @NameInMap("DbObject")
        public String dbObject;

        @NameInMap("Delay")
        public Long delay;

        @NameInMap("DestNetType")
        public String destNetType;

        @NameInMap("DestinationEndpoint")
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        // 请使用
        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("DtsJobName")
        public String dtsJobName;

        @NameInMap("EndTimestamp")
        public String endTimestamp;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("EtlCalculator")
        public String etlCalculator;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("IsDemoJob")
        public Boolean isDemoJob;

        // 返回结果中新增jobType字段
        @NameInMap("JobType")
        public String jobType;

        @NameInMap("MigrationMode")
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobMigrationMode migrationMode;

        // 任务来源 pts任务、dms任务 (PTS, DMS, DTS)
        @NameInMap("OriginType")
        public String originType;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Performance")
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPerformance performance;

        @NameInMap("PrecheckStatus")
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        public String reserved;

        @NameInMap("RetryState")
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState retryState;

        @NameInMap("ReverseJob")
        public Object reverseJob;

        @NameInMap("SourceEndpoint")
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        public String status;

        @NameInMap("StructureInitializationStatus")
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobStructureInitializationStatus structureInitializationStatus;

        @NameInMap("SubscribeTopic")
        public String subscribeTopic;

        @NameInMap("SubscriptionDataType")
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionDataType subscriptionDataType;

        @NameInMap("SubscriptionHost")
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionHost subscriptionHost;

        @NameInMap("SynchronizationDirection")
        public String synchronizationDirection;

        @NameInMap("TagList")
        public java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList> tagList;

        @NameInMap("TaskType")
        public String taskType;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob self = new DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setBeginTimestamp(String beginTimestamp) {
            this.beginTimestamp = beginTimestamp;
            return this;
        }
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setConsumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setConsumptionClient(String consumptionClient) {
            this.consumptionClient = consumptionClient;
            return this;
        }
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setDataEtlStatus(DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataEtlStatus dataEtlStatus) {
            this.dataEtlStatus = dataEtlStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setDataInitializationStatus(DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setDataSynchronizationStatus(DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setDatabaseCount(Integer databaseCount) {
            this.databaseCount = databaseCount;
            return this;
        }
        public Integer getDatabaseCount() {
            return this.databaseCount;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setDbObject(String dbObject) {
            this.dbObject = dbObject;
            return this;
        }
        public String getDbObject() {
            return this.dbObject;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setDestNetType(String destNetType) {
            this.destNetType = destNetType;
            return this;
        }
        public String getDestNetType() {
            return this.destNetType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setDestinationEndpoint(DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setDtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setDtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setDtsJobDirection(String dtsJobDirection) {
            this.dtsJobDirection = dtsJobDirection;
            return this;
        }
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setEndTimestamp(String endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setEtlCalculator(String etlCalculator) {
            this.etlCalculator = etlCalculator;
            return this;
        }
        public String getEtlCalculator() {
            return this.etlCalculator;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setIsDemoJob(Boolean isDemoJob) {
            this.isDemoJob = isDemoJob;
            return this;
        }
        public Boolean getIsDemoJob() {
            return this.isDemoJob;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setMigrationMode(DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setOriginType(String originType) {
            this.originType = originType;
            return this;
        }
        public String getOriginType() {
            return this.originType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setPerformance(DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPerformance getPerformance() {
            return this.performance;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setPrecheckStatus(DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setReserved(String reserved) {
            this.reserved = reserved;
            return this;
        }
        public String getReserved() {
            return this.reserved;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setRetryState(DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState retryState) {
            this.retryState = retryState;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobRetryState getRetryState() {
            return this.retryState;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setReverseJob(Object reverseJob) {
            this.reverseJob = reverseJob;
            return this;
        }
        public Object getReverseJob() {
            return this.reverseJob;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setSourceEndpoint(DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setStructureInitializationStatus(DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobStructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setSubscribeTopic(String subscribeTopic) {
            this.subscribeTopic = subscribeTopic;
            return this;
        }
        public String getSubscribeTopic() {
            return this.subscribeTopic;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setSubscriptionDataType(DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionDataType subscriptionDataType) {
            this.subscriptionDataType = subscriptionDataType;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionDataType getSubscriptionDataType() {
            return this.subscriptionDataType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setSubscriptionHost(DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionHost subscriptionHost) {
            this.subscriptionHost = subscriptionHost;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobSubscriptionHost getSubscriptionHost() {
            return this.subscriptionHost;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setSynchronizationDirection(String synchronizationDirection) {
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }
        public String getSynchronizationDirection() {
            return this.synchronizationDirection;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setTagList(java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJobReverseJobTagList> getTagList() {
            return this.tagList;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("RoleName")
        public String roleName;

        // DISABLE: 不使用 SSL, ENABLE_WITH_CERTIFICATE: 使用 SSL, 需要用户上传 CA 证书, ENABLE_ONLY_4_MONGODB_ATLAS: 使用 SSL, 但只适用于 AWS MongoDB Altas, 不需要证书, ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256: Kafka SCRAM-SHA-256 支持, 不需要证书
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint self = new DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobStructureInitializationStatus self = new DescribeDtsJobDetailResponseBodySubDistributedJobStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobStructureInitializationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionDataType extends TeaModel {
        @NameInMap("Ddl")
        public Boolean ddl;

        @NameInMap("Dml")
        public Boolean dml;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionDataType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionDataType self = new DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionDataType();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionDataType setDdl(Boolean ddl) {
            this.ddl = ddl;
            return this;
        }
        public Boolean getDdl() {
            return this.ddl;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionDataType setDml(Boolean dml) {
            this.dml = dml;
            return this;
        }
        public Boolean getDml() {
            return this.dml;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionHost extends TeaModel {
        @NameInMap("PrivateHost")
        public String privateHost;

        @NameInMap("PublicHost")
        public String publicHost;

        @NameInMap("VpcHost")
        public String vpcHost;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionHost self = new DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionHost();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionHost setPrivateHost(String privateHost) {
            this.privateHost = privateHost;
            return this;
        }
        public String getPrivateHost() {
            return this.privateHost;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionHost setPublicHost(String publicHost) {
            this.publicHost = publicHost;
            return this;
        }
        public String getPublicHost() {
            return this.publicHost;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionHost setVpcHost(String vpcHost) {
            this.vpcHost = vpcHost;
            return this;
        }
        public String getVpcHost() {
            return this.vpcHost;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJobTagList extends TeaModel {
        // 用户id
        @NameInMap("AliUid")
        public Long aliUid;

        // 标签操作者
        @NameInMap("Creator")
        public Long creator;

        // 创建时间
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // 修改时间
        @NameInMap("GmtModified")
        public String gmtModified;

        // 主键
        @NameInMap("Id")
        public Long id;

        // region_id
        @NameInMap("RegionId")
        public String regionId;

        // dts instance id
        @NameInMap("ResourceId")
        public String resourceId;

        // 资源类型
        @NameInMap("ResourceType")
        public String resourceType;

        // 0为public，1为private (Public, Private, All)
        @NameInMap("Scope")
        public String scope;

        // 任务所在region，注意一般是dts的目标端region
        @NameInMap("SrcRegion")
        public String srcRegion;

        // 标签类型：系统标签－System，用户标签－Custom (Custom, System, All)
        @NameInMap("TagCategory")
        public String tagCategory;

        // 标签键tagkey
        @NameInMap("TagKey")
        public String tagKey;

        // 标签值tagvalue
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDtsJobDetailResponseBodySubDistributedJobTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJobTagList self = new DescribeDtsJobDetailResponseBodySubDistributedJobTagList();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobTagList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobTagList setCreator(Long creator) {
            this.creator = creator;
            return this;
        }
        public Long getCreator() {
            return this.creator;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobTagList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobTagList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobTagList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobTagList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobTagList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobTagList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobTagList setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobTagList setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobTagList setTagCategory(String tagCategory) {
            this.tagCategory = tagCategory;
            return this;
        }
        public String getTagCategory() {
            return this.tagCategory;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJobTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubDistributedJob extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("BeginTimestamp")
        public String beginTimestamp;

        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        @NameInMap("ConsumptionClient")
        public String consumptionClient;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataEtlStatus")
        public DescribeDtsJobDetailResponseBodySubDistributedJobDataEtlStatus dataEtlStatus;

        @NameInMap("DataInitializationStatus")
        public DescribeDtsJobDetailResponseBodySubDistributedJobDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        public DescribeDtsJobDetailResponseBodySubDistributedJobDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DatabaseCount")
        public Integer databaseCount;

        @NameInMap("DbObject")
        public String dbObject;

        @NameInMap("Delay")
        public Long delay;

        @NameInMap("DestNetType")
        public String destNetType;

        @NameInMap("DestinationEndpoint")
        public DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        // 请使用
        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("DtsJobName")
        public String dtsJobName;

        @NameInMap("EndTimestamp")
        public String endTimestamp;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("EtlCalculator")
        public String etlCalculator;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("IsDemoJob")
        public Boolean isDemoJob;

        // 返回结果中新增jobType字段
        @NameInMap("JobType")
        public String jobType;

        @NameInMap("MigrationMode")
        public DescribeDtsJobDetailResponseBodySubDistributedJobMigrationMode migrationMode;

        // 任务来源 pts任务、dms任务 (PTS, DMS, DTS)
        @NameInMap("OriginType")
        public String originType;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Performance")
        public DescribeDtsJobDetailResponseBodySubDistributedJobPerformance performance;

        @NameInMap("PrecheckStatus")
        public DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        public String reserved;

        @NameInMap("RetryState")
        public DescribeDtsJobDetailResponseBodySubDistributedJobRetryState retryState;

        @NameInMap("ReverseJob")
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob reverseJob;

        @NameInMap("SourceEndpoint")
        public DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        public String status;

        @NameInMap("StructureInitializationStatus")
        public DescribeDtsJobDetailResponseBodySubDistributedJobStructureInitializationStatus structureInitializationStatus;

        @NameInMap("SubSyncJob")
        public java.util.List<?> subSyncJob;

        @NameInMap("SubscribeTopic")
        public String subscribeTopic;

        @NameInMap("SubscriptionDataType")
        public DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionDataType subscriptionDataType;

        @NameInMap("SubscriptionHost")
        public DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionHost subscriptionHost;

        @NameInMap("SynchronizationDirection")
        public String synchronizationDirection;

        @NameInMap("TagList")
        public java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJobTagList> tagList;

        @NameInMap("TaskType")
        public String taskType;

        public static DescribeDtsJobDetailResponseBodySubDistributedJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubDistributedJob self = new DescribeDtsJobDetailResponseBodySubDistributedJob();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setBeginTimestamp(String beginTimestamp) {
            this.beginTimestamp = beginTimestamp;
            return this;
        }
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setConsumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setConsumptionClient(String consumptionClient) {
            this.consumptionClient = consumptionClient;
            return this;
        }
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setDataEtlStatus(DescribeDtsJobDetailResponseBodySubDistributedJobDataEtlStatus dataEtlStatus) {
            this.dataEtlStatus = dataEtlStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobDataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setDataInitializationStatus(DescribeDtsJobDetailResponseBodySubDistributedJobDataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setDataSynchronizationStatus(DescribeDtsJobDetailResponseBodySubDistributedJobDataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setDatabaseCount(Integer databaseCount) {
            this.databaseCount = databaseCount;
            return this;
        }
        public Integer getDatabaseCount() {
            return this.databaseCount;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setDbObject(String dbObject) {
            this.dbObject = dbObject;
            return this;
        }
        public String getDbObject() {
            return this.dbObject;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setDestNetType(String destNetType) {
            this.destNetType = destNetType;
            return this;
        }
        public String getDestNetType() {
            return this.destNetType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setDestinationEndpoint(DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setDtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setDtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setDtsJobDirection(String dtsJobDirection) {
            this.dtsJobDirection = dtsJobDirection;
            return this;
        }
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setEndTimestamp(String endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setEtlCalculator(String etlCalculator) {
            this.etlCalculator = etlCalculator;
            return this;
        }
        public String getEtlCalculator() {
            return this.etlCalculator;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setIsDemoJob(Boolean isDemoJob) {
            this.isDemoJob = isDemoJob;
            return this;
        }
        public Boolean getIsDemoJob() {
            return this.isDemoJob;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setMigrationMode(DescribeDtsJobDetailResponseBodySubDistributedJobMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setOriginType(String originType) {
            this.originType = originType;
            return this;
        }
        public String getOriginType() {
            return this.originType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setPerformance(DescribeDtsJobDetailResponseBodySubDistributedJobPerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobPerformance getPerformance() {
            return this.performance;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setPrecheckStatus(DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setReserved(String reserved) {
            this.reserved = reserved;
            return this;
        }
        public String getReserved() {
            return this.reserved;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setRetryState(DescribeDtsJobDetailResponseBodySubDistributedJobRetryState retryState) {
            this.retryState = retryState;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobRetryState getRetryState() {
            return this.retryState;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setReverseJob(DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob reverseJob) {
            this.reverseJob = reverseJob;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobReverseJob getReverseJob() {
            return this.reverseJob;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setSourceEndpoint(DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setStructureInitializationStatus(DescribeDtsJobDetailResponseBodySubDistributedJobStructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setSubSyncJob(java.util.List<?> subSyncJob) {
            this.subSyncJob = subSyncJob;
            return this;
        }
        public java.util.List<?> getSubSyncJob() {
            return this.subSyncJob;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setSubscribeTopic(String subscribeTopic) {
            this.subscribeTopic = subscribeTopic;
            return this;
        }
        public String getSubscribeTopic() {
            return this.subscribeTopic;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setSubscriptionDataType(DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionDataType subscriptionDataType) {
            this.subscriptionDataType = subscriptionDataType;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionDataType getSubscriptionDataType() {
            return this.subscriptionDataType;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setSubscriptionHost(DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionHost subscriptionHost) {
            this.subscriptionHost = subscriptionHost;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubDistributedJobSubscriptionHost getSubscriptionHost() {
            return this.subscriptionHost;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setSynchronizationDirection(String synchronizationDirection) {
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }
        public String getSynchronizationDirection() {
            return this.synchronizationDirection;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setTagList(java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJobTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeDtsJobDetailResponseBodySubDistributedJobTagList> getTagList() {
            return this.tagList;
        }

        public DescribeDtsJobDetailResponseBodySubDistributedJob setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobDataEtlStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubSyncJobDataEtlStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobDataEtlStatus self = new DescribeDtsJobDetailResponseBodySubSyncJobDataEtlStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataEtlStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataEtlStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataEtlStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataEtlStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataEtlStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubSyncJobDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobDataInitializationStatus self = new DescribeDtsJobDetailResponseBodySubSyncJobDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataInitializationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubSyncJobDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobDataSynchronizationStatus self = new DescribeDtsJobDetailResponseBodySubSyncJobDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataSynchronizationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataSynchronizationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("RoleName")
        public String roleName;

        // DISABLE: 不使用 SSL, ENABLE_WITH_CERTIFICATE: 使用 SSL, 需要用户上传 CA 证书, ENABLE_ONLY_4_MONGODB_ATLAS: 使用 SSL, 但只适用于 AWS MongoDB Altas, 不需要证书, ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256: Kafka SCRAM-SHA-256 支持, 不需要证书
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint self = new DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobMigrationMode extends TeaModel {
        @NameInMap("DataExtractTransformLoad")
        public Boolean dataExtractTransformLoad;

        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        public static DescribeDtsJobDetailResponseBodySubSyncJobMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobMigrationMode self = new DescribeDtsJobDetailResponseBodySubSyncJobMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobMigrationMode setDataExtractTransformLoad(Boolean dataExtractTransformLoad) {
            this.dataExtractTransformLoad = dataExtractTransformLoad;
            return this;
        }
        public Boolean getDataExtractTransformLoad() {
            return this.dataExtractTransformLoad;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobPerformance extends TeaModel {
        // 每秒同步的流量，单位为：MB/s
        @NameInMap("Flow")
        public String flow;

        // 每秒同步的记录数
        @NameInMap("Rps")
        public String rps;

        public static DescribeDtsJobDetailResponseBodySubSyncJobPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobPerformance self = new DescribeDtsJobDetailResponseBodySubSyncJobPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobPerformance setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobPerformance setRps(String rps) {
            this.rps = rps;
            return this;
        }
        public String getRps() {
            return this.rps;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatusDetail extends TeaModel {
        // 预检查项
        @NameInMap("CheckItem")
        public String checkItem;

        // 检查项的描述
        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        // 检查结果 (NotStarted: 未启动, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Warning: 警告, Success: 完成)
        @NameInMap("CheckResult")
        public String checkResult;

        // 错误原因
        @NameInMap("FailedReason")
        public String failedReason;

        // 修复方法
        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatusDetail self = new DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatusDetail setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatusDetail setCheckItemDescription(String checkItemDescription) {
            this.checkItemDescription = checkItemDescription;
            return this;
        }
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatusDetail setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatusDetail setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatusDetail> detail;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatus self = new DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatus setDetail(java.util.List<DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobRetryState extends TeaModel {
        // 错误信息
        @NameInMap("ErrMsg")
        public String errMsg;

        // 任务ID
        @NameInMap("JobId")
        public String jobId;

        // 最大重试时间,单位秒
        @NameInMap("MaxRetryTime")
        public Integer maxRetryTime;

        // 模块名称 reader/store/writer/full/struct
        @NameInMap("Module")
        public String module;

        // 已重试次数
        @NameInMap("RetryCount")
        public Integer retryCount;

        // srcDB/destDB/metaDB/dstore
        @NameInMap("RetryTarget")
        public String retryTarget;

        // 已重试时间,单位秒
        @NameInMap("RetryTime")
        public Integer retryTime;

        // 是否重试中
        @NameInMap("Retrying")
        public Boolean retrying;

        public static DescribeDtsJobDetailResponseBodySubSyncJobRetryState build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobRetryState self = new DescribeDtsJobDetailResponseBodySubSyncJobRetryState();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobRetryState setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobRetryState setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobRetryState setMaxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobRetryState setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobRetryState setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobRetryState setRetryTarget(String retryTarget) {
            this.retryTarget = retryTarget;
            return this;
        }
        public String getRetryTarget() {
            return this.retryTarget;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobRetryState setRetryTime(Integer retryTime) {
            this.retryTime = retryTime;
            return this;
        }
        public Integer getRetryTime() {
            return this.retryTime;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobRetryState setRetrying(Boolean retrying) {
            this.retrying = retrying;
            return this;
        }
        public Boolean getRetrying() {
            return this.retrying;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataEtlStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataEtlStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataEtlStatus self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataEtlStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataEtlStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataEtlStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataEtlStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataEtlStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataEtlStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataInitializationStatus self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataInitializationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataSynchronizationStatus self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataSynchronizationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataSynchronizationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("RoleName")
        public String roleName;

        // DISABLE: 不使用 SSL, ENABLE_WITH_CERTIFICATE: 使用 SSL, 需要用户上传 CA 证书, ENABLE_ONLY_4_MONGODB_ATLAS: 使用 SSL, 但只适用于 AWS MongoDB Altas, 不需要证书, ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256: Kafka SCRAM-SHA-256 支持, 不需要证书
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJobMigrationMode extends TeaModel {
        @NameInMap("DataExtractTransformLoad")
        public Boolean dataExtractTransformLoad;

        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJobMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJobMigrationMode self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJobMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobMigrationMode setDataExtractTransformLoad(Boolean dataExtractTransformLoad) {
            this.dataExtractTransformLoad = dataExtractTransformLoad;
            return this;
        }
        public Boolean getDataExtractTransformLoad() {
            return this.dataExtractTransformLoad;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPerformance extends TeaModel {
        // 每秒同步的流量，单位为：MB/s
        @NameInMap("Flow")
        public String flow;

        // 每秒同步的记录数
        @NameInMap("Rps")
        public String rps;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPerformance self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPerformance setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPerformance setRps(String rps) {
            this.rps = rps;
            return this;
        }
        public String getRps() {
            return this.rps;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatusDetail extends TeaModel {
        // 预检查项
        @NameInMap("CheckItem")
        public String checkItem;

        // 检查项的描述
        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        // 检查结果 (NotStarted: 未启动, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Warning: 警告, Success: 完成)
        @NameInMap("CheckResult")
        public String checkResult;

        // 错误原因
        @NameInMap("FailedReason")
        public String failedReason;

        // 修复方法
        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatusDetail self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatusDetail setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatusDetail setCheckItemDescription(String checkItemDescription) {
            this.checkItemDescription = checkItemDescription;
            return this;
        }
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatusDetail setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatusDetail setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatusDetail> detail;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatus self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatus setDetail(java.util.List<DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState extends TeaModel {
        // 错误信息
        @NameInMap("ErrMsg")
        public String errMsg;

        // 任务ID
        @NameInMap("JobId")
        public String jobId;

        // 最大重试时间,单位秒
        @NameInMap("MaxRetryTime")
        public Integer maxRetryTime;

        // 模块名称 reader/store/writer/full/struct
        @NameInMap("Module")
        public String module;

        // 已重试次数
        @NameInMap("RetryCount")
        public Integer retryCount;

        // srcDB/destDB/metaDB/dstore
        @NameInMap("RetryTarget")
        public String retryTarget;

        // 已重试时间,单位秒
        @NameInMap("RetryTime")
        public Integer retryTime;

        // 是否重试中
        @NameInMap("Retrying")
        public Boolean retrying;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState setMaxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState setRetryTarget(String retryTarget) {
            this.retryTarget = retryTarget;
            return this;
        }
        public String getRetryTarget() {
            return this.retryTarget;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState setRetryTime(Integer retryTime) {
            this.retryTime = retryTime;
            return this;
        }
        public Integer getRetryTime() {
            return this.retryTime;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState setRetrying(Boolean retrying) {
            this.retrying = retrying;
            return this;
        }
        public Boolean getRetrying() {
            return this.retrying;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("RoleName")
        public String roleName;

        // DISABLE: 不使用 SSL, ENABLE_WITH_CERTIFICATE: 使用 SSL, 需要用户上传 CA 证书, ENABLE_ONLY_4_MONGODB_ATLAS: 使用 SSL, 但只适用于 AWS MongoDB Altas, 不需要证书, ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256: Kafka SCRAM-SHA-256 支持, 不需要证书
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJobStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJobStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJobStructureInitializationStatus self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJobStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobStructureInitializationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionDataType extends TeaModel {
        @NameInMap("Ddl")
        public Boolean ddl;

        @NameInMap("Dml")
        public Boolean dml;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionDataType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionDataType self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionDataType();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionDataType setDdl(Boolean ddl) {
            this.ddl = ddl;
            return this;
        }
        public Boolean getDdl() {
            return this.ddl;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionDataType setDml(Boolean dml) {
            this.dml = dml;
            return this;
        }
        public Boolean getDml() {
            return this.dml;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionHost extends TeaModel {
        @NameInMap("PrivateHost")
        public String privateHost;

        @NameInMap("PublicHost")
        public String publicHost;

        @NameInMap("VpcHost")
        public String vpcHost;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionHost self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionHost();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionHost setPrivateHost(String privateHost) {
            this.privateHost = privateHost;
            return this;
        }
        public String getPrivateHost() {
            return this.privateHost;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionHost setPublicHost(String publicHost) {
            this.publicHost = publicHost;
            return this;
        }
        public String getPublicHost() {
            return this.publicHost;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionHost setVpcHost(String vpcHost) {
            this.vpcHost = vpcHost;
            return this;
        }
        public String getVpcHost() {
            return this.vpcHost;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList extends TeaModel {
        // 用户id
        @NameInMap("AliUid")
        public Long aliUid;

        // 标签操作者
        @NameInMap("Creator")
        public Long creator;

        // 创建时间
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // 修改时间
        @NameInMap("GmtModified")
        public String gmtModified;

        // 主键
        @NameInMap("Id")
        public Long id;

        // region_id
        @NameInMap("RegionId")
        public String regionId;

        // dts instance id
        @NameInMap("ResourceId")
        public String resourceId;

        // 资源类型
        @NameInMap("ResourceType")
        public String resourceType;

        // 0为public，1为private (Public, Private, All)
        @NameInMap("Scope")
        public String scope;

        // 任务所在region，注意一般是dts的目标端region
        @NameInMap("SrcRegion")
        public String srcRegion;

        // 标签类型：系统标签－System，用户标签－Custom (Custom, System, All)
        @NameInMap("TagCategory")
        public String tagCategory;

        // 标签键tagkey
        @NameInMap("TagKey")
        public String tagKey;

        // 标签值tagvalue
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList setCreator(Long creator) {
            this.creator = creator;
            return this;
        }
        public Long getCreator() {
            return this.creator;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList setTagCategory(String tagCategory) {
            this.tagCategory = tagCategory;
            return this;
        }
        public String getTagCategory() {
            return this.tagCategory;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobReverseJob extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("BeginTimestamp")
        public String beginTimestamp;

        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        @NameInMap("ConsumptionClient")
        public String consumptionClient;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataEtlStatus")
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataEtlStatus dataEtlStatus;

        @NameInMap("DataInitializationStatus")
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DatabaseCount")
        public Integer databaseCount;

        @NameInMap("DbObject")
        public String dbObject;

        @NameInMap("Delay")
        public Long delay;

        @NameInMap("DestNetType")
        public String destNetType;

        @NameInMap("DestinationEndpoint")
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        // 请使用
        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("DtsJobName")
        public String dtsJobName;

        @NameInMap("EndTimestamp")
        public String endTimestamp;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("EtlCalculator")
        public String etlCalculator;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("IsDemoJob")
        public Boolean isDemoJob;

        // 返回结果中新增jobType字段
        @NameInMap("JobType")
        public String jobType;

        @NameInMap("MigrationMode")
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobMigrationMode migrationMode;

        // 任务来源 pts任务、dms任务 (PTS, DMS, DTS)
        @NameInMap("OriginType")
        public String originType;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Performance")
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPerformance performance;

        @NameInMap("PrecheckStatus")
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        public String reserved;

        @NameInMap("RetryState")
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState retryState;

        @NameInMap("ReverseJob")
        public Object reverseJob;

        @NameInMap("SourceEndpoint")
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        public String status;

        @NameInMap("StructureInitializationStatus")
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobStructureInitializationStatus structureInitializationStatus;

        @NameInMap("SubscribeTopic")
        public String subscribeTopic;

        @NameInMap("SubscriptionDataType")
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionDataType subscriptionDataType;

        @NameInMap("SubscriptionHost")
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionHost subscriptionHost;

        @NameInMap("SynchronizationDirection")
        public String synchronizationDirection;

        @NameInMap("TagList")
        public java.util.List<DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList> tagList;

        @NameInMap("TaskType")
        public String taskType;

        public static DescribeDtsJobDetailResponseBodySubSyncJobReverseJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobReverseJob self = new DescribeDtsJobDetailResponseBodySubSyncJobReverseJob();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setBeginTimestamp(String beginTimestamp) {
            this.beginTimestamp = beginTimestamp;
            return this;
        }
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setConsumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setConsumptionClient(String consumptionClient) {
            this.consumptionClient = consumptionClient;
            return this;
        }
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setDataEtlStatus(DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataEtlStatus dataEtlStatus) {
            this.dataEtlStatus = dataEtlStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setDataInitializationStatus(DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setDataSynchronizationStatus(DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setDatabaseCount(Integer databaseCount) {
            this.databaseCount = databaseCount;
            return this;
        }
        public Integer getDatabaseCount() {
            return this.databaseCount;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setDbObject(String dbObject) {
            this.dbObject = dbObject;
            return this;
        }
        public String getDbObject() {
            return this.dbObject;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setDestNetType(String destNetType) {
            this.destNetType = destNetType;
            return this;
        }
        public String getDestNetType() {
            return this.destNetType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setDestinationEndpoint(DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setDtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setDtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setDtsJobDirection(String dtsJobDirection) {
            this.dtsJobDirection = dtsJobDirection;
            return this;
        }
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setEndTimestamp(String endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setEtlCalculator(String etlCalculator) {
            this.etlCalculator = etlCalculator;
            return this;
        }
        public String getEtlCalculator() {
            return this.etlCalculator;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setIsDemoJob(Boolean isDemoJob) {
            this.isDemoJob = isDemoJob;
            return this;
        }
        public Boolean getIsDemoJob() {
            return this.isDemoJob;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setMigrationMode(DescribeDtsJobDetailResponseBodySubSyncJobReverseJobMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setOriginType(String originType) {
            this.originType = originType;
            return this;
        }
        public String getOriginType() {
            return this.originType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setPerformance(DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPerformance getPerformance() {
            return this.performance;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setPrecheckStatus(DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setReserved(String reserved) {
            this.reserved = reserved;
            return this;
        }
        public String getReserved() {
            return this.reserved;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setRetryState(DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState retryState) {
            this.retryState = retryState;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobRetryState getRetryState() {
            return this.retryState;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setReverseJob(Object reverseJob) {
            this.reverseJob = reverseJob;
            return this;
        }
        public Object getReverseJob() {
            return this.reverseJob;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setSourceEndpoint(DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setStructureInitializationStatus(DescribeDtsJobDetailResponseBodySubSyncJobReverseJobStructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setSubscribeTopic(String subscribeTopic) {
            this.subscribeTopic = subscribeTopic;
            return this;
        }
        public String getSubscribeTopic() {
            return this.subscribeTopic;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setSubscriptionDataType(DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionDataType subscriptionDataType) {
            this.subscriptionDataType = subscriptionDataType;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionDataType getSubscriptionDataType() {
            return this.subscriptionDataType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setSubscriptionHost(DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionHost subscriptionHost) {
            this.subscriptionHost = subscriptionHost;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJobSubscriptionHost getSubscriptionHost() {
            return this.subscriptionHost;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setSynchronizationDirection(String synchronizationDirection) {
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }
        public String getSynchronizationDirection() {
            return this.synchronizationDirection;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setTagList(java.util.List<DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeDtsJobDetailResponseBodySubSyncJobReverseJobTagList> getTagList() {
            return this.tagList;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("RoleName")
        public String roleName;

        // DISABLE: 不使用 SSL, ENABLE_WITH_CERTIFICATE: 使用 SSL, 需要用户上传 CA 证书, ENABLE_ONLY_4_MONGODB_ATLAS: 使用 SSL, 但只适用于 AWS MongoDB Altas, 不需要证书, ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256: Kafka SCRAM-SHA-256 支持, 不需要证书
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint self = new DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 是否显示提升升级规格
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        // 迁移进度
        @NameInMap("Percent")
        public String percent;

        // 已经完成迁移的表数量
        @NameInMap("Progress")
        public String progress;

        // NotStarted: 未启动, Suspending: 暂停中, Checking: 检查中, Migrating: 迁移中, Failed: 失败, Catched: 同步中 ｜ 增量迁移中, Finished: 完成
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobDetailResponseBodySubSyncJobStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobStructureInitializationStatus self = new DescribeDtsJobDetailResponseBodySubSyncJobStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobStructureInitializationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionDataType extends TeaModel {
        @NameInMap("Ddl")
        public Boolean ddl;

        @NameInMap("Dml")
        public Boolean dml;

        public static DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionDataType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionDataType self = new DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionDataType();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionDataType setDdl(Boolean ddl) {
            this.ddl = ddl;
            return this;
        }
        public Boolean getDdl() {
            return this.ddl;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionDataType setDml(Boolean dml) {
            this.dml = dml;
            return this;
        }
        public Boolean getDml() {
            return this.dml;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionHost extends TeaModel {
        @NameInMap("PrivateHost")
        public String privateHost;

        @NameInMap("PublicHost")
        public String publicHost;

        @NameInMap("VpcHost")
        public String vpcHost;

        public static DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionHost self = new DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionHost();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionHost setPrivateHost(String privateHost) {
            this.privateHost = privateHost;
            return this;
        }
        public String getPrivateHost() {
            return this.privateHost;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionHost setPublicHost(String publicHost) {
            this.publicHost = publicHost;
            return this;
        }
        public String getPublicHost() {
            return this.publicHost;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionHost setVpcHost(String vpcHost) {
            this.vpcHost = vpcHost;
            return this;
        }
        public String getVpcHost() {
            return this.vpcHost;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJobTagList extends TeaModel {
        // 用户id
        @NameInMap("AliUid")
        public Long aliUid;

        // 标签操作者
        @NameInMap("Creator")
        public Long creator;

        // 创建时间
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // 修改时间
        @NameInMap("GmtModified")
        public String gmtModified;

        // 主键
        @NameInMap("Id")
        public Long id;

        // region_id
        @NameInMap("RegionId")
        public String regionId;

        // dts instance id
        @NameInMap("ResourceId")
        public String resourceId;

        // 资源类型
        @NameInMap("ResourceType")
        public String resourceType;

        // 0为public，1为private (Public, Private, All)
        @NameInMap("Scope")
        public String scope;

        // 任务所在region，注意一般是dts的目标端region
        @NameInMap("SrcRegion")
        public String srcRegion;

        // 标签类型：系统标签－System，用户标签－Custom (Custom, System, All)
        @NameInMap("TagCategory")
        public String tagCategory;

        // 标签键tagkey
        @NameInMap("TagKey")
        public String tagKey;

        // 标签值tagvalue
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDtsJobDetailResponseBodySubSyncJobTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJobTagList self = new DescribeDtsJobDetailResponseBodySubSyncJobTagList();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobTagList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobTagList setCreator(Long creator) {
            this.creator = creator;
            return this;
        }
        public Long getCreator() {
            return this.creator;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobTagList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobTagList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobTagList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobTagList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobTagList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobTagList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobTagList setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobTagList setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobTagList setTagCategory(String tagCategory) {
            this.tagCategory = tagCategory;
            return this;
        }
        public String getTagCategory() {
            return this.tagCategory;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJobTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubSyncJob extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("BeginTimestamp")
        public String beginTimestamp;

        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        @NameInMap("ConsumptionClient")
        public String consumptionClient;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataEtlStatus")
        public DescribeDtsJobDetailResponseBodySubSyncJobDataEtlStatus dataEtlStatus;

        @NameInMap("DataInitializationStatus")
        public DescribeDtsJobDetailResponseBodySubSyncJobDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        public DescribeDtsJobDetailResponseBodySubSyncJobDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DatabaseCount")
        public Integer databaseCount;

        @NameInMap("DbObject")
        public String dbObject;

        @NameInMap("Delay")
        public Long delay;

        @NameInMap("DestNetType")
        public String destNetType;

        @NameInMap("DestinationEndpoint")
        public DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        // 请使用
        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("DtsJobName")
        public String dtsJobName;

        @NameInMap("EndTimestamp")
        public String endTimestamp;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("EtlCalculator")
        public String etlCalculator;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("IsDemoJob")
        public Boolean isDemoJob;

        // 返回结果中新增jobType字段
        @NameInMap("JobType")
        public String jobType;

        @NameInMap("MigrationMode")
        public DescribeDtsJobDetailResponseBodySubSyncJobMigrationMode migrationMode;

        // 任务来源 pts任务、dms任务 (PTS, DMS, DTS)
        @NameInMap("OriginType")
        public String originType;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Performance")
        public DescribeDtsJobDetailResponseBodySubSyncJobPerformance performance;

        @NameInMap("PrecheckStatus")
        public DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        public String reserved;

        @NameInMap("RetryState")
        public DescribeDtsJobDetailResponseBodySubSyncJobRetryState retryState;

        @NameInMap("ReverseJob")
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob reverseJob;

        @NameInMap("SourceEndpoint")
        public DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        public String status;

        @NameInMap("StructureInitializationStatus")
        public DescribeDtsJobDetailResponseBodySubSyncJobStructureInitializationStatus structureInitializationStatus;

        @NameInMap("SubSyncJob")
        public java.util.List<?> subSyncJob;

        @NameInMap("SubscribeTopic")
        public String subscribeTopic;

        @NameInMap("SubscriptionDataType")
        public DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionDataType subscriptionDataType;

        @NameInMap("SubscriptionHost")
        public DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionHost subscriptionHost;

        @NameInMap("SynchronizationDirection")
        public String synchronizationDirection;

        @NameInMap("TagList")
        public java.util.List<DescribeDtsJobDetailResponseBodySubSyncJobTagList> tagList;

        @NameInMap("TaskType")
        public String taskType;

        public static DescribeDtsJobDetailResponseBodySubSyncJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubSyncJob self = new DescribeDtsJobDetailResponseBodySubSyncJob();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setBeginTimestamp(String beginTimestamp) {
            this.beginTimestamp = beginTimestamp;
            return this;
        }
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setConsumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setConsumptionClient(String consumptionClient) {
            this.consumptionClient = consumptionClient;
            return this;
        }
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setDataEtlStatus(DescribeDtsJobDetailResponseBodySubSyncJobDataEtlStatus dataEtlStatus) {
            this.dataEtlStatus = dataEtlStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobDataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setDataInitializationStatus(DescribeDtsJobDetailResponseBodySubSyncJobDataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setDataSynchronizationStatus(DescribeDtsJobDetailResponseBodySubSyncJobDataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setDatabaseCount(Integer databaseCount) {
            this.databaseCount = databaseCount;
            return this;
        }
        public Integer getDatabaseCount() {
            return this.databaseCount;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setDbObject(String dbObject) {
            this.dbObject = dbObject;
            return this;
        }
        public String getDbObject() {
            return this.dbObject;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setDestNetType(String destNetType) {
            this.destNetType = destNetType;
            return this;
        }
        public String getDestNetType() {
            return this.destNetType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setDestinationEndpoint(DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setDtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setDtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setDtsJobDirection(String dtsJobDirection) {
            this.dtsJobDirection = dtsJobDirection;
            return this;
        }
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setEndTimestamp(String endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setEtlCalculator(String etlCalculator) {
            this.etlCalculator = etlCalculator;
            return this;
        }
        public String getEtlCalculator() {
            return this.etlCalculator;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setIsDemoJob(Boolean isDemoJob) {
            this.isDemoJob = isDemoJob;
            return this;
        }
        public Boolean getIsDemoJob() {
            return this.isDemoJob;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setMigrationMode(DescribeDtsJobDetailResponseBodySubSyncJobMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setOriginType(String originType) {
            this.originType = originType;
            return this;
        }
        public String getOriginType() {
            return this.originType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setPerformance(DescribeDtsJobDetailResponseBodySubSyncJobPerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobPerformance getPerformance() {
            return this.performance;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setPrecheckStatus(DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setReserved(String reserved) {
            this.reserved = reserved;
            return this;
        }
        public String getReserved() {
            return this.reserved;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setRetryState(DescribeDtsJobDetailResponseBodySubSyncJobRetryState retryState) {
            this.retryState = retryState;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobRetryState getRetryState() {
            return this.retryState;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setReverseJob(DescribeDtsJobDetailResponseBodySubSyncJobReverseJob reverseJob) {
            this.reverseJob = reverseJob;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobReverseJob getReverseJob() {
            return this.reverseJob;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setSourceEndpoint(DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setStructureInitializationStatus(DescribeDtsJobDetailResponseBodySubSyncJobStructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setSubSyncJob(java.util.List<?> subSyncJob) {
            this.subSyncJob = subSyncJob;
            return this;
        }
        public java.util.List<?> getSubSyncJob() {
            return this.subSyncJob;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setSubscribeTopic(String subscribeTopic) {
            this.subscribeTopic = subscribeTopic;
            return this;
        }
        public String getSubscribeTopic() {
            return this.subscribeTopic;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setSubscriptionDataType(DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionDataType subscriptionDataType) {
            this.subscriptionDataType = subscriptionDataType;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionDataType getSubscriptionDataType() {
            return this.subscriptionDataType;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setSubscriptionHost(DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionHost subscriptionHost) {
            this.subscriptionHost = subscriptionHost;
            return this;
        }
        public DescribeDtsJobDetailResponseBodySubSyncJobSubscriptionHost getSubscriptionHost() {
            return this.subscriptionHost;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setSynchronizationDirection(String synchronizationDirection) {
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }
        public String getSynchronizationDirection() {
            return this.synchronizationDirection;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setTagList(java.util.List<DescribeDtsJobDetailResponseBodySubSyncJobTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeDtsJobDetailResponseBodySubSyncJobTagList> getTagList() {
            return this.tagList;
        }

        public DescribeDtsJobDetailResponseBodySubSyncJob setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubscriptionDataType extends TeaModel {
        @NameInMap("Ddl")
        public Boolean ddl;

        @NameInMap("Dml")
        public Boolean dml;

        public static DescribeDtsJobDetailResponseBodySubscriptionDataType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubscriptionDataType self = new DescribeDtsJobDetailResponseBodySubscriptionDataType();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubscriptionDataType setDdl(Boolean ddl) {
            this.ddl = ddl;
            return this;
        }
        public Boolean getDdl() {
            return this.ddl;
        }

        public DescribeDtsJobDetailResponseBodySubscriptionDataType setDml(Boolean dml) {
            this.dml = dml;
            return this;
        }
        public Boolean getDml() {
            return this.dml;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubscriptionHost extends TeaModel {
        @NameInMap("PrivateHost")
        public String privateHost;

        @NameInMap("PublicHost")
        public String publicHost;

        @NameInMap("VpcHost")
        public String vpcHost;

        public static DescribeDtsJobDetailResponseBodySubscriptionHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubscriptionHost self = new DescribeDtsJobDetailResponseBodySubscriptionHost();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubscriptionHost setPrivateHost(String privateHost) {
            this.privateHost = privateHost;
            return this;
        }
        public String getPrivateHost() {
            return this.privateHost;
        }

        public DescribeDtsJobDetailResponseBodySubscriptionHost setPublicHost(String publicHost) {
            this.publicHost = publicHost;
            return this;
        }
        public String getPublicHost() {
            return this.publicHost;
        }

        public DescribeDtsJobDetailResponseBodySubscriptionHost setVpcHost(String vpcHost) {
            this.vpcHost = vpcHost;
            return this;
        }
        public String getVpcHost() {
            return this.vpcHost;
        }

    }

}
