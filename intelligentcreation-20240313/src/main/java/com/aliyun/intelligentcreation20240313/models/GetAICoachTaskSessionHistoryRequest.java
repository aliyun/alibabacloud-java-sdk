// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachTaskSessionHistoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>1251317954812712</p>
     */
    @NameInMap("uid")
    public String uid;

    public static GetAICoachTaskSessionHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachTaskSessionHistoryRequest self = new GetAICoachTaskSessionHistoryRequest();
        return TeaModel.build(map, self);
    }

    public GetAICoachTaskSessionHistoryRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetAICoachTaskSessionHistoryRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
