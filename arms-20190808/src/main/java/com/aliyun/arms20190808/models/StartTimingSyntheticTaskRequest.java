// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StartTimingSyntheticTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    public static StartTimingSyntheticTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTimingSyntheticTaskRequest self = new StartTimingSyntheticTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartTimingSyntheticTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartTimingSyntheticTaskRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
