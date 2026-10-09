// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpdateSupabaseVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSupabaseVersionResponseBody body;

    public static UpdateSupabaseVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSupabaseVersionResponse self = new UpdateSupabaseVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSupabaseVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSupabaseVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSupabaseVersionResponse setBody(UpdateSupabaseVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSupabaseVersionResponseBody getBody() {
        return this.body;
    }

}
