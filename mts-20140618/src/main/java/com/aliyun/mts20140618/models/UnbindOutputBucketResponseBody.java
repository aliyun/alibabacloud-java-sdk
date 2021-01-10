// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UnbindOutputBucketResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindOutputBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindOutputBucketResponseBody self = new UnbindOutputBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindOutputBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
