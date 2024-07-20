// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingPortMappingsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Details about the port mapping table.</p>
     */
    @NameInMap("PortMappings")
    public java.util.List<ListCustomRoutingPortMappingsResponseBodyPortMappings> portMappings;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCustomRoutingPortMappingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingPortMappingsResponseBody self = new ListCustomRoutingPortMappingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingPortMappingsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomRoutingPortMappingsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomRoutingPortMappingsResponseBody setPortMappings(java.util.List<ListCustomRoutingPortMappingsResponseBodyPortMappings> portMappings) {
        this.portMappings = portMappings;
        return this;
    }
    public java.util.List<ListCustomRoutingPortMappingsResponseBodyPortMappings> getPortMappings() {
        return this.portMappings;
    }

    public ListCustomRoutingPortMappingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomRoutingPortMappingsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomRoutingPortMappingsResponseBodyPortMappingsDestinationSocketAddress extends TeaModel {
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

        public static ListCustomRoutingPortMappingsResponseBodyPortMappingsDestinationSocketAddress build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingPortMappingsResponseBodyPortMappingsDestinationSocketAddress self = new ListCustomRoutingPortMappingsResponseBodyPortMappingsDestinationSocketAddress();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingPortMappingsResponseBodyPortMappingsDestinationSocketAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public ListCustomRoutingPortMappingsResponseBodyPortMappingsDestinationSocketAddress setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class ListCustomRoutingPortMappingsResponseBodyPortMappings extends TeaModel {
        /**
         * <p>The ID of the GA instance.</p>
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
        public ListCustomRoutingPortMappingsResponseBodyPortMappingsDestinationSocketAddress destinationSocketAddress;

        /**
         * <p>The access policy of traffic for the backend instance. Valid values:</p>
         * <ul>
         * <li><strong>allow</strong>: allows traffic to the backend instance.</li>
         * <li><strong>deny</strong>: denies traffic to the backend instance.</li>
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
         * <p>The ID of the region in which the endpoint group resides.</p>
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
         * <p>The ID of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The protocol of the backend service.</p>
         * <ul>
         * <li><strong>tcp</strong>: TCP</li>
         * <li><strong>udp</strong>: UDP</li>
         * </ul>
         */
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        /**
         * <p>The name of the endpoint (vSwitch).</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-test01</p>
         */
        @NameInMap("Vswitch")
        public String vswitch;

        public static ListCustomRoutingPortMappingsResponseBodyPortMappings build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingPortMappingsResponseBodyPortMappings self = new ListCustomRoutingPortMappingsResponseBodyPortMappings();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingPortMappingsResponseBodyPortMappings setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListCustomRoutingPortMappingsResponseBodyPortMappings setAcceleratorPort(Integer acceleratorPort) {
            this.acceleratorPort = acceleratorPort;
            return this;
        }
        public Integer getAcceleratorPort() {
            return this.acceleratorPort;
        }

        public ListCustomRoutingPortMappingsResponseBodyPortMappings setDestinationSocketAddress(ListCustomRoutingPortMappingsResponseBodyPortMappingsDestinationSocketAddress destinationSocketAddress) {
            this.destinationSocketAddress = destinationSocketAddress;
            return this;
        }
        public ListCustomRoutingPortMappingsResponseBodyPortMappingsDestinationSocketAddress getDestinationSocketAddress() {
            return this.destinationSocketAddress;
        }

        public ListCustomRoutingPortMappingsResponseBodyPortMappings setDestinationTrafficState(String destinationTrafficState) {
            this.destinationTrafficState = destinationTrafficState;
            return this;
        }
        public String getDestinationTrafficState() {
            return this.destinationTrafficState;
        }

        public ListCustomRoutingPortMappingsResponseBodyPortMappings setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public ListCustomRoutingPortMappingsResponseBodyPortMappings setEndpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        public ListCustomRoutingPortMappingsResponseBodyPortMappings setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListCustomRoutingPortMappingsResponseBodyPortMappings setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListCustomRoutingPortMappingsResponseBodyPortMappings setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public ListCustomRoutingPortMappingsResponseBodyPortMappings setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

    }

}
