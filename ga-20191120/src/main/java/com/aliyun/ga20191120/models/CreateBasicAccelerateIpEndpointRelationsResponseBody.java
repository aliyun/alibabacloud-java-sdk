// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicAccelerateIpEndpointRelationsResponseBody extends TeaModel {
    /**
     * <p>The ID of the basic GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBasicAccelerateIpEndpointRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicAccelerateIpEndpointRelationsResponseBody self = new CreateBasicAccelerateIpEndpointRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBasicAccelerateIpEndpointRelationsResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateBasicAccelerateIpEndpointRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
