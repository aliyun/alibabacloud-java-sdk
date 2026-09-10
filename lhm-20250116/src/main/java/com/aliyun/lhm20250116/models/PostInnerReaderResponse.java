// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class PostInnerReaderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PostInnerReaderResponseBody body;

    public static PostInnerReaderResponse build(java.util.Map<String, ?> map) throws Exception {
        PostInnerReaderResponse self = new PostInnerReaderResponse();
        return TeaModel.build(map, self);
    }

    public PostInnerReaderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostInnerReaderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostInnerReaderResponse setBody(PostInnerReaderResponseBody body) {
        this.body = body;
        return this;
    }
    public PostInnerReaderResponseBody getBody() {
        return this.body;
    }

}
