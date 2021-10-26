// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFunctionResponseBody body;

    public static GetFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionResponse self = new GetFunctionResponse();
        return TeaModel.build(map, self);
    }

    public GetFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFunctionResponse setBody(GetFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFunctionResponseBody getBody() {
        return this.body;
    }

}
