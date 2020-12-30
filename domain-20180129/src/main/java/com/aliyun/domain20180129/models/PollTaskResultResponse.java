// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class PollTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PollTaskResultResponseBody body;

    public static PollTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        PollTaskResultResponse self = new PollTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public PollTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PollTaskResultResponse setBody(PollTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public PollTaskResultResponseBody getBody() {
        return this.body;
    }

}
