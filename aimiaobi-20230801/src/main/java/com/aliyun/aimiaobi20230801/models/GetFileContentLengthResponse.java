// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetFileContentLengthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileContentLengthResponseBody body;

    public static GetFileContentLengthResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileContentLengthResponse self = new GetFileContentLengthResponse();
        return TeaModel.build(map, self);
    }

    public GetFileContentLengthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileContentLengthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileContentLengthResponse setBody(GetFileContentLengthResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileContentLengthResponseBody getBody() {
        return this.body;
    }

}
