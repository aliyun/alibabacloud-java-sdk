// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class FinishAICoachTaskSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>14878724-A835-578D-9DD5-4779ADCE9221</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("status")
    public String status;

    public static FinishAICoachTaskSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FinishAICoachTaskSessionResponseBody self = new FinishAICoachTaskSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public FinishAICoachTaskSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FinishAICoachTaskSessionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
