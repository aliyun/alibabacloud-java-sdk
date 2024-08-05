// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateTrafficControlResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the throttling policy.</p>
     * 
     * <strong>example:</strong>
     * <p>tf123456</p>
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
