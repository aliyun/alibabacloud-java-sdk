// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateSimQuestionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DFB71B34-4188-4EA2-9988-EF3014E75910</p>
     */
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
