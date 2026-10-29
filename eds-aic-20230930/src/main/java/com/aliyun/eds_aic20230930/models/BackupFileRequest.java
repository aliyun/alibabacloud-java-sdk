// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BackupFileRequest extends TeaModel {
    /**
     * <p>The list of instance IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>Specifies whether to back up the entire instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BackupAll")
    public Boolean backupAll;

    /**
     * <p>The name of the backup file.</p>
     * 
     * <strong>example:</strong>
     * <p>MyBackup</p>
     */
    @NameInMap("BackupFileName")
    public String backupFileName;

    /**
     * <p>The upload address of the backup file.</p>
     * <blockquote>
     * <p>If you upload the backup file to an OSS bucket, call the describeBuckets operation to obtain the bucketName, and select ossObjectList to obtain the key. The key is the folder path in the OSS bucket. Concatenate them into <code>oss://${bucketName}/${key}</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackupFilePath")
    public String backupFilePath;

    /**
     * <p>The description of the backup file.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a request to back up /data</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of application package names excluded from full instance backup. Matched applications only skip APK collection, and user data is backed up as usual. If this parameter is not specified, no applications are excluded.</p>
     */
    @NameInMap("ExcludeAppList")
    public java.util.List<String> excludeAppList;

    /**
     * <p>The list of file paths in the Android container to exclude from the backup.</p>
     */
    @NameInMap("ExcludeSourceFilePathList")
    public java.util.List<String> excludeSourceFilePathList;

    /**
     * <p>The list of package names of the applications to back up.</p>
     */
    @NameInMap("SourceAppList")
    public java.util.List<String> sourceAppList;

    /**
     * <p>The list of file paths to back up.</p>
     */
    @NameInMap("SourceFilePathList")
    public java.util.List<String> sourceFilePathList;

    /**
     * <p>The domain name of the backup address.</p>
     * <blockquote>
     * <p>If you upload the backup file to an OSS bucket, call the describeBuckets operation to obtain the bucket. If the Cloud Phone instance and the bucket are in the same region, obtain the intranetEndpoint field. If they are in different regions, obtain the extranetEndpoint field.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-shanghai-internal.aliyuncs.com</p>
     */
    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    /**
     * <p>The backup type.</p>
     * 
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

    public BackupFileRequest setExcludeAppList(java.util.List<String> excludeAppList) {
        this.excludeAppList = excludeAppList;
        return this;
    }
    public java.util.List<String> getExcludeAppList() {
        return this.excludeAppList;
    }

    public BackupFileRequest setExcludeSourceFilePathList(java.util.List<String> excludeSourceFilePathList) {
        this.excludeSourceFilePathList = excludeSourceFilePathList;
        return this;
    }
    public java.util.List<String> getExcludeSourceFilePathList() {
        return this.excludeSourceFilePathList;
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
