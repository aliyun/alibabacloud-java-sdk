// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StopTimingSyntheticTaskShrinkRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The task IDs.</p>
     */
    @NameInMap("TaskIds")
    public String taskIdsShrink;

    public static StopTimingSyntheticTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTimingSyntheticTaskShrinkRequest self = new StopTimingSyntheticTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopTimingSyntheticTaskShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopTimingSyntheticTaskShrinkRequest setTaskIdsShrink(String taskIdsShrink) {
        this.taskIdsShrink = taskIdsShrink;
        return this;
    }
    public String getTaskIdsShrink() {
        return this.taskIdsShrink;
    }

}
