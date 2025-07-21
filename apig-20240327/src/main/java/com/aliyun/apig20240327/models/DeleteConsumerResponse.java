// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteConsumerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConsumerResponseBody body;

    public static DeleteConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerResponse self = new DeleteConsumerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConsumerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConsumerResponse setBody(DeleteConsumerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConsumerResponseBody getBody() {
        return this.body;
    }

}
