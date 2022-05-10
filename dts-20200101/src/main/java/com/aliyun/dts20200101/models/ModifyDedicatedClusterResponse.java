// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDedicatedClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDedicatedClusterResponseBody body;

    public static ModifyDedicatedClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedClusterResponse self = new ModifyDedicatedClusterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDedicatedClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDedicatedClusterResponse setBody(ModifyDedicatedClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDedicatedClusterResponseBody getBody() {
        return this.body;
    }

}
