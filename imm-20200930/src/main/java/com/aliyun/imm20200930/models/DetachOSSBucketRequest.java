// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetachOSSBucketRequest extends TeaModel {
    /**
     * <p>The OSS bucket that you want to unbind.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>examplebucket</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    public static DetachOSSBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachOSSBucketRequest self = new DetachOSSBucketRequest();
        return TeaModel.build(map, self);
    }

    public DetachOSSBucketRequest setOSSBucket(String OSSBucket) {
        this.OSSBucket = OSSBucket;
        return this;
    }
    public String getOSSBucket() {
        return this.OSSBucket;
    }

}
