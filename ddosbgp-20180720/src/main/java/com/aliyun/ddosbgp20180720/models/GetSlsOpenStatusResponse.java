// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class GetSlsOpenStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSlsOpenStatusResponseBody body;

    public static GetSlsOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSlsOpenStatusResponse self = new GetSlsOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetSlsOpenStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSlsOpenStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSlsOpenStatusResponse setBody(GetSlsOpenStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSlsOpenStatusResponseBody getBody() {
        return this.body;
    }

}
