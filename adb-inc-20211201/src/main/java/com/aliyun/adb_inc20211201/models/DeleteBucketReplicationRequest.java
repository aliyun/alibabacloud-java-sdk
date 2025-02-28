// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DeleteBucketReplicationRequest extends TeaModel {
    @NameInMap("Ak")
    public String ak;

    @NameInMap("EncryptedSk")
    public String encryptedSk;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("SourceBucketName")
    public String sourceBucketName;

    public static DeleteBucketReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketReplicationRequest self = new DeleteBucketReplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBucketReplicationRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public DeleteBucketReplicationRequest setEncryptedSk(String encryptedSk) {
        this.encryptedSk = encryptedSk;
        return this;
    }
    public String getEncryptedSk() {
        return this.encryptedSk;
    }

    public DeleteBucketReplicationRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public DeleteBucketReplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteBucketReplicationRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DeleteBucketReplicationRequest setSourceBucketName(String sourceBucketName) {
        this.sourceBucketName = sourceBucketName;
        return this;
    }
    public String getSourceBucketName() {
        return this.sourceBucketName;
    }

}
