// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GetInitDmsAIServiceK8sEnvInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInitDmsAIServiceK8sEnvInfoResponseBody body;

    public static GetInitDmsAIServiceK8sEnvInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInitDmsAIServiceK8sEnvInfoResponse self = new GetInitDmsAIServiceK8sEnvInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetInitDmsAIServiceK8sEnvInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInitDmsAIServiceK8sEnvInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInitDmsAIServiceK8sEnvInfoResponse setBody(GetInitDmsAIServiceK8sEnvInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInitDmsAIServiceK8sEnvInfoResponseBody getBody() {
        return this.body;
    }

}
