// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UntagSupabaseProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UntagSupabaseProjectResponseBody body;

    public static UntagSupabaseProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UntagSupabaseProjectResponse self = new UntagSupabaseProjectResponse();
        return TeaModel.build(map, self);
    }

    public UntagSupabaseProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UntagSupabaseProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UntagSupabaseProjectResponse setBody(UntagSupabaseProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UntagSupabaseProjectResponseBody getBody() {
        return this.body;
    }

}
