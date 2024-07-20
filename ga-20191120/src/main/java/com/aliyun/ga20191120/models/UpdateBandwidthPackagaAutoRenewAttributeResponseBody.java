// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBandwidthPackagaAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>gbwp-bp1sgzldyj6b4q7cx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F591955F-5CB5-4CCE-A75D-17CF2085CE22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBandwidthPackagaAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBandwidthPackagaAutoRenewAttributeResponseBody self = new UpdateBandwidthPackagaAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBandwidthPackagaAutoRenewAttributeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
