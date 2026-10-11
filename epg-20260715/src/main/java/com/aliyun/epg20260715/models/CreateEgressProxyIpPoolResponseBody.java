// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyIpPoolResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eppool-gw80d96a96ca0b00****</p>
     */
    @NameInMap("EgressProxyIpPoolId")
    public String egressProxyIpPoolId;

    /**
     * <strong>example:</strong>
     * <p>01A05AB7-6C14-5A12-94E7-F20F9F69AE3D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEgressProxyIpPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyIpPoolResponseBody self = new CreateEgressProxyIpPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyIpPoolResponseBody setEgressProxyIpPoolId(String egressProxyIpPoolId) {
        this.egressProxyIpPoolId = egressProxyIpPoolId;
        return this;
    }
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    public CreateEgressProxyIpPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
