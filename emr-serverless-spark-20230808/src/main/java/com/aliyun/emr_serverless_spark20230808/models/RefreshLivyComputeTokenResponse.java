// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class RefreshLivyComputeTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshLivyComputeTokenResponseBody body;

    public static RefreshLivyComputeTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshLivyComputeTokenResponse self = new RefreshLivyComputeTokenResponse();
        return TeaModel.build(map, self);
    }

    public RefreshLivyComputeTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshLivyComputeTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshLivyComputeTokenResponse setBody(RefreshLivyComputeTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshLivyComputeTokenResponseBody getBody() {
        return this.body;
    }

}
