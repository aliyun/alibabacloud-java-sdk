// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeOssBucketReplicationRulesRequest extends TeaModel {
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

    public static DescribeOssBucketReplicationRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssBucketReplicationRulesRequest self = new DescribeOssBucketReplicationRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssBucketReplicationRulesRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public DescribeOssBucketReplicationRulesRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public DescribeOssBucketReplicationRulesRequest setEncryptedSk(String encryptedSk) {
        this.encryptedSk = encryptedSk;
        return this;
    }
    public String getEncryptedSk() {
        return this.encryptedSk;
    }

    public DescribeOssBucketReplicationRulesRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public DescribeOssBucketReplicationRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
