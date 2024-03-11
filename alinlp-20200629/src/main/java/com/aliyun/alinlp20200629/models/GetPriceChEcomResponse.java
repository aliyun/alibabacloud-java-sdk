// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetPriceChEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPriceChEcomResponseBody body;

    public static GetPriceChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPriceChEcomResponse self = new GetPriceChEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetPriceChEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPriceChEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPriceChEcomResponse setBody(GetPriceChEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPriceChEcomResponseBody getBody() {
        return this.body;
    }

}
