// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigDeliveryChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConfigDeliveryChannelsResponseBody body;

    public static ListConfigDeliveryChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigDeliveryChannelsResponse self = new ListConfigDeliveryChannelsResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigDeliveryChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigDeliveryChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConfigDeliveryChannelsResponse setBody(ListConfigDeliveryChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigDeliveryChannelsResponseBody getBody() {
        return this.body;
    }

}
