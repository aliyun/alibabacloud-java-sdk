// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DownloadAgentSpecViaOssResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadAgentSpecViaOssResponseBody body;

    public static DownloadAgentSpecViaOssResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadAgentSpecViaOssResponse self = new DownloadAgentSpecViaOssResponse();
        return TeaModel.build(map, self);
    }

    public DownloadAgentSpecViaOssResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadAgentSpecViaOssResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadAgentSpecViaOssResponse setBody(DownloadAgentSpecViaOssResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadAgentSpecViaOssResponseBody getBody() {
        return this.body;
    }

}
