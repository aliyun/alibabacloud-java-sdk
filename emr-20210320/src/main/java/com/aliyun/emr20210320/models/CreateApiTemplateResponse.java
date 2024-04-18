// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateApiTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApiTemplateResponseBody body;

    public static CreateApiTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApiTemplateResponse self = new CreateApiTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateApiTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApiTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApiTemplateResponse setBody(CreateApiTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApiTemplateResponseBody getBody() {
        return this.body;
    }

}
