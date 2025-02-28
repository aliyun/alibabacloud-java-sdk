// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InitDmsAIServiceK8sEnvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitDmsAIServiceK8sEnvResponseBody body;

    public static InitDmsAIServiceK8sEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        InitDmsAIServiceK8sEnvResponse self = new InitDmsAIServiceK8sEnvResponse();
        return TeaModel.build(map, self);
    }

    public InitDmsAIServiceK8sEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitDmsAIServiceK8sEnvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitDmsAIServiceK8sEnvResponse setBody(InitDmsAIServiceK8sEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public InitDmsAIServiceK8sEnvResponseBody getBody() {
        return this.body;
    }

}
