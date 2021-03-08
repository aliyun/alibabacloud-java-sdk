// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class RenewTSDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RenewTSDBInstanceResponseBody body;

    public static RenewTSDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewTSDBInstanceResponse self = new RenewTSDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewTSDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewTSDBInstanceResponse setBody(RenewTSDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewTSDBInstanceResponseBody getBody() {
        return this.body;
    }

}
