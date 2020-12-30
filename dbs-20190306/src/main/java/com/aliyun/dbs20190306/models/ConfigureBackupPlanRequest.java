// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ConfigureBackupPlanRequest extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    @NameInMap("SourceEndpointPort")
    public Integer sourceEndpointPort;

    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    @NameInMap("OSSBucketName")
    public String OSSBucketName;

    @NameInMap("BackupObjects")
    public String backupObjects;

    @NameInMap("BackupPeriod")
    public String backupPeriod;

    @NameInMap("BackupStartTime")
    public String backupStartTime;

    @NameInMap("EnableBackupLog")
    public Boolean enableBackupLog;

    @NameInMap("BackupLogIntervalSeconds")
    public Integer backupLogIntervalSeconds;

    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    @NameInMap("DuplicationInfrequentAccessPeriod")
    public Integer duplicationInfrequentAccessPeriod;

    @NameInMap("DuplicationArchivePeriod")
    public Integer duplicationArchivePeriod;

    @NameInMap("BackupPlanName")
    public String backupPlanName;

    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    @NameInMap("BackupStorageType")
    public String backupStorageType;

    @NameInMap("BackupSpeedLimit")
    public Long backupSpeedLimit;

    @NameInMap("BackupRateLimit")
    public Long backupRateLimit;

    @NameInMap("BackupStrategyType")
    public String backupStrategyType;

    @NameInMap("CrossAliyunId")
    public String crossAliyunId;

    @NameInMap("CrossRoleName")
    public String crossRoleName;

    @NameInMap("AutoStartBackup")
    public Boolean autoStartBackup;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ConfigureBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureBackupPlanRequest self = new ConfigureBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureBackupPlanRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ConfigureBackupPlanRequest setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
        this.sourceEndpointInstanceType = sourceEndpointInstanceType;
        return this;
    }
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    public ConfigureBackupPlanRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    public ConfigureBackupPlanRequest setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
        this.sourceEndpointInstanceID = sourceEndpointInstanceID;
        return this;
    }
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    public ConfigureBackupPlanRequest setSourceEndpointIP(String sourceEndpointIP) {
        this.sourceEndpointIP = sourceEndpointIP;
        return this;
    }
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    public ConfigureBackupPlanRequest setSourceEndpointPort(Integer sourceEndpointPort) {
        this.sourceEndpointPort = sourceEndpointPort;
        return this;
    }
    public Integer getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    public ConfigureBackupPlanRequest setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
        this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
        return this;
    }
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    public ConfigureBackupPlanRequest setSourceEndpointUserName(String sourceEndpointUserName) {
        this.sourceEndpointUserName = sourceEndpointUserName;
        return this;
    }
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    public ConfigureBackupPlanRequest setSourceEndpointPassword(String sourceEndpointPassword) {
        this.sourceEndpointPassword = sourceEndpointPassword;
        return this;
    }
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    public ConfigureBackupPlanRequest setBackupGatewayId(Long backupGatewayId) {
        this.backupGatewayId = backupGatewayId;
        return this;
    }
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    public ConfigureBackupPlanRequest setOSSBucketName(String OSSBucketName) {
        this.OSSBucketName = OSSBucketName;
        return this;
    }
    public String getOSSBucketName() {
        return this.OSSBucketName;
    }

    public ConfigureBackupPlanRequest setBackupObjects(String backupObjects) {
        this.backupObjects = backupObjects;
        return this;
    }
    public String getBackupObjects() {
        return this.backupObjects;
    }

    public ConfigureBackupPlanRequest setBackupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
        return this;
    }
    public String getBackupPeriod() {
        return this.backupPeriod;
    }

    public ConfigureBackupPlanRequest setBackupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
        return this;
    }
    public String getBackupStartTime() {
        return this.backupStartTime;
    }

    public ConfigureBackupPlanRequest setEnableBackupLog(Boolean enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public Boolean getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public ConfigureBackupPlanRequest setBackupLogIntervalSeconds(Integer backupLogIntervalSeconds) {
        this.backupLogIntervalSeconds = backupLogIntervalSeconds;
        return this;
    }
    public Integer getBackupLogIntervalSeconds() {
        return this.backupLogIntervalSeconds;
    }

    public ConfigureBackupPlanRequest setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public ConfigureBackupPlanRequest setDuplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
        this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
        return this;
    }
    public Integer getDuplicationInfrequentAccessPeriod() {
        return this.duplicationInfrequentAccessPeriod;
    }

    public ConfigureBackupPlanRequest setDuplicationArchivePeriod(Integer duplicationArchivePeriod) {
        this.duplicationArchivePeriod = duplicationArchivePeriod;
        return this;
    }
    public Integer getDuplicationArchivePeriod() {
        return this.duplicationArchivePeriod;
    }

    public ConfigureBackupPlanRequest setBackupPlanName(String backupPlanName) {
        this.backupPlanName = backupPlanName;
        return this;
    }
    public String getBackupPlanName() {
        return this.backupPlanName;
    }

    public ConfigureBackupPlanRequest setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
        this.sourceEndpointOracleSID = sourceEndpointOracleSID;
        return this;
    }
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    public ConfigureBackupPlanRequest setBackupStorageType(String backupStorageType) {
        this.backupStorageType = backupStorageType;
        return this;
    }
    public String getBackupStorageType() {
        return this.backupStorageType;
    }

    public ConfigureBackupPlanRequest setBackupSpeedLimit(Long backupSpeedLimit) {
        this.backupSpeedLimit = backupSpeedLimit;
        return this;
    }
    public Long getBackupSpeedLimit() {
        return this.backupSpeedLimit;
    }

    public ConfigureBackupPlanRequest setBackupRateLimit(Long backupRateLimit) {
        this.backupRateLimit = backupRateLimit;
        return this;
    }
    public Long getBackupRateLimit() {
        return this.backupRateLimit;
    }

    public ConfigureBackupPlanRequest setBackupStrategyType(String backupStrategyType) {
        this.backupStrategyType = backupStrategyType;
        return this;
    }
    public String getBackupStrategyType() {
        return this.backupStrategyType;
    }

    public ConfigureBackupPlanRequest setCrossAliyunId(String crossAliyunId) {
        this.crossAliyunId = crossAliyunId;
        return this;
    }
    public String getCrossAliyunId() {
        return this.crossAliyunId;
    }

    public ConfigureBackupPlanRequest setCrossRoleName(String crossRoleName) {
        this.crossRoleName = crossRoleName;
        return this;
    }
    public String getCrossRoleName() {
        return this.crossRoleName;
    }

    public ConfigureBackupPlanRequest setAutoStartBackup(Boolean autoStartBackup) {
        this.autoStartBackup = autoStartBackup;
        return this;
    }
    public Boolean getAutoStartBackup() {
        return this.autoStartBackup;
    }

    public ConfigureBackupPlanRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureBackupPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
