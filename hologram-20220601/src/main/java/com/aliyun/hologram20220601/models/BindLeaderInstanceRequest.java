// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class BindLeaderInstanceRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The leader instance ID. The region ID, zone ID, and version of the follower instance must be the same as those of the leader instance. Select the leader instance ID from the list of instances returned by the ListFollowerInstances operation.</p>
     * 
     * <strong>example:</strong>
     * <p>hgpostcn-cn-uqm3316l1004</p>
     */
    @NameInMap("leaderInstanceId")
    public String leaderInstanceId;

    public static BindLeaderInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindLeaderInstanceRequest self = new BindLeaderInstanceRequest();
        return TeaModel.build(map, self);
    }

    public BindLeaderInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BindLeaderInstanceRequest setLeaderInstanceId(String leaderInstanceId) {
        this.leaderInstanceId = leaderInstanceId;
        return this;
    }
    public String getLeaderInstanceId() {
        return this.leaderInstanceId;
    }

}
