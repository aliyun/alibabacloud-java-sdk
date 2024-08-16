// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenInterRegionTrafficQosQueueResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6DF9A765-BCD2-5C7E-8C32-C35C8A361A39</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCenInterRegionTrafficQosQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenInterRegionTrafficQosQueueResponseBody self = new DeleteCenInterRegionTrafficQosQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCenInterRegionTrafficQosQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
