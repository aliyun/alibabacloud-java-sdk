// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyInstanceDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceDeploymentResponseBody body;

    public static ModifyInstanceDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceDeploymentResponse self = new ModifyInstanceDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceDeploymentResponse setBody(ModifyInstanceDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceDeploymentResponseBody getBody() {
        return this.body;
    }

}
