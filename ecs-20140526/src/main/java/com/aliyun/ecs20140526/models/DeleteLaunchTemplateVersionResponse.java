// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteLaunchTemplateVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLaunchTemplateVersionResponseBody body;

    public static DeleteLaunchTemplateVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLaunchTemplateVersionResponse self = new DeleteLaunchTemplateVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLaunchTemplateVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLaunchTemplateVersionResponse setBody(DeleteLaunchTemplateVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLaunchTemplateVersionResponseBody getBody() {
        return this.body;
    }

}
