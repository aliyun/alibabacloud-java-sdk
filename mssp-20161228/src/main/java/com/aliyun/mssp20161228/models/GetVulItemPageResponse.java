// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetVulItemPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVulItemPageResponseBody body;

    public static GetVulItemPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVulItemPageResponse self = new GetVulItemPageResponse();
        return TeaModel.build(map, self);
    }

    public GetVulItemPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVulItemPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVulItemPageResponse setBody(GetVulItemPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVulItemPageResponseBody getBody() {
        return this.body;
    }

}
