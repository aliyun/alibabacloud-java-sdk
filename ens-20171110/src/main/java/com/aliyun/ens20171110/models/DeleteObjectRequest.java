// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteObjectRequest extends TeaModel {
    /**
     * <p>The name of the bucket.</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The name of the source file.</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

    public static DeleteObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteObjectRequest self = new DeleteObjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteObjectRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public DeleteObjectRequest setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

}
