// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateHanaBackupSettingRequest extends TeaModel {
    /**
     * <p>The configuration file for catalog backup.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/sap/SID/SYS/global/hdb/opt/hdbconfig/param</p>
     */
    @NameInMap("CatalogBackupParameterFile")
    public String catalogBackupParameterFile;

    /**
     * <p>Specifies whether to use Backint to back up catalogs. Valid values:</p>
     * <ul>
     * <li>true: Backint is used to back up catalogs.</li>
     * <li>false: Backint is not used to back up catalogs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CatalogBackupUsingBackint")
    public Boolean catalogBackupUsingBackint;

    /**
     * <p>The ID of the SAP HANA instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-000ezvg******8znz</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The configuration file for data backup.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/sap/SID/SYS/global/hdb/opt/hdbconfig/param</p>
     */
    @NameInMap("DataBackupParameterFile")
    public String dataBackupParameterFile;

    /**
     * <p>The name of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEMDB</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>Specifies whether to enable automatic log backup. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables automatic log backup.</li>
     * <li><strong>false</strong>: disables automatic log backup.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAutoLogBackup")
    public Boolean enableAutoLogBackup;

    /**
     * <p>The configuration file for log backup.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/sap/SID/SYS/global/hdb/opt/hdbconfig/param</p>
     */
    @NameInMap("LogBackupParameterFile")
    public String logBackupParameterFile;

    /**
     * <p>The interval at which logs are backed up. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("LogBackupTimeout")
    public Long logBackupTimeout;

    /**
     * <p>Specifies whether to use Backint to back up logs. Valid values:</p>
     * <ul>
     * <li>true: Backint is used to back up logs.</li>
     * <li>false: Backint is not used to back up logs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LogBackupUsingBackint")
    public Boolean logBackupUsingBackint;

    /**
     * <p>The ID of the backup vault.</p>
     * 
     * <strong>example:</strong>
     * <p>v-0005n******rluw5</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static UpdateHanaBackupSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHanaBackupSettingRequest self = new UpdateHanaBackupSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHanaBackupSettingRequest setCatalogBackupParameterFile(String catalogBackupParameterFile) {
        this.catalogBackupParameterFile = catalogBackupParameterFile;
        return this;
    }
    public String getCatalogBackupParameterFile() {
        return this.catalogBackupParameterFile;
    }

    public UpdateHanaBackupSettingRequest setCatalogBackupUsingBackint(Boolean catalogBackupUsingBackint) {
        this.catalogBackupUsingBackint = catalogBackupUsingBackint;
        return this;
    }
    public Boolean getCatalogBackupUsingBackint() {
        return this.catalogBackupUsingBackint;
    }

    public UpdateHanaBackupSettingRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateHanaBackupSettingRequest setDataBackupParameterFile(String dataBackupParameterFile) {
        this.dataBackupParameterFile = dataBackupParameterFile;
        return this;
    }
    public String getDataBackupParameterFile() {
        return this.dataBackupParameterFile;
    }

    public UpdateHanaBackupSettingRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public UpdateHanaBackupSettingRequest setEnableAutoLogBackup(Boolean enableAutoLogBackup) {
        this.enableAutoLogBackup = enableAutoLogBackup;
        return this;
    }
    public Boolean getEnableAutoLogBackup() {
        return this.enableAutoLogBackup;
    }

    public UpdateHanaBackupSettingRequest setLogBackupParameterFile(String logBackupParameterFile) {
        this.logBackupParameterFile = logBackupParameterFile;
        return this;
    }
    public String getLogBackupParameterFile() {
        return this.logBackupParameterFile;
    }

    public UpdateHanaBackupSettingRequest setLogBackupTimeout(Long logBackupTimeout) {
        this.logBackupTimeout = logBackupTimeout;
        return this;
    }
    public Long getLogBackupTimeout() {
        return this.logBackupTimeout;
    }

    public UpdateHanaBackupSettingRequest setLogBackupUsingBackint(Boolean logBackupUsingBackint) {
        this.logBackupUsingBackint = logBackupUsingBackint;
        return this;
    }
    public Boolean getLogBackupUsingBackint() {
        return this.logBackupUsingBackint;
    }

    public UpdateHanaBackupSettingRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
