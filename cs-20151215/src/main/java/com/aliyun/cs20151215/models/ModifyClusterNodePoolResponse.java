// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterNodePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClusterNodePoolResponseBody body;

    public static ModifyClusterNodePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterNodePoolResponse self = new ModifyClusterNodePoolResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterNodePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterNodePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClusterNodePoolResponse setBody(ModifyClusterNodePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterNodePoolResponseBody getBody() {
        return this.body;
    }

}
