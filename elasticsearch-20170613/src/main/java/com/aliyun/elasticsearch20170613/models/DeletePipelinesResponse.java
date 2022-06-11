// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeletePipelinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePipelinesResponseBody body;

    public static DeletePipelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelinesResponse self = new DeletePipelinesResponse();
        return TeaModel.build(map, self);
    }

    public DeletePipelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePipelinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePipelinesResponse setBody(DeletePipelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePipelinesResponseBody getBody() {
        return this.body;
    }

}
