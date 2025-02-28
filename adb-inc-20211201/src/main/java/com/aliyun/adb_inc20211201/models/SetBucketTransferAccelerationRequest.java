// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class SetBucketTransferAccelerationRequest extends TeaModel {
    @NameInMap("AccelerationEnabled")
    public Boolean accelerationEnabled;

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

    public static SetBucketTransferAccelerationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetBucketTransferAccelerationRequest self = new SetBucketTransferAccelerationRequest();
        return TeaModel.build(map, self);
    }

    public SetBucketTransferAccelerationRequest setAccelerationEnabled(Boolean accelerationEnabled) {
        this.accelerationEnabled = accelerationEnabled;
        return this;
    }
    public Boolean getAccelerationEnabled() {
        return this.accelerationEnabled;
    }

    public SetBucketTransferAccelerationRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public SetBucketTransferAccelerationRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public SetBucketTransferAccelerationRequest setEncryptedSk(String encryptedSk) {
        this.encryptedSk = encryptedSk;
        return this;
    }
    public String getEncryptedSk() {
        return this.encryptedSk;
    }

    public SetBucketTransferAccelerationRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SetBucketTransferAccelerationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
