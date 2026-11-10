// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupSetDownloadRulesRequest extends TeaModel {
    /**
     * <p>The ID of the backup gateway used to download the backup set.</p>
     * 
     * <strong>example:</strong>
     * <p>23312323</p>
     */
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    /**
     * <p>The ID of the backup plan. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi01xxxx</p>
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
     * <p>The target type for downloading the backup set.</p>
     * <blockquote>
     * <p>Default value: agent. A backup gateway is installed. This is the only supported value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>agent</p>
     */
    @NameInMap("BackupSetDownloadTargetType")
    public String backupSetDownloadTargetType;

    /**
     * <p>The target directory type for downloading the backup set. This parameter is required if automatic download is enabled. Valid values:</p>
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
     * <p>The client token used to ensure the idempotence of the request and prevent duplicate request submissions.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The format of the full data downloaded from the backup set. Valid values:</p>
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
     * <p>The format of the incremental data downloaded from the backup set. Valid values:</p>
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
     * <p>Specifies whether to enable automatic download. Default value: false.</p>
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
