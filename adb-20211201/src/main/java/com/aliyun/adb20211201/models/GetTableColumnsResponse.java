// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetTableColumnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableColumnsResponseBody body;

    public static GetTableColumnsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnsResponse self = new GetTableColumnsResponse();
        return TeaModel.build(map, self);
    }

    public GetTableColumnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableColumnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableColumnsResponse setBody(GetTableColumnsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableColumnsResponseBody getBody() {
        return this.body;
    }

}
