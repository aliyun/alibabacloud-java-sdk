// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyLaunchTemplateDefaultVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyLaunchTemplateDefaultVersionResponse setBody(ModifyLaunchTemplateDefaultVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLaunchTemplateDefaultVersionResponseBody getBody() {
        return this.body;
    }

}
