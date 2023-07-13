// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListUpgradeClientsRequest extends TeaModel {
    /**
     * <p>The upgrade records of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The latest version of the E-HPC client.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListUpgradeClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUpgradeClientsRequest self = new ListUpgradeClientsRequest();
        return TeaModel.build(map, self);
    }

    public ListUpgradeClientsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListUpgradeClientsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
