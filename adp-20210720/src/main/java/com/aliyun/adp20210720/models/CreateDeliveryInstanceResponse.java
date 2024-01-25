// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateDeliveryInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeliveryInstanceResponseBody body;

    public static CreateDeliveryInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryInstanceResponse self = new CreateDeliveryInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeliveryInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeliveryInstanceResponse setBody(CreateDeliveryInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeliveryInstanceResponseBody getBody() {
        return this.body;
    }

}
