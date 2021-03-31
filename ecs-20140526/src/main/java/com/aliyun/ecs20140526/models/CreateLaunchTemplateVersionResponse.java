// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLaunchTemplateVersionResponseBody body;

    public static CreateLaunchTemplateVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateVersionResponse self = new CreateLaunchTemplateVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateLaunchTemplateVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLaunchTemplateVersionResponse setBody(CreateLaunchTemplateVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLaunchTemplateVersionResponseBody getBody() {
        return this.body;
    }

}
