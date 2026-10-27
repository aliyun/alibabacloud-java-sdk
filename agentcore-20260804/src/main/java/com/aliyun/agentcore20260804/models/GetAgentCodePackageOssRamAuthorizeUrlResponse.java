// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentCodePackageOssRamAuthorizeUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentCodePackageOssRamAuthorizeUrlResponseBody body;

    public static GetAgentCodePackageOssRamAuthorizeUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentCodePackageOssRamAuthorizeUrlResponse self = new GetAgentCodePackageOssRamAuthorizeUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentCodePackageOssRamAuthorizeUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentCodePackageOssRamAuthorizeUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentCodePackageOssRamAuthorizeUrlResponse setBody(GetAgentCodePackageOssRamAuthorizeUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentCodePackageOssRamAuthorizeUrlResponseBody getBody() {
        return this.body;
    }

}
