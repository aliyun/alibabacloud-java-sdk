// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetBucketInfoRequest extends TeaModel {
    /**
     * <p>The name of the bucket.</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    public static GetBucketInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBucketInfoRequest self = new GetBucketInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetBucketInfoRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

}
