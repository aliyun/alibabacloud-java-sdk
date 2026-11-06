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
     * <p>Specifies whether it is a full-device backup.</p>
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
     * <p>The OSS address to which the backup file is uploaded.
     * <notice>Call the describeBuckets operation to obtain the bucketName, and select ossObjectList to obtain the key. The key is the path of the backup file. Concatenate them into &quot;oss://${bucketName}/${key}&quot;.</notice></p>
     */
    @NameInMap("BackupFilePath")
    public String backupFilePath;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;OssBucket&quot;:&quot;my-bucket&quot;,&quot;OssObjectKey&quot;:&quot;script/recover.sh&quot;,&quot;OssEndpoint&quot;:&quot;oss-cn-hangzhou-internal.aliyuncs.com&quot;,&quot;OssRegion&quot;:&quot;cn-hangzhou&quot;}]</p>
     */
    @NameInMap("CustomScripts")
    public java.util.List<RecoveryFileRequestCustomScripts> customScripts;

    /**
     * <p>The list of excluded app package names for full-device restore. Matched apps are not uninstalled, and their APKs are not installed (compatible with legacy backups that contain APKs). Only user data is replaced. The empty shell must be installed by the customer using pm install. If this parameter is not specified, no apps are excluded.</p>
     */
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

    public RecoveryFileRequest setCustomScripts(java.util.List<RecoveryFileRequestCustomScripts> customScripts) {
        this.customScripts = customScripts;
        return this;
    }
    public java.util.List<RecoveryFileRequestCustomScripts> getCustomScripts() {
        return this.customScripts;
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

    public static class RecoveryFileRequestCustomScripts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-bucket</p>
         */
        @NameInMap("OssBucket")
        public String ossBucket;

        /**
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
         */
        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        /**
         * <strong>example:</strong>
         * <p>script/recover.sh</p>
         */
        @NameInMap("OssObjectKey")
        public String ossObjectKey;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("OssRegion")
        public String ossRegion;

        /**
         * <strong>example:</strong>
         * <p>[&quot;acp-0n4k52uiyon472rq0&quot;]</p>
         */
        @NameInMap("TestInstanceIds")
        public java.util.List<String> testInstanceIds;

        public static RecoveryFileRequestCustomScripts build(java.util.Map<String, ?> map) throws Exception {
            RecoveryFileRequestCustomScripts self = new RecoveryFileRequestCustomScripts();
            return TeaModel.build(map, self);
        }

        public RecoveryFileRequestCustomScripts setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public RecoveryFileRequestCustomScripts setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public RecoveryFileRequestCustomScripts setOssObjectKey(String ossObjectKey) {
            this.ossObjectKey = ossObjectKey;
            return this;
        }
        public String getOssObjectKey() {
            return this.ossObjectKey;
        }

        public RecoveryFileRequestCustomScripts setOssRegion(String ossRegion) {
            this.ossRegion = ossRegion;
            return this;
        }
        public String getOssRegion() {
            return this.ossRegion;
        }

        public RecoveryFileRequestCustomScripts setTestInstanceIds(java.util.List<String> testInstanceIds) {
            this.testInstanceIds = testInstanceIds;
            return this;
        }
        public java.util.List<String> getTestInstanceIds() {
            return this.testInstanceIds;
        }

    }

}
