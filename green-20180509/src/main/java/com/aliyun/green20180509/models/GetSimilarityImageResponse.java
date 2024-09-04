// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetSimilarityImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSimilarityImageResponseBody body;

    public static GetSimilarityImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSimilarityImageResponse self = new GetSimilarityImageResponse();
        return TeaModel.build(map, self);
    }

    public GetSimilarityImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSimilarityImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSimilarityImageResponse setBody(GetSimilarityImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSimilarityImageResponseBody getBody() {
        return this.body;
    }

}
