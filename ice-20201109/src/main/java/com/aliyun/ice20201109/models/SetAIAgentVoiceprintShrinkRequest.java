// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetAIAgentVoiceprintShrinkRequest extends TeaModel {
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <strong>example:</strong>
     * <p>vp_1699123456_8527</p>
     */
    @NameInMap("VoiceprintId")
    public String voiceprintId;

    public static SetAIAgentVoiceprintShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAIAgentVoiceprintShrinkRequest self = new SetAIAgentVoiceprintShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetAIAgentVoiceprintShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SetAIAgentVoiceprintShrinkRequest setVoiceprintId(String voiceprintId) {
        this.voiceprintId = voiceprintId;
        return this;
    }
    public String getVoiceprintId() {
        return this.voiceprintId;
    }

}
