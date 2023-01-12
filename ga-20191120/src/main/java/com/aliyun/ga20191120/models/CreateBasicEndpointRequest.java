// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointRequest extends TeaModel {
    /**
     * <p>The ID of the basic GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The address of the endpoint.</p>
     */
    @NameInMap("EndpointAddress")
    public String endpointAddress;

    /**
     * <p>The ID of the endpoint group.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The secondary address of the endpoint.</p>
     * <br>
     * <p>This parameter is required if the endpoint type is **ECS**, **ENI**, or **NLB**.</p>
     * <br>
     * <p>*   If the endpoint type is **ECS**, you can set **EndpointSubAddress** to the secondary private IP address of the primary ENI. If the parameter is left empty, the primary private IP address of the primary ENI is used.</p>
     * <p>*   If the endpoint type is **ENI**, you can set **EndpointSubAddress** to the secondary private IP address of the secondary ENI. If the parameter is left empty, the primary private IP address of the secondary ENI is used.</p>
     * <p>*   This parameter is required if the endpoint type is **NLB**. **EndpointSubAddress** is the primary private IP address of the NLB backend server.</p>
     */
    @NameInMap("EndpointSubAddress")
    public String endpointSubAddress;

    /**
     * <p>The type of the secondary address of the endpoint. Valid values:</p>
     * <br>
     * <p>*   **primary**: a primary private IP address.</p>
     * <p>*   **secondary**: a secondary private IP address.</p>
     * <br>
     * <p>This parameter is required if the endpoint type is **ECS**, **ENI**, or **NLB**. If the endpoint type is **NLB**, only **primary** is supported.</p>
     */
    @NameInMap("EndpointSubAddressType")
    public String endpointSubAddressType;

    /**
     * <p>The type of endpoint. Valid values:</p>
     * <br>
     * <p>*   **ENI**: elastic network interface (ENI)</p>
     * <p>*   **SLB**: Classic Load Balancer (CLB)</p>
     * <p>*   **ECS**: Elastic Compute Service (ECS)</p>
     * <p>*   **NLB**: Network Load Balancer (NLB)</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The zone ID of the endpoint.</p>
     * <br>
     * <p>This parameter is required only if the endpoint type is **NLB**.</p>
     */
    @NameInMap("EndpointZoneId")
    public String endpointZoneId;

    /**
     * <p>The name of the endpoint.</p>
     * <br>
     * <p>The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateBasicEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicEndpointRequest self = new CreateBasicEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateBasicEndpointRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateBasicEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBasicEndpointRequest setEndpointAddress(String endpointAddress) {
        this.endpointAddress = endpointAddress;
        return this;
    }
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    public CreateBasicEndpointRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public CreateBasicEndpointRequest setEndpointSubAddress(String endpointSubAddress) {
        this.endpointSubAddress = endpointSubAddress;
        return this;
    }
    public String getEndpointSubAddress() {
        return this.endpointSubAddress;
    }

    public CreateBasicEndpointRequest setEndpointSubAddressType(String endpointSubAddressType) {
        this.endpointSubAddressType = endpointSubAddressType;
        return this;
    }
    public String getEndpointSubAddressType() {
        return this.endpointSubAddressType;
    }

    public CreateBasicEndpointRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateBasicEndpointRequest setEndpointZoneId(String endpointZoneId) {
        this.endpointZoneId = endpointZoneId;
        return this;
    }
    public String getEndpointZoneId() {
        return this.endpointZoneId;
    }

    public CreateBasicEndpointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBasicEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
