// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeletePerspectiveResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FC384CE1-8D42-1900-84E1-F33F990F2B5E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
