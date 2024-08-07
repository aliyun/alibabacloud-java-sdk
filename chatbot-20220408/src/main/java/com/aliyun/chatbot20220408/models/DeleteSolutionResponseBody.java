// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteSolutionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F79E7305-5314-5069-A701-9591AD051902</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSolutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSolutionResponseBody self = new DeleteSolutionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSolutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
