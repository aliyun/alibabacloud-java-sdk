// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopRtcAsrTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asr-d794cc89-a63e-4d08-8b44-242a6597****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StopRtcAsrTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopRtcAsrTaskRequest self = new StopRtcAsrTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopRtcAsrTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StopRtcAsrTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopRtcAsrTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
