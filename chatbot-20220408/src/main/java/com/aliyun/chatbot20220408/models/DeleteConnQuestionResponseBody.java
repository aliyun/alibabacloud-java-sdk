// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteConnQuestionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConnQuestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnQuestionResponseBody self = new DeleteConnQuestionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConnQuestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
