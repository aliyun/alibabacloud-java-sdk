// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteLaunchTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteLaunchTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLaunchTemplateResponse setBody(DeleteLaunchTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLaunchTemplateResponseBody getBody() {
        return this.body;
    }

}
