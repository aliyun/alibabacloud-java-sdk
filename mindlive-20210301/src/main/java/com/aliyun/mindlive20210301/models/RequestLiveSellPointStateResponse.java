// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestLiveSellPointStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RequestLiveSellPointStateResponseBody body;

    public static RequestLiveSellPointStateResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestLiveSellPointStateResponse self = new RequestLiveSellPointStateResponse();
        return TeaModel.build(map, self);
    }

    public RequestLiveSellPointStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestLiveSellPointStateResponse setBody(RequestLiveSellPointStateResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestLiveSellPointStateResponseBody getBody() {
        return this.body;
    }

}
