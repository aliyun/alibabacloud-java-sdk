// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDeliveryChannelResponseBody body;

    public static UpdateDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeliveryChannelResponse self = new UpdateDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeliveryChannelResponse setBody(UpdateDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
