// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDeliveryChannelResponseBody body;

    public static CreateDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryChannelResponse self = new CreateDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeliveryChannelResponse setBody(CreateDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
