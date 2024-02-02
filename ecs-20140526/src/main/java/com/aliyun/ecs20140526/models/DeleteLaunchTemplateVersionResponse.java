// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteLaunchTemplateVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteLaunchTemplateVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLaunchTemplateVersionResponse setBody(DeleteLaunchTemplateVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLaunchTemplateVersionResponseBody getBody() {
        return this.body;
    }

}
