// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyClusterConnectionStringResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClusterConnectionStringResponseBody body;

    public static ModifyClusterConnectionStringResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterConnectionStringResponse self = new ModifyClusterConnectionStringResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterConnectionStringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterConnectionStringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClusterConnectionStringResponse setBody(ModifyClusterConnectionStringResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterConnectionStringResponseBody getBody() {
        return this.body;
    }

}
