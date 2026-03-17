// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResumeSupabaseProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeSupabaseProjectResponseBody body;

    public static ResumeSupabaseProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeSupabaseProjectResponse self = new ResumeSupabaseProjectResponse();
        return TeaModel.build(map, self);
    }

    public ResumeSupabaseProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeSupabaseProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeSupabaseProjectResponse setBody(ResumeSupabaseProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeSupabaseProjectResponseBody getBody() {
        return this.body;
    }

}
