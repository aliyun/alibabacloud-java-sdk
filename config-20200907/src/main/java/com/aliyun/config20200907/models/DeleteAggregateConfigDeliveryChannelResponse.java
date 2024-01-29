// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateConfigDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAggregateConfigDeliveryChannelResponseBody body;

    public static DeleteAggregateConfigDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateConfigDeliveryChannelResponse self = new DeleteAggregateConfigDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateConfigDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAggregateConfigDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAggregateConfigDeliveryChannelResponse setBody(DeleteAggregateConfigDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAggregateConfigDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
