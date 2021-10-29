// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class StopOrRollbackOptimizeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopOrRollbackOptimizeTaskResponseBody body;

    public static StopOrRollbackOptimizeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopOrRollbackOptimizeTaskResponse self = new StopOrRollbackOptimizeTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopOrRollbackOptimizeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopOrRollbackOptimizeTaskResponse setBody(StopOrRollbackOptimizeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopOrRollbackOptimizeTaskResponseBody getBody() {
        return this.body;
    }

}
