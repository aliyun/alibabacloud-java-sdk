// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTopicResponseBody body;

    public static DeleteTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTopicResponse self = new DeleteTopicResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTopicResponse setBody(DeleteTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTopicResponseBody getBody() {
        return this.body;
    }

}
