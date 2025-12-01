// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupSetDownloadRulesRequest extends TeaModel {
    /**
     * <p>The ID of the backup gateway that is used to download the backup set.</p>
     * 
     * <strong>example:</strong>
     * <p>2331****</p>
     */
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    /**
     * <p>The ID of the backup schedule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi01****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The server directory to which the backup set is downloaded.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BackupSetDownloadDir")
    public String backupSetDownloadDir;

    /**
     * <p>The type of the destination server to which the backup set is downloaded.</p>
     * <blockquote>
     * <p>Set the value to agent, which indicates a server on which a backup gateway is installed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>agent</p>
     */
    @NameInMap("BackupSetDownloadTargetType")
    public String backupSetDownloadTargetType;

    /**
     * <p>The type of the destination directory to which the backup set is downloaded. This parameter is required if the automatic download feature is enabled. Valid values:</p>
     * <ul>
     * <li>local</li>
     * <li>nas</li>
     * <li>ftp</li>
     * <li>minio</li>
     * </ul>
     * <blockquote>
     * <p>Default value: local.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>local</p>
     */
    @NameInMap("BackupSetDownloadTargetTypeLocation")
    public String backupSetDownloadTargetTypeLocation;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzx****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The format in which the full backup set is downloaded. Valid values:</p>
     * <ul>
     * <li>Native</li>
     * <li>SQL</li>
     * <li>CSV</li>
     * <li>JSON</li>
     * </ul>
     * <blockquote>
     * <p>Default value: CSV.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CSV</p>
     */
    @NameInMap("FullDataFormat")
    public String fullDataFormat;

    /**
     * <p>The format in which the incremental backup set is downloaded. Valid values:</p>
     * <ul>
     * <li>Native</li>
     * <li>SQL</li>
     * <li>CSV</li>
     * <li>JSON</li>
     * </ul>
     * <blockquote>
     * <p>Default value: Native.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Native</p>
     */
    @NameInMap("IncrementDataFormat")
    public String incrementDataFormat;

    /**
     * <p>Specifies whether to enable the automatic download feature. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
