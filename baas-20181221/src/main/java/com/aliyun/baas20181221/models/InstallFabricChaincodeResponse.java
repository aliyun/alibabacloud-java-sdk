// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class InstallFabricChaincodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallFabricChaincodeResponseBody body;

    public static InstallFabricChaincodeResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallFabricChaincodeResponse self = new InstallFabricChaincodeResponse();
        return TeaModel.build(map, self);
    }

    public InstallFabricChaincodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallFabricChaincodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallFabricChaincodeResponse setBody(InstallFabricChaincodeResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallFabricChaincodeResponseBody getBody() {
        return this.body;
    }

}
