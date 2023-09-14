// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetAutoScalingActivityRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>伸缩活动ID。</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static GetAutoScalingActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingActivityRequest self = new GetAutoScalingActivityRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingActivityRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetAutoScalingActivityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAutoScalingActivityRequest setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
