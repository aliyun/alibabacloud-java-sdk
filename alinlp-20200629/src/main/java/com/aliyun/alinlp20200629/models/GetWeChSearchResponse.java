// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWeChSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWeChSearchResponseBody body;

    public static GetWeChSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWeChSearchResponse self = new GetWeChSearchResponse();
        return TeaModel.build(map, self);
    }

    public GetWeChSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWeChSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWeChSearchResponse setBody(GetWeChSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWeChSearchResponseBody getBody() {
        return this.body;
    }

}
