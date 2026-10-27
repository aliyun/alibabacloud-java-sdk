// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentCodePackageUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentCodePackageUploadUrlResponseBody body;

    public static GetAgentCodePackageUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentCodePackageUploadUrlResponse self = new GetAgentCodePackageUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentCodePackageUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentCodePackageUploadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentCodePackageUploadUrlResponse setBody(GetAgentCodePackageUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentCodePackageUploadUrlResponseBody getBody() {
        return this.body;
    }

}
