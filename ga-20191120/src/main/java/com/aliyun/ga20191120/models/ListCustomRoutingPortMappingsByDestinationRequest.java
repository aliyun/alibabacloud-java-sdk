// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingPortMappingsByDestinationRequest extends TeaModel {
    /**
     * <p>The service IP address of the backend instance.</p>
     */
    @NameInMap("DestinationAddress")
    public String destinationAddress;

    /**
     * <p>The ID of the endpoint to which the backend instance belongs.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListCustomRoutingPortMappingsByDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingPortMappingsByDestinationRequest self = new ListCustomRoutingPortMappingsByDestinationRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingPortMappingsByDestinationRequest setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
        return this;
    }
    public String getDestinationAddress() {
        return this.destinationAddress;
    }

    public ListCustomRoutingPortMappingsByDestinationRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public ListCustomRoutingPortMappingsByDestinationRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomRoutingPortMappingsByDestinationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomRoutingPortMappingsByDestinationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
