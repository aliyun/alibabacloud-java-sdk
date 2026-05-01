// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateModelTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModelTemplateResponseBody body;

    public static CreateModelTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelTemplateResponse self = new CreateModelTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelTemplateResponse setBody(CreateModelTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelTemplateResponseBody getBody() {
        return this.body;
    }

}
