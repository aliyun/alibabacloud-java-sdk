// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class ConfigureBackupSetInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Physical</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Automated</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <strong>example:</strong>
     * <p>ee-d84wwm3c****</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackupSetName")
    public String backupSetName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FullBackup</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("CheckSum")
    public String checkSum;

    /**
     * <strong>example:</strong>
     * <p>dbs</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-7iz7uw****</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("ExtraMeta")
    public String extraMeta;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WaitingUpload</p>
     */
    @NameInMap("UploadStatus")
    public String uploadStatus;

    public static ConfigureBackupSetInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureBackupSetInfoRequest self = new ConfigureBackupSetInfoRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureBackupSetInfoRequest setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public ConfigureBackupSetInfoRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public ConfigureBackupSetInfoRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public ConfigureBackupSetInfoRequest setBackupSetName(String backupSetName) {
        this.backupSetName = backupSetName;
        return this;
    }
    public String getBackupSetName() {
        return this.backupSetName;
    }

    public ConfigureBackupSetInfoRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public ConfigureBackupSetInfoRequest setCheckSum(String checkSum) {
        this.checkSum = checkSum;
        return this;
    }
    public String getCheckSum() {
        return this.checkSum;
    }

    public ConfigureBackupSetInfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ConfigureBackupSetInfoRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ConfigureBackupSetInfoRequest setExtraMeta(String extraMeta) {
        this.extraMeta = extraMeta;
        return this;
    }
    public String getExtraMeta() {
        return this.extraMeta;
    }

    public ConfigureBackupSetInfoRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public ConfigureBackupSetInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureBackupSetInfoRequest setUploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
        return this;
    }
    public String getUploadStatus() {
        return this.uploadStatus;
    }

}
