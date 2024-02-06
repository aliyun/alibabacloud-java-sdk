// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class GetAgentDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentDownloadUrlResponseBody body;

    public static GetAgentDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDownloadUrlResponse self = new GetAgentDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentDownloadUrlResponse setBody(GetAgentDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
