// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResetSupabaseProjectPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetSupabaseProjectPasswordResponseBody body;

    public static ResetSupabaseProjectPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetSupabaseProjectPasswordResponse self = new ResetSupabaseProjectPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetSupabaseProjectPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetSupabaseProjectPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetSupabaseProjectPasswordResponse setBody(ResetSupabaseProjectPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetSupabaseProjectPasswordResponseBody getBody() {
        return this.body;
    }

}
