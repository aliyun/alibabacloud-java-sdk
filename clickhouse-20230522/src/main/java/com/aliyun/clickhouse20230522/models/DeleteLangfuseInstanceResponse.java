// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteLangfuseInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLangfuseInstanceResponseBody body;

    public static DeleteLangfuseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLangfuseInstanceResponse self = new DeleteLangfuseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLangfuseInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLangfuseInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLangfuseInstanceResponse setBody(DeleteLangfuseInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLangfuseInstanceResponseBody getBody() {
        return this.body;
    }

}
