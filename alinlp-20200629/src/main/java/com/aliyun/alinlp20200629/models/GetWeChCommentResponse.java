// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWeChCommentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWeChCommentResponseBody body;

    public static GetWeChCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWeChCommentResponse self = new GetWeChCommentResponse();
        return TeaModel.build(map, self);
    }

    public GetWeChCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWeChCommentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWeChCommentResponse setBody(GetWeChCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWeChCommentResponseBody getBody() {
        return this.body;
    }

}
