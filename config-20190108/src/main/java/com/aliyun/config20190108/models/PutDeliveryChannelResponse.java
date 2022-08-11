// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PutDeliveryChannelResponseBody body;

    public static PutDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        PutDeliveryChannelResponse self = new PutDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public PutDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutDeliveryChannelResponse setBody(PutDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public PutDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
