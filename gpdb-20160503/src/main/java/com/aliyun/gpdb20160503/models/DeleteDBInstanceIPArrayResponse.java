// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceIPArrayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBInstanceIPArrayResponseBody body;

    public static DeleteDBInstanceIPArrayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceIPArrayResponse self = new DeleteDBInstanceIPArrayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceIPArrayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBInstanceIPArrayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBInstanceIPArrayResponse setBody(DeleteDBInstanceIPArrayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBInstanceIPArrayResponseBody getBody() {
        return this.body;
    }

}
