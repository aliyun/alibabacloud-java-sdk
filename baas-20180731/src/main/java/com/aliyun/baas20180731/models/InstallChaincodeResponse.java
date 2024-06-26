// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class InstallChaincodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallChaincodeResponseBody body;

    public static InstallChaincodeResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallChaincodeResponse self = new InstallChaincodeResponse();
        return TeaModel.build(map, self);
    }

    public InstallChaincodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallChaincodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallChaincodeResponse setBody(InstallChaincodeResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallChaincodeResponseBody getBody() {
        return this.body;
    }

}
