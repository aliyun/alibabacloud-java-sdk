// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsSaasTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmsSaasTaskResponseBody body;

    public static CreateSmsSaasTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSaasTaskResponse self = new CreateSmsSaasTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmsSaasTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmsSaasTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmsSaasTaskResponse setBody(CreateSmsSaasTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmsSaasTaskResponseBody getBody() {
        return this.body;
    }

}
