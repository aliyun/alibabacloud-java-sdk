// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>85123E71-7710-4620-8AAB-133CCE49EC83</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PutBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutBucketResponseBody self = new PutBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public PutBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
