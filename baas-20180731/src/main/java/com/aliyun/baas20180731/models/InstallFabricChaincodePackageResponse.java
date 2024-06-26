// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class InstallFabricChaincodePackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallFabricChaincodePackageResponseBody body;

    public static InstallFabricChaincodePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallFabricChaincodePackageResponse self = new InstallFabricChaincodePackageResponse();
        return TeaModel.build(map, self);
    }

    public InstallFabricChaincodePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallFabricChaincodePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallFabricChaincodePackageResponse setBody(InstallFabricChaincodePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallFabricChaincodePackageResponseBody getBody() {
        return this.body;
    }

}
