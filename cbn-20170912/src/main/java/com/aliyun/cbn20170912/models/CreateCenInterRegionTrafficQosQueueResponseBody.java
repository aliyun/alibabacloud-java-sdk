// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenInterRegionTrafficQosQueueResponseBody extends TeaModel {
    @NameInMap("QosQueueId")
    public String qosQueueId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCenInterRegionTrafficQosQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCenInterRegionTrafficQosQueueResponseBody self = new CreateCenInterRegionTrafficQosQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCenInterRegionTrafficQosQueueResponseBody setQosQueueId(String qosQueueId) {
        this.qosQueueId = qosQueueId;
        return this;
    }
    public String getQosQueueId() {
        return this.qosQueueId;
    }

    public CreateCenInterRegionTrafficQosQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
