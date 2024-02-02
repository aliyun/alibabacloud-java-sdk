// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class TransformClientIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransformClientIdResponseBody body;

    public static TransformClientIdResponse build(java.util.Map<String, ?> map) throws Exception {
        TransformClientIdResponse self = new TransformClientIdResponse();
        return TeaModel.build(map, self);
    }

    public TransformClientIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransformClientIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransformClientIdResponse setBody(TransformClientIdResponseBody body) {
        this.body = body;
        return this;
    }
    public TransformClientIdResponseBody getBody() {
        return this.body;
    }

}
