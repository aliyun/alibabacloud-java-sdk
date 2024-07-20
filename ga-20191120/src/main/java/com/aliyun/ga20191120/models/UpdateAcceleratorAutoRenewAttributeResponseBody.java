// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4qz****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F591955F-5CB5-4CCE-A75D-17CF2085CE22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAcceleratorAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcceleratorAutoRenewAttributeResponseBody self = new UpdateAcceleratorAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAcceleratorAutoRenewAttributeResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public UpdateAcceleratorAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
