// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class StartOssBucketReplicationRequest extends TeaModel {
    @NameInMap("Ak")
    public String ak;

    @NameInMap("EncryptedSk")
    public String encryptedSk;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("PrefixList")
    public java.util.List<String> prefixList;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReplicaKmsKeyId")
    public String replicaKmsKeyId;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("SourceBucketName")
    public String sourceBucketName;

    @NameInMap("SseKmsEncryptedObjectsStatus")
    public String sseKmsEncryptedObjectsStatus;

    @NameInMap("TargetBucketName")
    public String targetBucketName;

    @NameInMap("TargetRegionCode")
    public String targetRegionCode;

    public static StartOssBucketReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartOssBucketReplicationRequest self = new StartOssBucketReplicationRequest();
        return TeaModel.build(map, self);
    }

    public StartOssBucketReplicationRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public StartOssBucketReplicationRequest setEncryptedSk(String encryptedSk) {
        this.encryptedSk = encryptedSk;
        return this;
    }
    public String getEncryptedSk() {
        return this.encryptedSk;
    }

    public StartOssBucketReplicationRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public StartOssBucketReplicationRequest setPrefixList(java.util.List<String> prefixList) {
        this.prefixList = prefixList;
        return this;
    }
    public java.util.List<String> getPrefixList() {
        return this.prefixList;
    }

    public StartOssBucketReplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartOssBucketReplicationRequest setReplicaKmsKeyId(String replicaKmsKeyId) {
        this.replicaKmsKeyId = replicaKmsKeyId;
        return this;
    }
    public String getReplicaKmsKeyId() {
        return this.replicaKmsKeyId;
    }

    public StartOssBucketReplicationRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public StartOssBucketReplicationRequest setSourceBucketName(String sourceBucketName) {
        this.sourceBucketName = sourceBucketName;
        return this;
    }
    public String getSourceBucketName() {
        return this.sourceBucketName;
    }

    public StartOssBucketReplicationRequest setSseKmsEncryptedObjectsStatus(String sseKmsEncryptedObjectsStatus) {
        this.sseKmsEncryptedObjectsStatus = sseKmsEncryptedObjectsStatus;
        return this;
    }
    public String getSseKmsEncryptedObjectsStatus() {
        return this.sseKmsEncryptedObjectsStatus;
    }

    public StartOssBucketReplicationRequest setTargetBucketName(String targetBucketName) {
        this.targetBucketName = targetBucketName;
        return this;
    }
    public String getTargetBucketName() {
        return this.targetBucketName;
    }

    public StartOssBucketReplicationRequest setTargetRegionCode(String targetRegionCode) {
        this.targetRegionCode = targetRegionCode;
        return this;
    }
    public String getTargetRegionCode() {
        return this.targetRegionCode;
    }

}
