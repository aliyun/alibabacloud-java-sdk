// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicAccelerateIpEndpointRelationRequest extends TeaModel {
    /**
     * <p>The accelerated IP address instance ID of the basic GA instance.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/2253393.html">ListBasicAccelerateIps</a> to query the accelerated IP address instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gaip-bp1****</p>
     */
    @NameInMap("AccelerateIpId")
    public String accelerateIpId;

    /**
     * <p>The ID of the basic GA instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4qz****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of a request.</p>
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
     * <p>The endpoint ID of the basic GA instance.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/2253406.html">ListBasicEndpoints</a> to query the endpoint ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-bp14sz7ftcwwjgrdm****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The region ID of the Global Accelerator instance. Set the value to <strong>ap-southeast-1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteBasicAccelerateIpEndpointRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicAccelerateIpEndpointRelationRequest self = new DeleteBasicAccelerateIpEndpointRelationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBasicAccelerateIpEndpointRelationRequest setAccelerateIpId(String accelerateIpId) {
        this.accelerateIpId = accelerateIpId;
        return this;
    }
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    public DeleteBasicAccelerateIpEndpointRelationRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DeleteBasicAccelerateIpEndpointRelationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteBasicAccelerateIpEndpointRelationRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DeleteBasicAccelerateIpEndpointRelationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
