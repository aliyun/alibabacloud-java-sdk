// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageEnabledResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNetworkPackageEnabledResponseBody body;

    public static ModifyNetworkPackageEnabledResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkPackageEnabledResponse self = new ModifyNetworkPackageEnabledResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkPackageEnabledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNetworkPackageEnabledResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNetworkPackageEnabledResponse setBody(ModifyNetworkPackageEnabledResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNetworkPackageEnabledResponseBody getBody() {
        return this.body;
    }

}
