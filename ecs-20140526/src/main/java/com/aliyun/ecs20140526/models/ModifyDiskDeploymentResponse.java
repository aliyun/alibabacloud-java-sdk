// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDiskDeploymentResponseBody body;

    public static ModifyDiskDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskDeploymentResponse self = new ModifyDiskDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiskDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDiskDeploymentResponse setBody(ModifyDiskDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiskDeploymentResponseBody getBody() {
        return this.body;
    }

}
