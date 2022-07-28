// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateAndStartBackupPlanRequest extends TeaModel {
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    @NameInMap("BackupLogIntervalSeconds")
    public Integer backupLogIntervalSeconds;

    @NameInMap("BackupMethod")
    public String backupMethod;

    @NameInMap("BackupObjects")
    public String backupObjects;

    @NameInMap("BackupPeriod")
    public String backupPeriod;

    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("BackupPlanName")
    public String backupPlanName;

    @NameInMap("BackupRateLimit")
    public Long backupRateLimit;

    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    @NameInMap("BackupSpeedLimit")
    public Long backupSpeedLimit;

    @NameInMap("BackupStartTime")
    public String backupStartTime;

    @NameInMap("BackupStorageType")
    public String backupStorageType;

    @NameInMap("BackupStrategyType")
    public String backupStrategyType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CrossAliyunId")
    public String crossAliyunId;

    @NameInMap("CrossRoleName")
    public String crossRoleName;

    @NameInMap("DatabaseRegion")
    public String databaseRegion;

    @NameInMap("DatabaseType")
    public String databaseType;

    @NameInMap("DuplicationArchivePeriod")
    public Integer duplicationArchivePeriod;

    @NameInMap("DuplicationInfrequentAccessPeriod")
    public Integer duplicationInfrequentAccessPeriod;

    @NameInMap("EnableBackupLog")
    public Boolean enableBackupLog;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("InstanceClass")
    public String instanceClass;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OSSBucketName")
    public String OSSBucketName;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Period")
    public String period;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    @NameInMap("SourceEndpointPort")
    public Integer sourceEndpointPort;

    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    @NameInMap("StorageRegion")
    public String storageRegion;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("UsedTime")
    public Integer usedTime;

    public static CreateAndStartBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndStartBackupPlanRequest self = new CreateAndStartBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndStartBackupPlanRequest setBackupGatewayId(Long backupGatewayId) {
        this.backupGatewayId = backupGatewayId;
        return this;
    }
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    public CreateAndStartBackupPlanRequest setBackupLogIntervalSeconds(Integer backupLogIntervalSeconds) {
        this.backupLogIntervalSeconds = backupLogIntervalSeconds;
        return this;
    }
    public Integer getBackupLogIntervalSeconds() {
        return this.backupLogIntervalSeconds;
    }

    public CreateAndStartBackupPlanRequest setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public CreateAndStartBackupPlanRequest setBackupObjects(String backupObjects) {
        this.backupObjects = backupObjects;
        return this;
    }
    public String getBackupObjects() {
        return this.backupObjects;
    }

    public CreateAndStartBackupPlanRequest setBackupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
        return this;
    }
    public String getBackupPeriod() {
        return this.backupPeriod;
    }

    public CreateAndStartBackupPlanRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public CreateAndStartBackupPlanRequest setBackupPlanName(String backupPlanName) {
        this.backupPlanName = backupPlanName;
        return this;
    }
    public String getBackupPlanName() {
        return this.backupPlanName;
    }

    public CreateAndStartBackupPlanRequest setBackupRateLimit(Long backupRateLimit) {
        this.backupRateLimit = backupRateLimit;
        return this;
    }
    public Long getBackupRateLimit() {
        return this.backupRateLimit;
    }

    public CreateAndStartBackupPlanRequest setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public CreateAndStartBackupPlanRequest setBackupSpeedLimit(Long backupSpeedLimit) {
        this.backupSpeedLimit = backupSpeedLimit;
        return this;
    }
    public Long getBackupSpeedLimit() {
        return this.backupSpeedLimit;
    }

    public CreateAndStartBackupPlanRequest setBackupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
        return this;
    }
    public String getBackupStartTime() {
        return this.backupStartTime;
    }

    public CreateAndStartBackupPlanRequest setBackupStorageType(String backupStorageType) {
        this.backupStorageType = backupStorageType;
        return this;
    }
    public String getBackupStorageType() {
        return this.backupStorageType;
    }

    public CreateAndStartBackupPlanRequest setBackupStrategyType(String backupStrategyType) {
        this.backupStrategyType = backupStrategyType;
        return this;
    }
    public String getBackupStrategyType() {
        return this.backupStrategyType;
    }

    public CreateAndStartBackupPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAndStartBackupPlanRequest setCrossAliyunId(String crossAliyunId) {
        this.crossAliyunId = crossAliyunId;
        return this;
    }
    public String getCrossAliyunId() {
        return this.crossAliyunId;
    }

    public CreateAndStartBackupPlanRequest setCrossRoleName(String crossRoleName) {
        this.crossRoleName = crossRoleName;
        return this;
    }
    public String getCrossRoleName() {
        return this.crossRoleName;
    }

    public CreateAndStartBackupPlanRequest setDatabaseRegion(String databaseRegion) {
        this.databaseRegion = databaseRegion;
        return this;
    }
    public String getDatabaseRegion() {
        return this.databaseRegion;
    }

    public CreateAndStartBackupPlanRequest setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }
    public String getDatabaseType() {
        return this.databaseType;
    }

    public CreateAndStartBackupPlanRequest setDuplicationArchivePeriod(Integer duplicationArchivePeriod) {
        this.duplicationArchivePeriod = duplicationArchivePeriod;
        return this;
    }
    public Integer getDuplicationArchivePeriod() {
        return this.duplicationArchivePeriod;
    }

    public CreateAndStartBackupPlanRequest setDuplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
        this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
        return this;
    }
    public Integer getDuplicationInfrequentAccessPeriod() {
        return this.duplicationInfrequentAccessPeriod;
    }

    public CreateAndStartBackupPlanRequest setEnableBackupLog(Boolean enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public Boolean getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public CreateAndStartBackupPlanRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public CreateAndStartBackupPlanRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public CreateAndStartBackupPlanRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateAndStartBackupPlanRequest setOSSBucketName(String OSSBucketName) {
        this.OSSBucketName = OSSBucketName;
        return this;
    }
    public String getOSSBucketName() {
        return this.OSSBucketName;
    }

    public CreateAndStartBackupPlanRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateAndStartBackupPlanRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateAndStartBackupPlanRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateAndStartBackupPlanRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateAndStartBackupPlanRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
        this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
        return this;
    }
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointIP(String sourceEndpointIP) {
        this.sourceEndpointIP = sourceEndpointIP;
        return this;
    }
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
        this.sourceEndpointInstanceID = sourceEndpointInstanceID;
        return this;
    }
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
        this.sourceEndpointInstanceType = sourceEndpointInstanceType;
        return this;
    }
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
        this.sourceEndpointOracleSID = sourceEndpointOracleSID;
        return this;
    }
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointPassword(String sourceEndpointPassword) {
        this.sourceEndpointPassword = sourceEndpointPassword;
        return this;
    }
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointPort(Integer sourceEndpointPort) {
        this.sourceEndpointPort = sourceEndpointPort;
        return this;
    }
    public Integer getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointUserName(String sourceEndpointUserName) {
        this.sourceEndpointUserName = sourceEndpointUserName;
        return this;
    }
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    public CreateAndStartBackupPlanRequest setStorageRegion(String storageRegion) {
        this.storageRegion = storageRegion;
        return this;
    }
    public String getStorageRegion() {
        return this.storageRegion;
    }

    public CreateAndStartBackupPlanRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateAndStartBackupPlanRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

}
