// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetDefaultStorageLocationRequest extends TeaModel {
    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("Path")
    public String path;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StorageType")
    public String storageType;

    public static SetDefaultStorageLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultStorageLocationRequest self = new SetDefaultStorageLocationRequest();
        return TeaModel.build(map, self);
    }

    public SetDefaultStorageLocationRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public SetDefaultStorageLocationRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public SetDefaultStorageLocationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetDefaultStorageLocationRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
