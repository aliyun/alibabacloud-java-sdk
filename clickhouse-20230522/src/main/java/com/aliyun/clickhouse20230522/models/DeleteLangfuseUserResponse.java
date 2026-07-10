// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteLangfuseUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLangfuseUserResponseBody body;

    public static DeleteLangfuseUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLangfuseUserResponse self = new DeleteLangfuseUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLangfuseUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLangfuseUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLangfuseUserResponse setBody(DeleteLangfuseUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLangfuseUserResponseBody getBody() {
        return this.body;
    }

}
