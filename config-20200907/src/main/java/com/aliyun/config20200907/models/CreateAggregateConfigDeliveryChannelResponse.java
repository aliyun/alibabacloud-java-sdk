// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateConfigDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAggregateConfigDeliveryChannelResponseBody body;

    public static CreateAggregateConfigDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateConfigDeliveryChannelResponse self = new CreateAggregateConfigDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public CreateAggregateConfigDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAggregateConfigDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAggregateConfigDeliveryChannelResponse setBody(CreateAggregateConfigDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAggregateConfigDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
