// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeOssBucketReplicationProgressRequest extends TeaModel {
    @NameInMap("Ak")
    public String ak;

    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("EncryptedSk")
    public String encryptedSk;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleId")
    public String ruleId;

    public static DescribeOssBucketReplicationProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssBucketReplicationProgressRequest self = new DescribeOssBucketReplicationProgressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssBucketReplicationProgressRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public DescribeOssBucketReplicationProgressRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public DescribeOssBucketReplicationProgressRequest setEncryptedSk(String encryptedSk) {
        this.encryptedSk = encryptedSk;
        return this;
    }
    public String getEncryptedSk() {
        return this.encryptedSk;
    }

    public DescribeOssBucketReplicationProgressRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public DescribeOssBucketReplicationProgressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeOssBucketReplicationProgressRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
