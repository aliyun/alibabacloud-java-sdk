// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2daf4227f747cbf11a5501f18cc5e004</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("executeType")
    public String executeType;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("subCommand")
    public String subCommand;

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

    public CreateJobRequest setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }
    public String getExecuteType() {
        return this.executeType;
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
