// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BackupAndroidInstanceRequest extends TeaModel {
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
     * <p>abc</p>
     */
    @NameInMap("BackupFileName")
    public String backupFileName;

    /**
     * <p>The upload URL for the backup file.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackupFilePath")
    public String backupFilePath;

    /**
     * <p>The description of the full instance backup.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a backup android instance</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The region where the backup is stored.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
     */
    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    public static BackupAndroidInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BackupAndroidInstanceRequest self = new BackupAndroidInstanceRequest();
        return TeaModel.build(map, self);
    }

    public BackupAndroidInstanceRequest setAndroidInstanceIdList(java.util.List<String> androidInstanceIdList) {
        this.androidInstanceIdList = androidInstanceIdList;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIdList() {
        return this.androidInstanceIdList;
    }

    public BackupAndroidInstanceRequest setBackupFileName(String backupFileName) {
        this.backupFileName = backupFileName;
        return this;
    }
    public String getBackupFileName() {
        return this.backupFileName;
    }

    public BackupAndroidInstanceRequest setBackupFilePath(String backupFilePath) {
        this.backupFilePath = backupFilePath;
        return this;
    }
    public String getBackupFilePath() {
        return this.backupFilePath;
    }

    public BackupAndroidInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BackupAndroidInstanceRequest setUploadEndpoint(String uploadEndpoint) {
        this.uploadEndpoint = uploadEndpoint;
        return this;
    }
    public String getUploadEndpoint() {
        return this.uploadEndpoint;
    }

}
