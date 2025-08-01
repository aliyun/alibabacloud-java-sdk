// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteSupabaseProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSupabaseProjectResponseBody body;

    public static DeleteSupabaseProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSupabaseProjectResponse self = new DeleteSupabaseProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSupabaseProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSupabaseProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSupabaseProjectResponse setBody(DeleteSupabaseProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSupabaseProjectResponseBody getBody() {
        return this.body;
    }

}
