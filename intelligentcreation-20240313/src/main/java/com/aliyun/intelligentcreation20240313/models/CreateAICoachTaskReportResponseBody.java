// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAICoachTaskReportResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0E8B1746-AE35-5C4B-A3A8-345B274AE32C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>79e954faffe2415ebd18188ba787d78e</p>
     */
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
