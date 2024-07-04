// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketAclRequest extends TeaModel {
    /**
     * <p>The access control list (ACL) of the bucket.</p>
     * <ul>
     * <li><strong>public-read-write</strong></li>
     * <li><strong>public-read</strong></li>
     * <li><strong>private</strong> (default)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("BucketAcl")
    public String bucketAcl;

    /**
     * <p>The name of the bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    public static PutBucketAclRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketAclRequest self = new PutBucketAclRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketAclRequest setBucketAcl(String bucketAcl) {
        this.bucketAcl = bucketAcl;
        return this;
    }
    public String getBucketAcl() {
        return this.bucketAcl;
    }

    public PutBucketAclRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

}
