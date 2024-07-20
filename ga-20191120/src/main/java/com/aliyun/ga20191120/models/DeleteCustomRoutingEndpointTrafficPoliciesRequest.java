// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteCustomRoutingEndpointTrafficPoliciesRequest extends TeaModel {
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
     * <p>The ID of the endpoint for which you want to delete traffic destinations.</p>
     * <blockquote>
     * <p> This parameter is required.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-2zewuzypq5e6r3pfh****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The IDs of the traffic destinations.</p>
     * <p>You can specify the IDs of up to 9,000 traffic destinations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteCustomRoutingEndpointTrafficPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomRoutingEndpointTrafficPoliciesRequest self = new DeleteCustomRoutingEndpointTrafficPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomRoutingEndpointTrafficPoliciesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteCustomRoutingEndpointTrafficPoliciesRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DeleteCustomRoutingEndpointTrafficPoliciesRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

    public DeleteCustomRoutingEndpointTrafficPoliciesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
