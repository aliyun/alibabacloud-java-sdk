// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteCustomRoutingEndpointsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("EndpointIds")
    public java.util.List<String> endpointIds;

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
