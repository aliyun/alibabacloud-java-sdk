// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWeChEntertainmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWeChEntertainmentResponseBody body;

    public static GetWeChEntertainmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWeChEntertainmentResponse self = new GetWeChEntertainmentResponse();
        return TeaModel.build(map, self);
    }

    public GetWeChEntertainmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWeChEntertainmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWeChEntertainmentResponse setBody(GetWeChEntertainmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWeChEntertainmentResponseBody getBody() {
        return this.body;
    }

}
