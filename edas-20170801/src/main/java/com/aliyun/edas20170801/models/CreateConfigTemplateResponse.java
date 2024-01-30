// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateConfigTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConfigTemplateResponseBody body;

    public static CreateConfigTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigTemplateResponse self = new CreateConfigTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConfigTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConfigTemplateResponse setBody(CreateConfigTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigTemplateResponseBody getBody() {
        return this.body;
    }

}
