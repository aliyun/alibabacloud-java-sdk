// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetBucketAclRequest extends TeaModel {
    /**
     * <p>The name of the bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    public static GetBucketAclRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBucketAclRequest self = new GetBucketAclRequest();
        return TeaModel.build(map, self);
    }

    public GetBucketAclRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

}
