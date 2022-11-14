// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedSeaEcomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetWsCustomizedSeaEcomResponseBody body;

    public static GetWsCustomizedSeaEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedSeaEcomResponse self = new GetWsCustomizedSeaEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedSeaEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWsCustomizedSeaEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWsCustomizedSeaEcomResponse setBody(GetWsCustomizedSeaEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWsCustomizedSeaEcomResponseBody getBody() {
        return this.body;
    }

}
