// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20181015.models;

import com.aliyun.tea.*;

public class DeleteTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DeleteTopicResponse setBody(DeleteTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTopicResponseBody getBody() {
        return this.body;
    }

}
