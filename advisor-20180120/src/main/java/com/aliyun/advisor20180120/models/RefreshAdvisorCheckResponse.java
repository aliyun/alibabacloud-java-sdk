// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RefreshAdvisorCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshAdvisorCheckResponseBody body;

    public static RefreshAdvisorCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshAdvisorCheckResponse self = new RefreshAdvisorCheckResponse();
        return TeaModel.build(map, self);
    }

    public RefreshAdvisorCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshAdvisorCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshAdvisorCheckResponse setBody(RefreshAdvisorCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshAdvisorCheckResponseBody getBody() {
        return this.body;
    }

}
