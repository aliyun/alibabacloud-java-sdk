// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ReleaseAgentResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("status")
    public String status;

    public static ReleaseAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAgentResponseBody self = new ReleaseAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseAgentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
