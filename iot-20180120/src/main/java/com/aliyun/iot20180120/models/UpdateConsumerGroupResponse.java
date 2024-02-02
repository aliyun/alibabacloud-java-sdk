// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateConsumerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConsumerGroupResponseBody body;

    public static UpdateConsumerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerGroupResponse self = new UpdateConsumerGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConsumerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConsumerGroupResponse setBody(UpdateConsumerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConsumerGroupResponseBody getBody() {
        return this.body;
    }

}
