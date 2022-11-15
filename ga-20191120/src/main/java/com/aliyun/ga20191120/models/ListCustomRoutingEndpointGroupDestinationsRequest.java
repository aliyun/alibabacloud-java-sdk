// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointGroupDestinationsRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("FromPort")
    public Integer fromPort;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Protocols")
    public java.util.List<String> protocols;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ToPort")
    public Integer toPort;

    public static ListCustomRoutingEndpointGroupDestinationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingEndpointGroupDestinationsRequest self = new ListCustomRoutingEndpointGroupDestinationsRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }
    public Integer getFromPort() {
        return this.fromPort;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }
    public Integer getToPort() {
        return this.toPort;
    }

}
