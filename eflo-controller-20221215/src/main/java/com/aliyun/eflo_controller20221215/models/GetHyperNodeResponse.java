// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class GetHyperNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHyperNodeResponseBody body;

    public static GetHyperNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHyperNodeResponse self = new GetHyperNodeResponse();
        return TeaModel.build(map, self);
    }

    public GetHyperNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHyperNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHyperNodeResponse setBody(GetHyperNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHyperNodeResponseBody getBody() {
        return this.body;
    }

}
