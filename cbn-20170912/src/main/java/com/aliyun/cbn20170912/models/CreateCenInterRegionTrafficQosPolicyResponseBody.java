// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenInterRegionTrafficQosPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6DF9A765-BCD2-5C7E-8C32-C35C8A361A39</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the QoS policy.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-eczzew0v1kzrb5****</p>
     */
    @NameInMap("TrafficQosPolicyId")
    public String trafficQosPolicyId;

    public static CreateCenInterRegionTrafficQosPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCenInterRegionTrafficQosPolicyResponseBody self = new CreateCenInterRegionTrafficQosPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCenInterRegionTrafficQosPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCenInterRegionTrafficQosPolicyResponseBody setTrafficQosPolicyId(String trafficQosPolicyId) {
        this.trafficQosPolicyId = trafficQosPolicyId;
        return this;
    }
    public String getTrafficQosPolicyId() {
        return this.trafficQosPolicyId;
    }

}
