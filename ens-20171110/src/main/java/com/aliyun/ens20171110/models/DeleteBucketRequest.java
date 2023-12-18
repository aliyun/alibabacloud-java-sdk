// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteBucketRequest extends TeaModel {
    /**
     * <p>The name of the bucket that you want to delete. You can delete only one bucket at a time.</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    public static DeleteBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketRequest self = new DeleteBucketRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBucketRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

}
