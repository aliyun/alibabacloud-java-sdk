// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class BindInputBucketResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4AEA0480-32F4-1656-92B3-F4D4CDE6BBB3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindInputBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindInputBucketResponseBody self = new BindInputBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public BindInputBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
