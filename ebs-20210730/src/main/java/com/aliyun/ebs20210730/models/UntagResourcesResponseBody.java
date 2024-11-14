// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class UntagResourcesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. The request ID is returned regardless of whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>C46FF5A8-C5F0-4024-8262-B16B6392****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UntagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesResponseBody self = new UntagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
