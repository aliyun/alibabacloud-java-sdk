// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCategoriesResponseBody body;

    public static GetCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCategoriesResponse self = new GetCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public GetCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCategoriesResponse setBody(GetCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCategoriesResponseBody getBody() {
        return this.body;
    }

}
