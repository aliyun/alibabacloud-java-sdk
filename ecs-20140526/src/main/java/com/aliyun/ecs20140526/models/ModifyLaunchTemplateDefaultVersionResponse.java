// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyLaunchTemplateDefaultVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLaunchTemplateDefaultVersionResponseBody body;

    public static ModifyLaunchTemplateDefaultVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLaunchTemplateDefaultVersionResponse self = new ModifyLaunchTemplateDefaultVersionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLaunchTemplateDefaultVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLaunchTemplateDefaultVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLaunchTemplateDefaultVersionResponse setBody(ModifyLaunchTemplateDefaultVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLaunchTemplateDefaultVersionResponseBody getBody() {
        return this.body;
    }

}
