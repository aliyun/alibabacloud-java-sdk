// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetOsVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOsVersionResponseBody body;

    public static GetOsVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOsVersionResponse self = new GetOsVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetOsVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOsVersionResponse setBody(GetOsVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOsVersionResponseBody getBody() {
        return this.body;
    }

}
