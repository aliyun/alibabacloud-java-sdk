// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceVpcRegion extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>华北2（北京）</p>
     */
    @NameInMap("regionName")
    public String regionName;

    public static GrafanaWorkspaceVpcRegion build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceVpcRegion self = new GrafanaWorkspaceVpcRegion();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceVpcRegion setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrafanaWorkspaceVpcRegion setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

}
