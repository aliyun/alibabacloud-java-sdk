// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetVideoLabelClassificationResultRequest extends TeaModel {
    /**
     * <p>The project name. For information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The task ID. For information about how to obtain the task ID, see the response parameters of <a href="https://help.aliyun.com/document_detail/478223.html">CreateVideoLabelClassificationTask</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VideoLabelClassification-2f157087-91df-4fda-8c3e-232407ec****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VideoLabelClassification</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetVideoLabelClassificationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoLabelClassificationResultRequest self = new GetVideoLabelClassificationResultRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoLabelClassificationResultRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetVideoLabelClassificationResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetVideoLabelClassificationResultRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
