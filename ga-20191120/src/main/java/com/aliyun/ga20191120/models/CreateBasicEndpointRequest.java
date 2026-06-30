// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointRequest extends TeaModel {
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
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The address of the endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-bp1a05txelswuj8g****</p>
     */
    @NameInMap("EndpointAddress")
    public String endpointAddress;

    /**
     * <p>The endpoint group ID of the basic Alibaba Cloud Global Accelerator (GA) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp1dmlohjjz4kqaun****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The secondary address of the endpoint.</p>
     * <p>This parameter is required when the endpoint type is <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>.</p>
     * <ul>
     * <li>If the endpoint type is <strong>ECS</strong>, EndpointSubAddress can be set to a secondary private IP of the primary network interface controller (NIC). If you leave this parameter empty, the primary private IP of the primary network interface controller (NIC) is used.</li>
     * <li>If the endpoint type is <strong>ENI</strong>, EndpointSubAddress can be set to a secondary private IP of the secondary network interface controller (NIC). If you leave this parameter empty, the primary private IP of the secondary network interface controller (NIC) is used.</li>
     * <li>If the endpoint type is <strong>NLB</strong>, this parameter is required. Set EndpointSubAddress to the primary private IP of the NLB backend server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("EndpointSubAddress")
    public String endpointSubAddress;

    /**
     * <p>The type of the secondary address of the endpoint. Valid values:</p>
     * <ul>
     * <li><strong>primary</strong>: The secondary address type is the primary private IP address.</li>
     * <li><strong>secondary</strong>: The secondary address type is a secondary private IP address.</li>
     * </ul>
     * <p>This parameter is required when the endpoint type is <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>. If the endpoint type is <strong>NLB</strong>, only <strong>primary</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("EndpointSubAddressType")
    public String endpointSubAddressType;

    /**
     * <p>The endpoint type. Valid values:</p>
     * <ul>
     * <li><strong>ENI</strong>: Alibaba Cloud elastic network interface (ENI).</li>
     * <li><strong>SLB</strong>: Alibaba Cloud Classic Load Balancer (CLB) instance.</li>
     * <li><strong>ECS</strong>: Alibaba Cloud ECS instance.</li>
     * <li><strong>NLB</strong>: Alibaba Cloud Network Load Balancer (NLB) instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ENI</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The zone ID of the endpoint.</p>
     * <p>Currently, this parameter is required only when the endpoint type is <strong>NLB</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("EndpointZoneId")
    public String endpointZoneId;

    /**
     * <p>The name of the endpoint for the basic Alibaba Cloud Global Accelerator (GA) instance.</p>
     * <p>The name must be 1 to 128 characters in length and must start with a letter or a Chinese character. The name can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>ep01</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID of the Global Accelerator instance. Set the value to <strong>ap-southeast-1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
