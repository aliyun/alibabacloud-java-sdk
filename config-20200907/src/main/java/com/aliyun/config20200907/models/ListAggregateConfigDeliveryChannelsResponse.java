// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigDeliveryChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAggregateConfigDeliveryChannelsResponseBody body;

    public static ListAggregateConfigDeliveryChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigDeliveryChannelsResponse self = new ListAggregateConfigDeliveryChannelsResponse();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigDeliveryChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAggregateConfigDeliveryChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAggregateConfigDeliveryChannelsResponse setBody(ListAggregateConfigDeliveryChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggregateConfigDeliveryChannelsResponseBody getBody() {
        return this.body;
    }

}
