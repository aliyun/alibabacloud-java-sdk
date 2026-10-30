// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenInterRegionTrafficQosQueueResponseBody extends TeaModel {
    /**
     * <p>The ID of the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-queue-irqhi8k5fdyuu5****</p>
     */
    @NameInMap("QosQueueId")
    public String qosQueueId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>845F66F6-5C27-53A1-9428-B859086237B2</p>
     */
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
