// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteLaunchTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLaunchTemplateResponseBody body;

    public static DeleteLaunchTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLaunchTemplateResponse self = new DeleteLaunchTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLaunchTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLaunchTemplateResponse setBody(DeleteLaunchTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLaunchTemplateResponseBody getBody() {
        return this.body;
    }

}
