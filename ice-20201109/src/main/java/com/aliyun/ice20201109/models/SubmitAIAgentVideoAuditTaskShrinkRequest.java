// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAIAgentVideoAuditTaskShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the AI agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>*<strong><strong><strong>3b3d94abda22</strong></strong></strong></p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <p>The interval, in milliseconds, at which to submit captured frames to the AI agent. Valid values: 0 to 5000. Default value: 3000. If it is set to 0, all captured frames are sent to the model in a single batch request. Otherwise, frames are sent sequentially with the specified interval between each request.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("AuditInterval")
    public Integer auditInterval;

    /**
     * <p>Callback configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Url&quot;:&quot;<a href="https://yourcallback%22,%22Token%22:%22yourtoken%22%7D">https://yourcallback&quot;,&quot;Token&quot;:&quot;yourtoken&quot;}</a></p>
     */
    @NameInMap("CallbackConfig")
    public String callbackConfigShrink;

    /**
     * <p>An array of frame-capturing policies. Each policy defines a set of frames to be analyzed and will generate a separate result from the model.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CapturePolicies")
    public String capturePoliciesShrink;

    /**
     * <p>The details of the input file.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The user-defined data.</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitAIAgentVideoAuditTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIAgentVideoAuditTaskShrinkRequest self = new SubmitAIAgentVideoAuditTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIAgentVideoAuditTaskShrinkRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public SubmitAIAgentVideoAuditTaskShrinkRequest setAuditInterval(Integer auditInterval) {
        this.auditInterval = auditInterval;
        return this;
    }
    public Integer getAuditInterval() {
        return this.auditInterval;
    }

    public SubmitAIAgentVideoAuditTaskShrinkRequest setCallbackConfigShrink(String callbackConfigShrink) {
        this.callbackConfigShrink = callbackConfigShrink;
        return this;
    }
    public String getCallbackConfigShrink() {
        return this.callbackConfigShrink;
    }

    public SubmitAIAgentVideoAuditTaskShrinkRequest setCapturePoliciesShrink(String capturePoliciesShrink) {
        this.capturePoliciesShrink = capturePoliciesShrink;
        return this;
    }
    public String getCapturePoliciesShrink() {
        return this.capturePoliciesShrink;
    }

    public SubmitAIAgentVideoAuditTaskShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SubmitAIAgentVideoAuditTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
