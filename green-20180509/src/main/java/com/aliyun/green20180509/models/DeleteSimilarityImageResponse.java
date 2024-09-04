// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteSimilarityImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSimilarityImageResponseBody body;

    public static DeleteSimilarityImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSimilarityImageResponse self = new DeleteSimilarityImageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSimilarityImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSimilarityImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSimilarityImageResponse setBody(DeleteSimilarityImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSimilarityImageResponseBody getBody() {
        return this.body;
    }

}
