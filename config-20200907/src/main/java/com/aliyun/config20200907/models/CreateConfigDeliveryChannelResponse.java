// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateConfigDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConfigDeliveryChannelResponseBody body;

    public static CreateConfigDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigDeliveryChannelResponse self = new CreateConfigDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConfigDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConfigDeliveryChannelResponse setBody(CreateConfigDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
