// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteCustomTopicByTopicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomTopicByTopicResponseBody body;

    public static DeleteCustomTopicByTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomTopicByTopicResponse self = new DeleteCustomTopicByTopicResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomTopicByTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomTopicByTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomTopicByTopicResponse setBody(DeleteCustomTopicByTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomTopicByTopicResponseBody getBody() {
        return this.body;
    }

}
