// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndPointTrafficPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the traffic policy.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The ID of the endpoint to which the traffic policy belongs.</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The ID of the listener to which the endpoint belongs.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The ID of the endpoint group to which the endpoint belongs.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The ID of the GA instance to which the endpoint belongs.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The name of the vSwitch to which the traffic policy belongs.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The IP address of the traffic policy.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<DescribeCustomRoutingEndPointTrafficPolicyResponseBodyPortRanges> portRanges;

    /**
     * <p>The ID of the endpoint to which the traffic destination belongs.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the service that manages the instance.</p>
     * <br>
     * <p>>  This parameter is returned only if the value of **ServiceManaged** is **true**.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>Indicates whether the instance is managed. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The actions that users can perform on the managed instance.</p>
     * <p>> *   This parameter is returned only if the value of **ServiceManaged** is **true**.</p>
     * <p>> *   Users can perform only specific actions on a managed instance.</p>
     */
    @NameInMap("ServiceManagedInfos")
    public java.util.List<DescribeCustomRoutingEndPointTrafficPolicyResponseBodyServiceManagedInfos> serviceManagedInfos;

    /**
     * <p>The status of the traffic destination.</p>
     * <br>
     * <p>- init: being initialized.</p>
     * <p>- active: running as expected.</p>
     * <p>- updating: being updated.</p>
     * <p>- deleting: being deleted.</p>
     */
    @NameInMap("State")
    public String state;

    public static DescribeCustomRoutingEndPointTrafficPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomRoutingEndPointTrafficPolicyResponseBody self = new DescribeCustomRoutingEndPointTrafficPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody setPortRanges(java.util.List<DescribeCustomRoutingEndPointTrafficPolicyResponseBodyPortRanges> portRanges) {
        this.portRanges = portRanges;
        return this;
    }
    public java.util.List<DescribeCustomRoutingEndPointTrafficPolicyResponseBodyPortRanges> getPortRanges() {
        return this.portRanges;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody setServiceManagedInfos(java.util.List<DescribeCustomRoutingEndPointTrafficPolicyResponseBodyServiceManagedInfos> serviceManagedInfos) {
        this.serviceManagedInfos = serviceManagedInfos;
        return this;
    }
    public java.util.List<DescribeCustomRoutingEndPointTrafficPolicyResponseBodyServiceManagedInfos> getServiceManagedInfos() {
        return this.serviceManagedInfos;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public static class DescribeCustomRoutingEndPointTrafficPolicyResponseBodyPortRanges extends TeaModel {
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

        public static DescribeCustomRoutingEndPointTrafficPolicyResponseBodyPortRanges build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomRoutingEndPointTrafficPolicyResponseBodyPortRanges self = new DescribeCustomRoutingEndPointTrafficPolicyResponseBodyPortRanges();
            return TeaModel.build(map, self);
        }

        public DescribeCustomRoutingEndPointTrafficPolicyResponseBodyPortRanges setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public DescribeCustomRoutingEndPointTrafficPolicyResponseBodyPortRanges setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class DescribeCustomRoutingEndPointTrafficPolicyResponseBodyServiceManagedInfos extends TeaModel {
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
         * <p>*   **Listener**: listener.</p>
         * <p>*   **IpSet**: acceleration region.</p>
         * <p>*   **EndpointGroup**: endpoint group.</p>
         * <p>*   **ForwardingRule**: forwarding rule.</p>
         * <p>*   **Endpoint**: endpoint.</p>
         * <p>*   **EndpointGroupDestination**: protocol mapping of an endpoint group that is associated with a custom routing listener.</p>
         * <p>*   **EndpointPolicy**: traffic policy of an endpoint that is associated with a custom routing listener.</p>
         * <br>
         * <p>>  This parameter takes effect only if the value of **Action** is **CreateChild**.</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified actions are managed.</p>
         * <br>
         * <p>*   **true**: The specified actions are managed, and users cannot perform the specified actions on the managed instance.</p>
         * <p>*   **false**: The specified actions are not managed, and users can perform the specified actions on the managed instance.</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        public static DescribeCustomRoutingEndPointTrafficPolicyResponseBodyServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomRoutingEndPointTrafficPolicyResponseBodyServiceManagedInfos self = new DescribeCustomRoutingEndPointTrafficPolicyResponseBodyServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCustomRoutingEndPointTrafficPolicyResponseBodyServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeCustomRoutingEndPointTrafficPolicyResponseBodyServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public DescribeCustomRoutingEndPointTrafficPolicyResponseBodyServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

}
