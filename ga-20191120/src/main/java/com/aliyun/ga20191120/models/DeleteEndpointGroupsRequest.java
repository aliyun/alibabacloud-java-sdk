// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteEndpointGroupsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EndpointGroupIds")
    public java.util.List<String> endpointGroupIds;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteEndpointGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEndpointGroupsRequest self = new DeleteEndpointGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEndpointGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteEndpointGroupsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteEndpointGroupsRequest setEndpointGroupIds(java.util.List<String> endpointGroupIds) {
        this.endpointGroupIds = endpointGroupIds;
        return this;
    }
    public java.util.List<String> getEndpointGroupIds() {
        return this.endpointGroupIds;
    }

    public DeleteEndpointGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
