// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndpointRequest extends TeaModel {
    /**
     * <p>The ID of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp1j184jhb9i9ubwf****</p>
     */
    @NameInMap("EndpointGroup")
    public String endpointGroup;

    /**
     * <p>The ID of the endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-bp1dmlohjjz4kqaun****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCustomRoutingEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomRoutingEndpointRequest self = new DescribeCustomRoutingEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomRoutingEndpointRequest setEndpointGroup(String endpointGroup) {
        this.endpointGroup = endpointGroup;
        return this;
    }
    public String getEndpointGroup() {
        return this.endpointGroup;
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
