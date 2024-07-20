// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListEndpointGroupIpAddressCidrBlocksResponseBody extends TeaModel {
    /**
     * <p>The region ID of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    /**
     * <p>The CIDR blocks.</p>
     */
    @NameInMap("IpAddressCidrBlocks")
    public java.util.List<String> ipAddressCidrBlocks;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B6DBBB0-2D01-4C6A-A384-4129266E6B78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the endpoint group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekztkx4zwc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    public static ListEndpointGroupIpAddressCidrBlocksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointGroupIpAddressCidrBlocksResponseBody self = new ListEndpointGroupIpAddressCidrBlocksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEndpointGroupIpAddressCidrBlocksResponseBody setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public ListEndpointGroupIpAddressCidrBlocksResponseBody setIpAddressCidrBlocks(java.util.List<String> ipAddressCidrBlocks) {
        this.ipAddressCidrBlocks = ipAddressCidrBlocks;
        return this;
    }
    public java.util.List<String> getIpAddressCidrBlocks() {
        return this.ipAddressCidrBlocks;
    }

    public ListEndpointGroupIpAddressCidrBlocksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEndpointGroupIpAddressCidrBlocksResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListEndpointGroupIpAddressCidrBlocksResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
