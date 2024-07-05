// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetDecodeBlindWatermarkResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DecodeBlindWatermark-c09b0943-ed79-4983-8dbe-7a882574****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DecodeBlindWatermark</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetDecodeBlindWatermarkResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDecodeBlindWatermarkResultRequest self = new GetDecodeBlindWatermarkResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDecodeBlindWatermarkResultRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetDecodeBlindWatermarkResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetDecodeBlindWatermarkResultRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
