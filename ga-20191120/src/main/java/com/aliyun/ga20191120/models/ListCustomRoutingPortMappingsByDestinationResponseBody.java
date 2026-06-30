// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingPortMappingsByDestinationResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The information about the port mappings.</p>
     */
    @NameInMap("PortMappings")
    public java.util.List<ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappings> portMappings;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>String	04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The service IP address of the backend instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The service port of the backend instance.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
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
        /**
         * <p>The ID of the Global Accelerator instance to which the port mapping belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The acceleration port.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("AcceleratorPort")
        public Integer acceleratorPort;

        /**
         * <p>The service IP address and port of the backend instance.</p>
         */
        @NameInMap("DestinationSocketAddress")
        public ListCustomRoutingPortMappingsByDestinationResponseBodyPortMappingsDestinationSocketAddress destinationSocketAddress;

        /**
         * <p>The traffic policy for the backend instance.</p>
         * <ul>
         * <li><p><strong>allow</strong>: allows the backend instance to receive traffic.</p>
         * </li>
         * <li><p><strong>deny</strong>: denies the backend instance from receiving traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("DestinationTrafficState")
        public String destinationTrafficState;

        /**
         * <p>The ID of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-bp14sz7ftcwwjgrdm****</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The ID of the region where the endpoint group is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>us-west-1</p>
         */
        @NameInMap("EndpointGroupRegion")
        public String endpointGroupRegion;

        /**
         * <p>The ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-bp14sz7ftcwwjgrdm****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The ID of the custom routing listener to which the port mapping belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The protocol of the backend service.</p>
         * <ul>
         * <li><p><strong>TCP</strong>: TCP.</p>
         * </li>
         * <li><p><strong>UDP</strong>: UDP.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        /**
         * <p>The name of the vSwitch instance of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-test01</p>
         */
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
