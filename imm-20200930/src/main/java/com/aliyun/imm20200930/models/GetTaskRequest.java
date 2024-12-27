// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetTaskRequest extends TeaModel {
    /**
     * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Specifies whether to return the initial request parameters that are used to create the task. Default value: False.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("RequestDefinition")
    public Boolean requestDefinition;

    /**
     * <p>The ID of the task. You can obtain the ID of a task after you create the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c2b277b9-0d30-4882-ad6d-ad661382****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The type of the task. For information about valid values, see <a href="https://help.aliyun.com/document_detail/2743993.html">Task types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VideoLabelClassification</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskRequest self = new GetTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetTaskRequest setRequestDefinition(Boolean requestDefinition) {
        this.requestDefinition = requestDefinition;
        return this;
    }
    public Boolean getRequestDefinition() {
        return this.requestDefinition;
    }

    public GetTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
