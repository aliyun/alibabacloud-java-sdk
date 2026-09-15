// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class InstallMcpMarketItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallMcpMarketItemResponseBody body;

    public static InstallMcpMarketItemResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallMcpMarketItemResponse self = new InstallMcpMarketItemResponse();
        return TeaModel.build(map, self);
    }

    public InstallMcpMarketItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallMcpMarketItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallMcpMarketItemResponse setBody(InstallMcpMarketItemResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallMcpMarketItemResponseBody getBody() {
        return this.body;
    }

}
