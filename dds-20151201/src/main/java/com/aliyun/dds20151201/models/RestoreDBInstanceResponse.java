// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class RestoreDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestoreDBInstanceResponseBody body;

    public static RestoreDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreDBInstanceResponse self = new RestoreDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RestoreDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreDBInstanceResponse setBody(RestoreDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreDBInstanceResponseBody getBody() {
        return this.body;
    }

}
