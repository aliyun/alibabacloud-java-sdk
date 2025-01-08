// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BackupFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    @NameInMap("BackupAll")
    public Boolean backupAll;

    @NameInMap("BackupFileName")
    public String backupFileName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackupFilePath")
    public String backupFilePath;

    @NameInMap("Description")
    public String description;

    @NameInMap("SourceAppList")
    public java.util.List<String> sourceAppList;

    @NameInMap("SourceFilePathList")
    public java.util.List<String> sourceFilePathList;

    /**
     * <strong>example:</strong>
     * <p>oss-cn-shanghai-internal.aliyuncs.com</p>
     */
    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    /**
     * <strong>example:</strong>
     * <p>OSS</p>
     */
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

    public BackupFileRequest setBackupAll(Boolean backupAll) {
        this.backupAll = backupAll;
        return this;
    }
    public Boolean getBackupAll() {
        return this.backupAll;
    }

    public BackupFileRequest setBackupFileName(String backupFileName) {
        this.backupFileName = backupFileName;
        return this;
    }
    public String getBackupFileName() {
        return this.backupFileName;
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

    public BackupFileRequest setSourceAppList(java.util.List<String> sourceAppList) {
        this.sourceAppList = sourceAppList;
        return this;
    }
    public java.util.List<String> getSourceAppList() {
        return this.sourceAppList;
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
