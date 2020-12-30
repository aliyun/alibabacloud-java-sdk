// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class KillExecutionJobInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public KillExecutionJobInstanceResponseBody body;

    public static KillExecutionJobInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        KillExecutionJobInstanceResponse self = new KillExecutionJobInstanceResponse();
        return TeaModel.build(map, self);
    }

    public KillExecutionJobInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KillExecutionJobInstanceResponse setBody(KillExecutionJobInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public KillExecutionJobInstanceResponseBody getBody() {
        return this.body;
    }

}
