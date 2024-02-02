// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLaunchTemplateResponseBody body;

    public static CreateLaunchTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateResponse self = new CreateLaunchTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateLaunchTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLaunchTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLaunchTemplateResponse setBody(CreateLaunchTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLaunchTemplateResponseBody getBody() {
        return this.body;
    }

}
