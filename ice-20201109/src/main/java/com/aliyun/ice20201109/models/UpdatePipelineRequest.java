// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdatePipelineRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("Status")
    public String status;

    public static UpdatePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineRequest self = new UpdatePipelineRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePipelineRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public UpdatePipelineRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdatePipelineRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
