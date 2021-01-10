// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetGlobalConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGlobalConfigResponseBody body;

    public static GetGlobalConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalConfigResponse self = new GetGlobalConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetGlobalConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGlobalConfigResponse setBody(GetGlobalConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGlobalConfigResponseBody getBody() {
        return this.body;
    }

}
