// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointGroupDestinationsResponseBody extends TeaModel {
    /**
     * <p>The details about the endpoint group mappings.</p>
     */
    @NameInMap("Destinations")
    public java.util.List<ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations> destinations;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
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

    public static class ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinationsServiceManagedInfos extends TeaModel {
        /**
         * <p>Managed policy action name, Valid values:</p>
         * <p>Create
         * Update
         * Delete
         * Associate
         * UserUnmanaged
         * CreateChild</p>
         * 
         * <strong>example:</strong>
         * <p>Update</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the child resource. Valid values:</p>
         * <ul>
         * <li><strong>Listener</strong>: listener.</li>
         * <li><strong>IpSet</strong>: acceleration region.</li>
         * <li><strong>EndpointGroup</strong>: endpoint group.</li>
         * <li><strong>ForwardingRule</strong>: forwarding rule.</li>
         * <li><strong>Endpoint</strong>: endpoint.</li>
         * <li><strong>EndpointGroupDestination</strong>: protocol mapping of an endpoint group associated with a custom routing listener.</li>
         * <li><strong>EndpointPolicy</strong>: traffic policy of an endpoint associated with a custom routing listener.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only if <strong>Action</strong> is set to <strong>CreateChild</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified actions are managed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The specified actions are managed, and you cannot perform the specified actions on the managed instance.</li>
         * <li><strong>false</strong>: The specified actions are not managed, and you can perform the specified actions on the managed instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        public static ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinationsServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinationsServiceManagedInfos self = new ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinationsServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinationsServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinationsServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinationsServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations extends TeaModel {
        /**
         * <p>The GA instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The ID of the endpoint group mapping.</p>
         * 
         * <strong>example:</strong>
         * <p>dst-123abc****</p>
         */
        @NameInMap("DestinationId")
        public String destinationId;

        /**
         * <p>The endpoint group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-bp14sz7ftcwwjgrdm****</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The first port of the backend service port range.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The listener ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The backend service protocols of the endpoint group. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>TCP,UDP</strong></li>
         * </ul>
         */
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        /**
         * <p>The ID of the service that manages the GA instance.</p>
         * <blockquote>
         * <p> This parameter takes effect only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Indicates whether the GA instance is managed. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The actions that you can perform on the managed instance.</p>
         * <blockquote>
         * <p> This parameter takes effect only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
         * </blockquote>
         * <ul>
         * <li>You can perform only specific actions on a managed instance.</li>
         * </ul>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinationsServiceManagedInfos> serviceManagedInfos;

        /**
         * <p>The last port of the backend service port range.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
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

        public ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations setServiceManagedInfos(java.util.List<ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinationsServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }
        public java.util.List<ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinationsServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
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
