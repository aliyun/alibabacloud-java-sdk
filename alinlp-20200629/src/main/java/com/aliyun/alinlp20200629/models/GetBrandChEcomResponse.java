// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetBrandChEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBrandChEcomResponseBody body;

    public static GetBrandChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBrandChEcomResponse self = new GetBrandChEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetBrandChEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBrandChEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBrandChEcomResponse setBody(GetBrandChEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBrandChEcomResponseBody getBody() {
        return this.body;
    }

}
