// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteCustomTopicViewPointByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomTopicViewPointByIdResponseBody body;

    public static DeleteCustomTopicViewPointByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomTopicViewPointByIdResponse self = new DeleteCustomTopicViewPointByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomTopicViewPointByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomTopicViewPointByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomTopicViewPointByIdResponse setBody(DeleteCustomTopicViewPointByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomTopicViewPointByIdResponseBody getBody() {
        return this.body;
    }

}
