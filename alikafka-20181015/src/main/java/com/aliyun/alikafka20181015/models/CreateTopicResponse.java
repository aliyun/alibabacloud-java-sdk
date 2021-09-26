// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20181015.models;

import com.aliyun.tea.*;

public class CreateTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTopicResponseBody body;

    public static CreateTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicResponse self = new CreateTopicResponse();
        return TeaModel.build(map, self);
    }

    public CreateTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTopicResponse setBody(CreateTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTopicResponseBody getBody() {
        return this.body;
    }

}
