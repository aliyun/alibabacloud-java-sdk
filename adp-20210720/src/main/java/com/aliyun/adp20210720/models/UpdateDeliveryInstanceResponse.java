// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateDeliveryInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeliveryInstanceResponseBody body;

    public static UpdateDeliveryInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeliveryInstanceResponse self = new UpdateDeliveryInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeliveryInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeliveryInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeliveryInstanceResponse setBody(UpdateDeliveryInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeliveryInstanceResponseBody getBody() {
        return this.body;
    }

}
