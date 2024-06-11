// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BackupFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackupFilePath")
    public String backupFilePath;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceFilePathList")
    public java.util.List<String> sourceFilePathList;

    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    @NameInMap("UploadType")
    public String uploadType;

    public static BackupFileRequest build(java.util.Map<String, ?> map) throws Exception {
        BackupFileRequest self = new BackupFileRequest();
        return TeaModel.build(map, self);
    }

    public BackupFileRequest setAndroidInstanceIdList(java.util.List<String> androidInstanceIdList) {
        this.androidInstanceIdList = androidInstanceIdList;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIdList() {
        return this.androidInstanceIdList;
    }

    public BackupFileRequest setBackupFilePath(String backupFilePath) {
        this.backupFilePath = backupFilePath;
        return this;
    }
    public String getBackupFilePath() {
        return this.backupFilePath;
    }

    public BackupFileRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BackupFileRequest setSourceFilePathList(java.util.List<String> sourceFilePathList) {
        this.sourceFilePathList = sourceFilePathList;
        return this;
    }
    public java.util.List<String> getSourceFilePathList() {
        return this.sourceFilePathList;
    }

    public BackupFileRequest setUploadEndpoint(String uploadEndpoint) {
        this.uploadEndpoint = uploadEndpoint;
        return this;
    }
    public String getUploadEndpoint() {
        return this.uploadEndpoint;
    }

    public BackupFileRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

}
