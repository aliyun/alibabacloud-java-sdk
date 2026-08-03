// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class FinishAICoachTaskSessionRequest extends TeaModel {
    @NameInMap("sessionId")
    public String sessionId;

    @NameInMap("uid")
    public String uid;

    public static FinishAICoachTaskSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishAICoachTaskSessionRequest self = new FinishAICoachTaskSessionRequest();
        return TeaModel.build(map, self);
    }

    public FinishAICoachTaskSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public FinishAICoachTaskSessionRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
