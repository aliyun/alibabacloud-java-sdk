// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateModelProviderTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModelProviderTemplateResponseBody body;

    public static CreateModelProviderTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelProviderTemplateResponse self = new CreateModelProviderTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelProviderTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelProviderTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelProviderTemplateResponse setBody(CreateModelProviderTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelProviderTemplateResponseBody getBody() {
        return this.body;
    }

}
