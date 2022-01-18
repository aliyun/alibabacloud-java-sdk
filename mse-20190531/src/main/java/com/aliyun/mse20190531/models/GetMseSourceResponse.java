// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetMseSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMseSourceResponseBody body;

    public static GetMseSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMseSourceResponse self = new GetMseSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetMseSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMseSourceResponse setBody(GetMseSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMseSourceResponseBody getBody() {
        return this.body;
    }

}
