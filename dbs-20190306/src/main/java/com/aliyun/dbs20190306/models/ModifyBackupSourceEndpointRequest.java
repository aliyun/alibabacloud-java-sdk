// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupSourceEndpointRequest extends TeaModel {
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    @NameInMap("BackupObjects")
    public String backupObjects;

    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CrossAliyunId")
    public String crossAliyunId;

    @NameInMap("CrossRoleName")
    public String crossRoleName;

    @NameInMap("OwnerId")
    public String ownerId;

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

    public static ModifyBackupSourceEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupSourceEndpointRequest self = new ModifyBackupSourceEndpointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupSourceEndpointRequest setBackupGatewayId(Long backupGatewayId) {
        this.backupGatewayId = backupGatewayId;
        return this;
    }
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    public ModifyBackupSourceEndpointRequest setBackupObjects(String backupObjects) {
        this.backupObjects = backupObjects;
        return this;
    }
    public String getBackupObjects() {
        return this.backupObjects;
    }

    public ModifyBackupSourceEndpointRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ModifyBackupSourceEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyBackupSourceEndpointRequest setCrossAliyunId(String crossAliyunId) {
        this.crossAliyunId = crossAliyunId;
        return this;
    }
    public String getCrossAliyunId() {
        return this.crossAliyunId;
    }

    public ModifyBackupSourceEndpointRequest setCrossRoleName(String crossRoleName) {
        this.crossRoleName = crossRoleName;
        return this;
    }
    public String getCrossRoleName() {
        return this.crossRoleName;
    }

    public ModifyBackupSourceEndpointRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
        this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
        return this;
    }
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointIP(String sourceEndpointIP) {
        this.sourceEndpointIP = sourceEndpointIP;
        return this;
    }
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
        this.sourceEndpointInstanceID = sourceEndpointInstanceID;
        return this;
    }
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
        this.sourceEndpointInstanceType = sourceEndpointInstanceType;
        return this;
    }
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
        this.sourceEndpointOracleSID = sourceEndpointOracleSID;
        return this;
    }
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointPassword(String sourceEndpointPassword) {
        this.sourceEndpointPassword = sourceEndpointPassword;
        return this;
    }
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointPort(Integer sourceEndpointPort) {
        this.sourceEndpointPort = sourceEndpointPort;
        return this;
    }
    public Integer getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointUserName(String sourceEndpointUserName) {
        this.sourceEndpointUserName = sourceEndpointUserName;
        return this;
    }
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

}
