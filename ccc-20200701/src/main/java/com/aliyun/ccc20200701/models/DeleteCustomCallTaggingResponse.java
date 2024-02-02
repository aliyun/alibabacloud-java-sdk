// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteCustomCallTaggingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomCallTaggingResponseBody body;

    public static DeleteCustomCallTaggingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomCallTaggingResponse self = new DeleteCustomCallTaggingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomCallTaggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomCallTaggingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomCallTaggingResponse setBody(DeleteCustomCallTaggingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomCallTaggingResponseBody getBody() {
        return this.body;
    }

}
