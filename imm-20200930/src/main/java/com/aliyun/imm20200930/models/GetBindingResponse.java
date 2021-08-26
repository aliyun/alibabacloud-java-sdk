// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetBindingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBindingResponseBody body;

    public static GetBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBindingResponse self = new GetBindingResponse();
        return TeaModel.build(map, self);
    }

    public GetBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBindingResponse setBody(GetBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBindingResponseBody getBody() {
        return this.body;
    }

}
