// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetCanaryStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCanaryStatusResponseBody body;

    public static GetCanaryStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCanaryStatusResponse self = new GetCanaryStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetCanaryStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCanaryStatusResponse setBody(GetCanaryStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCanaryStatusResponseBody getBody() {
        return this.body;
    }

}
