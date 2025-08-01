// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSupabaseProjectApiKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSupabaseProjectApiKeysResponseBody body;

    public static GetSupabaseProjectApiKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSupabaseProjectApiKeysResponse self = new GetSupabaseProjectApiKeysResponse();
        return TeaModel.build(map, self);
    }

    public GetSupabaseProjectApiKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSupabaseProjectApiKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSupabaseProjectApiKeysResponse setBody(GetSupabaseProjectApiKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSupabaseProjectApiKeysResponseBody getBody() {
        return this.body;
    }

}
