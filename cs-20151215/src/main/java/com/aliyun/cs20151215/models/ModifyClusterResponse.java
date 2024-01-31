// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClusterResponseBody body;

    public static ModifyClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterResponse self = new ModifyClusterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClusterResponse setBody(ModifyClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterResponseBody getBody() {
        return this.body;
    }

}
