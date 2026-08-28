// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentSpecImportFileUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentSpecImportFileUrlResponseBody body;

    public static GetAgentSpecImportFileUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSpecImportFileUrlResponse self = new GetAgentSpecImportFileUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentSpecImportFileUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentSpecImportFileUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentSpecImportFileUrlResponse setBody(GetAgentSpecImportFileUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentSpecImportFileUrlResponseBody getBody() {
        return this.body;
    }

}
