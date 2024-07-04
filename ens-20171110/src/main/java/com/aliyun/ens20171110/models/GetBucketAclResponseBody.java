// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetBucketAclResponseBody extends TeaModel {
    /**
     * <p>The ACL of the bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("BucketAcl")
    public String bucketAcl;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5C881388-2D4B-46F4-A96B-D4E6BD0886A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetBucketAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketAclResponseBody self = new GetBucketAclResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketAclResponseBody setBucketAcl(String bucketAcl) {
        this.bucketAcl = bucketAcl;
        return this;
    }
    public String getBucketAcl() {
        return this.bucketAcl;
    }

    public GetBucketAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
