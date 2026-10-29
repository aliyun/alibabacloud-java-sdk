// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RecoverAndroidInstanceRequest extends TeaModel {
    /**
     * <p>The list of instance IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>The ID of the backup file.</p>
     * 
     * <strong>example:</strong>
     * <p>bf-azhps4rdyi2th****</p>
     */
    @NameInMap("BackupFileId")
    public String backupFileId;

    /**
     * <p>The OSS address to which the backup file is uploaded.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackupFilePath")
    public String backupFilePath;

    /**
     * <p>The list of app package names excluded from the full-device restore. Excluded apps are not uninstalled and their APKs are not installed, which is compatible with legacy backups that contain APKs. Only user data is replaced. Empty shells must be installed by the customer by using the pm install command. If this parameter is not specified, no apps are excluded.</p>
     */
    @NameInMap("ExcludeAppList")
    public java.util.List<String> excludeAppList;

    /**
     * <p>The backup region.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
     */
    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    /**
     * <p>The upload type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("UploadType")
    public String uploadType;

    public static RecoverAndroidInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoverAndroidInstanceRequest self = new RecoverAndroidInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RecoverAndroidInstanceRequest setAndroidInstanceIdList(java.util.List<String> androidInstanceIdList) {
        this.androidInstanceIdList = androidInstanceIdList;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIdList() {
        return this.androidInstanceIdList;
    }

    public RecoverAndroidInstanceRequest setBackupFileId(String backupFileId) {
        this.backupFileId = backupFileId;
        return this;
    }
    public String getBackupFileId() {
        return this.backupFileId;
    }

    public RecoverAndroidInstanceRequest setBackupFilePath(String backupFilePath) {
        this.backupFilePath = backupFilePath;
        return this;
    }
    public String getBackupFilePath() {
        return this.backupFilePath;
    }

    public RecoverAndroidInstanceRequest setExcludeAppList(java.util.List<String> excludeAppList) {
        this.excludeAppList = excludeAppList;
        return this;
    }
    public java.util.List<String> getExcludeAppList() {
        return this.excludeAppList;
    }

    public RecoverAndroidInstanceRequest setUploadEndpoint(String uploadEndpoint) {
        this.uploadEndpoint = uploadEndpoint;
        return this;
    }
    public String getUploadEndpoint() {
        return this.uploadEndpoint;
    }

    public RecoverAndroidInstanceRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

}
