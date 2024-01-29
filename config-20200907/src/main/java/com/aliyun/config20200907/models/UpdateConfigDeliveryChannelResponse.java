// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateConfigDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConfigDeliveryChannelResponseBody body;

    public static UpdateConfigDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigDeliveryChannelResponse self = new UpdateConfigDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConfigDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConfigDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConfigDeliveryChannelResponse setBody(UpdateConfigDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConfigDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
