// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class GetEgressProxyIpPoolAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eppool-gw80d96a96ca0b00****</p>
     */
    @NameInMap("EgressProxyIpPoolId")
    public String egressProxyIpPoolId;

    public static GetEgressProxyIpPoolAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEgressProxyIpPoolAttributeRequest self = new GetEgressProxyIpPoolAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetEgressProxyIpPoolAttributeRequest setEgressProxyIpPoolId(String egressProxyIpPoolId) {
        this.egressProxyIpPoolId = egressProxyIpPoolId;
        return this;
    }
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

}
