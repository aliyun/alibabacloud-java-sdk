// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointTrafficPoliciesResponseBody extends TeaModel {
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
     * <p>A list of traffic policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies> policies;

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
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port of the port range used by the traffic destination to process requests.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
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
         * <ul>
         * <li><strong>Create</strong>: Create an instance.</li>
         * <li><strong>Update</strong>: Update the current instance.</li>
         * <li><strong>Delete</strong>: Delete the current instance.</li>
         * <li><strong>Associate</strong>: Reference the current instance.</li>
         * <li><strong>UserUnmanaged</strong>: Unmanage the instance.</li>
         * <li><strong>CreateChild</strong>: Create a child resource in the current instance.</li>
         * </ul>
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
         * <p> This parameter is returned only if the value of <strong>Action</strong> is <strong>CreateChild</strong>.</p>
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
         * <li><strong>true</strong>: The specified actions are managed, and users cannot perform the specified actions on the managed instance.</li>
         * <li><strong>false</strong>: The specified actions are not managed, and users can perform the specified actions on the managed instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The ID of the GA instance to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The IP addresses of the traffic policies.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The ID of the endpoint group to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The ID of the endpoint to which the traffic policy belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-bp14sz7ftcwwjgrdm****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The ID of the custom routing listener to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The ID of the traffic policy.</p>
         * 
         * <strong>example:</strong>
         * <p>ply-bp1dmlohjjz4kqaun****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The port range of the traffic policy.</p>
         */
        @NameInMap("PortRanges")
        public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges> portRanges;

        /**
         * <p>The ID of the service that manages the instance.</p>
         * <blockquote>
         * <p> This parameter is returned only if the value of <strong>ServiceManaged</strong> is <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Indicates whether the instance is managed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The GA instance is managed.</li>
         * <li><strong>false</strong>: The GA instance is not managed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The actions that users can perform on the managed instance.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is returned only if the value of <strong>ServiceManaged</strong> is <strong>true</strong>.</li>
         * <li>Users can perform only specific actions on a managed instance.</li>
         * </ul>
         * </blockquote>
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
