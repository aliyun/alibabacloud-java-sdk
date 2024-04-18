// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class UpgradeMinorVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeMinorVersionResponseBody body;

    public static UpgradeMinorVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMinorVersionResponse self = new UpgradeMinorVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeMinorVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeMinorVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeMinorVersionResponse setBody(UpgradeMinorVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeMinorVersionResponseBody getBody() {
        return this.body;
    }

}
