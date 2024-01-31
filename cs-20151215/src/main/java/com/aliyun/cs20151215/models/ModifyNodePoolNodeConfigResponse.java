// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyNodePoolNodeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNodePoolNodeConfigResponseBody body;

    public static ModifyNodePoolNodeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodePoolNodeConfigResponse self = new ModifyNodePoolNodeConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNodePoolNodeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNodePoolNodeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNodePoolNodeConfigResponse setBody(ModifyNodePoolNodeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNodePoolNodeConfigResponseBody getBody() {
        return this.body;
    }

}
