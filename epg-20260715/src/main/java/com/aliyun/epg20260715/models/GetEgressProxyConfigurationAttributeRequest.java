// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class GetEgressProxyConfigurationAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the egress proxy configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epc-hn302f6a9a284c4f****</p>
     */
    @NameInMap("EgressProxyConfigurationId")
    public String egressProxyConfigurationId;

    public static GetEgressProxyConfigurationAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEgressProxyConfigurationAttributeRequest self = new GetEgressProxyConfigurationAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetEgressProxyConfigurationAttributeRequest setEgressProxyConfigurationId(String egressProxyConfigurationId) {
        this.egressProxyConfigurationId = egressProxyConfigurationId;
        return this;
    }
    public String getEgressProxyConfigurationId() {
        return this.egressProxyConfigurationId;
    }

}
