// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateJobTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateJobTemplateResponseBody body;

    public static CreateJobTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateJobTemplateResponse self = new CreateJobTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateJobTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateJobTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateJobTemplateResponse setBody(CreateJobTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateJobTemplateResponseBody getBody() {
        return this.body;
    }

}
