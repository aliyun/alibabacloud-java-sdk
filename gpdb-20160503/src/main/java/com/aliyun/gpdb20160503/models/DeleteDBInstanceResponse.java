// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBInstanceResponseBody body;

    public static DeleteDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceResponse self = new DeleteDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBInstanceResponse setBody(DeleteDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBInstanceResponseBody getBody() {
        return this.body;
    }

}
