// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetPosChEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPosChEcomResponseBody body;

    public static GetPosChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPosChEcomResponse self = new GetPosChEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetPosChEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPosChEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPosChEcomResponse setBody(GetPosChEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPosChEcomResponseBody getBody() {
        return this.body;
    }

}
