// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicEndpointGroupRequest extends TeaModel {
    // 客户端Token
    @NameInMap("ClientToken")
    public String clientToken;

    // 终端节点组Id
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    // RegionId
    @NameInMap("RegionId")
    public String regionId;

    public static GetBasicEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBasicEndpointGroupRequest self = new GetBasicEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetBasicEndpointGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetBasicEndpointGroupRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public GetBasicEndpointGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
