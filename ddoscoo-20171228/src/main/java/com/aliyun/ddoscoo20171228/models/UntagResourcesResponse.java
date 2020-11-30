// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class UntagResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UntagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesResponse self = new UntagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UntagResourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
