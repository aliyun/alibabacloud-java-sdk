// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListEndpointGroupIpAddressCidrBlocksRequest extends TeaModel {
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    @NameInMap("RegionId")
    public String regionId;

    public static ListEndpointGroupIpAddressCidrBlocksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointGroupIpAddressCidrBlocksRequest self = new ListEndpointGroupIpAddressCidrBlocksRequest();
        return TeaModel.build(map, self);
    }

    public ListEndpointGroupIpAddressCidrBlocksRequest setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public ListEndpointGroupIpAddressCidrBlocksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
