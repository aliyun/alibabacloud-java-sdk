// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetComponentResponseBody body;

    public static GetComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComponentResponse self = new GetComponentResponse();
        return TeaModel.build(map, self);
    }

    public GetComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComponentResponse setBody(GetComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComponentResponseBody getBody() {
        return this.body;
    }

}
