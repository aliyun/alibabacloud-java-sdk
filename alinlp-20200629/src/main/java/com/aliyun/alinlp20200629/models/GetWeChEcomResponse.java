// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWeChEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWeChEcomResponseBody body;

    public static GetWeChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWeChEcomResponse self = new GetWeChEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetWeChEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWeChEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWeChEcomResponse setBody(GetWeChEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWeChEcomResponseBody getBody() {
        return this.body;
    }

}
