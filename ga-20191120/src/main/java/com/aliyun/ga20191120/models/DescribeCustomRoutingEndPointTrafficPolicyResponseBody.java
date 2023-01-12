// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndPointTrafficPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance to which the endpoint belongs.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The IP address of the traffic policy.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The name of the vSwitch to which the traffic policy belongs.</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The ID of the endpoint group to which the endpoint belongs.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The ID of the endpoint to which the traffic policy belongs.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The ID of the listener to which the endpoint belongs.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The ID of the traffic policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The port range of the traffic policy.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<DescribeCustomRoutingEndPointTrafficPolicyResponseBodyPortRanges> portRanges;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public static class DescribeCustomRoutingEndPointTrafficPolicyResponseBodyPortRanges extends TeaModel {
        /**
         * <p>The first port of the port range.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port of the port range.</p>
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

}
