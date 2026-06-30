// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointTrafficPoliciesResponseBody extends TeaModel {
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
     * <p>The list of traffic policies.</p>
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
         * <p>The start port of the traffic policy destination for processing requests.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The end port of the traffic policy destination for processing requests.</p>
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
         * <p>Update</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the child resource. Valid values:</p>
         * <ul>
         * <li><p><strong>Listener</strong>: listener resource.</p>
         * </li>
         * <li><p><strong>IpSet</strong>: acceleration region resource.</p>
         * </li>
         * <li><p><strong>EndpointGroup</strong>: endpoint group resource.</p>
         * </li>
         * <li><p><strong>ForwardingRule</strong>: forwarding rule resource.</p>
         * </li>
         * <li><p><strong>Endpoint</strong>: endpoint resource.</p>
         * </li>
         * <li><p><strong>EndpointGroupDestination</strong>: protocol mapping resource of the endpoint group under the custom routing listener.</p>
         * </li>
         * <li><p><strong>EndpointPolicy</strong>: traffic policy resource of the endpoint under the custom routing listener.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid only when <strong>Action</strong> is set to <strong>CreateChild</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the managed policy action is managed. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The managed policy action is managed. The user cannot perform the action specified by Action on the managed instance.</p>
         * </li>
         * <li><p><strong>false</strong>: The managed policy action is not managed. The user can perform the action specified by Action on the managed instance.</p>
         * </li>
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
         * <p>The instance ID of the Alibaba Cloud Global Accelerator (GA) instance to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The IP address of the traffic policy destination.</p>
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
         * <p>The ID of the custom routing type listener to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The traffic policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ply-bp1dmlohjjz4kqaun****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The port range of the traffic policy destination.</p>
         */
        @NameInMap("PortRanges")
        public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges> portRanges;

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
         * <p>Indicates whether the instance is managed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The instance is managed.</li>
         * <li><strong>false</strong>: The instance is not managed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The list of action policies that the user can perform on the managed instance.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is valid only when <strong>ServiceManaged</strong> is set to <strong>True</strong>.</li>
         * <li>When the instance is in the managed state, user operations on the instance are restricted, and certain operations are prohibited.</li>
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
