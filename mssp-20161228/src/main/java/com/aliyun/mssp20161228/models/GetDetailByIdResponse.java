// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetDetailByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDetailByIdResponseBody body;

    public static GetDetailByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetailByIdResponse self = new GetDetailByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetDetailByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetailByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDetailByIdResponse setBody(GetDetailByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetailByIdResponseBody getBody() {
        return this.body;
    }

}
