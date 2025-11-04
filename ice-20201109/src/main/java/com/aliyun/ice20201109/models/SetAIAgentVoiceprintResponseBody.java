// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetAIAgentVoiceprintResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400********55440000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the registered voiceprint.</p>
     * 
     * <strong>example:</strong>
     * <p>vp_1699123456_8527</p>
     */
    @NameInMap("VoiceprintId")
    public String voiceprintId;

    public static SetAIAgentVoiceprintResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAIAgentVoiceprintResponseBody self = new SetAIAgentVoiceprintResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAIAgentVoiceprintResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetAIAgentVoiceprintResponseBody setVoiceprintId(String voiceprintId) {
        this.voiceprintId = voiceprintId;
        return this;
    }
    public String getVoiceprintId() {
        return this.voiceprintId;
    }

}
