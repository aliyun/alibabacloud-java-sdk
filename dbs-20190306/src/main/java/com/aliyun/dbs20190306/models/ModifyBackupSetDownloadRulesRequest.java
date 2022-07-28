// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupSetDownloadRulesRequest extends TeaModel {
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("BackupSetDownloadDir")
    public String backupSetDownloadDir;

    @NameInMap("BackupSetDownloadTargetType")
    public String backupSetDownloadTargetType;

    @NameInMap("BackupSetDownloadTargetTypeLocation")
    public String backupSetDownloadTargetTypeLocation;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("FullDataFormat")
    public String fullDataFormat;

    @NameInMap("IncrementDataFormat")
    public String incrementDataFormat;

    @NameInMap("OpenAutoDownload")
    public Boolean openAutoDownload;

    @NameInMap("OwnerId")
    public String ownerId;

    public static ModifyBackupSetDownloadRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupSetDownloadRulesRequest self = new ModifyBackupSetDownloadRulesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupSetDownloadRulesRequest setBackupGatewayId(Long backupGatewayId) {
        this.backupGatewayId = backupGatewayId;
        return this;
    }
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    public ModifyBackupSetDownloadRulesRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ModifyBackupSetDownloadRulesRequest setBackupSetDownloadDir(String backupSetDownloadDir) {
        this.backupSetDownloadDir = backupSetDownloadDir;
        return this;
    }
    public String getBackupSetDownloadDir() {
        return this.backupSetDownloadDir;
    }

    public ModifyBackupSetDownloadRulesRequest setBackupSetDownloadTargetType(String backupSetDownloadTargetType) {
        this.backupSetDownloadTargetType = backupSetDownloadTargetType;
        return this;
    }
    public String getBackupSetDownloadTargetType() {
        return this.backupSetDownloadTargetType;
    }

    public ModifyBackupSetDownloadRulesRequest setBackupSetDownloadTargetTypeLocation(String backupSetDownloadTargetTypeLocation) {
        this.backupSetDownloadTargetTypeLocation = backupSetDownloadTargetTypeLocation;
        return this;
    }
    public String getBackupSetDownloadTargetTypeLocation() {
        return this.backupSetDownloadTargetTypeLocation;
    }

    public ModifyBackupSetDownloadRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyBackupSetDownloadRulesRequest setFullDataFormat(String fullDataFormat) {
        this.fullDataFormat = fullDataFormat;
        return this;
    }
    public String getFullDataFormat() {
        return this.fullDataFormat;
    }

    public ModifyBackupSetDownloadRulesRequest setIncrementDataFormat(String incrementDataFormat) {
        this.incrementDataFormat = incrementDataFormat;
        return this;
    }
    public String getIncrementDataFormat() {
        return this.incrementDataFormat;
    }

    public ModifyBackupSetDownloadRulesRequest setOpenAutoDownload(Boolean openAutoDownload) {
        this.openAutoDownload = openAutoDownload;
        return this;
    }
    public Boolean getOpenAutoDownload() {
        return this.openAutoDownload;
    }

    public ModifyBackupSetDownloadRulesRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
