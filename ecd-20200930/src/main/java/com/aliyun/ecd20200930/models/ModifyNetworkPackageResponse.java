// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNetworkPackageResponseBody body;

    public static ModifyNetworkPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkPackageResponse self = new ModifyNetworkPackageResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNetworkPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNetworkPackageResponse setBody(ModifyNetworkPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNetworkPackageResponseBody getBody() {
        return this.body;
    }

}
