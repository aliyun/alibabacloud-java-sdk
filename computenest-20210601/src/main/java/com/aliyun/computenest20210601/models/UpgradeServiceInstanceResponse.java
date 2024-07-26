// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpgradeServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeServiceInstanceResponseBody body;

    public static UpgradeServiceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeServiceInstanceResponse self = new UpgradeServiceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeServiceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeServiceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeServiceInstanceResponse setBody(UpgradeServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
