// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpgradeInstanceVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeInstanceVersionResponseBody body;

    public static UpgradeInstanceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceVersionResponse self = new UpgradeInstanceVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeInstanceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeInstanceVersionResponse setBody(UpgradeInstanceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeInstanceVersionResponseBody getBody() {
        return this.body;
    }

}
