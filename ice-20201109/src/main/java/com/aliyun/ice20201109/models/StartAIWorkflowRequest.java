// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartAIWorkflowRequest extends TeaModel {
    /**
     * <p>The tag for the task.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DispatchTag")
    public String dispatchTag;

    /**
     * <p>A JSON string containing the specific input parameters, such as information about the media assets, standard live streams, or RTC streams.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;live_url&quot;: {
     *         &quot;Url&quot;: &quot;rtmp://test.com/test_app/test_stream?auth_key=test&quot;,
     *         &quot;MaxIdleTime&quot;: 20
     *     },
     *     &quot;source_language_id&quot;: &quot;es&quot;
     * }</p>
     */
    @NameInMap("Inputs")
    public String inputs;

    /**
     * <p>A user-defined parameter for passing custom metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     * &quot;url&quot;:&quot;<a href="https://test.com">https://test.com</a>&quot;
     * }</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the workflow template.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>3f44-f1f6-477e-9364-c5e6c49e</strong></strong></p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static StartAIWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAIWorkflowRequest self = new StartAIWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public StartAIWorkflowRequest setDispatchTag(String dispatchTag) {
        this.dispatchTag = dispatchTag;
        return this;
    }
    public String getDispatchTag() {
        return this.dispatchTag;
    }

    public StartAIWorkflowRequest setInputs(String inputs) {
        this.inputs = inputs;
        return this;
    }
    public String getInputs() {
        return this.inputs;
    }

    public StartAIWorkflowRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public StartAIWorkflowRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
