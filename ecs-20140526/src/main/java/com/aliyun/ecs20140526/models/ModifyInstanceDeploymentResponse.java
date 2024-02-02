// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
