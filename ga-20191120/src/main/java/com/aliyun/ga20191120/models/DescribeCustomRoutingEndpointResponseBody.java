// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndpointResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance with which the endpoint is associated.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The name of the endpoint (vSwitch).</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The ID of the endpoint group to which the endpoint belongs.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The ID of the endpoint.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The ID of the listener with which the endpoint is associated.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>终端节点当前状态。</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The access policy of traffic for the specified endpoint. Valid values:</p>
     * <br>
     * <p>*   **AllowAll:** allows all traffic to the endpoint.</p>
     * <p>*   **DenyAll:** denies all traffic to the endpoint.</p>
     * <p>*   **AllowCustom:** allows traffic only to specified destinations in the endpoint</p>
     */
    @NameInMap("TrafficToEndpointPolicy")
    public String trafficToEndpointPolicy;

    /**
     * <p>The backend service type of the endpoint.</p>
     * <br>
     * <p>Set the value to **PrivateSubNet**, which indicates private CIDR blocks.</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeCustomRoutingEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomRoutingEndpointResponseBody self = new DescribeCustomRoutingEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomRoutingEndpointResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeCustomRoutingEndpointResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public DescribeCustomRoutingEndpointResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public DescribeCustomRoutingEndpointResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DescribeCustomRoutingEndpointResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DescribeCustomRoutingEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomRoutingEndpointResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeCustomRoutingEndpointResponseBody setTrafficToEndpointPolicy(String trafficToEndpointPolicy) {
        this.trafficToEndpointPolicy = trafficToEndpointPolicy;
        return this;
    }
    public String getTrafficToEndpointPolicy() {
        return this.trafficToEndpointPolicy;
    }

    public DescribeCustomRoutingEndpointResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
