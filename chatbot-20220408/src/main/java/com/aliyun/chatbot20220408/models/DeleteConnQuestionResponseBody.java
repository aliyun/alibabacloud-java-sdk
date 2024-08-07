// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteConnQuestionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FC323352-3AD7-59A1-9088-A64470BAFC9D</p>
     */
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
