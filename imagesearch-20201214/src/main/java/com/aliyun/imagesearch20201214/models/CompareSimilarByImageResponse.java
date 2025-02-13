// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class CompareSimilarByImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompareSimilarByImageResponseBody body;

    public static CompareSimilarByImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareSimilarByImageResponse self = new CompareSimilarByImageResponse();
        return TeaModel.build(map, self);
    }

    public CompareSimilarByImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompareSimilarByImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompareSimilarByImageResponse setBody(CompareSimilarByImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CompareSimilarByImageResponseBody getBody() {
        return this.body;
    }

}
