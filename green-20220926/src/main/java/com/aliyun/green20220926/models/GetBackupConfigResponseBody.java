// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetBackupConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BackupMode")
    public Integer backupMode;

    /**
     * <strong>example:</strong>
     * <p>buckect_test</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("EnableBackup")
    public Boolean enableBackup;

    @NameInMap("EnableBackupVoice")
    public Boolean enableBackupVoice;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("ExpireSeconds")
    public Integer expireSeconds;

    /**
     * <strong>example:</strong>
     * <p>2023-01-17 12:29:56</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>aliyun/template/</p>
     */
    @NameInMap("Path")
    public String path;

    @NameInMap("PathVoice")
    public String pathVoice;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>UID。</p>
     * 
     * <strong>example:</strong>
     * <p>1772612608370735</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static GetBackupConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBackupConfigResponseBody self = new GetBackupConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBackupConfigResponseBody setBackupMode(Integer backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public Integer getBackupMode() {
        return this.backupMode;
    }

    public GetBackupConfigResponseBody setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public GetBackupConfigResponseBody setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public GetBackupConfigResponseBody setEnableBackup(Boolean enableBackup) {
        this.enableBackup = enableBackup;
        return this;
    }
    public Boolean getEnableBackup() {
        return this.enableBackup;
    }

    public GetBackupConfigResponseBody setEnableBackupVoice(Boolean enableBackupVoice) {
        this.enableBackupVoice = enableBackupVoice;
        return this;
    }
    public Boolean getEnableBackupVoice() {
        return this.enableBackupVoice;
    }

    public GetBackupConfigResponseBody setExpireSeconds(Integer expireSeconds) {
        this.expireSeconds = expireSeconds;
        return this;
    }
    public Integer getExpireSeconds() {
        return this.expireSeconds;
    }

    public GetBackupConfigResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetBackupConfigResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetBackupConfigResponseBody setPathVoice(String pathVoice) {
        this.pathVoice = pathVoice;
        return this;
    }
    public String getPathVoice() {
        return this.pathVoice;
    }

    public GetBackupConfigResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetBackupConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBackupConfigResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetBackupConfigResponseBody setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetBackupConfigResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
