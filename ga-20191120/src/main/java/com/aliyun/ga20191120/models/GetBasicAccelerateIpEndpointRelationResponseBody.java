// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAccelerateIpEndpointRelationResponseBody extends TeaModel {
    /**
     * <p>The ID of the accelerated IP address.</p>
     */
    @NameInMap("AccelerateIpId")
    public String accelerateIpId;

    /**
     * <p>The ID of the basic GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The address of the endpoint.</p>
     */
    @NameInMap("EndpointAddress")
    public String endpointAddress;

    /**
     * <p>The ID of the endpoint.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The name of the endpoint.</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The secondary address of the endpoint.</p>
     * <br>
     * <p>This parameter is returned if the endpoint type is **ECS**, **ENI**, or **NLB**.</p>
     * <br>
     * <p>*   If the endpoint type is **ECS**, **EndpointSubAddress** returns the primary or secondary private IP address of the primary ENI.</p>
     * <p>*   If the endpoint type is **ENI**, **EndpointSubAddress** returns the primary or secondary private IP address of the secondary ENI.</p>
     * <p>*   If the endpoint type is **NLB**, **EndpointSubAddress** returns the primary private IP address of the NLB backend server.</p>
     */
    @NameInMap("EndpointSubAddress")
    public String endpointSubAddress;

    /**
     * <p>The type of the secondary address of the endpoint.</p>
     * <br>
     * <p>*   **primary**: a primary private IP address.</p>
     * <p>*   **secondary**: a secondary private IP address.</p>
     * <br>
     * <p>This parameter is returned if the endpoint type is **ECS**, **ENI**, or **NLB**. If the endpoint type is set to **NLB**, **primary** is returned.</p>
     */
    @NameInMap("EndpointSubAddressType")
    public String endpointSubAddressType;

    /**
     * <p>The type of endpoint. Valid values:</p>
     * <br>
     * <p>*   **ENI**: elastic network interface (ENI).</p>
     * <p>*   **SLB**: Classic Load Balancer (CLB) instance.</p>
     * <p>*   **ECS**: Elastic Compute Service (ECS) instance.</p>
     * <p>*   **NLB**: Network Load Balancer (NLB) instance.</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The ID of the zone where the endpoint is created.</p>
     * <br>
     * <p>This parameter is returned only when the endpoint type is **NLB**.</p>
     */
    @NameInMap("EndpointZoneId")
    public String endpointZoneId;

    /**
     * <p>The accelerated IP address of the basic GA instance.</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The association status between the accelerated IP address and endpoint.</p>
     * <br>
     * <p>A value of **active** indicates that the accelerated IP address is associated with the endpoint.</p>
     */
    @NameInMap("State")
    public String state;

    public static GetBasicAccelerateIpEndpointRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAccelerateIpEndpointRelationResponseBody self = new GetBasicAccelerateIpEndpointRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setAccelerateIpId(String accelerateIpId) {
        this.accelerateIpId = accelerateIpId;
        return this;
    }
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointAddress(String endpointAddress) {
        this.endpointAddress = endpointAddress;
        return this;
    }
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointSubAddress(String endpointSubAddress) {
        this.endpointSubAddress = endpointSubAddress;
        return this;
    }
    public String getEndpointSubAddress() {
        return this.endpointSubAddress;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointSubAddressType(String endpointSubAddressType) {
        this.endpointSubAddressType = endpointSubAddressType;
        return this;
    }
    public String getEndpointSubAddressType() {
        return this.endpointSubAddressType;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointZoneId(String endpointZoneId) {
        this.endpointZoneId = endpointZoneId;
        return this;
    }
    public String getEndpointZoneId() {
        return this.endpointZoneId;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
