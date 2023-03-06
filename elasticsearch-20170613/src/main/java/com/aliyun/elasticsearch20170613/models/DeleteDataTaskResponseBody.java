// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteDataTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static DeleteDataTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataTaskResponseBody self = new DeleteDataTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDataTaskResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
