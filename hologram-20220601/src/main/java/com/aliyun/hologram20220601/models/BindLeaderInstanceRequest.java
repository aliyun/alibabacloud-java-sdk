// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class BindLeaderInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
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
