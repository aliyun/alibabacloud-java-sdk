// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteCustomRoutingEndpointsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among all requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the endpoint group to which the endpoint that you want to delete belongs.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("EndpointIds")
    public java.util.List<String> endpointIds;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
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
