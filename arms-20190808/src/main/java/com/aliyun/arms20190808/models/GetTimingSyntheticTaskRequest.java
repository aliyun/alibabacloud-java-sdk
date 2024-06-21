// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTimingSyntheticTaskRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the synthetic monitoring task.</p>
     * 
     * <strong>example:</strong>
     * <p>856566a9cb2a4cafa05aa95ed0ec8f21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetTimingSyntheticTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTimingSyntheticTaskRequest self = new GetTimingSyntheticTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetTimingSyntheticTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTimingSyntheticTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
