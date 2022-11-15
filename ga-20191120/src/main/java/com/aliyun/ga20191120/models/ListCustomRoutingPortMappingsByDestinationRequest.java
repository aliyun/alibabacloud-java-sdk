// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingPortMappingsByDestinationRequest extends TeaModel {
    @NameInMap("DestinationAddress")
    public String destinationAddress;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

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

    public ListCustomRoutingPortMappingsByDestinationRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomRoutingPortMappingsByDestinationRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
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
