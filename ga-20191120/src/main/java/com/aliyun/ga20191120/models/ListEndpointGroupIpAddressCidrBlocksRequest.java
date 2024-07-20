// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListEndpointGroupIpAddressCidrBlocksRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The region ID of the endpoint group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    /**
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListEndpointGroupIpAddressCidrBlocksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointGroupIpAddressCidrBlocksRequest self = new ListEndpointGroupIpAddressCidrBlocksRequest();
        return TeaModel.build(map, self);
    }

    public ListEndpointGroupIpAddressCidrBlocksRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
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
