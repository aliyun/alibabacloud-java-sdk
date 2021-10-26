// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionAsyncInvokeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFunctionAsyncInvokeConfigResponseBody body;

    public static GetFunctionAsyncInvokeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionAsyncInvokeConfigResponse self = new GetFunctionAsyncInvokeConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetFunctionAsyncInvokeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFunctionAsyncInvokeConfigResponse setBody(GetFunctionAsyncInvokeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFunctionAsyncInvokeConfigResponseBody getBody() {
        return this.body;
    }

}
