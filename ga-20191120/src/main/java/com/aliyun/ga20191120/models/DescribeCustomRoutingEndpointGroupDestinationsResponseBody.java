// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndpointGroupDestinationsResponseBody extends TeaModel {
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
     * <p>*   **tcp**: TCP</p>
     * <p>*   **udp**: UDP</p>
     * <p>*   **tcp,udp**: TCP and UDP</p>
     */
    @NameInMap("Protocols")
    public java.util.List<String> protocols;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    /**
     * <p>The end port of the backend service port range of the endpoint group.</p>
     */
    @NameInMap("ToPort")
    public Integer toPort;

    public static DescribeCustomRoutingEndpointGroupDestinationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomRoutingEndpointGroupDestinationsResponseBody self = new DescribeCustomRoutingEndpointGroupDestinationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    public String getDestinationId() {
        return this.destinationId;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }
    public Integer getFromPort() {
        return this.fromPort;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }
    public Integer getToPort() {
        return this.toPort;
    }

}
