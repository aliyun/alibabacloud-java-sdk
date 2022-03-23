// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetPageConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPageConfigResponseBody body;

    public static GetPageConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPageConfigResponse self = new GetPageConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetPageConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPageConfigResponse setBody(GetPageConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPageConfigResponseBody getBody() {
        return this.body;
    }

}
