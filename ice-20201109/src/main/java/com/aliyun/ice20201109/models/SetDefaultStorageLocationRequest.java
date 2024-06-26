// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetDefaultStorageLocationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>oss-test-bucket</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <strong>example:</strong>
     * <p>ims/dir</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>user_oss_bucket</p>
     */
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

    public SetDefaultStorageLocationRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
