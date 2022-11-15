// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingPortMappingsByDestinationResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PortMappings")
    public java.util.List<ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings> portMappings;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCustomRoutingPortMappingsByDestinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingPortMappingsByDestinationResponseBody self = new ListCustomRoutingPortMappingsByDestinationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingPortMappingsByDestinationResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomRoutingPortMappingsByDestinationResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomRoutingPortMappingsByDestinationResponseBody setPortMappings(java.util.List<ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings> portMappings) {
        this.portMappings = portMappings;
        return this;
    }
    public java.util.List<ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings> getPortMappings() {
        return this.portMappings;
    }

    public ListCustomRoutingPortMappingsByDestinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomRoutingPortMappingsByDestinationResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappingsDestinationSocketAddress extends TeaModel {
        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Port")
        public Integer port;

        public static ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappingsDestinationSocketAddress build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappingsDestinationSocketAddress self = new ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappingsDestinationSocketAddress();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappingsDestinationSocketAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappingsDestinationSocketAddress setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings extends TeaModel {
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        @NameInMap("AcceleratorPort")
        public Integer acceleratorPort;

        @NameInMap("DestinationSocketAddress")
        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappingsDestinationSocketAddress destinationSocketAddress;

        @NameInMap("DestinationTrafficState")
        public String destinationTrafficState;

        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        @NameInMap("EndpointGroupRegion")
        public String endpointGroupRegion;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("ListenerId")
        public String listenerId;

        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        @NameInMap("Vswitch")
        public String vswitch;

        public static ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings self = new ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings setAcceleratorPort(Integer acceleratorPort) {
            this.acceleratorPort = acceleratorPort;
            return this;
        }
        public Integer getAcceleratorPort() {
            return this.acceleratorPort;
        }

        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings setDestinationSocketAddress(ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappingsDestinationSocketAddress destinationSocketAddress) {
            this.destinationSocketAddress = destinationSocketAddress;
            return this;
        }
        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappingsDestinationSocketAddress getDestinationSocketAddress() {
            return this.destinationSocketAddress;
        }

        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings setDestinationTrafficState(String destinationTrafficState) {
            this.destinationTrafficState = destinationTrafficState;
            return this;
        }
        public String getDestinationTrafficState() {
            return this.destinationTrafficState;
        }

        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings setEndpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

    }

}
