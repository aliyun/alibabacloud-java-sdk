// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class SubmitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitResponseBody body;

    public static SubmitResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitResponse self = new SubmitResponse();
        return TeaModel.build(map, self);
    }

    public SubmitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitResponse setBody(SubmitResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitResponseBody getBody() {
        return this.body;
    }

}
