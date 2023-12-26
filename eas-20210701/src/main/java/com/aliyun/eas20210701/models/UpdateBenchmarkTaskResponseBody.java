// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateBenchmarkTaskResponseBody extends TeaModel {
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

    public static UpdateBenchmarkTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBenchmarkTaskResponseBody self = new UpdateBenchmarkTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBenchmarkTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateBenchmarkTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
