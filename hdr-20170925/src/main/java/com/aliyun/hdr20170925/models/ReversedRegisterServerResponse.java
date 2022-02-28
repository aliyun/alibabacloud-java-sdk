// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReversedRegisterServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReversedRegisterServerResponseBody body;

    public static ReversedRegisterServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ReversedRegisterServerResponse self = new ReversedRegisterServerResponse();
        return TeaModel.build(map, self);
    }

    public ReversedRegisterServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReversedRegisterServerResponse setBody(ReversedRegisterServerResponseBody body) {
        this.body = body;
        return this;
    }
    public ReversedRegisterServerResponseBody getBody() {
        return this.body;
    }

}
