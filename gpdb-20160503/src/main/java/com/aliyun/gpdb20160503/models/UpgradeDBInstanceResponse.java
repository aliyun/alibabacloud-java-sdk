// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpgradeDBInstanceResponse setBody(UpgradeDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeDBInstanceResponseBody getBody() {
        return this.body;
    }

}
