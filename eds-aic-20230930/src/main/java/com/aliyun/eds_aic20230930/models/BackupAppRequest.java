// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BackupAppRequest extends TeaModel {
    /**
     * <p>A list of instance IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>The name of the backup file.</p>
     * 
     * <strong>example:</strong>
     * <p>MyBackup</p>
     */
    @NameInMap("BackupFileName")
    public String backupFileName;

    /**
     * <p>The URL of the backup file.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackupFilePath")
    public String backupFilePath;

    /**
     * <p>The description of the application backup.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a backup app</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>A list of package names for the applications to back up.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceAppList")
    public java.util.List<String> sourceAppList;

    /**
     * <p>Specifies the region where the backup is created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-shanghai-internal.aliyuncs.com</p>
     */
    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    public static BackupAppRequest build(java.util.Map<String, ?> map) throws Exception {
        BackupAppRequest self = new BackupAppRequest();
        return TeaModel.build(map, self);
    }

    public BackupAppRequest setAndroidInstanceIdList(java.util.List<String> androidInstanceIdList) {
        this.androidInstanceIdList = androidInstanceIdList;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIdList() {
        return this.androidInstanceIdList;
    }

    public BackupAppRequest setBackupFileName(String backupFileName) {
        this.backupFileName = backupFileName;
        return this;
    }
    public String getBackupFileName() {
        return this.backupFileName;
    }

    public BackupAppRequest setBackupFilePath(String backupFilePath) {
        this.backupFilePath = backupFilePath;
        return this;
    }
    public String getBackupFilePath() {
        return this.backupFilePath;
    }

    public BackupAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BackupAppRequest setSourceAppList(java.util.List<String> sourceAppList) {
        this.sourceAppList = sourceAppList;
        return this;
    }
    public java.util.List<String> getSourceAppList() {
        return this.sourceAppList;
    }

    public BackupAppRequest setUploadEndpoint(String uploadEndpoint) {
        this.uploadEndpoint = uploadEndpoint;
        return this;
    }
    public String getUploadEndpoint() {
        return this.uploadEndpoint;
    }

}
