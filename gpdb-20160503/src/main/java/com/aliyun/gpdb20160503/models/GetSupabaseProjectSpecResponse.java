// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSupabaseProjectSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSupabaseProjectSpecResponseBody body;

    public static GetSupabaseProjectSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSupabaseProjectSpecResponse self = new GetSupabaseProjectSpecResponse();
        return TeaModel.build(map, self);
    }

    public GetSupabaseProjectSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSupabaseProjectSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSupabaseProjectSpecResponse setBody(GetSupabaseProjectSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSupabaseProjectSpecResponseBody getBody() {
        return this.body;
    }

}
