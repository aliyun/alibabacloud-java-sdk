// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AttachOSSBucketResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    public static AttachOSSBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachOSSBucketResponseBody self = new AttachOSSBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachOSSBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
