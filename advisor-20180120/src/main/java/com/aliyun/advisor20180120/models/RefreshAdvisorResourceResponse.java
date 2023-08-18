// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RefreshAdvisorResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshAdvisorResourceResponseBody body;

    public static RefreshAdvisorResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshAdvisorResourceResponse self = new RefreshAdvisorResourceResponse();
        return TeaModel.build(map, self);
    }

    public RefreshAdvisorResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshAdvisorResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshAdvisorResourceResponse setBody(RefreshAdvisorResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshAdvisorResourceResponseBody getBody() {
        return this.body;
    }

}
