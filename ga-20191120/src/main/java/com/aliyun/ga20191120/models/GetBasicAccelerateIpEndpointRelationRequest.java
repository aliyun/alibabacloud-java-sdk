// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAccelerateIpEndpointRelationRequest extends TeaModel {
    /**
     * <p>The ID of the accelerated IP address.</p>
     * <blockquote>
     * <p> You must specify <strong>EndpointId</strong> or <strong>AccelerateIpId</strong>.</p>
     * </blockquote>
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
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the endpoint.</p>
     * <blockquote>
     * <p> You must specify <strong>EndpointId</strong> or <strong>AccelerateIpId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ep-bp14sz7ftcwwjgrdm****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetBasicAccelerateIpEndpointRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAccelerateIpEndpointRelationRequest self = new GetBasicAccelerateIpEndpointRelationRequest();
        return TeaModel.build(map, self);
    }

    public GetBasicAccelerateIpEndpointRelationRequest setAccelerateIpId(String accelerateIpId) {
        this.accelerateIpId = accelerateIpId;
        return this;
    }
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    public GetBasicAccelerateIpEndpointRelationRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetBasicAccelerateIpEndpointRelationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetBasicAccelerateIpEndpointRelationRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public GetBasicAccelerateIpEndpointRelationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
