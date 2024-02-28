// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetTrustedProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTrustedProjectsResponseBody body;

    public static GetTrustedProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrustedProjectsResponse self = new GetTrustedProjectsResponse();
        return TeaModel.build(map, self);
    }

    public GetTrustedProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrustedProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrustedProjectsResponse setBody(GetTrustedProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrustedProjectsResponseBody getBody() {
        return this.body;
    }

}
