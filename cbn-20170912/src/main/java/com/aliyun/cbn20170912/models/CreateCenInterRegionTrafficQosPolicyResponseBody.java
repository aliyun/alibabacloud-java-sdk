// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenInterRegionTrafficQosPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
