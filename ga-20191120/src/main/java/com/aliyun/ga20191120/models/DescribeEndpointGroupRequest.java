// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeEndpointGroupRequest extends TeaModel {
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointGroupRequest self = new DescribeEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointGroupRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public DescribeEndpointGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
