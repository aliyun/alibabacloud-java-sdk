// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteRtcAsrTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The task ID. You can obtain the ID from the response to the <a href="https://help.aliyun.com/document_detail/2848217.html">CreateRtcAsrTask</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asr-51c72******</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DeleteRtcAsrTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRtcAsrTaskRequest self = new DeleteRtcAsrTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRtcAsrTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteRtcAsrTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRtcAsrTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
