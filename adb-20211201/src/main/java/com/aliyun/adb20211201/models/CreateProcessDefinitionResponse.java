// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateProcessDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProcessDefinitionResponseBody body;

    public static CreateProcessDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProcessDefinitionResponse self = new CreateProcessDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public CreateProcessDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProcessDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProcessDefinitionResponse setBody(CreateProcessDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProcessDefinitionResponseBody getBody() {
        return this.body;
    }

}
