// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UnbindOutputBucketResponseBody extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to <strong>UnbindOutputBucket</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4AEA0480-32F4-1656-92B3-F4D4CDE6BBB3</p>
     */
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
