// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterPayTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterPayTypeResponseBody body;

    public static ModifyDBClusterPayTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterPayTypeResponse self = new ModifyDBClusterPayTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterPayTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterPayTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterPayTypeResponse setBody(ModifyDBClusterPayTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterPayTypeResponseBody getBody() {
        return this.body;
    }

}
