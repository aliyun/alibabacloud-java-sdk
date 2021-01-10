// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ExitLiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExitLiveResponseBody body;

    public static ExitLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        ExitLiveResponse self = new ExitLiveResponse();
        return TeaModel.build(map, self);
    }

    public ExitLiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExitLiveResponse setBody(ExitLiveResponseBody body) {
        this.body = body;
        return this;
    }
    public ExitLiveResponseBody getBody() {
        return this.body;
    }

}
