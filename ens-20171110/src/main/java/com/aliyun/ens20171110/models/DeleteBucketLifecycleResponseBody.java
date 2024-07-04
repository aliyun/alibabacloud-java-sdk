// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteBucketLifecycleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C6583E8B-B930-4F59-ADC0-0E209A45E860</p>
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
