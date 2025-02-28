// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GetBucketTransferAccelerationRequest extends TeaModel {
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

    public static GetBucketTransferAccelerationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBucketTransferAccelerationRequest self = new GetBucketTransferAccelerationRequest();
        return TeaModel.build(map, self);
    }

    public GetBucketTransferAccelerationRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public GetBucketTransferAccelerationRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public GetBucketTransferAccelerationRequest setEncryptedSk(String encryptedSk) {
        this.encryptedSk = encryptedSk;
        return this;
    }
    public String getEncryptedSk() {
        return this.encryptedSk;
    }

    public GetBucketTransferAccelerationRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public GetBucketTransferAccelerationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
