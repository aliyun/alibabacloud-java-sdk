// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndPointTrafficPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the traffic policy.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The ID of the endpoint to which the traffic policy belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-test01</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The ID of the listener to which the endpoint belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp1bpn0kn908w4nb****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The ID of the endpoint group to which the endpoint belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-2zewuzypq5e6r3pfh****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The ID of the GA instance to which the endpoint belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The name of the vSwitch to which the traffic policy belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ply-bptest2****</p>
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
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
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
    public java.util.List<DescribeCustomRoutingEndPointTrafficPolicyResponseBodyServiceManagedInfos> serviceManagedInfos;

    /**
     * <p>The status of the traffic destination.</p>
     * <ul>
     * <li>init: being initialized.</li>
     * <li>active: running as expected.</li>
     * <li>updating: being updated.</li>
     * <li>deleting: being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
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
         * <ul>
         * <li><strong>Create</strong></li>
         * <li><strong>Update</strong></li>
         * <li><strong>Delete</strong></li>
         * <li><strong>Associate</strong></li>
         * <li><strong>UserUnmanaged</strong></li>
         * <li><strong>CreateChild</strong></li>
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
         * <li><strong>EndpointGroupDestination</strong>: protocol mapping of an endpoint group that is associated with a custom routing listener.</li>
         * <li><strong>EndpointPolicy</strong>: traffic policy of an endpoint that is associated with a custom routing listener.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only if the value of <strong>Action</strong> is <strong>CreateChild</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified actions are managed.</p>
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
