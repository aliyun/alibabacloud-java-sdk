// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitAsyncTaskRequest extends TeaModel {
    /**
     * <p>The unique ID of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2daaa2e0c209xb26acb97009ea77bd4b_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>For details on the task definition, see the task definition table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MaterialDocumentUpload</p>
     */
    @NameInMap("TaskCode")
    public String taskCode;

    /**
     * <p>The time to run the task. By default, the task runs immediately. Format: YYYY-MM-DD HH:mm:ss</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-14 14:30:00</p>
     */
    @NameInMap("TaskExecuteTime")
    public String taskExecuteTime;

    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>任务名称</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The task parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;fileUrl&quot;:&quot;<a href="https://www.example.com/aaa.doc%22,%22fileName%22:%22%E6%96%87%E4%BB%B6%E5%90%8D%E7%A7%B0%22,%22shareAttr%22:1%7D">https://www.example.com/aaa.doc&quot;,&quot;fileName&quot;:&quot;文件名称&quot;,&quot;shareAttr&quot;:1}</a></p>
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
