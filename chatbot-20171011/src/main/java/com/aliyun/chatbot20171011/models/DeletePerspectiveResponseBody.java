// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeletePerspectiveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static DeletePerspectiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePerspectiveResponseBody self = new DeletePerspectiveResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePerspectiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePerspectiveResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
