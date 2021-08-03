// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RollbackSuspEventQuaraFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RollbackSuspEventQuaraFileResponseBody body;

    public static RollbackSuspEventQuaraFileResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackSuspEventQuaraFileResponse self = new RollbackSuspEventQuaraFileResponse();
        return TeaModel.build(map, self);
    }

    public RollbackSuspEventQuaraFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackSuspEventQuaraFileResponse setBody(RollbackSuspEventQuaraFileResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackSuspEventQuaraFileResponseBody getBody() {
        return this.body;
    }

}
