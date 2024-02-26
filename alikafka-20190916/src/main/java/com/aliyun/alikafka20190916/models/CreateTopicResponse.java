// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateTopicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTopicResponse setBody(CreateTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTopicResponseBody getBody() {
        return this.body;
    }

}
