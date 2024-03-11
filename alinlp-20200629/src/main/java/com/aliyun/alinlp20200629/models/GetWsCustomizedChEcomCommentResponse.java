// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedChEcomCommentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWsCustomizedChEcomCommentResponseBody body;

    public static GetWsCustomizedChEcomCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedChEcomCommentResponse self = new GetWsCustomizedChEcomCommentResponse();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedChEcomCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWsCustomizedChEcomCommentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWsCustomizedChEcomCommentResponse setBody(GetWsCustomizedChEcomCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWsCustomizedChEcomCommentResponseBody getBody() {
        return this.body;
    }

}
