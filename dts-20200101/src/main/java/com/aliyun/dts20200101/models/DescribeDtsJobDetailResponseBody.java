// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobDetailResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("DtsJobName")
    public String dtsJobName;

    @NameInMap("FinishTime")
    public String finishTime;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Reserved")
    public String reserved;

    @NameInMap("DatabaseCount")
    public Integer databaseCount;

    @NameInMap("DtsJobClass")
    public String dtsJobClass;

    @NameInMap("EndTimestamp")
    public String endTimestamp;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("DestNetType")
    public String destNetType;

    @NameInMap("SubscribeTopic")
    public String subscribeTopic;

    @NameInMap("DtsInstanceID")
    public String dtsInstanceID;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Checkpoint")
    public Integer checkpoint;

    @NameInMap("Delay")
    public Integer delay;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("ConsumptionClient")
    public String consumptionClient;

    @NameInMap("DbObject")
    public String dbObject;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ConsumptionCheckpoint")
    public String consumptionCheckpoint;

    @NameInMap("EtlCalculator")
    public String etlCalculator;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("BeginTimestamp")
    public String beginTimestamp;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("DtsJobDirection")
    public String dtsJobDirection;

    @NameInMap("SourceEndpoint")
    public DescribeDtsJobDetailResponseBodySourceEndpoint sourceEndpoint;

    @NameInMap("DestinationEndpoint")
    public DescribeDtsJobDetailResponseBodyDestinationEndpoint destinationEndpoint;

    @NameInMap("MigrationMode")
    public DescribeDtsJobDetailResponseBodyMigrationMode migrationMode;

    @NameInMap("SubscriptionHost")
    public DescribeDtsJobDetailResponseBodySubscriptionHost subscriptionHost;

    @NameInMap("SubscriptionDataType")
    public DescribeDtsJobDetailResponseBodySubscriptionDataType subscriptionDataType;

    public static DescribeDtsJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobDetailResponseBody self = new DescribeDtsJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobDetailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDtsJobDetailResponseBody setDtsJobName(String dtsJobName) {
        this.dtsJobName = dtsJobName;
        return this;
    }
    public String getDtsJobName() {
        return this.dtsJobName;
    }

    public DescribeDtsJobDetailResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public DescribeDtsJobDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeDtsJobDetailResponseBody setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDtsJobDetailResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDtsJobDetailResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDtsJobDetailResponseBody setReserved(String reserved) {
        this.reserved = reserved;
        return this;
    }
    public String getReserved() {
        return this.reserved;
    }

    public DescribeDtsJobDetailResponseBody setDatabaseCount(Integer databaseCount) {
        this.databaseCount = databaseCount;
        return this;
    }
    public Integer getDatabaseCount() {
        return this.databaseCount;
    }

    public DescribeDtsJobDetailResponseBody setDtsJobClass(String dtsJobClass) {
        this.dtsJobClass = dtsJobClass;
        return this;
    }
    public String getDtsJobClass() {
        return this.dtsJobClass;
    }

    public DescribeDtsJobDetailResponseBody setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeDtsJobDetailResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeDtsJobDetailResponseBody setDestNetType(String destNetType) {
        this.destNetType = destNetType;
        return this;
    }
    public String getDestNetType() {
        return this.destNetType;
    }

    public DescribeDtsJobDetailResponseBody setSubscribeTopic(String subscribeTopic) {
        this.subscribeTopic = subscribeTopic;
        return this;
    }
    public String getSubscribeTopic() {
        return this.subscribeTopic;
    }

    public DescribeDtsJobDetailResponseBody setDtsInstanceID(String dtsInstanceID) {
        this.dtsInstanceID = dtsInstanceID;
        return this;
    }
    public String getDtsInstanceID() {
        return this.dtsInstanceID;
    }

    public DescribeDtsJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDtsJobDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeDtsJobDetailResponseBody setCheckpoint(Integer checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public Integer getCheckpoint() {
        return this.checkpoint;
    }

    public DescribeDtsJobDetailResponseBody setDelay(Integer delay) {
        this.delay = delay;
        return this;
    }
    public Integer getDelay() {
        return this.delay;
    }

    public DescribeDtsJobDetailResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDtsJobDetailResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDtsJobDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDtsJobDetailResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDtsJobDetailResponseBody setConsumptionClient(String consumptionClient) {
        this.consumptionClient = consumptionClient;
        return this;
    }
    public String getConsumptionClient() {
        return this.consumptionClient;
    }

    public DescribeDtsJobDetailResponseBody setDbObject(String dbObject) {
        this.dbObject = dbObject;
        return this;
    }
    public String getDbObject() {
        return this.dbObject;
    }

    public DescribeDtsJobDetailResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDtsJobDetailResponseBody setConsumptionCheckpoint(String consumptionCheckpoint) {
        this.consumptionCheckpoint = consumptionCheckpoint;
        return this;
    }
    public String getConsumptionCheckpoint() {
        return this.consumptionCheckpoint;
    }

    public DescribeDtsJobDetailResponseBody setEtlCalculator(String etlCalculator) {
        this.etlCalculator = etlCalculator;
        return this;
    }
    public String getEtlCalculator() {
        return this.etlCalculator;
    }

    public DescribeDtsJobDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDtsJobDetailResponseBody setBeginTimestamp(String beginTimestamp) {
        this.beginTimestamp = beginTimestamp;
        return this;
    }
    public String getBeginTimestamp() {
        return this.beginTimestamp;
    }

    public DescribeDtsJobDetailResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDtsJobDetailResponseBody setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public DescribeDtsJobDetailResponseBody setDtsJobDirection(String dtsJobDirection) {
        this.dtsJobDirection = dtsJobDirection;
        return this;
    }
    public String getDtsJobDirection() {
        return this.dtsJobDirection;
    }

    public DescribeDtsJobDetailResponseBody setSourceEndpoint(DescribeDtsJobDetailResponseBodySourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public DescribeDtsJobDetailResponseBodySourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public DescribeDtsJobDetailResponseBody setDestinationEndpoint(DescribeDtsJobDetailResponseBodyDestinationEndpoint destinationEndpoint) {
        this.destinationEndpoint = destinationEndpoint;
        return this;
    }
    public DescribeDtsJobDetailResponseBodyDestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    public DescribeDtsJobDetailResponseBody setMigrationMode(DescribeDtsJobDetailResponseBodyMigrationMode migrationMode) {
        this.migrationMode = migrationMode;
        return this;
    }
    public DescribeDtsJobDetailResponseBodyMigrationMode getMigrationMode() {
        return this.migrationMode;
    }

    public DescribeDtsJobDetailResponseBody setSubscriptionHost(DescribeDtsJobDetailResponseBodySubscriptionHost subscriptionHost) {
        this.subscriptionHost = subscriptionHost;
        return this;
    }
    public DescribeDtsJobDetailResponseBodySubscriptionHost getSubscriptionHost() {
        return this.subscriptionHost;
    }

    public DescribeDtsJobDetailResponseBody setSubscriptionDataType(DescribeDtsJobDetailResponseBodySubscriptionDataType subscriptionDataType) {
        this.subscriptionDataType = subscriptionDataType;
        return this;
    }
    public DescribeDtsJobDetailResponseBodySubscriptionDataType getSubscriptionDataType() {
        return this.subscriptionDataType;
    }

    public static class DescribeDtsJobDetailResponseBodySourceEndpoint extends TeaModel {
        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Port")
        public String port;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("Region")
        public String region;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobDetailResponseBodySourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySourceEndpoint self = new DescribeDtsJobDetailResponseBodySourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public DescribeDtsJobDetailResponseBodySourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobDetailResponseBodyDestinationEndpoint extends TeaModel {
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("Region")
        public String region;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("Port")
        public String port;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("EngineName")
        public String engineName;

        public static DescribeDtsJobDetailResponseBodyDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodyDestinationEndpoint self = new DescribeDtsJobDetailResponseBodyDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeDtsJobDetailResponseBodyDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
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

    public static class DescribeDtsJobDetailResponseBodySubscriptionHost extends TeaModel {
        @NameInMap("VpcHost")
        public String vpcHost;

        @NameInMap("PublicHost")
        public String publicHost;

        @NameInMap("PrivateHost")
        public String privateHost;

        public static DescribeDtsJobDetailResponseBodySubscriptionHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubscriptionHost self = new DescribeDtsJobDetailResponseBodySubscriptionHost();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubscriptionHost setVpcHost(String vpcHost) {
            this.vpcHost = vpcHost;
            return this;
        }
        public String getVpcHost() {
            return this.vpcHost;
        }

        public DescribeDtsJobDetailResponseBodySubscriptionHost setPublicHost(String publicHost) {
            this.publicHost = publicHost;
            return this;
        }
        public String getPublicHost() {
            return this.publicHost;
        }

        public DescribeDtsJobDetailResponseBodySubscriptionHost setPrivateHost(String privateHost) {
            this.privateHost = privateHost;
            return this;
        }
        public String getPrivateHost() {
            return this.privateHost;
        }

    }

    public static class DescribeDtsJobDetailResponseBodySubscriptionDataType extends TeaModel {
        @NameInMap("Dml")
        public Boolean dml;

        @NameInMap("Ddl")
        public Boolean ddl;

        public static DescribeDtsJobDetailResponseBodySubscriptionDataType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobDetailResponseBodySubscriptionDataType self = new DescribeDtsJobDetailResponseBodySubscriptionDataType();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobDetailResponseBodySubscriptionDataType setDml(Boolean dml) {
            this.dml = dml;
            return this;
        }
        public Boolean getDml() {
            return this.dml;
        }

        public DescribeDtsJobDetailResponseBodySubscriptionDataType setDdl(Boolean ddl) {
            this.ddl = ddl;
            return this;
        }
        public Boolean getDdl() {
            return this.ddl;
        }

    }

}
