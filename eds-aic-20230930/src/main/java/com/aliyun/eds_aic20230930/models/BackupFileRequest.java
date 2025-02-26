// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BackupFileRequest extends TeaModel {
    /**
     * <p>The IDs of the instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>Whether all data is to be backed up.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BackupAll")
    public Boolean backupAll;

    /**
     * <p>Backup file name.</p>
     * 
     * <strong>example:</strong>
     * <p>defaultBackupFile</p>
     */
    @NameInMap("BackupFileName")
    public String backupFileName;

    /**
     * <p>The OSS path of the backup file.</p>
     * <blockquote>
     * <p> To upload a backup file to an OSS bucket, you must obtain the name of the bucket. When calling the describeBuckets operation to retrieve a bucket name, you must also call the ossObjectList operation to obtain the object key. Combine these to form the full path: oss://${bucketName}/${key}.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackupFilePath")
    public String backupFilePath;

    /**
     * <p>The description of the backup file.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a backup file description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>List of apps to be backed up.</p>
     */
    @NameInMap("SourceAppList")
    public java.util.List<String> sourceAppList;

    /**
     * <p>The paths to the source files.</p>
     */
    @NameInMap("SourceFilePathList")
    public java.util.List<String> sourceFilePathList;

    /**
     * <p>The endpoint of the OSS bucket to which you want to upload the backup file.</p>
     * <blockquote>
     * <p>: When calling the DescribeBuckets operation to query buckets, retrieve the IntranetEndpoint value if the cloud phone and the OSS bucket are in the same region. If they are in different regions, retrieve the ExtranetEndpoint value instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-shanghai-internal.aliyuncs.com</p>
     */
    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    /**
     * <p>The type of the backup.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>OSS: uploads the backup file to an OSS bucket.</li>
     * </ul>
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
