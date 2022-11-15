// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndpointGroupRequest extends TeaModel {
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCustomRoutingEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomRoutingEndpointGroupRequest self = new DescribeCustomRoutingEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomRoutingEndpointGroupRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public DescribeCustomRoutingEndpointGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
