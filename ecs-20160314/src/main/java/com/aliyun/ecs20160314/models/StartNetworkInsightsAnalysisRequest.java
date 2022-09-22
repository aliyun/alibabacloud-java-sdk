// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class StartNetworkInsightsAnalysisRequest extends TeaModel {
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("NetworkInsightsPathId")
    public String networkInsightsPathId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static StartNetworkInsightsAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        StartNetworkInsightsAnalysisRequest self = new StartNetworkInsightsAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public StartNetworkInsightsAnalysisRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public StartNetworkInsightsAnalysisRequest setNetworkInsightsPathId(String networkInsightsPathId) {
        this.networkInsightsPathId = networkInsightsPathId;
        return this;
    }
    public String getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    public StartNetworkInsightsAnalysisRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartNetworkInsightsAnalysisRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
