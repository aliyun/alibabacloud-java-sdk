// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketAclResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C0066F05-3116-4BAA-B588-52EB2E7F5D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PutBucketAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutBucketAclResponseBody self = new PutBucketAclResponseBody();
        return TeaModel.build(map, self);
    }

    public PutBucketAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
