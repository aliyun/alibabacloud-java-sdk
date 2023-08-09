// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteTimingSyntheticTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskId")
    public String taskId;

    public static DeleteTimingSyntheticTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTimingSyntheticTaskRequest self = new DeleteTimingSyntheticTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTimingSyntheticTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTimingSyntheticTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
