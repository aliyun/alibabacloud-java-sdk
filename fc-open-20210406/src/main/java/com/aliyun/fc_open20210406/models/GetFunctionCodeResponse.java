// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFunctionCodeResponseBody body;

    public static GetFunctionCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionCodeResponse self = new GetFunctionCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetFunctionCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFunctionCodeResponse setBody(GetFunctionCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFunctionCodeResponseBody getBody() {
        return this.body;
    }

}
