// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateConfigDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAggregateConfigDeliveryChannelResponseBody body;

    public static UpdateAggregateConfigDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateConfigDeliveryChannelResponse self = new UpdateAggregateConfigDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateConfigDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAggregateConfigDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAggregateConfigDeliveryChannelResponse setBody(UpdateAggregateConfigDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAggregateConfigDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
