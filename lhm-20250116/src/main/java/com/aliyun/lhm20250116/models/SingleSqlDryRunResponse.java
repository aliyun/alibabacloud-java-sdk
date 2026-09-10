// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class SingleSqlDryRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SingleSqlDryRunResponseBody body;

    public static SingleSqlDryRunResponse build(java.util.Map<String, ?> map) throws Exception {
        SingleSqlDryRunResponse self = new SingleSqlDryRunResponse();
        return TeaModel.build(map, self);
    }

    public SingleSqlDryRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SingleSqlDryRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SingleSqlDryRunResponse setBody(SingleSqlDryRunResponseBody body) {
        this.body = body;
        return this;
    }
    public SingleSqlDryRunResponseBody getBody() {
        return this.body;
    }

}
