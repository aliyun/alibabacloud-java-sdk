// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSampleResponseBody body;

    public static DeleteSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSampleResponse self = new DeleteSampleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSampleResponse setBody(DeleteSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSampleResponseBody getBody() {
        return this.body;
    }

}
