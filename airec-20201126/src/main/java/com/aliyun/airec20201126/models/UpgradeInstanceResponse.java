// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class UpgradeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeInstanceResponseBody body;

    public static UpgradeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceResponse self = new UpgradeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeInstanceResponse setBody(UpgradeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeInstanceResponseBody getBody() {
        return this.body;
    }

}
