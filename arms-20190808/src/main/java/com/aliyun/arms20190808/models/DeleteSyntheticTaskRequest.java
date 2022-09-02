// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSyntheticTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    public static DeleteSyntheticTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSyntheticTaskRequest self = new DeleteSyntheticTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSyntheticTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSyntheticTaskRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
