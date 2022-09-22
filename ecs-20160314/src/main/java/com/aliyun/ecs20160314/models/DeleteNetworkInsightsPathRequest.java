// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteNetworkInsightsPathRequest extends TeaModel {
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("NetworkInsightsPathId")
    public java.util.List<String> networkInsightsPathId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteNetworkInsightsPathRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInsightsPathRequest self = new DeleteNetworkInsightsPathRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInsightsPathRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteNetworkInsightsPathRequest setNetworkInsightsPathId(java.util.List<String> networkInsightsPathId) {
        this.networkInsightsPathId = networkInsightsPathId;
        return this;
    }
    public java.util.List<String> getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    public DeleteNetworkInsightsPathRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteNetworkInsightsPathRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
