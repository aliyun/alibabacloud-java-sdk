// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointsResponseBody extends TeaModel {
    /**
     * <p>The information about the endpoints.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<ListCustomRoutingEndpointsResponseBodyEndpoints> endpoints;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCustomRoutingEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingEndpointsResponseBody self = new ListCustomRoutingEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingEndpointsResponseBody setEndpoints(java.util.List<ListCustomRoutingEndpointsResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<ListCustomRoutingEndpointsResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public ListCustomRoutingEndpointsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomRoutingEndpointsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomRoutingEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomRoutingEndpointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos extends TeaModel {
        /**
         * <p>The name of the action performed on the managed instance. Valid values:</p>
         * <br>
         * <p>*   **Create**</p>
         * <p>*   **Update**</p>
         * <p>*   **Delete**</p>
         * <p>*   **Associate**</p>
         * <p>*   **UserUnmanaged**</p>
         * <p>*   **CreateChild**</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the child resource. Valid values:</p>
         * <br>
         * <p>*   **Listener**: listener</p>
         * <p>*   **IpSet**: acceleration region</p>
         * <p>*   **EndpointGroup**: endpoint group</p>
         * <p>*   **ForwardingRule**: forwarding rule</p>
         * <p>*   **Endpoint**: endpoint</p>
         * <p>*   **EndpointGroupDestination**: protocol mapping of an endpoint group associated with a custom routing listener</p>
         * <p>*   **EndpointPolicy**: traffic policy of an endpoint associated with a custom routing listener</p>
         * <br>
         * <p>>  This parameter is valid only if **Action** is set to **CreateChild**.</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified actions are managed. Valid values:</p>
         * <br>
         * <p>*   **true**: The specified actions are managed, and users cannot perform the specified actions on the managed resource.</p>
         * <p>*   **false**: The specified actions are not managed, and users can perform the specified actions on the managed resource.</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        public static ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos self = new ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class ListCustomRoutingEndpointsResponseBodyEndpoints extends TeaModel {
        /**
         * <p>The ID of the GA instance with which the endpoint is associated.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The name of the vSwitch that is specified as an endpoint.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The ID of the endpoint group to which the endpoint belongs.</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The endpoint ID.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The ID of the listener to which the endpoint belongs.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The ID of the service that manages the GA instance.</p>
         * <br>
         * <p>>  This parameter is valid only if **ServiceManaged** is set to **True**.</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Indicates whether the GA instance is managed. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The actions that users can perform on the managed instance.</p>
         * <br>
         * <p>>  This parameter is valid only if **ServiceManaged** is set to **True**.</p>
         * <br>
         * <p>*   Users can perform only specific actions on a managed instance.</p>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos> serviceManagedInfos;

        /**
         * <p>The access policy of traffic that is destined for the endpoint. Valid values:</p>
         * <br>
         * <p>*   **AllowAll**: allows all traffic to the endpoint.</p>
         * <p>*   **DenyAll**: denies all traffic to the endpoint.</p>
         * <p>*   **AllowCustom**: allows traffic only to specified destinations.</p>
         */
        @NameInMap("TrafficToEndpointPolicy")
        public String trafficToEndpointPolicy;

        /**
         * <p>The backend service type of the endpoint.</p>
         * <br>
         * <p>Only **PrivateSubNet** may be returned, which indicates a private CIDR block.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListCustomRoutingEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingEndpointsResponseBodyEndpoints self = new ListCustomRoutingEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setServiceManagedInfos(java.util.List<ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }
        public java.util.List<ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setTrafficToEndpointPolicy(String trafficToEndpointPolicy) {
            this.trafficToEndpointPolicy = trafficToEndpointPolicy;
            return this;
        }
        public String getTrafficToEndpointPolicy() {
            return this.trafficToEndpointPolicy;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
