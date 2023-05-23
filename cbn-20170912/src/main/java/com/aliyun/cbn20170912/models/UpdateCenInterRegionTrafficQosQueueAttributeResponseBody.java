// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateCenInterRegionTrafficQosQueueAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCenInterRegionTrafficQosQueueAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCenInterRegionTrafficQosQueueAttributeResponseBody self = new UpdateCenInterRegionTrafficQosQueueAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
