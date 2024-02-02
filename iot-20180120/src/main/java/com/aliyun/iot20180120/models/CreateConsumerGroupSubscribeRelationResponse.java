// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupSubscribeRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConsumerGroupSubscribeRelationResponseBody body;

    public static CreateConsumerGroupSubscribeRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerGroupSubscribeRelationResponse self = new CreateConsumerGroupSubscribeRelationResponse();
        return TeaModel.build(map, self);
    }

    public CreateConsumerGroupSubscribeRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConsumerGroupSubscribeRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConsumerGroupSubscribeRelationResponse setBody(CreateConsumerGroupSubscribeRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConsumerGroupSubscribeRelationResponseBody getBody() {
        return this.body;
    }

}
