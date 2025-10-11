// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class OfflineAICoachScriptResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EC169FD8-F8D8-5414-A4FF-B6B6751BE36D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("status")
    public String status;

    public static OfflineAICoachScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OfflineAICoachScriptResponseBody self = new OfflineAICoachScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public OfflineAICoachScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OfflineAICoachScriptResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
