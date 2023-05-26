// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticTaskDetailRequest extends TeaModel {
    /**
     * <p>地域ID。默认为cn-hangzhou。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>云拨测任务ID。</p>
     */
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
