// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetPostScriptsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to obtain the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the region where the cluster resides.</p>
     * <br>
     * <p>You can call the [ListRegions](~~188593~~) operation to query the latest region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetPostScriptsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPostScriptsRequest self = new GetPostScriptsRequest();
        return TeaModel.build(map, self);
    }

    public GetPostScriptsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetPostScriptsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
