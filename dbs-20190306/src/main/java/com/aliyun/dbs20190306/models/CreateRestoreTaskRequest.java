// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateRestoreTaskRequest extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("DestinationEndpointInstanceType")
    public String destinationEndpointInstanceType;

    @NameInMap("DestinationEndpointRegion")
    public String destinationEndpointRegion;

    @NameInMap("DestinationEndpointInstanceID")
    public String destinationEndpointInstanceID;

    @NameInMap("DestinationEndpointIP")
    public String destinationEndpointIP;

    @NameInMap("DestinationEndpointPort")
    public Integer destinationEndpointPort;

    @NameInMap("DestinationEndpointDatabaseName")
    public String destinationEndpointDatabaseName;

    @NameInMap("DestinationEndpointUserName")
    public String destinationEndpointUserName;

    @NameInMap("DestinationEndpointPassword")
    public String destinationEndpointPassword;

    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    @NameInMap("RestoreObjects")
    public String restoreObjects;

    @NameInMap("RestoreTime")
    public Long restoreTime;

    @NameInMap("BackupSetId")
    public String backupSetId;

    @NameInMap("RestoreTaskName")
    public String restoreTaskName;

    @NameInMap("DestinationEndpointOracleSID")
    public String destinationEndpointOracleSID;

    @NameInMap("RestoreDir")
    public String restoreDir;

    @NameInMap("RestoreHome")
    public String restoreHome;

    @NameInMap("DuplicateConflict")
    public String duplicateConflict;

    @NameInMap("CrossAliyunId")
    public String crossAliyunId;

    @NameInMap("CrossRoleName")
    public String crossRoleName;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateRestoreTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRestoreTaskRequest self = new CreateRestoreTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRestoreTaskRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public CreateRestoreTaskRequest setDestinationEndpointInstanceType(String destinationEndpointInstanceType) {
        this.destinationEndpointInstanceType = destinationEndpointInstanceType;
        return this;
    }
    public String getDestinationEndpointInstanceType() {
        return this.destinationEndpointInstanceType;
    }

    public CreateRestoreTaskRequest setDestinationEndpointRegion(String destinationEndpointRegion) {
        this.destinationEndpointRegion = destinationEndpointRegion;
        return this;
    }
    public String getDestinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }

    public CreateRestoreTaskRequest setDestinationEndpointInstanceID(String destinationEndpointInstanceID) {
        this.destinationEndpointInstanceID = destinationEndpointInstanceID;
        return this;
    }
    public String getDestinationEndpointInstanceID() {
        return this.destinationEndpointInstanceID;
    }

    public CreateRestoreTaskRequest setDestinationEndpointIP(String destinationEndpointIP) {
        this.destinationEndpointIP = destinationEndpointIP;
        return this;
    }
    public String getDestinationEndpointIP() {
        return this.destinationEndpointIP;
    }

    public CreateRestoreTaskRequest setDestinationEndpointPort(Integer destinationEndpointPort) {
        this.destinationEndpointPort = destinationEndpointPort;
        return this;
    }
    public Integer getDestinationEndpointPort() {
        return this.destinationEndpointPort;
    }

    public CreateRestoreTaskRequest setDestinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
        this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
        return this;
    }
    public String getDestinationEndpointDatabaseName() {
        return this.destinationEndpointDatabaseName;
    }

    public CreateRestoreTaskRequest setDestinationEndpointUserName(String destinationEndpointUserName) {
        this.destinationEndpointUserName = destinationEndpointUserName;
        return this;
    }
    public String getDestinationEndpointUserName() {
        return this.destinationEndpointUserName;
    }

    public CreateRestoreTaskRequest setDestinationEndpointPassword(String destinationEndpointPassword) {
        this.destinationEndpointPassword = destinationEndpointPassword;
        return this;
    }
    public String getDestinationEndpointPassword() {
        return this.destinationEndpointPassword;
    }

    public CreateRestoreTaskRequest setBackupGatewayId(Long backupGatewayId) {
        this.backupGatewayId = backupGatewayId;
        return this;
    }
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    public CreateRestoreTaskRequest setRestoreObjects(String restoreObjects) {
        this.restoreObjects = restoreObjects;
        return this;
    }
    public String getRestoreObjects() {
        return this.restoreObjects;
    }

    public CreateRestoreTaskRequest setRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public Long getRestoreTime() {
        return this.restoreTime;
    }

    public CreateRestoreTaskRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateRestoreTaskRequest setRestoreTaskName(String restoreTaskName) {
        this.restoreTaskName = restoreTaskName;
        return this;
    }
    public String getRestoreTaskName() {
        return this.restoreTaskName;
    }

    public CreateRestoreTaskRequest setDestinationEndpointOracleSID(String destinationEndpointOracleSID) {
        this.destinationEndpointOracleSID = destinationEndpointOracleSID;
        return this;
    }
    public String getDestinationEndpointOracleSID() {
        return this.destinationEndpointOracleSID;
    }

    public CreateRestoreTaskRequest setRestoreDir(String restoreDir) {
        this.restoreDir = restoreDir;
        return this;
    }
    public String getRestoreDir() {
        return this.restoreDir;
    }

    public CreateRestoreTaskRequest setRestoreHome(String restoreHome) {
        this.restoreHome = restoreHome;
        return this;
    }
    public String getRestoreHome() {
        return this.restoreHome;
    }

    public CreateRestoreTaskRequest setDuplicateConflict(String duplicateConflict) {
        this.duplicateConflict = duplicateConflict;
        return this;
    }
    public String getDuplicateConflict() {
        return this.duplicateConflict;
    }

    public CreateRestoreTaskRequest setCrossAliyunId(String crossAliyunId) {
        this.crossAliyunId = crossAliyunId;
        return this;
    }
    public String getCrossAliyunId() {
        return this.crossAliyunId;
    }

    public CreateRestoreTaskRequest setCrossRoleName(String crossRoleName) {
        this.crossRoleName = crossRoleName;
        return this;
    }
    public String getCrossRoleName() {
        return this.crossRoleName;
    }

    public CreateRestoreTaskRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateRestoreTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
