// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddSimilarityImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSimilarityImageResponseBody body;

    public static AddSimilarityImageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSimilarityImageResponse self = new AddSimilarityImageResponse();
        return TeaModel.build(map, self);
    }

    public AddSimilarityImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSimilarityImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSimilarityImageResponse setBody(AddSimilarityImageResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSimilarityImageResponseBody getBody() {
        return this.body;
    }

}
