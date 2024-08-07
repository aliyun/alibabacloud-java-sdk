// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteSimQuestionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6419BA93-D111-5225-8998-13E63E6D3940</p>
     */
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
