// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeNetworkInsightsAnalysisResultRequest extends TeaModel {
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("NetworkInsightsAnalysisId")
    public String networkInsightsAnalysisId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeNetworkInsightsAnalysisResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInsightsAnalysisResultRequest self = new DescribeNetworkInsightsAnalysisResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInsightsAnalysisResultRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeNetworkInsightsAnalysisResultRequest setNetworkInsightsAnalysisId(String networkInsightsAnalysisId) {
        this.networkInsightsAnalysisId = networkInsightsAnalysisId;
        return this;
    }
    public String getNetworkInsightsAnalysisId() {
        return this.networkInsightsAnalysisId;
    }

    public DescribeNetworkInsightsAnalysisResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNetworkInsightsAnalysisResultRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
