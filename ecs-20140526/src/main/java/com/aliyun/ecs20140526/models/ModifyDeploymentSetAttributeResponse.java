// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDeploymentSetAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDeploymentSetAttributeResponseBody body;

    public static ModifyDeploymentSetAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeploymentSetAttributeResponse self = new ModifyDeploymentSetAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDeploymentSetAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDeploymentSetAttributeResponse setBody(ModifyDeploymentSetAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDeploymentSetAttributeResponseBody getBody() {
        return this.body;
    }

}
