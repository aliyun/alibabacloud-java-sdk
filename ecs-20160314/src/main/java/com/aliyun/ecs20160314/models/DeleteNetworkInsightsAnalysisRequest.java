// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteNetworkInsightsAnalysisRequest extends TeaModel {
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("NetworkInsightsAnalysisId")
    public java.util.List<String> networkInsightsAnalysisId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteNetworkInsightsAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInsightsAnalysisRequest self = new DeleteNetworkInsightsAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInsightsAnalysisRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteNetworkInsightsAnalysisRequest setNetworkInsightsAnalysisId(java.util.List<String> networkInsightsAnalysisId) {
        this.networkInsightsAnalysisId = networkInsightsAnalysisId;
        return this;
    }
    public java.util.List<String> getNetworkInsightsAnalysisId() {
        return this.networkInsightsAnalysisId;
    }

    public DeleteNetworkInsightsAnalysisRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteNetworkInsightsAnalysisRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
