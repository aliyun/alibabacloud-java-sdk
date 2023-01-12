// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBandwidthPackagaAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the bandwidth plan.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request.</p>
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
