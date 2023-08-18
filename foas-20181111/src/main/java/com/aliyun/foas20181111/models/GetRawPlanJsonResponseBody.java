// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetRawPlanJsonResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SessionId")
    public String sessionId;

    public static GetRawPlanJsonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRawPlanJsonResponseBody self = new GetRawPlanJsonResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRawPlanJsonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRawPlanJsonResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
