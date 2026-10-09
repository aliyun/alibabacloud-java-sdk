// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSupabaseUpdateVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSupabaseUpdateVersionResponseBody body;

    public static GetSupabaseUpdateVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSupabaseUpdateVersionResponse self = new GetSupabaseUpdateVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetSupabaseUpdateVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSupabaseUpdateVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSupabaseUpdateVersionResponse setBody(GetSupabaseUpdateVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSupabaseUpdateVersionResponseBody getBody() {
        return this.body;
    }

}
