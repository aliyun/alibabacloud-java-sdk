// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetPostScriptsRequest extends TeaModel {
    /**
     * <p>The URL that is used to download the Nth post-installation script. Valid values of N: 1 to 16.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The parameter that is used to run the Nth post-installation script. Valid values of N: 1 to 16.</p>
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
