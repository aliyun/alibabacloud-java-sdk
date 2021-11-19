// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class GetRuntimeApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRuntimeApiResponseBody body;

    public static GetRuntimeApiResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRuntimeApiResponse self = new GetRuntimeApiResponse();
        return TeaModel.build(map, self);
    }

    public GetRuntimeApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRuntimeApiResponse setBody(GetRuntimeApiResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRuntimeApiResponseBody getBody() {
        return this.body;
    }

}
