// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetBusinessIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBusinessIdResponseBody body;

    public static GetBusinessIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessIdResponse self = new GetBusinessIdResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessIdResponse setBody(GetBusinessIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessIdResponseBody getBody() {
        return this.body;
    }

}
