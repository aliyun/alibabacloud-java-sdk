// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteConsumerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConsumerGroupResponse setBody(DeleteConsumerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConsumerGroupResponseBody getBody() {
        return this.body;
    }

}
