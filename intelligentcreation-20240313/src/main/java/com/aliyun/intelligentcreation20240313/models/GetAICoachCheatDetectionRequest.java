// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachCheatDetectionRequest extends TeaModel {
    @NameInMap("sessionId")
    public String sessionId;

    public static GetAICoachCheatDetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachCheatDetectionRequest self = new GetAICoachCheatDetectionRequest();
        return TeaModel.build(map, self);
    }

    public GetAICoachCheatDetectionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
