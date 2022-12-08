// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicEndpointRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetBasicEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBasicEndpointRequest self = new GetBasicEndpointRequest();
        return TeaModel.build(map, self);
    }

    public GetBasicEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetBasicEndpointRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public GetBasicEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
