// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class CreateTrafficControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
