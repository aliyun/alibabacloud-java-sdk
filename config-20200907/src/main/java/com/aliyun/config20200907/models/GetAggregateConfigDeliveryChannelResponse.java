// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregateConfigDeliveryChannelResponseBody body;

    public static GetAggregateConfigDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigDeliveryChannelResponse self = new GetAggregateConfigDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateConfigDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateConfigDeliveryChannelResponse setBody(GetAggregateConfigDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateConfigDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
