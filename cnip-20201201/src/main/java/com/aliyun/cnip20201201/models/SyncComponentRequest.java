// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class SyncComponentRequest extends TeaModel {
    @NameInMap("region")
    public String region;

    @NameInMap("bucketName")
    public String bucketName;

    public static SyncComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncComponentRequest self = new SyncComponentRequest();
        return TeaModel.build(map, self);
    }

    public SyncComponentRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SyncComponentRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

}
