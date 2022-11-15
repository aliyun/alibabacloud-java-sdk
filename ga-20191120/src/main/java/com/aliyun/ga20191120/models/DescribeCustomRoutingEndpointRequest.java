// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndpointRequest extends TeaModel {
    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCustomRoutingEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomRoutingEndpointRequest self = new DescribeCustomRoutingEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomRoutingEndpointRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DescribeCustomRoutingEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
