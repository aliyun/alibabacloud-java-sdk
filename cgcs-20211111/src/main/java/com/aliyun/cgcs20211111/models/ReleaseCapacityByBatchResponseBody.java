// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReleaseCapacityByBatchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>46329898-489C-4E63-9BA1-C1DA5C5D0986</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseCapacityByBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseCapacityByBatchResponseBody self = new ReleaseCapacityByBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseCapacityByBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
