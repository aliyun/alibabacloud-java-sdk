// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteSimQuestionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSimQuestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSimQuestionResponseBody self = new DeleteSimQuestionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSimQuestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
