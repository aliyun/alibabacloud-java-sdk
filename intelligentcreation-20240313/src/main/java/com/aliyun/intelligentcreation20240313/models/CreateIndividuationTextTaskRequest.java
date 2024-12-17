// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateIndividuationTextTaskRequest extends TeaModel {
    @NameInMap("crowdPack")
    public java.util.List<java.util.List<String>> crowdPack;

    /**
     * <strong>example:</strong>
     * <p>840015278620459008</p>
     */
    @NameInMap("projectId")
    public String projectId;

    @NameInMap("taskName")
    public String taskName;

    public static CreateIndividuationTextTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIndividuationTextTaskRequest self = new CreateIndividuationTextTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateIndividuationTextTaskRequest setCrowdPack(java.util.List<java.util.List<String>> crowdPack) {
        this.crowdPack = crowdPack;
        return this;
    }
    public java.util.List<java.util.List<String>> getCrowdPack() {
        return this.crowdPack;
    }

    public CreateIndividuationTextTaskRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateIndividuationTextTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
