// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UnTagLiveResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>97C68796-EB7F-4D41-9D5B-12B909D76508</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnTagLiveResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnTagLiveResourcesResponseBody self = new UnTagLiveResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UnTagLiveResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
