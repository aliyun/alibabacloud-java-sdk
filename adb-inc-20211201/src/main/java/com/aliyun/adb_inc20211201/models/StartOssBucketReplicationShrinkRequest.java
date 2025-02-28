// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class StartOssBucketReplicationShrinkRequest extends TeaModel {
    @NameInMap("Ak")
    public String ak;

    @NameInMap("EncryptedSk")
    public String encryptedSk;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("PrefixList")
    public String prefixListShrink;

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

    public static StartOssBucketReplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartOssBucketReplicationShrinkRequest self = new StartOssBucketReplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartOssBucketReplicationShrinkRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public StartOssBucketReplicationShrinkRequest setEncryptedSk(String encryptedSk) {
        this.encryptedSk = encryptedSk;
        return this;
    }
    public String getEncryptedSk() {
        return this.encryptedSk;
    }

    public StartOssBucketReplicationShrinkRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public StartOssBucketReplicationShrinkRequest setPrefixListShrink(String prefixListShrink) {
        this.prefixListShrink = prefixListShrink;
        return this;
    }
    public String getPrefixListShrink() {
        return this.prefixListShrink;
    }

    public StartOssBucketReplicationShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartOssBucketReplicationShrinkRequest setReplicaKmsKeyId(String replicaKmsKeyId) {
        this.replicaKmsKeyId = replicaKmsKeyId;
        return this;
    }
    public String getReplicaKmsKeyId() {
        return this.replicaKmsKeyId;
    }

    public StartOssBucketReplicationShrinkRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public StartOssBucketReplicationShrinkRequest setSourceBucketName(String sourceBucketName) {
        this.sourceBucketName = sourceBucketName;
        return this;
    }
    public String getSourceBucketName() {
        return this.sourceBucketName;
    }

    public StartOssBucketReplicationShrinkRequest setSseKmsEncryptedObjectsStatus(String sseKmsEncryptedObjectsStatus) {
        this.sseKmsEncryptedObjectsStatus = sseKmsEncryptedObjectsStatus;
        return this;
    }
    public String getSseKmsEncryptedObjectsStatus() {
        return this.sseKmsEncryptedObjectsStatus;
    }

    public StartOssBucketReplicationShrinkRequest setTargetBucketName(String targetBucketName) {
        this.targetBucketName = targetBucketName;
        return this;
    }
    public String getTargetBucketName() {
        return this.targetBucketName;
    }

    public StartOssBucketReplicationShrinkRequest setTargetRegionCode(String targetRegionCode) {
        this.targetRegionCode = targetRegionCode;
        return this;
    }
    public String getTargetRegionCode() {
        return this.targetRegionCode;
    }

}
