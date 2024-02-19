// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RebalanceDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebalanceDBInstanceResponseBody body;

    public static RebalanceDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RebalanceDBInstanceResponse self = new RebalanceDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RebalanceDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebalanceDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebalanceDBInstanceResponse setBody(RebalanceDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RebalanceDBInstanceResponseBody getBody() {
        return this.body;
    }

}
