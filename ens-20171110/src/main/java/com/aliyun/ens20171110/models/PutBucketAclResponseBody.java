// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketAclResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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
