// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateSaasServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSaasServiceResponseBody body;

    public static CreateSaasServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSaasServiceResponse self = new CreateSaasServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSaasServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSaasServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSaasServiceResponse setBody(CreateSaasServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSaasServiceResponseBody getBody() {
        return this.body;
    }

}
