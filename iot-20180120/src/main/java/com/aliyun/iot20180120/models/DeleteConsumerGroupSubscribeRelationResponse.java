// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupSubscribeRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConsumerGroupSubscribeRelationResponseBody body;

    public static DeleteConsumerGroupSubscribeRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerGroupSubscribeRelationResponse self = new DeleteConsumerGroupSubscribeRelationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerGroupSubscribeRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConsumerGroupSubscribeRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConsumerGroupSubscribeRelationResponse setBody(DeleteConsumerGroupSubscribeRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConsumerGroupSubscribeRelationResponseBody getBody() {
        return this.body;
    }

}
