// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class StartK8sAppPrecheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartK8sAppPrecheckResponseBody body;

    public static StartK8sAppPrecheckResponse build(java.util.Map<String, ?> map) throws Exception {
        StartK8sAppPrecheckResponse self = new StartK8sAppPrecheckResponse();
        return TeaModel.build(map, self);
    }

    public StartK8sAppPrecheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartK8sAppPrecheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartK8sAppPrecheckResponse setBody(StartK8sAppPrecheckResponseBody body) {
        this.body = body;
        return this;
    }
    public StartK8sAppPrecheckResponseBody getBody() {
        return this.body;
    }

}
