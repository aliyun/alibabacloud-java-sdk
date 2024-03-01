// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class EnableAutoTopicCreationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableAutoTopicCreationResponseBody body;

    public static EnableAutoTopicCreationResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAutoTopicCreationResponse self = new EnableAutoTopicCreationResponse();
        return TeaModel.build(map, self);
    }

    public EnableAutoTopicCreationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAutoTopicCreationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAutoTopicCreationResponse setBody(EnableAutoTopicCreationResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAutoTopicCreationResponseBody getBody() {
        return this.body;
    }

}
