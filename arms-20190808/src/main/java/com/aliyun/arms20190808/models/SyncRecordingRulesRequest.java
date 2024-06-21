// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SyncRecordingRulesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster whose aggregation rule you want to synchronize.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the region. The destination region can be the same as the source region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of clusters to which you want to synchronize the aggregation rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;cn&quot;:[         &quot;c06ca68cd16f14f52bb07772eda***&quot;,         &quot;c33dd70a0ac184c1b879d807ab2***&quot;,         &quot;c384cf7e4dcb543e6ac8c7d4dd3***&quot;     ],     &quot;us&quot;:[         &quot;ce30f833bc4a04a56a06b070319***&quot;     ],     &quot;jp&quot;:[      ],     &quot;ap&quot;:[      ],     &quot;gov&quot;:[      ],     &quot;finance&quot;:[      ] }</p>
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
