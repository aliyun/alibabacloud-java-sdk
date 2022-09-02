// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticTaskDetailRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskId")
    public String taskId;

    public static GetSyntheticTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSyntheticTaskDetailRequest self = new GetSyntheticTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetSyntheticTaskDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSyntheticTaskDetailRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
