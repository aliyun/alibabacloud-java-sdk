// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMdsMiniConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMdsMiniConfigResponseBody body;

    public static GetMdsMiniConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMdsMiniConfigResponse self = new GetMdsMiniConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetMdsMiniConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMdsMiniConfigResponse setBody(GetMdsMiniConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMdsMiniConfigResponseBody getBody() {
        return this.body;
    }

}
