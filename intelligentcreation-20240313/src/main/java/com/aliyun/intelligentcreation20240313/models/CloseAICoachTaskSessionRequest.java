// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CloseAICoachTaskSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>273610276967782972</p>
     */
    @NameInMap("uid")
    public String uid;

    public static CloseAICoachTaskSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseAICoachTaskSessionRequest self = new CloseAICoachTaskSessionRequest();
        return TeaModel.build(map, self);
    }

    public CloseAICoachTaskSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CloseAICoachTaskSessionRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
