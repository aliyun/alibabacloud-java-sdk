// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class CreateEenterpriseDIDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEenterpriseDIDResponseBody body;

    public static CreateEenterpriseDIDResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEenterpriseDIDResponse self = new CreateEenterpriseDIDResponse();
        return TeaModel.build(map, self);
    }

    public CreateEenterpriseDIDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEenterpriseDIDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEenterpriseDIDResponse setBody(CreateEenterpriseDIDResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEenterpriseDIDResponseBody getBody() {
        return this.body;
    }

}
