// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sAppPrecheckResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetK8sAppPrecheckResultResponseBody body;

    public static GetK8sAppPrecheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetK8sAppPrecheckResultResponse self = new GetK8sAppPrecheckResultResponse();
        return TeaModel.build(map, self);
    }

    public GetK8sAppPrecheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetK8sAppPrecheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetK8sAppPrecheckResultResponse setBody(GetK8sAppPrecheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetK8sAppPrecheckResultResponseBody getBody() {
        return this.body;
    }

}
