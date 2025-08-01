// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSupabaseProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSupabaseProjectResponseBody body;

    public static GetSupabaseProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSupabaseProjectResponse self = new GetSupabaseProjectResponse();
        return TeaModel.build(map, self);
    }

    public GetSupabaseProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSupabaseProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSupabaseProjectResponse setBody(GetSupabaseProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSupabaseProjectResponseBody getBody() {
        return this.body;
    }

}
