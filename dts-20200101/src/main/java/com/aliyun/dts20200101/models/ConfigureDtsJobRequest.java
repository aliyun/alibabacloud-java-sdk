// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureDtsJobRequest extends TeaModel {
    @NameInMap("DtsJobName")
    public String dtsJobName;

    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    @NameInMap("SourceEndpointEngineName")
    public String sourceEndpointEngineName;

    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    @NameInMap("SourceEndpointPort")
    public String sourceEndpointPort;

    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    @NameInMap("SourceEndpointOwnerID")
    public String sourceEndpointOwnerID;

    @NameInMap("SourceEndpointRole")
    public String sourceEndpointRole;

    @NameInMap("DestinationEndpointInstanceType")
    public String destinationEndpointInstanceType;

    @NameInMap("DestinationEndpointInstanceID")
    public String destinationEndpointInstanceID;

    @NameInMap("DestinationEndpointEngineName")
    public String destinationEndpointEngineName;

    @NameInMap("DestinationEndpointRegion")
    public String destinationEndpointRegion;

    @NameInMap("DestinationEndpointIP")
    public String destinationEndpointIP;

    @NameInMap("DestinationEndpointPort")
    public String destinationEndpointPort;

    @NameInMap("DestinationEndpointDataBaseName")
    public String destinationEndpointDataBaseName;

    @NameInMap("DestinationEndpointUserName")
    public String destinationEndpointUserName;

    @NameInMap("DestinationEndpointPassword")
    public String destinationEndpointPassword;

    @NameInMap("StructureInitialization")
    public Boolean structureInitialization;

    @NameInMap("DataInitialization")
    public Boolean dataInitialization;

    @NameInMap("DataSynchronization")
    public Boolean dataSynchronization;

    @NameInMap("DbList")
    public String dbList;

    @NameInMap("Reserve")
    public String reserve;

    @NameInMap("Checkpoint")
    public String checkpoint;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("DestinationEndpointOracleSID")
    public String destinationEndpointOracleSID;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("DelayPhone")
    public String delayPhone;

    @NameInMap("DelayRuleTime")
    public Long delayRuleTime;

    @NameInMap("DelayNotice")
    public Boolean delayNotice;

    @NameInMap("ErrorPhone")
    public String errorPhone;

    @NameInMap("ErrorNotice")
    public Boolean errorNotice;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("RegionId")
    public String regionId;

    public static ConfigureDtsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureDtsJobRequest self = new ConfigureDtsJobRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureDtsJobRequest setDtsJobName(String dtsJobName) {
        this.dtsJobName = dtsJobName;
        return this;
    }
    public String getDtsJobName() {
        return this.dtsJobName;
    }

    public ConfigureDtsJobRequest setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
        this.sourceEndpointInstanceType = sourceEndpointInstanceType;
        return this;
    }
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    public ConfigureDtsJobRequest setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
        this.sourceEndpointInstanceID = sourceEndpointInstanceID;
        return this;
    }
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    public ConfigureDtsJobRequest setSourceEndpointEngineName(String sourceEndpointEngineName) {
        this.sourceEndpointEngineName = sourceEndpointEngineName;
        return this;
    }
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }

    public ConfigureDtsJobRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    public ConfigureDtsJobRequest setSourceEndpointIP(String sourceEndpointIP) {
        this.sourceEndpointIP = sourceEndpointIP;
        return this;
    }
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    public ConfigureDtsJobRequest setSourceEndpointPort(String sourceEndpointPort) {
        this.sourceEndpointPort = sourceEndpointPort;
        return this;
    }
    public String getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    public ConfigureDtsJobRequest setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
        this.sourceEndpointOracleSID = sourceEndpointOracleSID;
        return this;
    }
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    public ConfigureDtsJobRequest setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
        this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
        return this;
    }
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    public ConfigureDtsJobRequest setSourceEndpointUserName(String sourceEndpointUserName) {
        this.sourceEndpointUserName = sourceEndpointUserName;
        return this;
    }
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    public ConfigureDtsJobRequest setSourceEndpointPassword(String sourceEndpointPassword) {
        this.sourceEndpointPassword = sourceEndpointPassword;
        return this;
    }
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    public ConfigureDtsJobRequest setSourceEndpointOwnerID(String sourceEndpointOwnerID) {
        this.sourceEndpointOwnerID = sourceEndpointOwnerID;
        return this;
    }
    public String getSourceEndpointOwnerID() {
        return this.sourceEndpointOwnerID;
    }

    public ConfigureDtsJobRequest setSourceEndpointRole(String sourceEndpointRole) {
        this.sourceEndpointRole = sourceEndpointRole;
        return this;
    }
    public String getSourceEndpointRole() {
        return this.sourceEndpointRole;
    }

    public ConfigureDtsJobRequest setDestinationEndpointInstanceType(String destinationEndpointInstanceType) {
        this.destinationEndpointInstanceType = destinationEndpointInstanceType;
        return this;
    }
    public String getDestinationEndpointInstanceType() {
        return this.destinationEndpointInstanceType;
    }

    public ConfigureDtsJobRequest setDestinationEndpointInstanceID(String destinationEndpointInstanceID) {
        this.destinationEndpointInstanceID = destinationEndpointInstanceID;
        return this;
    }
    public String getDestinationEndpointInstanceID() {
        return this.destinationEndpointInstanceID;
    }

    public ConfigureDtsJobRequest setDestinationEndpointEngineName(String destinationEndpointEngineName) {
        this.destinationEndpointEngineName = destinationEndpointEngineName;
        return this;
    }
    public String getDestinationEndpointEngineName() {
        return this.destinationEndpointEngineName;
    }

    public ConfigureDtsJobRequest setDestinationEndpointRegion(String destinationEndpointRegion) {
        this.destinationEndpointRegion = destinationEndpointRegion;
        return this;
    }
    public String getDestinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }

    public ConfigureDtsJobRequest setDestinationEndpointIP(String destinationEndpointIP) {
        this.destinationEndpointIP = destinationEndpointIP;
        return this;
    }
    public String getDestinationEndpointIP() {
        return this.destinationEndpointIP;
    }

    public ConfigureDtsJobRequest setDestinationEndpointPort(String destinationEndpointPort) {
        this.destinationEndpointPort = destinationEndpointPort;
        return this;
    }
    public String getDestinationEndpointPort() {
        return this.destinationEndpointPort;
    }

    public ConfigureDtsJobRequest setDestinationEndpointDataBaseName(String destinationEndpointDataBaseName) {
        this.destinationEndpointDataBaseName = destinationEndpointDataBaseName;
        return this;
    }
    public String getDestinationEndpointDataBaseName() {
        return this.destinationEndpointDataBaseName;
    }

    public ConfigureDtsJobRequest setDestinationEndpointUserName(String destinationEndpointUserName) {
        this.destinationEndpointUserName = destinationEndpointUserName;
        return this;
    }
    public String getDestinationEndpointUserName() {
        return this.destinationEndpointUserName;
    }

    public ConfigureDtsJobRequest setDestinationEndpointPassword(String destinationEndpointPassword) {
        this.destinationEndpointPassword = destinationEndpointPassword;
        return this;
    }
    public String getDestinationEndpointPassword() {
        return this.destinationEndpointPassword;
    }

    public ConfigureDtsJobRequest setStructureInitialization(Boolean structureInitialization) {
        this.structureInitialization = structureInitialization;
        return this;
    }
    public Boolean getStructureInitialization() {
        return this.structureInitialization;
    }

    public ConfigureDtsJobRequest setDataInitialization(Boolean dataInitialization) {
        this.dataInitialization = dataInitialization;
        return this;
    }
    public Boolean getDataInitialization() {
        return this.dataInitialization;
    }

    public ConfigureDtsJobRequest setDataSynchronization(Boolean dataSynchronization) {
        this.dataSynchronization = dataSynchronization;
        return this;
    }
    public Boolean getDataSynchronization() {
        return this.dataSynchronization;
    }

    public ConfigureDtsJobRequest setDbList(String dbList) {
        this.dbList = dbList;
        return this;
    }
    public String getDbList() {
        return this.dbList;
    }

    public ConfigureDtsJobRequest setReserve(String reserve) {
        this.reserve = reserve;
        return this;
    }
    public String getReserve() {
        return this.reserve;
    }

    public ConfigureDtsJobRequest setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public String getCheckpoint() {
        return this.checkpoint;
    }

    public ConfigureDtsJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureDtsJobRequest setDestinationEndpointOracleSID(String destinationEndpointOracleSID) {
        this.destinationEndpointOracleSID = destinationEndpointOracleSID;
        return this;
    }
    public String getDestinationEndpointOracleSID() {
        return this.destinationEndpointOracleSID;
    }

    public ConfigureDtsJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ConfigureDtsJobRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ConfigureDtsJobRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ConfigureDtsJobRequest setDelayPhone(String delayPhone) {
        this.delayPhone = delayPhone;
        return this;
    }
    public String getDelayPhone() {
        return this.delayPhone;
    }

    public ConfigureDtsJobRequest setDelayRuleTime(Long delayRuleTime) {
        this.delayRuleTime = delayRuleTime;
        return this;
    }
    public Long getDelayRuleTime() {
        return this.delayRuleTime;
    }

    public ConfigureDtsJobRequest setDelayNotice(Boolean delayNotice) {
        this.delayNotice = delayNotice;
        return this;
    }
    public Boolean getDelayNotice() {
        return this.delayNotice;
    }

    public ConfigureDtsJobRequest setErrorPhone(String errorPhone) {
        this.errorPhone = errorPhone;
        return this;
    }
    public String getErrorPhone() {
        return this.errorPhone;
    }

    public ConfigureDtsJobRequest setErrorNotice(Boolean errorNotice) {
        this.errorNotice = errorNotice;
        return this;
    }
    public Boolean getErrorNotice() {
        return this.errorNotice;
    }

    public ConfigureDtsJobRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public ConfigureDtsJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
