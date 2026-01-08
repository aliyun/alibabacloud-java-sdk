// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetFbInstagramPagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFbInstagramPagesResponseBody body;

    public static GetFbInstagramPagesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFbInstagramPagesResponse self = new GetFbInstagramPagesResponse();
        return TeaModel.build(map, self);
    }

    public GetFbInstagramPagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFbInstagramPagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFbInstagramPagesResponse setBody(GetFbInstagramPagesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFbInstagramPagesResponseBody getBody() {
        return this.body;
    }

}
