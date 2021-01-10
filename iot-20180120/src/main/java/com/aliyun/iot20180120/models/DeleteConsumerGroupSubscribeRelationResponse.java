// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupSubscribeRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteConsumerGroupSubscribeRelationResponse setBody(DeleteConsumerGroupSubscribeRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConsumerGroupSubscribeRelationResponseBody getBody() {
        return this.body;
    }

}
