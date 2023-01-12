// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicEndpointGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the basic GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The description of the endpoint group that is associated with the basic GA instance.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The address of the endpoint.</p>
     */
    @NameInMap("EndpointAddress")
    public String endpointAddress;

    /**
     * <p>The ID of the endpoint group that is associated with the basic GA instance.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The ID of the region where the endpoint group resides.</p>
     */
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    @NameInMap("EndpointSubAddress")
    public String endpointSubAddress;

    /**
     * <p>The type of endpoint. Valid values:</p>
     * <br>
     * <p>*   **ENI**: elastic network interface (ENI)</p>
     * <p>*   **SLB**: Server Load Balancer (SLB) instance</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The name of the endpoint group that is associated with the basic GA instance.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the endpoint group.</p>
     * <br>
     * <p>*   **init**: The endpoint group is being initialized.</p>
     * <p>*   **active**: The endpoint group is running as expected.</p>
     * <p>*   **updating**: The endpoint group is being updated.</p>
     * <p>*   **deleting**: The endpoint group is being deleted.</p>
     */
    @NameInMap("State")
    public String state;

    public static GetBasicEndpointGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicEndpointGroupResponseBody self = new GetBasicEndpointGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicEndpointGroupResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetBasicEndpointGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetBasicEndpointGroupResponseBody setEndpointAddress(String endpointAddress) {
        this.endpointAddress = endpointAddress;
        return this;
    }
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    public GetBasicEndpointGroupResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public GetBasicEndpointGroupResponseBody setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public GetBasicEndpointGroupResponseBody setEndpointSubAddress(String endpointSubAddress) {
        this.endpointSubAddress = endpointSubAddress;
        return this;
    }
    public String getEndpointSubAddress() {
        return this.endpointSubAddress;
    }

    public GetBasicEndpointGroupResponseBody setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public GetBasicEndpointGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetBasicEndpointGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBasicEndpointGroupResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
