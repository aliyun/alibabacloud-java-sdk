// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteBenchmarkTaskResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBenchmarkTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBenchmarkTaskResponseBody self = new DeleteBenchmarkTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBenchmarkTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteBenchmarkTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
