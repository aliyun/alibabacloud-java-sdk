// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateApplicationAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateApplicationAccessPointResponseBody body;

    public static CreateApplicationAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationAccessPointResponse self = new CreateApplicationAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationAccessPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationAccessPointResponse setBody(CreateApplicationAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationAccessPointResponseBody getBody() {
        return this.body;
    }

}
