// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableSiteMonitorsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the site monitoring tasks. Separate multiple IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>49f7b317-7645-4cc9-94fd-ea42e522****,49f7b317-7645-4cc9-94fd-ea42e522****</p>
     */
    @NameInMap("TaskIds")
    public String taskIds;

    public static DisableSiteMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSiteMonitorsRequest self = new DisableSiteMonitorsRequest();
        return TeaModel.build(map, self);
    }

    public DisableSiteMonitorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DisableSiteMonitorsRequest setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public String getTaskIds() {
        return this.taskIds;
    }

}
