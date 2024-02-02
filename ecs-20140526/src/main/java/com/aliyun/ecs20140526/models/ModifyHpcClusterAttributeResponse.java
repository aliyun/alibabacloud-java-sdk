// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyHpcClusterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHpcClusterAttributeResponseBody body;

    public static ModifyHpcClusterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHpcClusterAttributeResponse self = new ModifyHpcClusterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHpcClusterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHpcClusterAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHpcClusterAttributeResponse setBody(ModifyHpcClusterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHpcClusterAttributeResponseBody getBody() {
        return this.body;
    }

}
