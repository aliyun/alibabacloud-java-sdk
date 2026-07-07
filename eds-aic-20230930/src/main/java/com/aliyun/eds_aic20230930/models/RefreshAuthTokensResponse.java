// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RefreshAuthTokensResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshAuthTokensResponseBody body;

    public static RefreshAuthTokensResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshAuthTokensResponse self = new RefreshAuthTokensResponse();
        return TeaModel.build(map, self);
    }

    public RefreshAuthTokensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshAuthTokensResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshAuthTokensResponse setBody(RefreshAuthTokensResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshAuthTokensResponseBody getBody() {
        return this.body;
    }

}
