// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachTaskSessionReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>1707732338016307</p>
     */
    @NameInMap("uid")
    public String uid;

    public static GetAICoachTaskSessionReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachTaskSessionReportRequest self = new GetAICoachTaskSessionReportRequest();
        return TeaModel.build(map, self);
    }

    public GetAICoachTaskSessionReportRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetAICoachTaskSessionReportRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
