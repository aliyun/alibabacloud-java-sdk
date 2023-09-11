// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointGroupDestinationsResponseBody extends TeaModel {
    /**
     * <p>The details about the endpoint group mapping configurations.</p>
     */
    @NameInMap("Destinations")
    public java.util.List<ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinations> destinations;

    /**
     * <p>The number of the returned page.</p>
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
     * <p>The total number of entries returned.</p>
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
         * <br>
         * <p>Create</p>
         * <p>Update</p>
         * <p>Delete</p>
         * <p>Associate</p>
         * <p>UserUnmanaged</p>
         * <p>CreateChild</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>Sub resource type, Valid values:</p>
         * <br>
         * <p>Listener</p>
         * <p>IpSet</p>
         * <p>EndpointGroup</p>
         * <p>ForwardingRule</p>
         * <p>Endpoint</p>
         * <p>EndpointGroupDestination</p>
         * <p>EndpointPolicy</p>
         * <br>
         * <p>> Only valid when the Action parameter is CreateChild.</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Is the managed policy action managed, Valid values:</p>
         * <br>
         * <p>- **true**: The managed policy action is managed, and users do not have permission to perform the operation specified in the Action on the managed instance.</p>
         * <br>
         * <p>- **false**: The managed policy action is not managed, and users have permission to perform the operation specified in the Action on the managed instance.</p>
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
         * <p>*   **TCP**: TCP</p>
         * <p>*   **UDP**: UDP</p>
         * <p>*   **TCP,UDP**: TCP and UDP</p>
         */
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        /**
         * <p>The service ID to which the managed instance belongs.</p>
         * <br>
         * <p>>  Valid only when the ServiceManaged parameter is True.</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Is it a managed instance. Valid values:</p>
         * <br>
         * <p>- **true**</p>
         * <br>
         * <p>- **false**</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>A list of action policies that users can execute on this managed instance.</p>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListCustomRoutingEndpointGroupDestinationsResponseBodyDestinationsServiceManagedInfos> serviceManagedInfos;

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
