// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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
