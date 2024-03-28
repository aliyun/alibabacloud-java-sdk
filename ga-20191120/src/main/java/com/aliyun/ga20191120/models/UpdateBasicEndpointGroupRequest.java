// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBasicEndpointGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the endpoint group.</p>
     * <br>
     * <p>The description can be up to 200 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>This parameter is required only if the accelerated IP address is associated with the secondary private IP address of an ECS instance or an ENI.</p>
     * <br>
     * <p>*   If you set the endpoint type to **ECS**, you can set **EndpointSubAddress** to the secondary private IP address of the primary ENI. If you leave this parameter empty, the primary private IP address of the primary ENI is used.</p>
     * <p>*   If you set the endpoint type to **ENI**, you can set **EndpointSubAddress** to the secondary private IP address of the secondary ENI. If you leave this parameter empty, the primary private IP address of the secondary ENI is used.</p>
     */
    @NameInMap("EndpointSubAddress")
    public String endpointSubAddress;

    /**
     * <p>The type of the endpoint. Valid values:</p>
     * <br>
     * <p>*   **ENI**: elastic network interface (ENI).</p>
     * <p>*   **SLB**: Classic Load Balancer (CLB) instance.</p>
     * <p>*   **ECS**: Elastic Compute Service (ECS) instance.</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The name of the endpoint group.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region where the basic GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateBasicEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicEndpointGroupRequest self = new UpdateBasicEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBasicEndpointGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateBasicEndpointGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBasicEndpointGroupRequest setEndpointAddress(String endpointAddress) {
        this.endpointAddress = endpointAddress;
        return this;
    }
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    public UpdateBasicEndpointGroupRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public UpdateBasicEndpointGroupRequest setEndpointSubAddress(String endpointSubAddress) {
        this.endpointSubAddress = endpointSubAddress;
        return this;
    }
    public String getEndpointSubAddress() {
        return this.endpointSubAddress;
    }

    public UpdateBasicEndpointGroupRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public UpdateBasicEndpointGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateBasicEndpointGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
