// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class GetConfigInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConfigInfoResponseBody body;

    public static GetConfigInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigInfoResponse self = new GetConfigInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigInfoResponse setBody(GetConfigInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigInfoResponseBody getBody() {
        return this.body;
    }

}
