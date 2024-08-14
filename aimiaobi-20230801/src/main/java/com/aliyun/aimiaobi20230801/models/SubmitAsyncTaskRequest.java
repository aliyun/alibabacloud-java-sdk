// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitAsyncTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2daaa2e0c209xb26acb97009ea77bd4b_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MaterialDocumentUpload</p>
     */
    @NameInMap("TaskCode")
    public String taskCode;

    /**
     * <strong>example:</strong>
     * <p>2023-10-14 14:30:00</p>
     */
    @NameInMap("TaskExecuteTime")
    public String taskExecuteTime;

    /**
     * <strong>example:</strong>
     * <p>任务名称</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <strong>example:</strong>
     * <p>任务提交参数</p>
     */
    @NameInMap("TaskParam")
    public String taskParam;

    public static SubmitAsyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAsyncTaskRequest self = new SubmitAsyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAsyncTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SubmitAsyncTaskRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public SubmitAsyncTaskRequest setTaskExecuteTime(String taskExecuteTime) {
        this.taskExecuteTime = taskExecuteTime;
        return this;
    }
    public String getTaskExecuteTime() {
        return this.taskExecuteTime;
    }

    public SubmitAsyncTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public SubmitAsyncTaskRequest setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public String getTaskParam() {
        return this.taskParam;
    }

}
