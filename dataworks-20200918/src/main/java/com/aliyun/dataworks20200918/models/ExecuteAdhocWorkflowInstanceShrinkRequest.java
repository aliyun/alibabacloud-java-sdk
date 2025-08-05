// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ExecuteAdhocWorkflowInstanceShrinkRequest extends TeaModel {
    @NameInMap("BizDate")
    public Long bizDate;

    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tasks")
    public String tasksShrink;

    public static ExecuteAdhocWorkflowInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAdhocWorkflowInstanceShrinkRequest self = new ExecuteAdhocWorkflowInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAdhocWorkflowInstanceShrinkRequest setBizDate(Long bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public Long getBizDate() {
        return this.bizDate;
    }

    public ExecuteAdhocWorkflowInstanceShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ExecuteAdhocWorkflowInstanceShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ExecuteAdhocWorkflowInstanceShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ExecuteAdhocWorkflowInstanceShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ExecuteAdhocWorkflowInstanceShrinkRequest setTasksShrink(String tasksShrink) {
        this.tasksShrink = tasksShrink;
        return this;
    }
    public String getTasksShrink() {
        return this.tasksShrink;
    }

}
