// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetFailFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFailFileResponseBody body;

    public static GetFailFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFailFileResponse self = new GetFailFileResponse();
        return TeaModel.build(map, self);
    }

    public GetFailFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFailFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFailFileResponse setBody(GetFailFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFailFileResponseBody getBody() {
        return this.body;
    }

}
