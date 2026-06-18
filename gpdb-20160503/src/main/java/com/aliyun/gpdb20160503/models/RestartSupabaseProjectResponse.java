// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RestartSupabaseProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartSupabaseProjectResponseBody body;

    public static RestartSupabaseProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartSupabaseProjectResponse self = new RestartSupabaseProjectResponse();
        return TeaModel.build(map, self);
    }

    public RestartSupabaseProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartSupabaseProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartSupabaseProjectResponse setBody(RestartSupabaseProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartSupabaseProjectResponseBody getBody() {
        return this.body;
    }

}
