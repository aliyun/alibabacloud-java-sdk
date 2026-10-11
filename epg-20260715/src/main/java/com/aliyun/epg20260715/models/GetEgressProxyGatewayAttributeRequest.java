// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class GetEgressProxyGatewayAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the egress proxy gateway instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-gw80bb6a94f835db****</p>
     */
    @NameInMap("EgressProxyGatewayId")
    public String egressProxyGatewayId;

    public static GetEgressProxyGatewayAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEgressProxyGatewayAttributeRequest self = new GetEgressProxyGatewayAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetEgressProxyGatewayAttributeRequest setEgressProxyGatewayId(String egressProxyGatewayId) {
        this.egressProxyGatewayId = egressProxyGatewayId;
        return this;
    }
    public String getEgressProxyGatewayId() {
        return this.egressProxyGatewayId;
    }

}
