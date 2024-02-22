// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetHistogramsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHistogramsResponseBody body;

    public static GetHistogramsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistogramsResponse self = new GetHistogramsResponse();
        return TeaModel.build(map, self);
    }

    public GetHistogramsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistogramsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHistogramsResponse setBody(GetHistogramsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHistogramsResponseBody getBody() {
        return this.body;
    }

}
