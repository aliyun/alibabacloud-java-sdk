// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStandardTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStandardTemplateResponseBody body;

    public static CreateStandardTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardTemplateResponse self = new CreateStandardTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateStandardTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStandardTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStandardTemplateResponse setBody(CreateStandardTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStandardTemplateResponseBody getBody() {
        return this.body;
    }

}
