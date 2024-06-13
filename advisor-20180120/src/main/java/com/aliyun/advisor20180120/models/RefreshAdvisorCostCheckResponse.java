// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RefreshAdvisorCostCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshAdvisorCostCheckResponseBody body;

    public static RefreshAdvisorCostCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshAdvisorCostCheckResponse self = new RefreshAdvisorCostCheckResponse();
        return TeaModel.build(map, self);
    }

    public RefreshAdvisorCostCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshAdvisorCostCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshAdvisorCostCheckResponse setBody(RefreshAdvisorCostCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshAdvisorCostCheckResponseBody getBody() {
        return this.body;
    }

}
