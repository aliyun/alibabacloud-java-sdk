// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class UnbindInputBucketResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindInputBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindInputBucketResponseBody self = new UnbindInputBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindInputBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
