// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class CheckOssObjectContentConsistencyRequest extends TeaModel {
    @NameInMap("Ak")
    public String ak;

    @NameInMap("EncryptedSk")
    public String encryptedSk;

    @NameInMap("Prefix")
    public String prefix;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceBucketName")
    public String sourceBucketName;

    @NameInMap("SourceDbClusterId")
    public String sourceDbClusterId;

    @NameInMap("SourceEndpoint")
    public String sourceEndpoint;

    @NameInMap("SourceRegionId")
    public String sourceRegionId;

    @NameInMap("TargetBucketName")
    public String targetBucketName;

    @NameInMap("TargetEndpoint")
    public String targetEndpoint;

    public static CheckOssObjectContentConsistencyRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckOssObjectContentConsistencyRequest self = new CheckOssObjectContentConsistencyRequest();
        return TeaModel.build(map, self);
    }

    public CheckOssObjectContentConsistencyRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public CheckOssObjectContentConsistencyRequest setEncryptedSk(String encryptedSk) {
        this.encryptedSk = encryptedSk;
        return this;
    }
    public String getEncryptedSk() {
        return this.encryptedSk;
    }

    public CheckOssObjectContentConsistencyRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public CheckOssObjectContentConsistencyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckOssObjectContentConsistencyRequest setSourceBucketName(String sourceBucketName) {
        this.sourceBucketName = sourceBucketName;
        return this;
    }
    public String getSourceBucketName() {
        return this.sourceBucketName;
    }

    public CheckOssObjectContentConsistencyRequest setSourceDbClusterId(String sourceDbClusterId) {
        this.sourceDbClusterId = sourceDbClusterId;
        return this;
    }
    public String getSourceDbClusterId() {
        return this.sourceDbClusterId;
    }

    public CheckOssObjectContentConsistencyRequest setSourceEndpoint(String sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public String getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public CheckOssObjectContentConsistencyRequest setSourceRegionId(String sourceRegionId) {
        this.sourceRegionId = sourceRegionId;
        return this;
    }
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public CheckOssObjectContentConsistencyRequest setTargetBucketName(String targetBucketName) {
        this.targetBucketName = targetBucketName;
        return this;
    }
    public String getTargetBucketName() {
        return this.targetBucketName;
    }

    public CheckOssObjectContentConsistencyRequest setTargetEndpoint(String targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
        return this;
    }
    public String getTargetEndpoint() {
        return this.targetEndpoint;
    }

}
