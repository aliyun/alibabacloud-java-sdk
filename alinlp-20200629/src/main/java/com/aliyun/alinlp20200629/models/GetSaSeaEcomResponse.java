// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetSaSeaEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSaSeaEcomResponseBody body;

    public static GetSaSeaEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSaSeaEcomResponse self = new GetSaSeaEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetSaSeaEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSaSeaEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSaSeaEcomResponse setBody(GetSaSeaEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSaSeaEcomResponseBody getBody() {
        return this.body;
    }

}
