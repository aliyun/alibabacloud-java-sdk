// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateLaunchTemplateResponse setBody(CreateLaunchTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLaunchTemplateResponseBody getBody() {
        return this.body;
    }

}
