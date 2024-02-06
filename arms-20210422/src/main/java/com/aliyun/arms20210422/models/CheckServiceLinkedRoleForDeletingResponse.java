// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleForDeletingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckServiceLinkedRoleForDeletingResponseBody body;

    public static CheckServiceLinkedRoleForDeletingResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleForDeletingResponse self = new CheckServiceLinkedRoleForDeletingResponse();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleForDeletingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckServiceLinkedRoleForDeletingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckServiceLinkedRoleForDeletingResponse setBody(CheckServiceLinkedRoleForDeletingResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckServiceLinkedRoleForDeletingResponseBody getBody() {
        return this.body;
    }

}
