// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteTagResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxXxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagResponseBody self = new DeleteTagResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
