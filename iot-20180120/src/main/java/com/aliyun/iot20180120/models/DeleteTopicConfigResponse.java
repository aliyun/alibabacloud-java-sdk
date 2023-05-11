// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteTopicConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTopicConfigResponseBody body;

    public static DeleteTopicConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTopicConfigResponse self = new DeleteTopicConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTopicConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTopicConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTopicConfigResponse setBody(DeleteTopicConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTopicConfigResponseBody getBody() {
        return this.body;
    }

}
