// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CancelRestartInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelRestartInstanceResponseBody body;

    public static CancelRestartInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRestartInstanceResponse self = new CancelRestartInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CancelRestartInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRestartInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelRestartInstanceResponse setBody(CancelRestartInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelRestartInstanceResponseBody getBody() {
        return this.body;
    }

}
