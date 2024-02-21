// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConsumerGroupResponseBody body;

    public static CreateConsumerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerGroupResponse self = new CreateConsumerGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateConsumerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConsumerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConsumerGroupResponse setBody(CreateConsumerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConsumerGroupResponseBody getBody() {
        return this.body;
    }

}
