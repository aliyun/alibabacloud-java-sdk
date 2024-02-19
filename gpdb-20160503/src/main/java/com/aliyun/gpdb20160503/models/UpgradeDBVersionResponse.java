// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpgradeDBVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeDBVersionResponseBody body;

    public static UpgradeDBVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBVersionResponse self = new UpgradeDBVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeDBVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeDBVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeDBVersionResponse setBody(UpgradeDBVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeDBVersionResponseBody getBody() {
        return this.body;
    }

}
