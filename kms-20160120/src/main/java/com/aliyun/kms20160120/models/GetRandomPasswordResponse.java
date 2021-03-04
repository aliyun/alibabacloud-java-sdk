// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetRandomPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRandomPasswordResponseBody body;

    public static GetRandomPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRandomPasswordResponse self = new GetRandomPasswordResponse();
        return TeaModel.build(map, self);
    }

    public GetRandomPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRandomPasswordResponse setBody(GetRandomPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRandomPasswordResponseBody getBody() {
        return this.body;
    }

}
