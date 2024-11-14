// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CloseAICoachTaskSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0E06E0AA-D5B6-538C-8CE9-BAB79C68B690</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("status")
    public String status;

    public static CloseAICoachTaskSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseAICoachTaskSessionResponseBody self = new CloseAICoachTaskSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseAICoachTaskSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloseAICoachTaskSessionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
