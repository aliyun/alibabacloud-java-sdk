// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SyncRecordingRulesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RegionId")
    public String regionId;

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
