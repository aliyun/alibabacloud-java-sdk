// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class UpdateTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskIds")
    public String taskIds;

    @NameInMap("TaskProgress")
    public Integer taskProgress;

    public static UpdateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskRequest self = new UpdateTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTaskRequest setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public String getTaskIds() {
        return this.taskIds;
    }

    public UpdateTaskRequest setTaskProgress(Integer taskProgress) {
        this.taskProgress = taskProgress;
        return this;
    }
    public Integer getTaskProgress() {
        return this.taskProgress;
    }

}
