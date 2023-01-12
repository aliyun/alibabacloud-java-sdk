// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointGroupDestinationsResponseBody extends TeaModel {
    /**
     * <p>Details of the endpoint group mappings.</p>
     */
    @NameInMap("Destinations")
    public java.util.List<ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations> destinations;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCustomRoutingEndpointGroupDestinationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingEndpointGroupDestinationsResponseBody self = new ListCustomRoutingEndpointGroupDestinationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingEndpointGroupDestinationsResponseBody setDestinations(java.util.List<ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations> destinations) {
        this.destinations = destinations;
        return this;
    }
    public java.util.List<ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations> getDestinations() {
        return this.destinations;
    }

    public ListCustomRoutingEndpointGroupDestinationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomRoutingEndpointGroupDestinationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomRoutingEndpointGroupDestinationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomRoutingEndpointGroupDestinationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations extends TeaModel {
        /**
         * <p>The ID of the GA instance.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The ID of the endpoint group mapping configuration.</p>
         */
        @NameInMap("DestinationId")
        public String destinationId;

        /**
         * <p>The ID of the endpoint group.</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The start port of the backend service port range of the endpoint group.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The ID of the listener.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The backend service protocol of the endpoint group.</p>
         * <br>
         * <p>*   **tcp**: TCP</p>
         * <p>*   **udp**: UDP</p>
         * <p>*   **tcp,udp**: TCP and UDP</p>
         */
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        /**
         * <p>The end port of the backend service port range of the endpoint group.</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations self = new ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations setDestinationId(String destinationId) {
            this.destinationId = destinationId;
            return this;
        }
        public String getDestinationId() {
            return this.destinationId;
        }

        public ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

}
