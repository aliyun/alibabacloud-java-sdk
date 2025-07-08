// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsSaasTaskNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmsSaasTaskNewResponseBody body;

    public static CreateSmsSaasTaskNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSaasTaskNewResponse self = new CreateSmsSaasTaskNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmsSaasTaskNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmsSaasTaskNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmsSaasTaskNewResponse setBody(CreateSmsSaasTaskNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmsSaasTaskNewResponseBody getBody() {
        return this.body;
    }

}
