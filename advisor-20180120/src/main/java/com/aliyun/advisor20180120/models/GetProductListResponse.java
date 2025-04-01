// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class GetProductListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProductListResponseBody body;

    public static GetProductListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductListResponse self = new GetProductListResponse();
        return TeaModel.build(map, self);
    }

    public GetProductListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductListResponse setBody(GetProductListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductListResponseBody getBody() {
        return this.body;
    }

}
