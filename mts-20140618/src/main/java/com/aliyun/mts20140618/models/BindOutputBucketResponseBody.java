// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class BindOutputBucketResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindOutputBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindOutputBucketResponseBody self = new BindOutputBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public BindOutputBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
