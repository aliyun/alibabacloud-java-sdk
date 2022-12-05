// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendLikeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendLikeResponseBody body;

    public static SendLikeResponse build(java.util.Map<String, ?> map) throws Exception {
        SendLikeResponse self = new SendLikeResponse();
        return TeaModel.build(map, self);
    }

    public SendLikeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendLikeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendLikeResponse setBody(SendLikeResponseBody body) {
        this.body = body;
        return this;
    }
    public SendLikeResponseBody getBody() {
        return this.body;
    }

}
