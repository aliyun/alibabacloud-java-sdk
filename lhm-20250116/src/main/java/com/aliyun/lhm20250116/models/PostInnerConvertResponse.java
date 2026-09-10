// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class PostInnerConvertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PostInnerConvertResponseBody body;

    public static PostInnerConvertResponse build(java.util.Map<String, ?> map) throws Exception {
        PostInnerConvertResponse self = new PostInnerConvertResponse();
        return TeaModel.build(map, self);
    }

    public PostInnerConvertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostInnerConvertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostInnerConvertResponse setBody(PostInnerConvertResponseBody body) {
        this.body = body;
        return this;
    }
    public PostInnerConvertResponseBody getBody() {
        return this.body;
    }

}
