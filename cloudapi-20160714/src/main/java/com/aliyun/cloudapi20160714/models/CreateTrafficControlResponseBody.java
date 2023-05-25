// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateTrafficControlResponseBody extends TeaModel {
    /**
     * <p>Creates a custom throttling policy.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>*   This API is intended for API providers.</p>
     * <p>*   Throttling policies must be bound to APIs to take effect. After a policy is bound to an API, it goes into effect on that API immediately.</p>
     * <p>*   The QPS limit on this operation is 50 per user.</p>
     */
    @NameInMap("TrafficControlId")
    public String trafficControlId;

    public static CreateTrafficControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficControlResponseBody self = new CreateTrafficControlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrafficControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTrafficControlResponseBody setTrafficControlId(String trafficControlId) {
        this.trafficControlId = trafficControlId;
        return this;
    }
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

}
