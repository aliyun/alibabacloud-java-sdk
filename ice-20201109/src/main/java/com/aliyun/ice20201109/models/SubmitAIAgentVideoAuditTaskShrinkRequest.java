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
     * <p>The moderation interval, in milliseconds. Valid values: 0 to 5000. Default value: 3000. If you set this parameter to 0, all captured frame data specified in CapturePolicies is sent to the large model in the corresponding agent at a time. If you set this parameter to a non-zero value, such as 3000, all captured frame data is sent to the large model in sequence at an interval of 3,000 milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("AuditInterval")
    public Integer auditInterval;

    /**
     * <p>The callback configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Url&quot;:&quot;<a href="https://yourcallback%22,%22Token%22:%22yourtoken%22%7D">https://yourcallback&quot;,&quot;Token&quot;:&quot;yourtoken&quot;}</a></p>
     */
    @NameInMap("CallbackConfig")
    public String callbackConfigShrink;

    /**
     * <p>The array of moderation policies. Each policy generates a model result.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CapturePolicies")
    public String capturePoliciesShrink;

    /**
     * <p>The input file.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The custom user data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Custom&quot;:&quot;hello&quot;}</p>
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
