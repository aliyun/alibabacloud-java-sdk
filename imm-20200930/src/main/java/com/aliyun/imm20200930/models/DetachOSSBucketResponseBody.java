// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetachOSSBucketResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    public static DetachOSSBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachOSSBucketResponseBody self = new DetachOSSBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachOSSBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
