// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestLiveSellPointStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RequestLiveSellPointStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestLiveSellPointStateResponse setBody(RequestLiveSellPointStateResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestLiveSellPointStateResponseBody getBody() {
        return this.body;
    }

}
