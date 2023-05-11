// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableSiteMonitorsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the site monitoring tasks. Separate multiple instance IDs with commas (,).</p>
     */
    @NameInMap("TaskIds")
    public String taskIds;

    public static EnableSiteMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSiteMonitorsRequest self = new EnableSiteMonitorsRequest();
        return TeaModel.build(map, self);
    }

    public EnableSiteMonitorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableSiteMonitorsRequest setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public String getTaskIds() {
        return this.taskIds;
    }

}
