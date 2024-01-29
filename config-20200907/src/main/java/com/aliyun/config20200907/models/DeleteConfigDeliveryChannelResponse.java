// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteConfigDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConfigDeliveryChannelResponseBody body;

    public static DeleteConfigDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigDeliveryChannelResponse self = new DeleteConfigDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConfigDeliveryChannelResponse setBody(DeleteConfigDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConfigDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
