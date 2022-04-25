// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class LifecycleTask extends TeaModel {
    // 业务id
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("LifecycleRule")
    public LifecycleRule lifecycleRule;

    // 名称
    @NameInMap("Name")
    public String name;

    @NameInMap("WorkflowInstance")
    public WorkflowInstance workflowInstance;

    public static LifecycleTask build(java.util.Map<String, ?> map) throws Exception {
        LifecycleTask self = new LifecycleTask();
        return TeaModel.build(map, self);
    }

    public LifecycleTask setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public LifecycleTask setLifecycleRule(LifecycleRule lifecycleRule) {
        this.lifecycleRule = lifecycleRule;
        return this;
    }
    public LifecycleRule getLifecycleRule() {
        return this.lifecycleRule;
    }

    public LifecycleTask setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LifecycleTask setWorkflowInstance(WorkflowInstance workflowInstance) {
        this.workflowInstance = workflowInstance;
        return this;
    }
    public WorkflowInstance getWorkflowInstance() {
        return this.workflowInstance;
    }

}
