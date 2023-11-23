// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointTrafficPoliciesResponseBody extends TeaModel {
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
     * <p>A list of traffic policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies> policies;

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

    public static ListCustomRoutingEndpointTrafficPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingEndpointTrafficPoliciesResponseBody self = new ListCustomRoutingEndpointTrafficPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponseBody setPolicies(java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges extends TeaModel {
        /**
         * <p>The first port of the port range used by the traffic destination to process requests.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port of the port range used by the traffic destination to process requests.</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges self = new ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos extends TeaModel {
        /**
         * <p>The name of the action on the managed instance. Valid values:</p>
         * <br>
         * <p>*   **Create**: Create an instance.</p>
         * <p>*   **Update**: Update the current instance.</p>
         * <p>*   **Delete**: Delete the current instance.</p>
         * <p>*   **Associate**: Reference the current instance.</p>
         * <p>*   **UserUnmanaged**: Unmanage the instance.</p>
         * <p>*   **CreateChild**: Create a child resource in the current instance.</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the child resource. Valid values:</p>
         * <br>
         * <p>*   **Listener**: listener.</p>
         * <p>*   **IpSet**: acceleration region.</p>
         * <p>*   **EndpointGroup**: endpoint group.</p>
         * <p>*   **ForwardingRule**: forwarding rule.</p>
         * <p>*   **Endpoint**: endpoint.</p>
         * <p>*   **EndpointGroupDestination**: protocol mapping of an endpoint group associated with a custom routing listener.</p>
         * <p>*   **EndpointPolicy**: traffic policy of an endpoint associated with a custom routing listener.</p>
         * <br>
         * <p>>  This parameter takes effect only if **Action** is set to **CreateChild**.</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified actions are managed. Valid values:</p>
         * <br>
         * <p>*   **true**: The specified actions are managed, and you cannot perform the specified actions on the managed instance.</p>
         * <p>*   **false**: The specified actions are not managed, and you can perform the specified actions on the managed instance.</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        public static ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos self = new ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies extends TeaModel {
        /**
         * <p>The ID of the GA instance with which the endpoint is associated.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The IP address of the traffic destination.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The ID of the endpoint group to which the endpoint belongs.</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The ID of the endpoint to which the traffic destination belongs.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The ID of the custom routing listener with which the endpoint is associated.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The traffic policy ID.</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The port range of the traffic policy.</p>
         */
        @NameInMap("PortRanges")
        public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges> portRanges;

        /**
         * <p>The ID of the service that manages the GA instance.</p>
         * <br>
         * <p>>  This parameter takes effect only if **ServiceManaged** is set to **True**.</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Indicates whether the GA instance is managed. Valid values:</p>
         * <br>
         * <p>*   **true**: The GA instance is managed.</p>
         * <p>*   **false**: The GA instance is not managed.</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The actions that you can perform on the managed instance.</p>
         * <br>
         * <p>>  This parameter takes effect only if **ServiceManaged** is set to **True**.</p>
         * <br>
         * <p>*   You can perform only specific actions on a managed instance.</p>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos> serviceManagedInfos;

        public static ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies self = new ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setPortRanges(java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges> getPortRanges() {
            return this.portRanges;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setServiceManagedInfos(java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }
        public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

    }

}
