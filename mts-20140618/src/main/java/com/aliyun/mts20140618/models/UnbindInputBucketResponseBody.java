// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UnbindInputBucketResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4AEA0480-32F4-1656-92B3-F4D4CDE6BBB3</p>
     */
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
