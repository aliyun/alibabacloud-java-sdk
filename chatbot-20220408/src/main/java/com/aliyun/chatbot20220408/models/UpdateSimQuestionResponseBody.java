// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateSimQuestionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSimQuestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSimQuestionResponseBody self = new UpdateSimQuestionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSimQuestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
