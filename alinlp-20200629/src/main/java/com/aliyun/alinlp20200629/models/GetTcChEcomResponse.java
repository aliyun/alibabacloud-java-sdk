// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetTcChEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTcChEcomResponseBody body;

    public static GetTcChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTcChEcomResponse self = new GetTcChEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetTcChEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTcChEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTcChEcomResponse setBody(GetTcChEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTcChEcomResponseBody getBody() {
        return this.body;
    }

}
