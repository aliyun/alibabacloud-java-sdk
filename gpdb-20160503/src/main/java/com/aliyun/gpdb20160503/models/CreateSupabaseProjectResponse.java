// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateSupabaseProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSupabaseProjectResponseBody body;

    public static CreateSupabaseProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSupabaseProjectResponse self = new CreateSupabaseProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateSupabaseProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSupabaseProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSupabaseProjectResponse setBody(CreateSupabaseProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSupabaseProjectResponseBody getBody() {
        return this.body;
    }

}
