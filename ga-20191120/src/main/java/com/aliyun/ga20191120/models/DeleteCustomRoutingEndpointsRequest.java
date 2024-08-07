// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteCustomRoutingEndpointsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among all requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the endpoint group to which the endpoint that you want to delete belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp1bpn0kn908w4nb****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The IDs of endpoints to be deleted.</p>
     * <p>If you do not set this parameter, all the endpoints in the specified endpoint group are deleted.</p>
     * <p>You can specify at most 10 endpoint IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndpointIds")
    public java.util.List<String> endpointIds;

    /**
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteCustomRoutingEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomRoutingEndpointsRequest self = new DeleteCustomRoutingEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomRoutingEndpointsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteCustomRoutingEndpointsRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public DeleteCustomRoutingEndpointsRequest setEndpointIds(java.util.List<String> endpointIds) {
        this.endpointIds = endpointIds;
        return this;
    }
    public java.util.List<String> getEndpointIds() {
        return this.endpointIds;
    }

    public DeleteCustomRoutingEndpointsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
