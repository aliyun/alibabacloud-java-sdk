// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UnTagLiveResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnTagLiveResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UnTagLiveResourcesResponse self = new UnTagLiveResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UnTagLiveResourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
