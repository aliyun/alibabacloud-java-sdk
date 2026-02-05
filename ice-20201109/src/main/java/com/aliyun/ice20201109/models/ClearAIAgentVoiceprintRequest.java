// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ClearAIAgentVoiceprintRequest extends TeaModel {
    @NameInMap("RegistrationMode")
    public String registrationMode;

    /**
     * <p>The unique identifier for the voiceprint.</p>
     * 
     * <strong>example:</strong>
     * <p>vp_1699123456_8527</p>
     */
    @NameInMap("VoiceprintId")
    public String voiceprintId;

    public static ClearAIAgentVoiceprintRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearAIAgentVoiceprintRequest self = new ClearAIAgentVoiceprintRequest();
        return TeaModel.build(map, self);
    }

    public ClearAIAgentVoiceprintRequest setRegistrationMode(String registrationMode) {
        this.registrationMode = registrationMode;
        return this;
    }
    public String getRegistrationMode() {
        return this.registrationMode;
    }

    public ClearAIAgentVoiceprintRequest setVoiceprintId(String voiceprintId) {
        this.voiceprintId = voiceprintId;
        return this;
    }
    public String getVoiceprintId() {
        return this.voiceprintId;
    }

}
