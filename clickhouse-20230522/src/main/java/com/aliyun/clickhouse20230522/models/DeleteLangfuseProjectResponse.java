// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteLangfuseProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLangfuseProjectResponseBody body;

    public static DeleteLangfuseProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLangfuseProjectResponse self = new DeleteLangfuseProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLangfuseProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLangfuseProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLangfuseProjectResponse setBody(DeleteLangfuseProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLangfuseProjectResponseBody getBody() {
        return this.body;
    }

}
