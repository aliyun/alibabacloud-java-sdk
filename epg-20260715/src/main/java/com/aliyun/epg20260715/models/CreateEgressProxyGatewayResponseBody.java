// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyGatewayResponseBody extends TeaModel {
    /**
     * <p>The ID of the egress proxy gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-gw80bb6a94f835db****</p>
     */
    @NameInMap("EgressProxyGatewayId")
    public String egressProxyGatewayId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01A05AB5-98DC-5175-9BBB-33BA653BC0C6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEgressProxyGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyGatewayResponseBody self = new CreateEgressProxyGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyGatewayResponseBody setEgressProxyGatewayId(String egressProxyGatewayId) {
        this.egressProxyGatewayId = egressProxyGatewayId;
        return this;
    }
    public String getEgressProxyGatewayId() {
        return this.egressProxyGatewayId;
    }

    public CreateEgressProxyGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
