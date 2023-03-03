// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SyncRecordingRulesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster whose aggregation rule you want to synchronize.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the region. The destination region can be the same as the source region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of clusters to which you want to synchronize the aggregation rule.</p>
     */
    @NameInMap("TargetClusters")
    public String targetClusters;

    public static SyncRecordingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRecordingRulesRequest self = new SyncRecordingRulesRequest();
        return TeaModel.build(map, self);
    }

    public SyncRecordingRulesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SyncRecordingRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SyncRecordingRulesRequest setTargetClusters(String targetClusters) {
        this.targetClusters = targetClusters;
        return this;
    }
    public String getTargetClusters() {
        return this.targetClusters;
    }

}
