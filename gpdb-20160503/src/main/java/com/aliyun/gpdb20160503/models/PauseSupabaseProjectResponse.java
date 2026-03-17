// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class PauseSupabaseProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PauseSupabaseProjectResponseBody body;

    public static PauseSupabaseProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseSupabaseProjectResponse self = new PauseSupabaseProjectResponse();
        return TeaModel.build(map, self);
    }

    public PauseSupabaseProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseSupabaseProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseSupabaseProjectResponse setBody(PauseSupabaseProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseSupabaseProjectResponseBody getBody() {
        return this.body;
    }

}
