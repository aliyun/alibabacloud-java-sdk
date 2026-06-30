// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointGroupRequest extends TeaModel {
    /**
     * <p>The instance ID of the basic Alibaba Cloud Global Accelerator (GA).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4qz****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> value as the <strong>ClientToken</strong> value. The <strong>RequestId</strong> value is different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the endpoint group for the basic Alibaba Cloud Global Accelerator (GA) instance.</p>
     * <p>The description can be up to 200 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>BasicEndpointGroup</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The address of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-bp1a05txelswuj8g****</p>
     */
    @NameInMap("EndpointAddress")
    public String endpointAddress;

    /**
     * <p>The region ID of the endpoint group for the basic Alibaba Cloud Global Accelerator (GA) instance.</p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/2253223.html">ListAvailableBusiRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    /**
     * <p>The secondary address of the endpoint.</p>
     * <p>Specify this parameter when the accelerated IP address is associated with a secondary private IP address of an ECS instance or an ENI.</p>
     * <ul>
     * <li>If the endpoint type is <strong>ECS</strong>, EndpointSubAddress can be set to a secondary private IP address of the primary ENI. If this parameter is left empty, the primary private IP address of the primary ENI is used.</li>
     * <li>If the endpoint type is <strong>ENI</strong>, EndpointSubAddress can be set to a secondary private IP address of the secondary ENI. If this parameter is left empty, the primary private IP address of the secondary ENI is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("EndpointSubAddress")
    public String endpointSubAddress;

    /**
     * <p>The endpoint type. Valid values:</p>
     * <ul>
     * <li><strong>ENI</strong>: elastic network interface (ENI).</li>
     * <li><strong>SLB</strong>: Classic Load Balancer (CLB) instance.</li>
     * <li><strong>ECS</strong>: ECS instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENI</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The name of the endpoint group for the basic Alibaba Cloud Global Accelerator (GA) instance.</p>
     * <p>The name must be 1 to 128 characters in length and must start with a letter or a Chinese character. The name can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID of the basic Alibaba Cloud Global Accelerator (GA) instance. Set the value to <strong>ap-southeast-1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateBasicEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicEndpointGroupRequest self = new CreateBasicEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateBasicEndpointGroupRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateBasicEndpointGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBasicEndpointGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBasicEndpointGroupRequest setEndpointAddress(String endpointAddress) {
        this.endpointAddress = endpointAddress;
        return this;
    }
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    public CreateBasicEndpointGroupRequest setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public CreateBasicEndpointGroupRequest setEndpointSubAddress(String endpointSubAddress) {
        this.endpointSubAddress = endpointSubAddress;
        return this;
    }
    public String getEndpointSubAddress() {
        return this.endpointSubAddress;
    }

    public CreateBasicEndpointGroupRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateBasicEndpointGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBasicEndpointGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
