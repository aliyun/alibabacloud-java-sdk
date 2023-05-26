// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListClusterFromGrafanaRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListClusterFromGrafanaRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterFromGrafanaRequest self = new ListClusterFromGrafanaRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterFromGrafanaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
