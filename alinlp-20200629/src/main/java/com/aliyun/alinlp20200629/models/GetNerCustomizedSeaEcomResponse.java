// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetNerCustomizedSeaEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNerCustomizedSeaEcomResponseBody body;

    public static GetNerCustomizedSeaEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNerCustomizedSeaEcomResponse self = new GetNerCustomizedSeaEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetNerCustomizedSeaEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNerCustomizedSeaEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNerCustomizedSeaEcomResponse setBody(GetNerCustomizedSeaEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNerCustomizedSeaEcomResponseBody getBody() {
        return this.body;
    }

}
