// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachTaskSessionResourceUsageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ccce827bcd2c4b13a0fd9ea8657a48cc</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static GetAICoachTaskSessionResourceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachTaskSessionResourceUsageRequest self = new GetAICoachTaskSessionResourceUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetAICoachTaskSessionResourceUsageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
