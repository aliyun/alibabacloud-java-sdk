// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateSystemPropertyTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSystemPropertyTemplateResponseBody body;

    public static CreateSystemPropertyTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSystemPropertyTemplateResponse self = new CreateSystemPropertyTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateSystemPropertyTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSystemPropertyTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSystemPropertyTemplateResponse setBody(CreateSystemPropertyTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSystemPropertyTemplateResponseBody getBody() {
        return this.body;
    }

}
