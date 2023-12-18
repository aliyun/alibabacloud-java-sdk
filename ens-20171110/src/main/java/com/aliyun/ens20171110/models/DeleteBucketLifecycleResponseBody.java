// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteBucketLifecycleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBucketLifecycleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketLifecycleResponseBody self = new DeleteBucketLifecycleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBucketLifecycleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
