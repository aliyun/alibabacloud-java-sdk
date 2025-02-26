// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RecoveryFileRequest extends TeaModel {
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
     * <p>The ID of the backup file.</p>
     * 
     * <strong>example:</strong>
     * <p>bf-azhps4rdyi2th****</p>
     */
    @NameInMap("BackupFileId")
    public String backupFileId;

    /**
     * <p>The OSS path to which the backup file is uploaded.</p>
     * <blockquote>
     * <p> When calling the describeBuckets operation to retrieve a bucket name, you must also call the ossObjectList operation to obtain the object key. Combine these to form the full path: oss://${bucketName}/${key}.</p>
     * </blockquote>
     */
    @NameInMap("BackupFilePath")
    public String backupFilePath;

    /**
     * <p>The endpoint of the OSS bucket that stores the backup file.</p>
     * <blockquote>
     * <p>: When calling the DescribeBuckets operation to query buckets, retrieve the IntranetEndpoint value if the cloud phone and the OSS bucket are in the same region. If they are in different regions, retrieve the ExtranetEndpoint value instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
     */
    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    /**
     * <p>The type of the backup.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>OSS: backup files are stored in OSS buckets.</li>
     * </ul>
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
