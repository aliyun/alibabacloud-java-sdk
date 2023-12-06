// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StopTimingSyntheticTaskRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The task IDs.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    public static StopTimingSyntheticTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTimingSyntheticTaskRequest self = new StopTimingSyntheticTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopTimingSyntheticTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopTimingSyntheticTaskRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
