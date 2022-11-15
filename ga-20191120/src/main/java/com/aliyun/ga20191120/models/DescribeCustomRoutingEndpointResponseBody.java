// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndpointResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficToEndpointPolicy")
    public String trafficToEndpointPolicy;

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
