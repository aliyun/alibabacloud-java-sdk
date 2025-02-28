// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceTestTaskRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>stt-xxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetServiceTestTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTestTaskRequest self = new GetServiceTestTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceTestTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceTestTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
