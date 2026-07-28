// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <p>The idempotence token. Format: [0-9a-zA-Z-]{1,64}. We recommend that you use a UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2daf4227f747cbf11a5501f18cc5e004</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The job description. Length: 1 to 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The operation command. Valid values:</p>
     * <ul>
     * <li>plan: performs a preview. This is the default value.</li>
     * <li>refresh: refreshes the resource status.</li>
     * <li>destroy: destroys resources.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>refresh</p>
     */
    @NameInMap("subCommand")
    public String subCommand;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li>Task: regular task. This is the default value.</li>
     * <li>SceneTestingTask: scenario-based testing task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Task</p>
     */
    @NameInMap("taskType")
    public String taskType;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateJobRequest setSubCommand(String subCommand) {
        this.subCommand = subCommand;
        return this;
    }
    public String getSubCommand() {
        return this.subCommand;
    }

    public CreateJobRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
