// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetReleaseTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetReleaseTimeResponseBody body;

    public static GetReleaseTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReleaseTimeResponse self = new GetReleaseTimeResponse();
        return TeaModel.build(map, self);
    }

    public GetReleaseTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReleaseTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetReleaseTimeResponse setBody(GetReleaseTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReleaseTimeResponseBody getBody() {
        return this.body;
    }

}
