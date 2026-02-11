// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListTraceAppsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListTraceAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTraceAppsRequest self = new ListTraceAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListTraceAppsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
