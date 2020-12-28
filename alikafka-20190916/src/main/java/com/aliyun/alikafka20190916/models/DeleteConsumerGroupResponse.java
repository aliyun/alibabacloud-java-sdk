// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteConsumerGroupResponseBody body;

    public static DeleteConsumerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerGroupResponse self = new DeleteConsumerGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConsumerGroupResponse setBody(DeleteConsumerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConsumerGroupResponseBody getBody() {
        return this.body;
    }

}
