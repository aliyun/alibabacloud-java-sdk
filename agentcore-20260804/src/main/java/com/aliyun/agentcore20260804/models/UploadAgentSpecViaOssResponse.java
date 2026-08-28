// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UploadAgentSpecViaOssResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadAgentSpecViaOssResponseBody body;

    public static UploadAgentSpecViaOssResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadAgentSpecViaOssResponse self = new UploadAgentSpecViaOssResponse();
        return TeaModel.build(map, self);
    }

    public UploadAgentSpecViaOssResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadAgentSpecViaOssResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadAgentSpecViaOssResponse setBody(UploadAgentSpecViaOssResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadAgentSpecViaOssResponseBody getBody() {
        return this.body;
    }

}
