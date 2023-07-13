// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SyncUsersRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the list of E-HPC clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>You can call the [ListRegions](~~188593~~) operation to query the list of regions where E-HPC is supported.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SyncUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncUsersRequest self = new SyncUsersRequest();
        return TeaModel.build(map, self);
    }

    public SyncUsersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SyncUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
