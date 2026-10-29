// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RecoveryFileRequest extends TeaModel {
    /**
     * <p>The list of instance IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>Specifies whether to back up the entire device.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BackupAll")
    public Boolean backupAll;

    /**
     * <p>The ID of the backup file.</p>
     * 
     * <strong>example:</strong>
     * <p>bf-azhps4rdyi2th****</p>
     */
    @NameInMap("BackupFileId")
    public String backupFileId;

    /**
     * <p>The OSS URL to which the backup file is uploaded.
     * <notice>Call the describeBuckets operation to obtain the bucketName, and select ossObjectList to obtain the key. The key is the path of the backup file. Concatenate them into &quot;oss://${bucketName}/${key}&quot;.</notice></p>
     */
    @NameInMap("BackupFilePath")
    public String backupFilePath;

    @NameInMap("ExcludeAppList")
    public java.util.List<String> excludeAppList;

    /**
     * <p>The domain name of the backup address.
     * <notice>Call the DescribeBuckets operation to obtain the bucket. If the cloud phone and the bucket are in the same region, obtain the IntranetEndpoint field. If they are in different regions, obtain the ExtranetEndpoint field.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
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

    public static RecoveryFileRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoveryFileRequest self = new RecoveryFileRequest();
        return TeaModel.build(map, self);
    }

    public RecoveryFileRequest setAndroidInstanceIdList(java.util.List<String> androidInstanceIdList) {
        this.androidInstanceIdList = androidInstanceIdList;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIdList() {
        return this.androidInstanceIdList;
    }

    public RecoveryFileRequest setBackupAll(Boolean backupAll) {
        this.backupAll = backupAll;
        return this;
    }
    public Boolean getBackupAll() {
        return this.backupAll;
    }

    public RecoveryFileRequest setBackupFileId(String backupFileId) {
        this.backupFileId = backupFileId;
        return this;
    }
    public String getBackupFileId() {
        return this.backupFileId;
    }

    public RecoveryFileRequest setBackupFilePath(String backupFilePath) {
        this.backupFilePath = backupFilePath;
        return this;
    }
    public String getBackupFilePath() {
        return this.backupFilePath;
    }

    public RecoveryFileRequest setExcludeAppList(java.util.List<String> excludeAppList) {
        this.excludeAppList = excludeAppList;
        return this;
    }
    public java.util.List<String> getExcludeAppList() {
        return this.excludeAppList;
    }

    public RecoveryFileRequest setUploadEndpoint(String uploadEndpoint) {
        this.uploadEndpoint = uploadEndpoint;
        return this;
    }
    public String getUploadEndpoint() {
        return this.uploadEndpoint;
    }

    public RecoveryFileRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

}
