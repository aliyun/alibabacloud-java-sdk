// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketLifecycleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>62373E71-5521-4620-8AAB-133CCE49357A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PutBucketLifecycleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutBucketLifecycleResponseBody self = new PutBucketLifecycleResponseBody();
        return TeaModel.build(map, self);
    }

    public PutBucketLifecycleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
