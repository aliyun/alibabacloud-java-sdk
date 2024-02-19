// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeDBInstanceResponseBody body;

    public static UpgradeDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceResponse self = new UpgradeDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeDBInstanceResponse setBody(UpgradeDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeDBInstanceResponseBody getBody() {
        return this.body;
    }

}
