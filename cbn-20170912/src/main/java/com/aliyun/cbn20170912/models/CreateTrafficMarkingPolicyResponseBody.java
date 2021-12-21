// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTrafficMarkingPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficMarkingPolicyId")
    public String trafficMarkingPolicyId;

    public static CreateTrafficMarkingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMarkingPolicyResponseBody self = new CreateTrafficMarkingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMarkingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTrafficMarkingPolicyResponseBody setTrafficMarkingPolicyId(String trafficMarkingPolicyId) {
        this.trafficMarkingPolicyId = trafficMarkingPolicyId;
        return this;
    }
    public String getTrafficMarkingPolicyId() {
        return this.trafficMarkingPolicyId;
    }

}
