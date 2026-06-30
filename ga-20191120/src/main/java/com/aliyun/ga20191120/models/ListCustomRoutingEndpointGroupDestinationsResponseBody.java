// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointGroupDestinationsResponseBody extends TeaModel {
    /**
     * <p>The destination configurations of the endpoint group.</p>
     */
    @NameInMap("Destinations")
    public java.util.List<ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations> destinations;

    /**
     * <p>The page number of the list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
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
         * <p>The name of the managed policy action. Valid values:</p>
         * <ul>
         * <li><strong>Create</strong>: Create an instance.</li>
         * <li><strong>Update</strong>: Update the current instance.</li>
         * <li><strong>Delete</strong>: Delete the current instance.</li>
         * <li><strong>Associate</strong>: Reference or be referenced by the current instance.</li>
         * <li><strong>UserUnmanaged</strong>: Unmanage the instance.</li>
         * <li><strong>CreateChild</strong>: Create a child resource under the current instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the child resource. Valid values:</p>
         * <ul>
         * <li><strong>Listener</strong>: listener resource.</li>
         * <li><strong>IpSet</strong>: acceleration region resource.</li>
         * <li><strong>EndpointGroup</strong>: endpoint group resource.</li>
         * <li><strong>ForwardingRule</strong>: forwarding rule resource.</li>
         * <li><strong>Endpoint</strong>: endpoint resource.</li>
         * <li><strong>EndpointGroupDestination</strong>: protocol mapping resource of the endpoint group under a custom routing listener.</li>
         * <li><strong>EndpointPolicy</strong>: endpoint traffic policy resource under a custom routing listener.<blockquote>
         * <p>This parameter is valid only when <strong>Action</strong> is set to <strong>CreateChild</strong>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the managed policy action is managed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The managed policy action is managed. The user cannot perform the action specified by Action on the managed instance.</li>
         * <li><strong>false</strong>: The managed policy action is not managed. The user can perform the action specified by Action on the managed instance.</li>
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
         * <p>The instance ID of the Alibaba Cloud Global Accelerator (GA) instance to which the endpoint group destination configuration belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The ID of the endpoint group destination configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>dst-123abc****</p>
         */
        @NameInMap("DestinationId")
        public String destinationId;

        /**
         * <p>The ID of the endpoint group to which the destination configuration belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-bp14sz7ftcwwjgrdm****</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The start port of the backend service of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The ID of the listener to which the endpoint group destination configuration belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The Protocol Type of the backend service of the endpoint group.</p>
         * <ul>
         * <li><p><strong>TCP</strong>: TCP protocol.</p>
         * </li>
         * <li><p><strong>UDP</strong>: UDP protocol.</p>
         * </li>
         * <li><p><strong>TCP,UDP</strong>: TCP and UDP protocols.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        /**
         * <p>The ID of the service to which the managed instance belongs.</p>
         * <blockquote>
         * <p>This parameter is valid only when <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Indicates whether the instance is managed. Valid values:  </p>
         * <ul>
         * <li><p>true: The instance is managed.  </p>
         * </li>
         * <li><p>false: The instance is not managed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The list of action policies that the user can execute on the managed instance.</p>
         * <blockquote>
         * <p>This parameter is valid only when <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
         * <ul>
         * <li>When the instance is in the managed state, user operations on the instance are restricted, and certain operations are prohibited.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinationsServiceManagedInfos> serviceManagedInfos;

        /**
         * <p>The end port of the backend service of the endpoint group.</p>
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
