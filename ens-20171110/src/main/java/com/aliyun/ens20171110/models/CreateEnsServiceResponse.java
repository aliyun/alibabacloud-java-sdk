// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEnsServiceResponseBody body;

    public static CreateEnsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnsServiceResponse self = new CreateEnsServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnsServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEnsServiceResponse setBody(CreateEnsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnsServiceResponseBody getBody() {
        return this.body;
    }

}
