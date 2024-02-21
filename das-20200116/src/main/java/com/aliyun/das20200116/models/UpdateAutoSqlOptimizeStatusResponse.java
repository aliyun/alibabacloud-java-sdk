// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoSqlOptimizeStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAutoSqlOptimizeStatusResponseBody body;

    public static UpdateAutoSqlOptimizeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoSqlOptimizeStatusResponse self = new UpdateAutoSqlOptimizeStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutoSqlOptimizeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutoSqlOptimizeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAutoSqlOptimizeStatusResponse setBody(UpdateAutoSqlOptimizeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAutoSqlOptimizeStatusResponseBody getBody() {
        return this.body;
    }

}
