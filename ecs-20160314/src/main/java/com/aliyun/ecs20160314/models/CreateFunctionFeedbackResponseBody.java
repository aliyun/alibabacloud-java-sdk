// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateFunctionFeedbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFunctionFeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionFeedbackResponseBody self = new CreateFunctionFeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFunctionFeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
