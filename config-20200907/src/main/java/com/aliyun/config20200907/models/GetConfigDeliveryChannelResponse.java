// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConfigDeliveryChannelResponseBody body;

    public static GetConfigDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigDeliveryChannelResponse self = new GetConfigDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConfigDeliveryChannelResponse setBody(GetConfigDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
