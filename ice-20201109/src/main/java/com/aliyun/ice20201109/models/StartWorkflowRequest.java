// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartWorkflowRequest extends TeaModel {
    /**
     * <p>The workflow input. Only media assets are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;Type&quot;: &quot;Media&quot;,
     *       &quot;Media&quot;: &quot;<strong><strong><strong>30706071edbfe290b488</strong></strong></strong>&quot;
     * }</p>
     */
    @NameInMap("TaskInput")
    public String taskInput;

    /**
     * <p>The user-defined data in the JSON format, which cannot be up to 512 bytes in length. You can specify a custom callback URL. For more information, see <a href="https://help.aliyun.com/document_detail/451631.html">Configure a callback upon editing completion</a>.</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the workflow template. To view the template ID, log on to the <a href="https://ims.console.aliyun.com/settings/workflow/list">IMS console</a> and choose Configurations &gt; Workflow Template.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>f0e54971ecbffd472190</strong></strong></strong></p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static StartWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        StartWorkflowRequest self = new StartWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public StartWorkflowRequest setTaskInput(String taskInput) {
        this.taskInput = taskInput;
        return this;
    }
    public String getTaskInput() {
        return this.taskInput;
    }

    public StartWorkflowRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public StartWorkflowRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
