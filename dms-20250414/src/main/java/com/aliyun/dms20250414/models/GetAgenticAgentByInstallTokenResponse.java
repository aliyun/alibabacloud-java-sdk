// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticAgentByInstallTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgenticAgentByInstallTokenResponseBody body;

    public static GetAgenticAgentByInstallTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticAgentByInstallTokenResponse self = new GetAgenticAgentByInstallTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetAgenticAgentByInstallTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgenticAgentByInstallTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgenticAgentByInstallTokenResponse setBody(GetAgenticAgentByInstallTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgenticAgentByInstallTokenResponseBody getBody() {
        return this.body;
    }

}
