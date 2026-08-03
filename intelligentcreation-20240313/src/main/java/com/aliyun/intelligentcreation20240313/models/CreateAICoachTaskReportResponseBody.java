// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAICoachTaskReportResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sessionId")
    public String sessionId;

    public static CreateAICoachTaskReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAICoachTaskReportResponseBody self = new CreateAICoachTaskReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAICoachTaskReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAICoachTaskReportResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
