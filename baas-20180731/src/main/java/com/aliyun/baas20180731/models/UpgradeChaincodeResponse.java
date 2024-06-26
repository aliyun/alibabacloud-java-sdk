// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpgradeChaincodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeChaincodeResponseBody body;

    public static UpgradeChaincodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeChaincodeResponse self = new UpgradeChaincodeResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeChaincodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeChaincodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeChaincodeResponse setBody(UpgradeChaincodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeChaincodeResponseBody getBody() {
        return this.body;
    }

}
