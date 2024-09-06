// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StartTimingSyntheticTaskShrinkRequest extends TeaModel {
    /**
     * <p>The region ID. Default value: cn-hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The task IDs.</p>
     */
    @NameInMap("TaskIds")
    public String taskIdsShrink;

    public static StartTimingSyntheticTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTimingSyntheticTaskShrinkRequest self = new StartTimingSyntheticTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartTimingSyntheticTaskShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartTimingSyntheticTaskShrinkRequest setTaskIdsShrink(String taskIdsShrink) {
        this.taskIdsShrink = taskIdsShrink;
        return this;
    }
    public String getTaskIdsShrink() {
        return this.taskIdsShrink;
    }

}
